package D8;

import Z4.C0981n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p200t0.C2243j;

/* JADX INFO: renamed from: D8.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0314t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f2787b;

    public C0314t0(JSONArray jSONArray) {
        this.f2786a = 2;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new C0981n(jSONObjectOptJSONObject));
                }
            }
        }
        this.f2787b = arrayList;
    }

    public void a(List list) {
        if (list.isEmpty()) {
            return;
        }
        if (this.f2787b == null) {
            this.f2787b = new ArrayList();
        }
        if (this.f2787b.isEmpty()) {
            this.f2787b.addAll(list);
            return;
        }
        int size = this.f2787b.size() - 1;
        Z9.w wVar = (Z9.w) this.f2787b.get(size);
        Z9.w wVar2 = (Z9.w) list.get(0);
        int i10 = wVar.f14056a;
        if (i10 == wVar2.f14056a) {
            int i11 = wVar.f14057b;
            int i12 = wVar.f14058c;
            if (i11 + i12 == wVar2.f14057b) {
                this.f2787b.set(size, new Z9.w(i10, i11, i12 + wVar2.f14058c));
                this.f2787b.addAll(list.subList(1, list.size()));
                return;
            }
        }
        this.f2787b.addAll(list);
    }

    public void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a(((Z9.r) it.next()).b());
        }
    }

    public void c(Object obj, String str) {
        this.f2787b.add(str + com.amazon.a.a.o.b.f.f16452b + obj);
    }

    public void d() {
        this.f2787b.add(C2243j.f26496c);
    }

    public void e(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f2787b.add(new p200t0.k(f10, f11, f12, f13, f14, f15));
    }

    public void f(float f10) {
        this.f2787b.add(new p200t0.l(f10));
    }

    public void g(float f10) {
        this.f2787b.add(new p200t0.t(f10));
    }

    public void h(float f10, float f11) {
        this.f2787b.add(new p200t0.m(f10, f11));
    }

    public void i(float f10, float f11) {
        this.f2787b.add(new p200t0.u(f10, f11));
    }

    public void j(float f10, float f11) {
        this.f2787b.add(new p200t0.n(f10, f11));
    }

    public void k(float f10, float f11) {
        this.f2787b.add(new p200t0.v(f10, f11));
    }

    public void l(float f10, float f11, float f12, float f13) {
        this.f2787b.add(new p200t0.w(f10, f11, f12, f13));
    }

    public void m(float f10, float f11, float f12, float f13) {
        this.f2787b.add(new p200t0.x(f10, f11, f12, f13));
    }

    public void n(float f10, float f11) {
        this.f2787b.add(new p200t0.q(f10, f11));
    }

    public void o(float f10, float f11) {
        this.f2787b.add(new p200t0.y(f10, f11));
    }

    public void p(float f10) {
        this.f2787b.add(new p200t0.z(f10));
    }

    public String toString() {
        switch (this.f2786a) {
            case 0:
                return this.f2787b.toString();
            default:
                return super.toString();
        }
    }

    public C0314t0(int i10) {
        this.f2786a = i10;
        switch (i10) {
            case 1:
                this.f2787b = new ArrayList();
                break;
            case 2:
            default:
                this.f2787b = new ArrayList();
                break;
            case 3:
                break;
            case 4:
                this.f2787b = new ArrayList(32);
                break;
        }
    }
}
