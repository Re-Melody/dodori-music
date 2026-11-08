package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public interface DefaultLifecycleObserver extends InterfaceC1124t {
    default void onCreate(InterfaceC1125u owner) {
        kotlin.jvm.internal.m.f(owner, "owner");
    }

    default void onDestroy(InterfaceC1125u interfaceC1125u) {
    }

    default void onPause(InterfaceC1125u owner) {
        kotlin.jvm.internal.m.f(owner, "owner");
    }

    default void onResume(InterfaceC1125u owner) {
        kotlin.jvm.internal.m.f(owner, "owner");
    }

    default void onStart(InterfaceC1125u owner) {
        kotlin.jvm.internal.m.f(owner, "owner");
    }

    default void onStop(InterfaceC1125u owner) {
        kotlin.jvm.internal.m.f(owner, "owner");
    }
}
