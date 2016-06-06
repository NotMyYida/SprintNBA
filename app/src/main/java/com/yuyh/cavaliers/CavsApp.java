package com.yuyh.cavaliers;

import android.app.Application;
import android.content.Context;

import com.yuyh.library.AppUtils;

/**
 * @author yuyh.
 * @date 16/6/4.
 */
public class CavsApp extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
        AppUtils.init(mContext);
    }

    public static Context getAppContext(){
        return mContext;
    }
}