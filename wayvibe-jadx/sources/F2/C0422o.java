package F2;

import android.content.Context;
import android.os.Looper;
import p255y2.C2329e;

/* JADX INFO: renamed from: F2.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0422o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B2.w f4205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0421n f4206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0421n f4207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0421n f4208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p267z6.o f4209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0421n f4210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Looper f4211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f4212i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C2329e f4213j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f4214l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k0 f4215m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0415h f4216n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f4217o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f4218p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f4219q;
    public boolean r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f4220s;

    public C0422o(Context context) {
        C0421n c0421n = new C0421n(context, 0);
        C0421n c0421n2 = new C0421n(context, 1);
        C0421n c0421n3 = new C0421n(context, 2);
        A8.c cVar = new A8.c(1);
        C0421n c0421n4 = new C0421n(context, 3);
        context.getClass();
        this.f4204a = context;
        this.f4206c = c0421n;
        this.f4207d = c0421n2;
        this.f4208e = c0421n3;
        this.f4209f = cVar;
        this.f4210g = c0421n4;
        int i10 = B2.C.f560a;
        Looper looperMyLooper = Looper.myLooper();
        this.f4211h = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.f4213j = C2329e.f28869e;
        this.k = 1;
        this.f4214l = true;
        this.f4215m = k0.f4185c;
        this.f4216n = new C0415h(0.97f, 1.03f, 1000L, 1.0E-7f, B2.C.I(20L), B2.C.I(500L), 0.999f);
        this.f4205b = B2.w.f636a;
        this.f4217o = 500L;
        this.f4218p = 2000L;
        this.f4219q = true;
        this.f4220s = "";
        this.f4212i = -1000;
    }
}
