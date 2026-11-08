package p154o1;

import java.util.Iterator;
import p089i1.q;
import p144n1.b;
import p144n1.g;
import p144n1.j;
import p144n1.l;

/* JADX INFO: loaded from: classes.dex */
public final class a extends g {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final /* synthetic */ int f23573n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public float f23574o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(q qVar, l lVar, int i10) {
        super(qVar, lVar);
        this.f23573n0 = i10;
    }

    @Override // p144n1.g, p144n1.b, p144n1.h
    public final void apply() {
        switch (this.f23573n0) {
            case 0:
                Iterator it = this.f22888m0.iterator();
                while (it.hasNext()) {
                    b bVarB = this.f22886k0.b(it.next());
                    bVarB.g();
                    Object obj = this.f22820N;
                    if (obj != null) {
                        bVarB.o(obj);
                    } else {
                        Object obj2 = this.f22821O;
                        if (obj2 != null) {
                            bVarB.f22840d0 = j.START_TO_END;
                            bVarB.f22821O = obj2;
                        } else {
                            bVarB.o(0);
                        }
                    }
                    Object obj3 = this.f22822P;
                    if (obj3 != null) {
                        bVarB.f22840d0 = j.END_TO_START;
                        bVarB.f22822P = obj3;
                    } else {
                        Object obj4 = this.f22823Q;
                        if (obj4 != null) {
                            bVarB.i(obj4);
                        } else {
                            bVarB.i(0);
                        }
                    }
                    float f10 = this.f23574o0;
                    if (f10 != 0.5f) {
                        bVarB.f22847h = f10;
                    }
                }
                break;
            default:
                Iterator it2 = this.f22888m0.iterator();
                while (it2.hasNext()) {
                    b bVarB2 = this.f22886k0.b(it2.next());
                    bVarB2.h();
                    Object obj5 = this.f22824R;
                    if (obj5 != null) {
                        bVarB2.p(obj5);
                    } else {
                        Object obj6 = this.f22825S;
                        if (obj6 != null) {
                            bVarB2.f22840d0 = j.TOP_TO_BOTTOM;
                            bVarB2.f22825S = obj6;
                        } else {
                            bVarB2.p(0);
                        }
                    }
                    Object obj7 = this.f22827U;
                    if (obj7 != null) {
                        bVarB2.f22840d0 = j.BOTTOM_TO_TOP;
                        bVarB2.f22827U = obj7;
                    } else {
                        Object obj8 = this.f22828V;
                        if (obj8 != null) {
                            bVarB2.e(obj8);
                        } else {
                            bVarB2.e(0);
                        }
                    }
                    float f11 = this.f23574o0;
                    if (f11 != 0.5f) {
                        bVarB2.f22849i = f11;
                    }
                }
                break;
        }
    }
}
