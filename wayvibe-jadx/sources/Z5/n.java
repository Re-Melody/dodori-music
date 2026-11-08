package Z5;

import android.os.WorkSource;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f13860c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f13861d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f13862e = Long.MAX_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13863f = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f13864g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13865h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f13866i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13867j = 0;
    public int k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f13868l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public WorkSource f13869m = null;

    public n(int i10, long j10) {
        this.f13858a = 102;
        com.google.android.gms.common.internal.E.a("intervalMillis must be greater than or equal to 0", j10 >= 0);
        this.f13859b = j10;
        A.b(i10);
        this.f13858a = i10;
    }

    public final LocationRequest a() {
        int i10 = this.f13858a;
        long j10 = this.f13859b;
        long jMin = this.f13860c;
        if (jMin == -1) {
            jMin = j10;
        } else if (i10 != 105) {
            jMin = Math.min(jMin, j10);
        }
        long jMax = Math.max(this.f13861d, this.f13859b);
        long j11 = this.f13862e;
        int i11 = this.f13863f;
        float f10 = this.f13864g;
        boolean z10 = this.f13865h;
        long j12 = this.f13866i;
        if (j12 == -1) {
            j12 = this.f13859b;
        }
        return new LocationRequest(i10, j10, jMin, jMax, Long.MAX_VALUE, j11, i11, f10, z10, j12, this.f13867j, this.k, this.f13868l, new WorkSource(this.f13869m), null);
    }

    public final void b(int i10) {
        int i11;
        boolean z10 = true;
        if (i10 == 0 || i10 == 1) {
            i11 = i10;
        } else {
            i11 = 2;
            if (i10 != 2) {
                z10 = false;
                i11 = i10;
            }
        }
        com.google.android.gms.common.internal.E.b("granularity %d must be a Granularity.GRANULARITY_* constant", z10, Integer.valueOf(i11));
        this.f13867j = i10;
    }

    public final void c(long j10) {
        boolean z10 = true;
        if (j10 != -1 && j10 < 0) {
            z10 = false;
        }
        com.google.android.gms.common.internal.E.a("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", z10);
        this.f13866i = j10;
    }

    public final void d(long j10) {
        boolean z10 = true;
        if (j10 != -1 && j10 < 0) {
            z10 = false;
        }
        com.google.android.gms.common.internal.E.a("minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL", z10);
        this.f13860c = j10;
    }
}
