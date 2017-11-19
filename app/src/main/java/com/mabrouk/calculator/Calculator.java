package com.mabrouk.calculator;

import android.util.Log;

/**
 * Created by User on 11/19/2017.
 */

public final class Calculator {
    static {
        System.loadLibrary("native-lib");
    }

    private Calculator() {}

    public static native double add(double op1, double op2);

    public static native double subtract(double op1, double op2);

    public static native double multiply(double op1, double op2);

    public static native double divide(double op1, double op2);

    public static native String string();
}
