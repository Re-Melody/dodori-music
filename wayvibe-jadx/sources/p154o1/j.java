package p154o1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p089i1.q;
import p144n1.b;

/* JADX INFO: loaded from: classes.dex */
public final class j extends d {
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
                qVar.b(it.next()).g();
            }
        }
        b bVar = null;
        b bVar2 = null;
        for (Object obj : arrayList) {
            b bVarB = qVar.b(obj);
            if (bVar2 == null) {
                Object obj2 = this.f22820N;
                if (obj2 != null) {
                    bVarB.o(obj2);
                    bVarB.k(this.f22853l).m(this.r);
                } else {
                    Object obj3 = this.f22821O;
                    if (obj3 != null) {
                        bVarB.f22840d0 = p144n1.j.START_TO_END;
                        bVarB.f22821O = obj3;
                        bVarB.k(this.f22853l).m(this.r);
                    } else {
                        Object obj4 = this.f22816J;
                        if (obj4 != null) {
                            bVarB.o(obj4);
                            bVarB.k(this.f22851j).m(this.f22857p);
                        } else {
                            Object obj5 = this.f22817K;
                            if (obj5 != null) {
                                bVarB.f22840d0 = p144n1.j.START_TO_END;
                                bVarB.f22821O = obj5;
                                bVarB.k(this.f22851j).m(this.f22857p);
                            } else {
                                String string = bVarB.f22833a.toString();
                                bVarB.o(0);
                                bVarB.l(Float.valueOf(w(string))).n(Float.valueOf(v(string)));
                            }
                        }
                    }
                }
                bVar2 = bVarB;
            }
            if (bVar != null) {
                String string2 = bVar.f22833a.toString();
                String string3 = bVarB.f22833a.toString();
                Object obj6 = bVarB.f22833a;
                bVar.f22840d0 = p144n1.j.END_TO_START;
                bVar.f22822P = obj6;
                bVar.l(Float.valueOf(u(string2))).n(Float.valueOf(t(string2)));
                Object obj7 = bVar.f22833a;
                bVarB.f22840d0 = p144n1.j.START_TO_END;
                bVarB.f22821O = obj7;
                bVarB.l(Float.valueOf(w(string3))).n(Float.valueOf(v(string3)));
            }
            String string4 = obj.toString();
            HashMap map = this.f23580o0;
            float fFloatValue = map.containsKey(string4) ? ((Float) map.get(string4)).floatValue() : -1.0f;
            if (fFloatValue != -1.0f) {
                bVarB.f22843f = fFloatValue;
            }
            bVar = bVarB;
        }
        if (bVar != null) {
            Object obj8 = this.f22822P;
            if (obj8 != null) {
                bVar.f22840d0 = p144n1.j.END_TO_START;
                bVar.f22822P = obj8;
                bVar.k(this.f22854m).m(this.f22859s);
            } else {
                Object obj9 = this.f22823Q;
                if (obj9 != null) {
                    bVar.i(obj9);
                    bVar.k(this.f22854m).m(this.f22859s);
                } else {
                    Object obj10 = this.f22818L;
                    if (obj10 != null) {
                        bVar.f22840d0 = p144n1.j.END_TO_START;
                        bVar.f22822P = obj10;
                        bVar.k(this.k).m(this.f22858q);
                    } else {
                        Object obj11 = this.f22819M;
                        if (obj11 != null) {
                            bVar.i(obj11);
                            bVar.k(this.k).m(this.f22858q);
                        } else {
                            String string5 = bVar.f22833a.toString();
                            bVar.i(0);
                            bVar.l(Float.valueOf(u(string5))).n(Float.valueOf(t(string5)));
                        }
                    }
                }
            }
        }
        if (bVar2 == null) {
            return;
        }
        float f10 = this.f23579n0;
        if (f10 != 0.5f) {
            bVar2.f22847h = f10;
        }
        int i10 = i.f23630a[this.f23585t0.ordinal()];
        if (i10 == 1) {
            bVar2.f22839d = 0;
        } else if (i10 == 2) {
            bVar2.f22839d = 1;
        } else {
            if (i10 != 3) {
                return;
            }
            bVar2.f22839d = 2;
        }
    }
}
