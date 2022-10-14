package com.tuya.appsdk.sample;

import android.app.Application;

import com.tuya.appsdk.sample.device.config.util.sp.SpUtils;
import com.tuya.smart.android.base.provider.ApiUrlProvider;
import com.tuya.smart.android.demo.camera.CameraUtils;
import com.tuya.smart.android.network.TuyaSmartNetWork;
import com.tuya.smart.home.sdk.TuyaHomeSdk;
import com.tuya.smart.home.sdk.bean.scene.SceneBean;
import com.tuya.smart.home.sdk.callback.ITuyaResultCallback;
import com.tuya.smart.sdk.TuyaSdk;
import com.uuzuche.lib_zxing.activity.ZXingLibrary;

import java.util.List;

/**
 * Base Application
 *
 * @author chuanfeng <a href="mailto:developer@tuya.com"/>
 * @since 2021/2/9 10:41 AM
 */
public final class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        TuyaHomeSdk.init(this);
        TuyaHomeSdk.setDebugMode(true);

        SpUtils.getInstance().initSp(this);
        ZXingLibrary.initDisplayOpinion(this);
        CameraUtils.init(this);
    }
}
