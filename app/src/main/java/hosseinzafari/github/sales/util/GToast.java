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

package hosseinzafari.github.sales.util;
/*

@created in 20/07/2020 - 03:22 PM
@project Sales
@author Hossein Zafari 
@email  hosseinzafari2000@gmail.com 
*/

import android.widget.Toast;

import androidx.annotation.NonNull;

import hosseinzafari.github.sales.core.G;

public class GToast {

    private static Toast toast;

    static {
        toast = new Toast(G.getContext());
    }

    public static void show(@NonNull String text, int duration) {
        toast.setText(text);
        toast.setDuration(duration);
        toast.show();
    }

    public static void show(@NonNull String text) {
        show(text, Toast.LENGTH_SHORT);
    }

    public static void show(@NonNull String text, boolean isShort) {
        if (isShort) {
            show(text);
        } else {
            show(text, Toast.LENGTH_LONG);
        }
    }
}
