package p037d0;

import C.C0140a0;
import D0.f0;
import M8.D;
import U.C0880d;
import U.C0896l;
import U.C0906q;
import U.C0908r0;
import U.InterfaceC0898m;
import U.U;
import W4.m;
import Z8.c;
import c0.b;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class h implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f19035d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f19036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f19037b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f19038c;

    static {
        d dVar = d.f19022b;
        e eVar = e.f19025b;
        m mVar = o.f19046a;
        f19035d = new m(10, dVar, eVar);
    }

    public h(Map map) {
        this.f19036a = map;
    }

    @Override // p037d0.c
    public final void d(Object obj) {
        f fVar = (f) this.f19037b.get(obj);
        if (fVar != null) {
            fVar.f19029b = false;
        } else {
            this.f19036a.remove(obj);
        }
    }

    @Override // p037d0.c
    public final void e(Object obj, b bVar, InterfaceC0898m interfaceC0898m, int i10) {
        int i11;
        C0906q c0906q = (C0906q) interfaceC0898m;
        c0906q.V(-1198538093);
        if ((i10 & 6) == 0) {
            i11 = (c0906q.h(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0906q.h(bVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0906q.h(this) ? 256 : ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD;
        }
        if ((i11 & 147) == 146 && c0906q.z()) {
            c0906q.N();
        } else {
            c0906q.W(obj);
            Object objI = c0906q.I();
            U u10 = C0896l.f11886a;
            if (objI == u10) {
                k kVar = this.f19038c;
                if (!(kVar != null ? kVar.a(obj) : true)) {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                objI = new f(this, obj);
                c0906q.d0(objI);
            }
            f fVar = (f) objI;
            C0880d.a(m.f19045a.a(fVar.f19030c), bVar, c0906q, (i11 & 112) | 8);
            D d10 = D.f8402a;
            boolean zH = c0906q.h(this) | c0906q.h(obj) | c0906q.h(fVar);
            Object objI2 = c0906q.I();
            if (zH || objI2 == u10) {
                objI2 = new C0140a0(this, obj, fVar, 9);
                c0906q.d0(objI2);
            }
            C0880d.c(d10, (c) objI2, c0906q);
            c0906q.t();
        }
        C0908r0 c0908r0S = c0906q.s();
        if (c0908r0S != null) {
            c0908r0S.f11954d = new f0(i10, 6, this, obj, bVar);
        }
    }
}
