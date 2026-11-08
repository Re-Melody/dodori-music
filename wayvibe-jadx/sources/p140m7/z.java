package p140m7;

import p170p7.h;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f22494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f22495b;

    public z(y yVar, h hVar) {
        this.f22494a = yVar;
        this.f22495b = hVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f22494a.equals(zVar.f22494a) && this.f22495b.equals(zVar.f22495b);
    }

    public final int hashCode() {
        return this.f22495b.f25264a.hashCode() + ((this.f22494a.hashCode() + 2077) * 31);
    }
}
