package p129l7;

import p170p7.q;

/* JADX INFO: loaded from: classes.dex */
public final class i implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f22107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f22108c;

    public i(String str, h hVar, q qVar) {
        this.f22106a = str;
        this.f22107b = hVar;
        this.f22108c = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f22106a.equals(iVar.f22106a) && this.f22107b.equals(iVar.f22107b)) {
            return this.f22108c.equals(iVar.f22108c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22108c.f25279a.hashCode() + ((this.f22107b.hashCode() + (this.f22106a.hashCode() * 31)) * 31);
    }
}
