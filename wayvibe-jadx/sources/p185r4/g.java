package p185r4;

import androidx.lifecycle.AbstractC1121p;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.EnumC1120o;
import androidx.lifecycle.InterfaceC1124t;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC1121p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f25904a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f25905b = new f();

    @Override // androidx.lifecycle.AbstractC1121p
    public final void addObserver(InterfaceC1124t interfaceC1124t) {
        if (!(interfaceC1124t instanceof DefaultLifecycleObserver)) {
            throw new IllegalArgumentException((interfaceC1124t + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) interfaceC1124t;
        f fVar = f25905b;
        defaultLifecycleObserver.onCreate(fVar);
        defaultLifecycleObserver.onStart(fVar);
        defaultLifecycleObserver.onResume(fVar);
    }

    @Override // androidx.lifecycle.AbstractC1121p
    public final EnumC1120o getCurrentState() {
        return EnumC1120o.RESUMED;
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }

    @Override // androidx.lifecycle.AbstractC1121p
    public final void removeObserver(InterfaceC1124t interfaceC1124t) {
    }
}
