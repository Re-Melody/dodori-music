package F;

import U.A0;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;

/* JADX INFO: renamed from: F.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0357b implements A0, Runnable, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static long f3518g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f3519a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3521c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f3524f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W.d f3520b = new W.d(new Y[16]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Choreographer f3522d = Choreographer.getInstance();

    /* JADX WARN: Code duplicated, block: B:10:0x0035  */
    public RunnableC0357b(View view) {
        float refreshRate;
        this.f3519a = view;
        if (f3518g == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                refreshRate = display.getRefreshRate();
                refreshRate = refreshRate < 30.0f ? 60.0f : refreshRate;
            }
            f3518g = (long) (1000000000 / refreshRate);
        }
    }

    @Override // U.A0
    public final void b() {
        this.f3523e = false;
        this.f3519a.removeCallbacks(this);
        this.f3522d.removeFrameCallback(this);
    }

    @Override // U.A0
    public final void c() {
        this.f3523e = true;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        if (this.f3523e) {
            this.f3524f = j10;
            this.f3519a.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        W.d dVar = this.f3520b;
        if (dVar.l() || !this.f3521c || !this.f3523e || this.f3519a.getWindowVisibility() != 0) {
            this.f3521c = false;
            return;
        }
        long j10 = this.f3524f + f3518g;
        C0356a c0356a = new C0356a();
        c0356a.f3516a = j10;
        boolean z10 = false;
        while (dVar.m() && !z10) {
            if (c0356a.a() <= 0 || ((Y) dVar.f12756a[0]).b(c0356a)) {
                z10 = true;
            } else {
                dVar.o(0);
            }
        }
        if (z10) {
            this.f3522d.postFrameCallback(this);
        } else {
            this.f3521c = false;
        }
    }

    @Override // U.A0
    public final void a() {
    }
}
