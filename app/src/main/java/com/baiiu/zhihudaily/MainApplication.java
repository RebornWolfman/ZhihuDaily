package com.baiiu.zhihudaily;

import com.baiiu.common.BaseApplication;
import com.baiiu.library.LogUtil;

/**
 * author: baiiu
 * date: on 16/4/5 11:14
 * description:
 */
public class MainApplication extends BaseApplication {

    @Override public void onCreate() {
        super.onCreate();
        LogUtil.init(BuildConfig.DEBUG);
    }

}
