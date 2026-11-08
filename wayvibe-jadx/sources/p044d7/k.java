package p044d7;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public abstract class k implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f19308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f19309d;

    public k(Object obj, Object obj2, i iVar, i iVar2) {
        this.f19306a = obj;
        this.f19307b = obj2;
        g gVar = g.f19305a;
        this.f19308c = iVar == null ? gVar : iVar;
        this.f19309d = iVar2 == null ? gVar : iVar2;
    }

    @Override // p044d7.i
    public final i a(Object obj, Object obj2, Comparator comparator) {
        k kVarJ;
        int iCompare = comparator.compare(obj, this.f19306a);
        if (iCompare < 0) {
            kVarJ = j(null, null, this.f19308c.a(obj, obj2, comparator), null);
        } else {
            kVarJ = iCompare == 0 ? j(obj, obj2, null, null) : j(null, null, null, this.f19309d.a(obj, obj2, comparator));
        }
        return kVarJ.k();
    }

    @Override // p044d7.i
    public final i b(Object obj, Comparator comparator) {
        k kVarJ;
        if (comparator.compare(obj, this.f19306a) < 0) {
            k kVarM = (this.f19308c.isEmpty() || this.f19308c.d() || ((k) this.f19308c).f19308c.d()) ? this : m();
            kVarJ = kVarM.j(null, null, kVarM.f19308c.b(obj, comparator), null);
        } else {
            k kVarP = this.f19308c.d() ? p() : this;
            i iVar = kVarP.f19309d;
            if (!iVar.isEmpty() && !iVar.d() && !((k) iVar).f19308c.d()) {
                kVarP = kVarP.h();
                if (kVarP.f19308c.c().d()) {
                    kVarP = kVarP.p().h();
                }
            }
            if (comparator.compare(obj, kVarP.f19306a) == 0) {
                i iVar2 = kVarP.f19309d;
                if (iVar2.isEmpty()) {
                    return g.f19305a;
                }
                i iVarE = iVar2.e();
                kVarP = kVarP.j(iVarE.getKey(), iVarE.getValue(), null, ((k) iVar2).o());
            }
            kVarJ = kVarP.j(null, null, null, kVarP.f19309d.b(obj, comparator));
        }
        return kVarJ.k();
    }

    @Override // p044d7.i
    public final i c() {
        return this.f19308c;
    }

    @Override // p044d7.i
    public final i e() {
        return this.f19308c.isEmpty() ? this : this.f19308c.e();
    }

    @Override // p044d7.i
    public final i g() {
        i iVar = this.f19309d;
        return iVar.isEmpty() ? this : iVar.g();
    }

    @Override // p044d7.i
    public final Object getKey() {
        return this.f19306a;
    }

    @Override // p044d7.i
    public final Object getValue() {
        return this.f19307b;
    }

    public final k h() {
        i iVar = this.f19308c;
        i iVarF = iVar.f(iVar.d() ? h.BLACK : h.RED, null, null);
        i iVar2 = this.f19309d;
        return f(d() ? h.BLACK : h.RED, iVarF, iVar2.f(iVar2.d() ? h.BLACK : h.RED, null, null));
    }

    @Override // p044d7.i
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final k f(h hVar, i iVar, i iVar2) {
        if (iVar == null) {
            iVar = this.f19308c;
        }
        if (iVar2 == null) {
            iVar2 = this.f19309d;
        }
        h hVar2 = h.RED;
        Object obj = this.f19306a;
        Object obj2 = this.f19307b;
        return hVar == hVar2 ? new j(obj, obj2, iVar, iVar2) : new f(obj, obj2, iVar, iVar2);
    }

    @Override // p044d7.i
    public final boolean isEmpty() {
        return false;
    }

    public abstract k j(Object obj, Object obj2, i iVar, i iVar2);

    public final k k() {
        k kVarP;
        i iVar = this.f19309d;
        if (!iVar.d() || this.f19308c.d()) {
            kVarP = this;
        } else {
            kVarP = (k) iVar.f(l(), f(h.RED, null, ((k) iVar).f19308c), null);
        }
        if (kVarP.f19308c.d() && ((k) kVarP.f19308c).f19308c.d()) {
            kVarP = kVarP.p();
        }
        return (kVarP.f19308c.d() && kVarP.f19309d.d()) ? kVarP.h() : kVarP;
    }

    public abstract h l();

    public final k m() {
        k kVarH = h();
        i iVar = kVarH.f19309d;
        if (!iVar.c().d()) {
            return kVarH;
        }
        k kVarJ = kVarH.j(null, null, null, ((k) iVar).p());
        h hVar = h.RED;
        i iVar2 = kVarJ.f19309d;
        return ((k) iVar2.f(kVarJ.l(), kVarJ.f(hVar, null, ((k) iVar2).f19308c), null)).h();
    }

    @Override // p044d7.i
    public final i n() {
        return this.f19309d;
    }

    public final i o() {
        if (this.f19308c.isEmpty()) {
            return g.f19305a;
        }
        k kVarM = (this.f19308c.d() || this.f19308c.c().d()) ? this : m();
        return kVarM.j(null, null, ((k) kVarM.f19308c).o(), null).k();
    }

    public final k p() {
        return (k) this.f19308c.f(l(), null, f(h.RED, ((k) this.f19308c).f19309d, null));
    }

    public void q(k kVar) {
        this.f19308c = kVar;
    }
}
