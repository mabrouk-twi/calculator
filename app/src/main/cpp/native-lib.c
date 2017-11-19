#include <jni.h>
#include "calcualtor.h"

jstring Java_com_mabrouk_calculator_Calculator_string(
        JNIEnv *env,
        jobject instance) {
    return (*env)->NewStringUTF(env, "Hello from C++");
}

jdouble Java_com_mabrouk_calculator_Calculator_add(
        JNIEnv *env,
        jobject instance, jdouble op1, jdouble op2) {
    return add(op1, op2);
}

jdouble Java_com_mabrouk_calculator_Calculator_subtract(
        JNIEnv *env,
        jobject instance, jdouble op1, jdouble op2) {
    return subtract(op1, op2);
}

jdouble Java_com_mabrouk_calculator_Calculator_multiply(
        JNIEnv *env,
        jobject instance, jdouble op1, jdouble op2) {
    return multiply(op1, op2);
}

jdouble Java_com_mabrouk_calculator_Calculator_divide(
        JNIEnv *env,
        jobject instance, jdouble op1, jdouble op2) {
    return divide(op1, op2);
}