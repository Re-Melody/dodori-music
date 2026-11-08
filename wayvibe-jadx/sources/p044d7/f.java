package p044d7;

/* JADX INFO: loaded from: classes.dex */
public final class f extends k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19304e;

    public f(Object obj, Object obj2, i iVar, i iVar2) {
        super(obj, obj2, iVar, iVar2);
        this.f19304e = -1;
    }

    @Override // p044d7.i
    public final boolean d() {
        return false;
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
        return new f(obj, obj2, iVar, iVar2);
    }

    @Override // p044d7.k
    public final h l() {
        return h.BLACK;
    }

    @Override // p044d7.k
    public final void q(k kVar) {
        if (this.f19304e != -1) {
            throw new IllegalStateException("Can't set left after using size");
        }
        this.f19308c = kVar;
    }

    @Override // p044d7.i
    public final int size() {
        if (this.f19304e == -1) {
            this.f19304e = this.f19309d.size() + this.f19308c.size() + 1;
        }
        return this.f19304e;
    }
}
