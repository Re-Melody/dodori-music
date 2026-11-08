package p205t5;

import B2.AbstractC0112b;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f26834f = new a(10485760, 200, 10000, 604800000, 81920);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f26838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26839e;

    public a(long j10, int i10, int i11, long j11, int i12) {
        this.f26835a = j10;
        this.f26836b = i10;
        this.f26837c = i11;
        this.f26838d = j11;
        this.f26839e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f26835a == aVar.f26835a && this.f26836b == aVar.f26836b && this.f26837c == aVar.f26837c && this.f26838d == aVar.f26838d && this.f26839e == aVar.f26839e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f26835a;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f26836b) * 1000003) ^ this.f26837c) * 1000003;
        long j11 = this.f26838d;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f26839e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f26835a);
        sb.append(", loadBatchSize=");
        sb.append(this.f26836b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f26837c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.f26838d);
        sb.append(", maxBlobByteSizePerRow=");
        return AbstractC0112b.i(sb, this.f26839e, "}");
    }
}
