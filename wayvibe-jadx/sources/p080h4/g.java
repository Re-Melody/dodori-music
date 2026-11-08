package p080h4;

import kotlin.jvm.internal.m;
import p191s0.b;

/* JADX INFO: loaded from: classes.dex */
public final class g extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f20269a;

    public g(b bVar) {
        this.f20269a = bVar;
    }

    @Override // p080h4.i
    public final b a() {
        return this.f20269a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && m.b(this.f20269a, ((g) obj).f20269a);
    }

    public final int hashCode() {
        b bVar = this.f20269a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.f20269a + ')';
    }
}
