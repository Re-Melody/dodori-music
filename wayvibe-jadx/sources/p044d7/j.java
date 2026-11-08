package p044d7;

/* JADX INFO: loaded from: classes.dex */
public final class j extends k {
    @Override // p044d7.i
    public final boolean d() {
        return true;
    }

    @Override // p044d7.k
    public final k j(Object obj, Object obj2, i iVar, i iVar2) {
        if (obj == null) {
            obj = this.f19306a;
        }
        if (obj2 == null) {
            obj2 = this.f19307b;
        }
        if (iVar == null) {
            iVar = this.f19308c;
        }
        if (iVar2 == null) {
            iVar2 = this.f19309d;
        }
        return new j(obj, obj2, iVar, iVar2);
    }

    @Override // p044d7.k
    public final h l() {
        return h.RED;
    }

    @Override // p044d7.i
    public final int size() {
        return this.f19309d.size() + this.f19308c.size() + 1;
    }
}
