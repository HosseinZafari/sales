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

package hosseinzafari.github.sales.core;
/*

@created in 04/06/2020 - 1:14 PM
@project Sales
@author Hossein Zafari 
@email  hosseinzafari2000@gmail.com 
*/

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;

import hosseinzafari.github.sales.util.GLog;


public class G extends Application{

    public static Handler handler;
    public static Context context;
    public static GAppCompatActivity currentActivity;
    public static String packageName ;
    public static String TAG = "Test";
    private static LayoutInflater layoutInflater;

    @Override
    public void onCreate() {
        super.onCreate();

        context = getApplicationContext();
        handler = new Handler();
        packageName = getPackageName();
    }

    public static Context getContext() {
        if (currentActivity == null) {
            return context;
        }
        return currentActivity;
    }

    public static LayoutInflater getLayoutInflater() {
        if (layoutInflater == null) {
            GLog.i("layoutInflater1 is Null");
            layoutInflater = LayoutInflater.from(currentActivity);
        }
        GLog.i("layoutInflater2 is : " + (layoutInflater == null));

        return layoutInflater;
    }
}
