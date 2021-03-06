/*
 * MIT License
 *
 * Copyright (c) 2020.  Hossein Zafari/novinfar
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package hosseinzafari.github.sales.ui.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;

import hosseinzafari.github.sales.R;
import hosseinzafari.github.sales.core.G;
import hosseinzafari.github.sales.core.GAppCompatActivity;
import hosseinzafari.github.sales.data.local.shared_pref.GSharedPref;
import hosseinzafari.github.sales.util.GLog;
import hosseinzafari.github.sales.util.UtilActivity;

public class SplashActivity extends GAppCompatActivity {

    private static final long TIME_DELAY = 3000;
    private static final long TIME_DELAY2 = 0;
    private boolean isLogin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        founder.fullScreen()
                .setContentView(R.layout.activity_splash);

        if (GSharedPref.isLogin()) {
            G.handler.postDelayed(() -> {
                GLog.i("Start SplashScreen");
                UtilActivity.goActivity(MainActivity.class);
                finish();
            }, TIME_DELAY);

        } else {

            G.handler.postDelayed(() -> {
                GLog.i("Start Activitylogin");
                UtilActivity.goActivity(StartActivity.class);
                finish();
            }, TIME_DELAY2);

        }

    }
}