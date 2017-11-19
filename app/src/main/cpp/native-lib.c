#include <jni.h>


jstring Java_com_mabrouk_calculator_Calculator_string(
        JNIEnv *env,
        jobject instance) {
    return (*env)->NewStringUTF(env, "Hello from C++");
}
