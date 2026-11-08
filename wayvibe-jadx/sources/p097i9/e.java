package p097i9;

import kotlin.jvm.internal.m;
import p064f9.g;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f20580b;

    public e(String str, g gVar) {
        this.f20579a = str;
        this.f20580b = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return m.b(this.f20579a, eVar.f20579a) && m.b(this.f20580b, eVar.f20580b);
    }

    public final int hashCode() {
        return this.f20580b.hashCode() + (this.f20579a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f20579a + ", range=" + this.f20580b + ')';
    }
}
