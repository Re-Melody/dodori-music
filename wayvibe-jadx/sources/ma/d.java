package ma;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f22547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f22548d;

    public d(c cVar) {
        this.f22545a = cVar.f22541a;
        this.f22546b = cVar.f22542b;
        this.f22547c = cVar.f22543c;
        this.f22548d = cVar.f22544d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f22545a == dVar.f22545a && this.f22546b == dVar.f22546b && Float.compare(dVar.f22547c, this.f22547c) == 0 && this.f22548d == dVar.f22548d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f22545a;
        int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + this.f22546b) * 31;
        float f10 = this.f22547c;
        int iFloatToIntBits = f10 != 0.0f ? Float.floatToIntBits(f10) : 0;
        long j11 = this.f22548d;
        return ((((i10 + iFloatToIntBits) * 31) + ((int) 0)) * 31) + ((int) ((j11 >>> 32) ^ j11));
    }
}
