package androidx.lifecycle;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class S implements InterfaceC1123s, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q f15524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15525c;

    public S(String str, Q q5) {
        this.f15523a = str;
        this.f15524b = q5;
    }

    public final void b(M3.f registry, AbstractC1121p lifecycle) {
        kotlin.jvm.internal.m.f(registry, "registry");
        kotlin.jvm.internal.m.f(lifecycle, "lifecycle");
        if (this.f15525c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f15525c = true;
        lifecycle.addObserver(this);
        registry.c(this.f15523a, this.f15524b.f15522e);
    }

    @Override // androidx.lifecycle.InterfaceC1123s
    public final void c(InterfaceC1125u interfaceC1125u, EnumC1119n enumC1119n) {
        if (enumC1119n == EnumC1119n.ON_DESTROY) {
            this.f15525c = false;
            interfaceC1125u.getLifecycle().removeObserver(this);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
