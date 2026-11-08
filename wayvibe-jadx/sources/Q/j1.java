package Q;

import M8.InterfaceC0643e;
import p143n0.InterfaceC2098z;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j1 implements InterfaceC2098z, kotlin.jvm.internal.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D.k f10234a;

    public j1(D.k kVar) {
        this.f10234a = kVar;
    }

    @Override // kotlin.jvm.internal.g
    public final InterfaceC0643e a() {
        return this.f10234a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC2098z) || !(obj instanceof kotlin.jvm.internal.g)) {
            return false;
        }
        return this.f10234a.equals(((kotlin.jvm.internal.g) obj).a());
    }

    public final int hashCode() {
        return this.f10234a.hashCode();
    }
}
