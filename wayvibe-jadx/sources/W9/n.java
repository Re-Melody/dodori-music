package W9;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public StringBuilder f12999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f13000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public char f13001g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public StringBuilder f13002h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f12995a = m.START_DEFINITION;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f12996b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f12997c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f12998d = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f13003i = false;

    public final void a() {
        if (this.f13003i) {
            String strB = Y9.a.b(this.f13000f);
            StringBuilder sb = this.f13002h;
            String strB2 = sb != null ? Y9.a.b(sb.toString()) : null;
            String string = this.f12999e.toString();
            Z9.o oVar = new Z9.o();
            oVar.f14042g = string;
            oVar.f14043h = strB;
            oVar.f14044i = strB2;
            ArrayList arrayList = this.f12998d;
            oVar.d(arrayList);
            arrayList.clear();
            this.f12997c.add(oVar);
            this.f12999e = null;
            this.f13003i = false;
            this.f13000f = null;
            this.f13002h = null;
        }
    }
}
