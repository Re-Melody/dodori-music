package F2;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class l0 implements P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f4190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f4191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f4193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f4194e;

    public l0(int i10, long j10) {
        this.f4190a = j10;
        this.f4191b = j10 + ((long) i10);
    }

    @Override // F2.P
    public long a() {
        long j10 = this.f4190a;
        if (!this.f4192c) {
            return j10;
        }
        ((B2.w) this.f4193d).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f4191b;
        p255y2.F f10 = (p255y2.F) this.f4194e;
        return f10.f28761a == 1.0f ? B2.C.I(jElapsedRealtime) + j10 : (jElapsedRealtime * ((long) f10.f28763c)) + j10;
    }

    @Override // F2.P
    public void b(p255y2.F f10) {
        if (this.f4192c) {
            d(a());
        }
        this.f4194e = f10;
    }

    public void d(long j10) {
        this.f4190a = j10;
        if (this.f4192c) {
            ((B2.w) this.f4193d).getClass();
            this.f4191b = SystemClock.elapsedRealtime();
        }
    }

    @Override // F2.P
    public p255y2.F e() {
        return (p255y2.F) this.f4194e;
    }

    public void f() {
        if (this.f4192c) {
            return;
        }
        ((B2.w) this.f4193d).getClass();
        this.f4191b = SystemClock.elapsedRealtime();
        this.f4192c = true;
    }
}
