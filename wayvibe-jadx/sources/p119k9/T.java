package p119k9;

import B2.AbstractC0112b;

/* JADX INFO: loaded from: classes2.dex */
public final class T implements InterfaceC2011e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21702a;

    public T(boolean z10) {
        this.f21702a = z10;
    }

    @Override // p119k9.InterfaceC2011e0
    public final x0 b() {
        return null;
    }

    @Override // p119k9.InterfaceC2011e0
    public final boolean isActive() {
        return this.f21702a;
    }

    public final String toString() {
        return AbstractC0112b.j(new StringBuilder("Empty{"), this.f21702a ? "Active" : "New", '}');
    }
}
