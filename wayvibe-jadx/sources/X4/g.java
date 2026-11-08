package X4;

import android.os.SystemClock;
import java.util.Map;
import p235w4.AbstractC2294b;
import p235w4.t;

/* JADX INFO: loaded from: classes.dex */
public final class g implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f13223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f13224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f13226d;

    public g(p050e5.e eVar, long j10, long j11, boolean z10) {
        this.f13226d = eVar;
        this.f13223a = j10;
        this.f13224b = j11;
        this.f13225c = z10;
    }

    public static g c(Map map) {
        if (map == null) {
            return new g(p050e5.e.best, 0L, 5000L, false);
        }
        Integer num = (Integer) map.get("accuracy");
        Integer num2 = (Integer) map.get("distanceFilter");
        Integer num3 = (Integer) map.get("timeInterval");
        Boolean bool = (Boolean) map.get("useMSLAltitude");
        p050e5.e eVar = p050e5.e.best;
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue == 0) {
                eVar = p050e5.e.lowest;
            } else if (iIntValue == 1) {
                eVar = p050e5.e.low;
            } else if (iIntValue == 2) {
                eVar = p050e5.e.medium;
            } else if (iIntValue == 3) {
                eVar = p050e5.e.high;
            } else if (iIntValue == 5) {
                eVar = p050e5.e.bestForNavigation;
            }
        }
        return new g(eVar, num2 != null ? num2.intValue() : 0L, num3 != null ? num3.intValue() : 5000L, bool != null && bool.booleanValue());
    }

    @Override // X4.c
    public t a(t tVar) {
        if (this.f13225c) {
            b(h());
        }
        this.f13226d = tVar;
        return tVar;
    }

    public void b(long j10) {
        this.f13223a = j10;
        if (this.f13225c) {
            this.f13224b = SystemClock.elapsedRealtime();
        }
    }

    @Override // X4.c
    public long h() {
        long j10 = this.f13223a;
        if (!this.f13225c) {
            return j10;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f13224b;
        t tVar = (t) this.f13226d;
        return tVar.f28036a == 1.0f ? AbstractC2294b.b(jElapsedRealtime) + j10 : (jElapsedRealtime * ((long) tVar.f28037b)) + j10;
    }

    @Override // X4.c
    public t i() {
        return (t) this.f13226d;
    }
}
