package F2;

import O2.C0688b;
import android.content.Context;
import java.util.HashMap;

/* JADX INFO: renamed from: F2.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0421n implements p267z6.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f4203b;

    public /* synthetic */ C0421n(Context context, int i10) {
        this.f4202a = i10;
        this.f4203b = context;
    }

    @Override // p267z6.o
    public Object get() {
        V2.g gVar;
        switch (this.f4202a) {
            case 0:
                return new C0419l(this.f4203b);
            case 1:
                new Z2.m();
                new ua.c(5, (byte) 0);
                this.f4203b.getApplicationContext();
                p050e5.f fVar = new p050e5.f(16);
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                map.clear();
                map2.clear();
                return fVar;
            case 2:
                return new U2.p(this.f4203b);
            default:
                Context context = this.f4203b;
                A6.W w10 = V2.g.f12491n;
                synchronized (V2.g.class) {
                    try {
                        if (V2.g.f12496t == null) {
                            C0688b c0688b = new C0688b(context);
                            V2.g.f12496t = new V2.g((Context) c0688b.f9029c, (HashMap) c0688b.f9030d, c0688b.f9027a, (B2.w) c0688b.f9031e, c0688b.f9028b);
                        }
                        gVar = V2.g.f12496t;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return gVar;
        }
    }
}
