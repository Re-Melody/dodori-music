package p089i1;

import B2.AbstractC0112b;
import D7.W;
import java.util.ArrayList;
import java.util.HashMap;
import p009a5.o;
import p144n1.b;
import p144n1.g;
import p144n1.h;
import p144n1.l;
import p154o1.a;
import p154o1.c;
import p154o1.f;
import p154o1.j;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f20467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20468b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f20469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f20470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f20471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f20472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20473g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f20474h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f20475i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f20476j;
    public final p028c1.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f20477l;

    public q(p028c1.b bVar) {
        HashMap map = new HashMap();
        this.f20469c = map;
        this.f20470d = new HashMap();
        this.f20471e = new HashMap();
        b bVar2 = new b(this);
        this.f20472f = bVar2;
        this.f20473g = 0;
        this.f20474h = new ArrayList();
        this.f20475i = new ArrayList();
        this.f20476j = true;
        bVar2.f22833a = 0;
        map.put(0, bVar2);
        this.k = bVar;
        this.f20477l = W.b(0, 0, 15);
        this.f20467a = new o(this, 17);
    }

    public final void a(Object obj) {
        this.f20474h.add(obj);
        this.f20476j = true;
    }

    public final b b(Object obj) {
        HashMap map = this.f20469c;
        h hVar = (h) map.get(obj);
        Object obj2 = hVar;
        if (hVar == null) {
            b bVar = new b(this);
            map.put(obj, bVar);
            bVar.f22833a = obj;
            obj2 = bVar;
        }
        if (obj2 instanceof b) {
            return (b) obj2;
        }
        return null;
    }

    public final int c(Float f10) {
        return Math.round(f10.floatValue());
    }

    public final p154o1.h d(int i10, String str) {
        b bVarB = b(str);
        Object obj = bVarB.f22837c;
        if (obj == null || !(obj instanceof p154o1.h)) {
            p154o1.h hVar = new p154o1.h(this);
            hVar.f23624b = i10;
            hVar.f23629g = str;
            bVarB.f22837c = hVar;
            bVarB.a(hVar.b());
        }
        return (p154o1.h) bVarB.f22837c;
    }

    public final g e(l lVar) {
        g jVar;
        StringBuilder sb = new StringBuilder("__HELPER_KEY_");
        int i10 = this.f20473g;
        this.f20473g = i10 + 1;
        String strI = AbstractC0112b.i(sb, i10, "__");
        HashMap map = this.f20470d;
        g gVar = (g) map.get(strI);
        g gVar2 = gVar;
        if (gVar == null) {
            switch (lVar.ordinal()) {
                case 0:
                    jVar = new j(this, l.HORIZONTAL_CHAIN);
                    break;
                case 1:
                    jVar = new p154o1.l(this, l.VERTICAL_CHAIN);
                    break;
                case 2:
                    a aVar = new a(this, l.ALIGN_VERTICALLY, 0);
                    aVar.f23574o0 = 0.5f;
                    jVar = aVar;
                    break;
                case 3:
                    a aVar2 = new a(this, l.ALIGN_VERTICALLY, 1);
                    aVar2.f23574o0 = 0.5f;
                    jVar = aVar2;
                    break;
                case 4:
                    jVar = new c(this);
                    break;
                case 5:
                default:
                    jVar = new g(this, lVar);
                    break;
                case 6:
                case 7:
                    jVar = new f(this, lVar);
                    break;
                case 8:
                case 9:
                case 10:
                    jVar = new p154o1.g(this, lVar);
                    break;
            }
            jVar.f22833a = strI;
            map.put(strI, jVar);
            gVar2 = jVar;
        }
        return gVar2;
    }
}
