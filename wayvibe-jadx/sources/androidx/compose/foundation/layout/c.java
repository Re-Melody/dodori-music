package androidx.compose.foundation.layout;

import C.InterfaceC0163v;
import C.InterfaceC0166y;
import D0.k0;
import kotlin.jvm.internal.m;
import p067g0.e;
import p067g0.r;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC0166y, InterfaceC0163v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f14714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14715b;

    public c(k0 k0Var, long j10) {
        this.f14714a = k0Var;
        this.f14715b = j10;
    }

    @Override // C.InterfaceC0163v
    public final r a(r rVar, e eVar) {
        return rVar.then(new BoxChildDataElement(eVar, false));
    }

    @Override // C.InterfaceC0163v
    public final r b() {
        return new BoxChildDataElement(p067g0.b.f19942e, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return m.b(this.f14714a, cVar.f14714a) && p028c1.a.b(this.f14715b, cVar.f14715b);
    }

    public final int hashCode() {
        return Long.hashCode(this.f14715b) + (this.f14714a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f14714a + ", constraints=" + ((Object) p028c1.a.l(this.f14715b)) + ')';
    }
}
