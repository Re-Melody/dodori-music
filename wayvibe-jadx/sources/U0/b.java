package U0;

import T0.AbstractC0800c;
import T0.C;
import T0.E;
import T0.H;
import T0.I;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC0800c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f12038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I f12039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f12041e;

    public b(String str, a aVar, I i10, int i11, boolean z10) {
        super(2, d.f12044a, new H(new E[0]));
        this.f12037a = str;
        this.f12038b = aVar;
        this.f12039c = i10;
        this.f12040d = i11;
        this.f12041e = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!m.b(this.f12037a, bVar.f12037a) || !m.b(this.f12038b, bVar.f12038b)) {
            return false;
        }
        if (m.b(this.f12039c, bVar.f12039c)) {
            return this.f12040d == bVar.f12040d && this.f12041e == bVar.f12041e;
        }
        return false;
    }

    @Override // T0.InterfaceC0816t
    /* JADX INFO: renamed from: getStyle-_-LCdwA */
    public final int mo9getStyle_LCdwA() {
        return this.f12040d;
    }

    @Override // T0.InterfaceC0816t
    public final I getWeight() {
        return this.f12039c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12041e) + p134m1.b.c(this.f12040d, (((this.f12038b.hashCode() + (this.f12037a.hashCode() * 31)) * 31) + this.f12039c.f11463a) * 31, 31);
    }

    public final String toString() {
        return "Font(GoogleFont(\"" + this.f12037a + "\", bestEffort=" + this.f12041e + "), weight=" + this.f12039c + ", style=" + ((Object) C.a(this.f12040d)) + ')';
    }
}
