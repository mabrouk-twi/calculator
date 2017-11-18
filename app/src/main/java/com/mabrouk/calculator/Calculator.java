package com.mabrouk.calculator;

/**
 * Created by User on 11/19/2017.
 */

public final class Calculator {
    private Calculator() {}

    public static double add(double op1, double op2) {
        return op1 + op2;
    }

    public static double subtract(double op1, double op2) {
        return op1 - op2;
    }

    public static double multiply(double op1, double op2) {
        return op1 * op2;
    }

    public static double divide(double op1, double op2) {
        return op1 / op2;
    }
}
