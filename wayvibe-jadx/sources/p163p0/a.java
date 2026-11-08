package p163p0;

import kotlin.jvm.internal.m;
import p028c1.b;
import p028c1.k;
import p133m0.f;
import p143n0.InterfaceC2093u;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f25142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f25143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC2093u f25144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f25145d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.b(this.f25142a, aVar.f25142a) && this.f25143b == aVar.f25143b && m.b(this.f25144c, aVar.f25144c) && f.a(this.f25145d, aVar.f25145d);
    }

    public final int hashCode() {
        return Long.hashCode(this.f25145d) + ((this.f25144c.hashCode() + ((this.f25143b.hashCode() + (this.f25142a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.f25142a + ", layoutDirection=" + this.f25143b + ", canvas=" + this.f25144c + ", size=" + ((Object) f.f(this.f25145d)) + ')';
    }
}
