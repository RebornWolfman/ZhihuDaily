package com.baiiu.setting;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.baiiu.componentservice.Router;
import com.baiiu.componentservice.service.DailyService;
import com.baiiu.componentservice.service.GankService;
import com.baiiu.library.LogUtil;

/**
 * author: baiiu
 * date: on 17/10/27 11:16
 * description:
 */
class SettingAdapter extends FragmentPagerAdapter {
    SettingAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override public Fragment getItem(int position) {
        if (position == 0) {
            //return NewsListFragment.instance();
            Object service = Router.INSTANCE.getService(DailyService.class.getName());
            if (service != null) {
                return ((DailyService) service).getNewsListFragment();
            }

        } else {
            Object service = Router.INSTANCE.getService(GankService.class.getName());
            if (service != null) {
                return ((GankService) service).getGankFragment();
            }
        }

        try {
            return (Fragment) Class.forName("com.baiiu.setting.runalone.TestFragment")
                    .newInstance();
        } catch (Exception e) {
            LogUtil.e(e.toString());
        }

        return null;
    }

    @Override public int getCount() {
        return 2;
    }
}
