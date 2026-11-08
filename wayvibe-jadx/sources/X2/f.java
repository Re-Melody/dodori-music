package X2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f13082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f13083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f13084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f13085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f13086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f13087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f13088g = new boolean[15];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13089h;

    public final boolean a() {
        return this.f13085d > 15 && this.f13089h == 0;
    }

    public final void b(long j10) {
        long j11 = this.f13085d;
        if (j11 == 0) {
            this.f13082a = j10;
        } else if (j11 == 1) {
            long j12 = j10 - this.f13082a;
            this.f13083b = j12;
            this.f13087f = j12;
            this.f13086e = 1L;
        } else {
            long j13 = j10 - this.f13084c;
            int i10 = (int) (j11 % 15);
            long jAbs = Math.abs(j13 - this.f13083b);
            boolean[] zArr = this.f13088g;
            if (jAbs <= 1000000) {
                this.f13086e++;
                this.f13087f += j13;
                if (zArr[i10]) {
                    zArr[i10] = false;
                    this.f13089h--;
                }
            } else if (!zArr[i10]) {
                zArr[i10] = true;
                this.f13089h++;
            }
        }
        this.f13085d++;
        this.f13084c = j10;
    }

    public final void c() {
        this.f13085d = 0L;
        this.f13086e = 0L;
        this.f13087f = 0L;
        this.f13089h = 0;
        Arrays.fill(this.f13088g, false);
    }
}
