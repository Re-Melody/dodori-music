package p080h4;

import kotlin.jvm.internal.m;
import p185r4.o;
import p191s0.b;

/* JADX INFO: loaded from: classes.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f20270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f20271b;

    public h(b bVar, o oVar) {
        this.f20270a = bVar;
        this.f20271b = oVar;
    }

    @Override // p080h4.i
    public final b a() {
        return this.f20270a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return m.b(this.f20270a, hVar.f20270a) && m.b(this.f20271b, hVar.f20271b);
    }

    public final int hashCode() {
        return this.f20271b.hashCode() + (this.f20270a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.f20270a + ", result=" + this.f20271b + ')';
    }
}
