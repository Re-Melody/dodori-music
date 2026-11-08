package p213u3;

import B2.u;
import D2.m;
import Z2.F;
import Z2.q;
import org.maplibre.android.location.C2198e;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public F f27204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f27205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f27206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f27207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f27208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f27209g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f27210h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f27211i;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f27213l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f27214m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f27203a = new m(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C2198e f27212j = new C2198e();

    public void a(long j10) {
        this.f27209g = j10;
    }

    public abstract long b(u uVar);

    public abstract boolean c(u uVar, long j10, C2198e c2198e);

    public void d(boolean z10) {
        if (z10) {
            this.f27212j = new C2198e();
            this.f27208f = 0L;
            this.f27210h = 0;
        } else {
            this.f27210h = 1;
        }
        this.f27207e = -1L;
        this.f27209g = 0L;
    }
}
