package p154o1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p089i1.q;
import p144n1.b;
import p144n1.j;

/* JADX INFO: loaded from: classes.dex */
public final class l extends d {
    @Override // p144n1.g, p144n1.b, p144n1.h
    public final void apply() {
        q qVar;
        ArrayList arrayList = this.f22888m0;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            qVar = this.f22886k0;
            if (!zHasNext) {
                break;
            } else {
                qVar.b(it.next()).h();
            }
        }
        b bVar = null;
        b bVar2 = null;
        for (Object obj : arrayList) {
            b bVarB = qVar.b(obj);
            if (bVar2 == null) {
                Object obj2 = this.f22824R;
                if (obj2 != null) {
                    bVarB.p(obj2);
                    bVarB.k(this.f22855n).m(this.f22860t);
                } else {
                    Object obj3 = this.f22825S;
                    if (obj3 != null) {
                        bVarB.f22840d0 = j.TOP_TO_BOTTOM;
                        bVarB.f22825S = obj3;
                        bVarB.k(this.f22855n).m(this.f22860t);
                    } else {
                        String string = bVarB.f22833a.toString();
                        bVarB.p(0);
                        bVarB.l(Float.valueOf(w(string))).n(Float.valueOf(v(string)));
                    }
                }
                bVar2 = bVarB;
            }
            if (bVar != null) {
                String string2 = bVar.f22833a.toString();
                String string3 = bVarB.f22833a.toString();
                Object obj4 = bVarB.f22833a;
                bVar.f22840d0 = j.BOTTOM_TO_TOP;
                bVar.f22827U = obj4;
                bVar.l(Float.valueOf(u(string2))).n(Float.valueOf(t(string2)));
                Object obj5 = bVar.f22833a;
                bVarB.f22840d0 = j.TOP_TO_BOTTOM;
                bVarB.f22825S = obj5;
                bVarB.l(Float.valueOf(w(string3))).n(Float.valueOf(v(string3)));
            }
            String string4 = obj.toString();
            HashMap map = this.f23580o0;
            float fFloatValue = map.containsKey(string4) ? ((Float) map.get(string4)).floatValue() : -1.0f;
            if (fFloatValue != -1.0f) {
                bVarB.f22845g = fFloatValue;
            }
            bVar = bVarB;
        }
        if (bVar != null) {
            Object obj6 = this.f22827U;
            if (obj6 != null) {
                bVar.f22840d0 = j.BOTTOM_TO_TOP;
                bVar.f22827U = obj6;
                bVar.k(this.f22856o).m(this.f22861u);
            } else {
                Object obj7 = this.f22828V;
                if (obj7 != null) {
                    bVar.e(obj7);
                    bVar.k(this.f22856o).m(this.f22861u);
                } else {
                    String string5 = bVar.f22833a.toString();
                    bVar.e(0);
                    bVar.l(Float.valueOf(u(string5))).n(Float.valueOf(t(string5)));
                }
            }
        }
        if (bVar2 == null) {
            return;
        }
        float f10 = this.f23579n0;
        if (f10 != 0.5f) {
            bVar2.f22849i = f10;
        }
        int i10 = k.f23631a[this.f23585t0.ordinal()];
        if (i10 == 1) {
            bVar2.f22841e = 0;
        } else if (i10 == 2) {
            bVar2.f22841e = 1;
        } else {
            if (i10 != 3) {
                return;
            }
            bVar2.f22841e = 2;
        }
    }
}
