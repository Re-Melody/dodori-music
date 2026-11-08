package p037d0;

import U.A0;
import U.U;
import U.W0;
import p048e0.q;
import p242x0.c;

/* JADX INFO: loaded from: classes.dex */
public final class b implements A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f19015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f19016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f19017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f19018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f19019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j f19020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Z0.b f19021g = new Z0.b(this, 2);

    public b(n nVar, k kVar, String str, Object obj, Object[] objArr) {
        this.f19015a = nVar;
        this.f19016b = kVar;
        this.f19017c = str;
        this.f19018d = obj;
        this.f19019e = objArr;
    }

    @Override // U.A0
    public final void a() {
        j jVar = this.f19020f;
        if (jVar != null) {
            ((W0) jVar).D();
        }
    }

    @Override // U.A0
    public final void b() {
        j jVar = this.f19020f;
        if (jVar != null) {
            ((W0) jVar).D();
        }
    }

    @Override // U.A0
    public final void c() throws Exception {
        d();
    }

    public final void d() throws Exception {
        String strN;
        k kVar = this.f19016b;
        if (this.f19020f != null) {
            throw new IllegalArgumentException(("entry(" + this.f19020f + ") is not null").toString());
        }
        if (kVar != null) {
            Z0.b bVar = this.f19021g;
            Object objInvoke = bVar.invoke();
            if (objInvoke == null || kVar.a(objInvoke)) {
                this.f19020f = kVar.b(this.f19017c, bVar);
                return;
            }
            if (objInvoke instanceof q) {
                q qVar = (q) objInvoke;
                if (qVar.l() == U.f11812c || qVar.l() == U.f11815f || qVar.l() == U.f11813d) {
                    strN = "MutableState containing " + qVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strN = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strN = c.n(objInvoke);
            }
            throw new IllegalArgumentException(strN);
        }
    }
}
