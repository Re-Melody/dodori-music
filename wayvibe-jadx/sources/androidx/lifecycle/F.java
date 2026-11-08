package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
public abstract class F {
    public static final void a(Activity activity, Application.ActivityLifecycleCallbacks callback) {
        kotlin.jvm.internal.m.f(activity, "activity");
        kotlin.jvm.internal.m.f(callback, "callback");
        activity.registerActivityLifecycleCallbacks(callback);
    }
}
