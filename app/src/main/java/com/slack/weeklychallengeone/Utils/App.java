package com.slack.weeklychallengeone.Utils;

import android.app.Application;

import com.slack.weeklychallengeone.R;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;



public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("RONDALO.TTF")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
