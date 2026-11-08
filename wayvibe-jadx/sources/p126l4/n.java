package p126l4;

import kotlin.jvm.internal.m;
import p092i4.f;
import p092i4.p;

/* JADX INFO: loaded from: classes.dex */
public final class n extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f21975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f21977c;

    public n(p pVar, String str, f fVar) {
        this.f21975a = pVar;
        this.f21976b = str;
        this.f21977c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return m.b(this.f21975a, nVar.f21975a) && m.b(this.f21976b, nVar.f21976b) && this.f21977c == nVar.f21977c;
    }

    public final int hashCode() {
        int iHashCode = this.f21975a.hashCode() * 31;
        String str = this.f21976b;
        return this.f21977c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
