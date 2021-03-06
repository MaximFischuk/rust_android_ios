// Automatically generated by rust_swig
package com.schuetz.rust_android_ios;
import android.support.annotation.NonNull;

public final class MyRustStruct {

    public MyRustStruct() {
        mNativeObj = init();
    }
    private static native long init();

    public final int add(int val) {
        int ret = do_add(mNativeObj, val);

        return ret;
    }
    private static native int do_add(long self, int val);

    public final @NonNull String greet(@NonNull String to) {
        String ret = do_greet(mNativeObj, to);

        return ret;
    }
    private static native @NonNull String do_greet(long self, @NonNull String to);

    public final @NonNull String json(@NonNull String to) {
        String ret = do_json(mNativeObj, to);

        return ret;
    }
    private static native @NonNull String do_json(long self, @NonNull String to);

    public final void function_with_callback(@NonNull Callback a0) {
        do_function_with_callback(mNativeObj, a0);
    }
    private static native void do_function_with_callback(long self, Callback a0);

    public final void send_to_observers(int val) {
        do_send_to_observers(mNativeObj, val);
    }
    private static native void do_send_to_observers(long self, int val);

    public final void observe(@NonNull Callback a0) {
        do_observe(mNativeObj, a0);
    }
    private static native void do_observe(long self, Callback a0);

    public synchronized void delete() {
        if (mNativeObj != 0) {
            do_delete(mNativeObj);
            mNativeObj = 0;
       }
    }
    @Override
    protected void finalize() throws Throwable {
        try {
            delete();
        }
        finally {
             super.finalize();
        }
    }
    private static native void do_delete(long me);
    /*package*/ MyRustStruct(InternalPointerMarker marker, long ptr) {
        assert marker == InternalPointerMarker.RAW_PTR;
        this.mNativeObj = ptr;
    }
    /*package*/ long mNativeObj;
}