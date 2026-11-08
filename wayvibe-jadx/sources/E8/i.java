package E8;

import D8.C0275g;
import D8.t2;
import D8.u2;
import D8.x2;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p268z7.c f3210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f3211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p268z7.c f3212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f3213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x2 f3214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SSLSocketFactory f3215f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final io.grpc.okhttp.internal.c f3216g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3217h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f3218i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0275g f3219j;
    public final long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f3220l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f3221m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3222n;

    public i(p268z7.c cVar, p268z7.c cVar2, SSLSocketFactory sSLSocketFactory, io.grpc.okhttp.internal.c cVar3, int i10, boolean z10, long j10, long j11, int i11, int i12, x2 x2Var) {
        this.f3210a = cVar;
        this.f3211b = (Executor) u2.a((t2) cVar.f29899b);
        this.f3212c = cVar2;
        this.f3213d = (ScheduledExecutorService) u2.a((t2) cVar2.f29899b);
        this.f3215f = sSLSocketFactory;
        this.f3216g = cVar3;
        this.f3217h = i10;
        this.f3218i = z10;
        this.f3219j = new C0275g(j10);
        this.k = j11;
        this.f3220l = i11;
        this.f3221m = i12;
        p229v9.a.k(x2Var, "transportTracerFactory");
        this.f3214e = x2Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3222n) {
            return;
        }
        this.f3222n = true;
        u2.b((t2) this.f3210a.f29899b, this.f3211b);
        u2.b((t2) this.f3212c.f29899b, this.f3213d);
    }
}
