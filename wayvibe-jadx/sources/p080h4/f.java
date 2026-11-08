package p080h4;

import kotlin.jvm.internal.m;
import p185r4.e;
import p191s0.b;

/* JADX INFO: loaded from: classes.dex */
public final class f extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f20267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f20268b;

    public f(b bVar, e eVar) {
        this.f20267a = bVar;
        this.f20268b = eVar;
    }

    @Override // p080h4.i
    public final b a() {
        return this.f20267a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return m.b(this.f20267a, fVar.f20267a) && m.b(this.f20268b, fVar.f20268b);
    }

    public final int hashCode() {
        b bVar = this.f20267a;
        return this.f20268b.hashCode() + ((bVar == null ? 0 : bVar.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.f20267a + ", result=" + this.f20268b + ')';
    }
}
