package org.xiangbalao.multichannelbuilddemo.app;

import android.app.Application;

import com.umeng.analytics.MobclickAgent;

/**
 * Created by longtaoge on 16/10/27.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        MobclickAgent.setScenarioType(getApplicationContext(), MobclickAgent.EScenarioType.E_UM_NORMAL);
    }
}
