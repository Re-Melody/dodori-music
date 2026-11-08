package G2;

import R2.D;
import java.util.Arrays;
import p255y2.O;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O f5352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D f5354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final O f5356f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5357g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final D f5358h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f5359i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f5360j;

    public a(long j10, O o10, int i10, D d10, long j11, O o11, int i11, D d11, long j12, long j13) {
        this.f5351a = j10;
        this.f5352b = o10;
        this.f5353c = i10;
        this.f5354d = d10;
        this.f5355e = j11;
        this.f5356f = o11;
        this.f5357g = i11;
        this.f5358h = d11;
        this.f5359i = j12;
        this.f5360j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f5351a == aVar.f5351a && this.f5353c == aVar.f5353c && this.f5355e == aVar.f5355e && this.f5357g == aVar.f5357g && this.f5359i == aVar.f5359i && this.f5360j == aVar.f5360j && p228v8.c.d(this.f5352b, aVar.f5352b) && p228v8.c.d(this.f5354d, aVar.f5354d) && p228v8.c.d(this.f5356f, aVar.f5356f) && p228v8.c.d(this.f5358h, aVar.f5358h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f5351a), this.f5352b, Integer.valueOf(this.f5353c), this.f5354d, Long.valueOf(this.f5355e), this.f5356f, Integer.valueOf(this.f5357g), this.f5358h, Long.valueOf(this.f5359i), Long.valueOf(this.f5360j)});
    }
}
