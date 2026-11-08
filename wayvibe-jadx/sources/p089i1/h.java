package p089i1;

import G0.RunnableC0510y;
import M8.D;
import Z8.a;
import Z8.c;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class h extends n implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f20447b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, int i10) {
        super(1);
        this.f20446a = i10;
        this.f20447b = iVar;
    }

    @Override // Z8.c
    public final Object invoke(Object obj) {
        switch (this.f20446a) {
            case 0:
                a aVar = (a) obj;
                if (m.b(Looper.myLooper(), Looper.getMainLooper())) {
                    aVar.invoke();
                } else {
                    i iVar = this.f20447b;
                    Handler handler = iVar.f20449b;
                    if (handler == null) {
                        handler = new Handler(Looper.getMainLooper());
                        iVar.f20449b = handler;
                    }
                    handler.post(new RunnableC0510y(8, aVar));
                }
                break;
            default:
                this.f20447b.f20451d = true;
                break;
        }
        return D.f8402a;
    }
}
