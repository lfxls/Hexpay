package com.cbl.hexpay.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.cbl.hexpay.base.BaseActivity;
import com.cbl.hexpay.noHttpUtil.HttpListener;
import com.cbl.hexpay.noHttpUtil.SSLContextUtil;
import com.cbl.hexpay.R;
import com.yanzhenjie.nohttp.NoHttp;
import com.yanzhenjie.nohttp.RequestMethod;
import com.yanzhenjie.nohttp.rest.Request;
import com.yanzhenjie.nohttp.rest.Response;

import javax.net.ssl.SSLContext;

import butterknife.ButterKnife;

/**
 * Created by HEC271
 * on 2017/6/1.
 */

public class TestActivity extends BaseActivity implements HttpListener<String> {
    private TextView tv_https, tv_no_https;
    private ImageView iv_res, iv_internet;

    @Override
    protected void onActivityCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_test);
        tv_https = (TextView) findViewById(R.id.tv_https);
        tv_no_https = (TextView) findViewById(R.id.tv_no_https);
        iv_res = ButterKnife.findById(this, R.id.iv_res);
        iv_internet = ButterKnife.findById(this, R.id.iv_internet);
        Glide.with(this).load(R.drawable.icon_non_background).crossFade().into(iv_res);
        tv_https.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                httpsVerify();
            }
        });
    }

    /**
     * Https请求，带证书。
     */
    private void httpsVerify() {
        Request<String> httpsRequest = NoHttp.createStringRequest("https://kyfw.12306.cn/otn/", RequestMethod.GET);
        SSLContext sslContext = SSLContextUtil.getSSLContext();

        // 主要是需要一个SocketFactory对象，这个对象是java通用的，具体用法还请Google、Baidu。
        if (sslContext != null)
            httpsRequest.setSSLSocketFactory(sslContext.getSocketFactory());
        request(0, httpsRequest, this, false, true);
    }

    @Override
    public void onSucceed(int what, Response<String> response) {
        showMessageDialog(R.string.request_succeed, response.get());
    }

    @Override
    public void onFailed(int what, Response<String> response) {
        showMessageDialog(R.string.request_failed, response.getException().getMessage());
    }
}
