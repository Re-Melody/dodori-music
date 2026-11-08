package p068g1;

import D0.InterfaceC0195v;
import G0.RunnableC0510y;
import M8.D;
import Z8.a;
import Z8.c;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p028c1.j;

/* JADX INFO: loaded from: classes.dex */
public final class i extends n implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f20001b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(u uVar, int i10) {
        super(1);
        this.f20000a = i10;
        this.f20001b = uVar;
    }

    @Override // Z8.c
    public final Object invoke(Object obj) {
        switch (this.f20000a) {
            case 0:
                InterfaceC0195v interfaceC0195vL = ((InterfaceC0195v) obj).L();
                m.c(interfaceC0195vL);
                this.f20001b.h(interfaceC0195vL);
                break;
            case 1:
                j jVar = new j(((j) obj).f15858a);
                u uVar = this.f20001b;
                uVar.m911setPopupContentSizefhxjrPA(jVar);
                uVar.i();
                break;
            default:
                a aVar = (a) obj;
                u uVar2 = this.f20001b;
                Handler handler = uVar2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar.invoke();
                } else {
                    Handler handler2 = uVar2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC0510y(7, aVar));
                    }
                }
                break;
        }
        return D.f8402a;
    }
}
