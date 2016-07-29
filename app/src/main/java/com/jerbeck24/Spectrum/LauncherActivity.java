package com.jerbeck24.Spectrum;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * @author Nicholas Chum (nicholaschum)
 */

public class LauncherActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, SubstratumLauncher.class);
        startActivity(intent);
        finish();
    }
}