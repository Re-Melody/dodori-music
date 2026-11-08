package f1;

import F0.p0;
import G0.A;
import M8.D;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.n implements Z8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f19678b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(p pVar, int i10) {
        super(1);
        this.f19677a = i10;
        this.f19678b = pVar;
    }

    @Override // Z8.c
    public final Object invoke(Object obj) {
        boolean zDispatchTouchEvent;
        switch (this.f19677a) {
            case 0:
                p0 p0Var = (p0) obj;
                A a10 = p0Var instanceof A ? (A) p0Var : null;
                p pVar = this.f19678b;
                if (a10 != null) {
                    A9.p pVar2 = new A9.p(7, a10, pVar);
                    W.d dVar = a10.H0;
                    if (!dVar.i(pVar2)) {
                        dVar.b(pVar2);
                    }
                }
                pVar.removeAllViewsInLayout();
                return D.f8402a;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                p pVar3 = this.f19678b;
                switch (actionMasked) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = pVar3.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = pVar3.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
        }
    }
}
