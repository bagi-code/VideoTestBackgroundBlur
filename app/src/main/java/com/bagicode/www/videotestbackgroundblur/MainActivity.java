package com.bagicode.www.videotestbackgroundblur;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ir.mirrajabi.viewfilter.core.ViewFilter;
import ir.mirrajabi.viewfilter.renderers.BlurRenderer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create blur
        ViewFilter.getInstance(this)
                // use effect
        .setRenderer(new BlurRenderer(30)) // blur
        .applyFilterOnView(findViewById(R.id.my_view), findViewById(R.id.root_view));
    }
}
