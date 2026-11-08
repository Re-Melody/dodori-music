package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class P extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f15515b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p012a8.b f15516a;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final O Companion = new O();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            kotlin.jvm.internal.m.f(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.m.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            kotlin.jvm.internal.m.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            kotlin.jvm.internal.m.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.m.f(activity, "activity");
            int i10 = P.f15515b;
            N.a(activity, EnumC1119n.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.m.f(activity, "activity");
            int i10 = P.f15515b;
            N.a(activity, EnumC1119n.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.m.f(activity, "activity");
            int i10 = P.f15515b;
            N.a(activity, EnumC1119n.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            kotlin.jvm.internal.m.f(activity, "activity");
            int i10 = P.f15515b;
            N.a(activity, EnumC1119n.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            kotlin.jvm.internal.m.f(activity, "activity");
            int i10 = P.f15515b;
            N.a(activity, EnumC1119n.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            kotlin.jvm.internal.m.f(activity, "activity");
            int i10 = P.f15515b;
            N.a(activity, EnumC1119n.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            kotlin.jvm.internal.m.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.m.f(activity, "activity");
            kotlin.jvm.internal.m.f(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            kotlin.jvm.internal.m.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            kotlin.jvm.internal.m.f(activity, "activity");
        }
    }

    public final void a(EnumC1119n enumC1119n) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            kotlin.jvm.internal.m.e(activity, "activity");
            N.a(activity, enumC1119n);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC1119n.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC1119n.ON_DESTROY);
        this.f15516a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC1119n.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        p012a8.b bVar = this.f15516a;
        if (bVar != null) {
            ((H) bVar.f14302b).a();
        }
        a(EnumC1119n.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        p012a8.b bVar = this.f15516a;
        if (bVar != null) {
            H h10 = (H) bVar.f14302b;
            int i10 = h10.f15480a + 1;
            h10.f15480a = i10;
            if (i10 == 1 && h10.f15483d) {
                h10.f15485f.c(EnumC1119n.ON_START);
                h10.f15483d = false;
            }
        }
        a(EnumC1119n.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC1119n.ON_STOP);
    }
}
