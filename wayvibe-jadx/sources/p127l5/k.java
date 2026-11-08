package p127l5;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class k extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f22029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f22031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f22032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f22033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f22034g;

    public k(long j10, Integer num, long j11, byte[] bArr, String str, long j12, n nVar) {
        this.f22028a = j10;
        this.f22029b = num;
        this.f22030c = j11;
        this.f22031d = bArr;
        this.f22032e = str;
        this.f22033f = j12;
        this.f22034g = nVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        k kVar = (k) rVar;
        if (this.f22028a != kVar.f22028a) {
            return false;
        }
        Integer num = this.f22029b;
        if (num == null) {
            if (kVar.f22029b != null) {
                return false;
            }
        } else if (!num.equals(kVar.f22029b)) {
            return false;
        }
        if (this.f22030c != kVar.f22030c) {
            return false;
        }
        if (!Arrays.equals(this.f22031d, rVar instanceof k ? ((k) rVar).f22031d : kVar.f22031d)) {
            return false;
        }
        String str = kVar.f22032e;
        String str2 = this.f22032e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f22033f != kVar.f22033f) {
            return false;
        }
        n nVar = kVar.f22034g;
        n nVar2 = this.f22034g;
        if (nVar2 == null) {
            return nVar == null;
        }
        return nVar2.equals(nVar);
    }

    public final int hashCode() {
        long j10 = this.f22028a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f22029b;
        int iHashCode = (i10 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j11 = this.f22030c;
        int iHashCode2 = (((iHashCode ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f22031d)) * 1000003;
        String str = this.f22032e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j12 = this.f22033f;
        int i11 = (iHashCode3 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        n nVar = this.f22034g;
        return i11 ^ (nVar != null ? nVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f22028a + ", eventCode=" + this.f22029b + ", eventUptimeMs=" + this.f22030c + ", sourceExtension=" + Arrays.toString(this.f22031d) + ", sourceExtensionJsonProto3=" + this.f22032e + ", timezoneOffsetSeconds=" + this.f22033f + ", networkConnectionInfo=" + this.f22034g + "}";
    }
}
