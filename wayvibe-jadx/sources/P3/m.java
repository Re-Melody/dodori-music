package P3;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class m extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f9580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f9581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f9583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f9584e;

    public m(o oVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f9584e = oVar;
        this.f9580a = obj;
        this.f9581b = arrayList;
        this.f9582c = obj2;
        this.f9583d = arrayList2;
    }

    @Override // P3.r
    public final void a(s sVar) {
        sVar.w(this);
    }

    @Override // P3.t, P3.r
    public final void c(s sVar) {
        o oVar = this.f9584e;
        Object obj = this.f9580a;
        if (obj != null) {
            oVar.t(obj, this.f9581b, null);
        }
        Object obj2 = this.f9582c;
        if (obj2 != null) {
            oVar.t(obj2, this.f9583d, null);
        }
    }
}
