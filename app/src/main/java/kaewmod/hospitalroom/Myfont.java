package kaewmod.hospitalroom;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class Myfont extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initFont();
    }

    private void initFont() {
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("athitilight.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}