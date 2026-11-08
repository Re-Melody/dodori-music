package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class N {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, EnumC1119n event) {
        kotlin.jvm.internal.m.f(event, "event");
        if (activity instanceof InterfaceC1125u) {
            AbstractC1121p lifecycle = ((InterfaceC1125u) activity).getLifecycle();
            if (lifecycle instanceof C1127w) {
                ((C1127w) lifecycle).c(event);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            P.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new P.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new P(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
