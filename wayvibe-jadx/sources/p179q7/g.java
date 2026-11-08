package p179q7;

import p170p7.k;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f25686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f25687b;

    public g(k kVar, p pVar) {
        this.f25686a = kVar;
        this.f25687b = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f25686a.equals(gVar.f25686a)) {
            return this.f25687b.equals(gVar.f25687b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25687b.hashCode() + (this.f25686a.hashCode() * 31);
    }
}
