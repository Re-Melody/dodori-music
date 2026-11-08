package p250x8;

import D7.W;
import M8.D;
import M8.n;
import M8.o;
import V0.p;
import Z8.c;
import android.util.Log;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W4.m f28648b;

    public /* synthetic */ m(W4.m mVar, int i10) {
        this.f28647a = i10;
        this.f28648b = mVar;
    }

    @Override // Z8.c
    public final Object invoke(Object obj) {
        List listU;
        List listU2;
        List listU3;
        List listU4;
        List listU5;
        o oVar = (o) obj;
        switch (this.f28647a) {
            case 0:
                Throwable thA = o.a(oVar.f8416a);
                W4.m mVar = this.f28648b;
                if (thA != null) {
                    if (thA instanceof e) {
                        e eVar = (e) thA;
                        listU = W.U(eVar.f28634a, eVar.f28635b, null);
                    } else {
                        listU = W.U(thA.getClass().getSimpleName(), thA.toString(), p.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(thA), thA.getCause()));
                    }
                    mVar.d(listU);
                } else {
                    Object obj2 = oVar.f8416a;
                    mVar.d(W.T((d) (obj2 instanceof n ? null : obj2)));
                }
                break;
            case 1:
                Throwable thA2 = o.a(oVar.f8416a);
                W4.m mVar2 = this.f28648b;
                if (thA2 != null) {
                    if (thA2 instanceof e) {
                        e eVar2 = (e) thA2;
                        listU2 = W.U(eVar2.f28634a, eVar2.f28635b, null);
                    } else {
                        listU2 = W.U(thA2.getClass().getSimpleName(), thA2.toString(), p.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(thA2), thA2.getCause()));
                    }
                    mVar2.d(listU2);
                } else {
                    mVar2.d(W.T(null));
                }
                break;
            case 2:
                Throwable thA3 = o.a(oVar.f8416a);
                W4.m mVar3 = this.f28648b;
                if (thA3 != null) {
                    if (thA3 instanceof e) {
                        e eVar3 = (e) thA3;
                        listU3 = W.U(eVar3.f28634a, eVar3.f28635b, null);
                    } else {
                        listU3 = W.U(thA3.getClass().getSimpleName(), thA3.toString(), p.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(thA3), thA3.getCause()));
                    }
                    mVar3.d(listU3);
                } else {
                    mVar3.d(W.T(null));
                }
                break;
            case 3:
                Throwable thA4 = o.a(oVar.f8416a);
                W4.m mVar4 = this.f28648b;
                if (thA4 != null) {
                    if (thA4 instanceof e) {
                        e eVar4 = (e) thA4;
                        listU4 = W.U(eVar4.f28634a, eVar4.f28635b, null);
                    } else {
                        listU4 = W.U(thA4.getClass().getSimpleName(), thA4.toString(), p.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(thA4), thA4.getCause()));
                    }
                    mVar4.d(listU4);
                } else {
                    Object obj3 = oVar.f8416a;
                    mVar4.d(W.T((k) (obj3 instanceof n ? null : obj3)));
                }
                break;
            default:
                Throwable thA5 = o.a(oVar.f8416a);
                W4.m mVar5 = this.f28648b;
                if (thA5 != null) {
                    if (thA5 instanceof e) {
                        e eVar5 = (e) thA5;
                        listU5 = W.U(eVar5.f28634a, eVar5.f28635b, null);
                    } else {
                        listU5 = W.U(thA5.getClass().getSimpleName(), thA5.toString(), p.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(thA5), thA5.getCause()));
                    }
                    mVar5.d(listU5);
                } else {
                    mVar5.d(W.T(null));
                }
                break;
        }
        return D.f8402a;
    }
}
