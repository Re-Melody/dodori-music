package p138m5;

import G2.e;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f22322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f22323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f22324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f22325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f22326f;

    public h(String str, Integer num, k kVar, long j10, long j11, HashMap map) {
        this.f22321a = str;
        this.f22322b = num;
        this.f22323c = kVar;
        this.f22324d = j10;
        this.f22325e = j11;
        this.f22326f = map;
    }

    public final String a(String str) {
        String str2 = (String) this.f22326f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f22326f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final e c() {
        e eVar = new e();
        String str = this.f22321a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        eVar.f5366a = str;
        eVar.f5367b = this.f22322b;
        k kVar = this.f22323c;
        if (kVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        eVar.f5368c = kVar;
        eVar.f5369d = Long.valueOf(this.f22324d);
        eVar.f5370e = Long.valueOf(this.f22325e);
        eVar.f5371f = new HashMap(this.f22326f);
        return eVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f22321a.equals(hVar.f22321a)) {
            return false;
        }
        Integer num = hVar.f22322b;
        Integer num2 = this.f22322b;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        return this.f22323c.equals(hVar.f22323c) && this.f22324d == hVar.f22324d && this.f22325e == hVar.f22325e && this.f22326f.equals(hVar.f22326f);
    }

    public final int hashCode() {
        int iHashCode = (this.f22321a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f22322b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f22323c.hashCode()) * 1000003;
        long j10 = this.f22324d;
        int i10 = (iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f22325e;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f22326f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f22321a + ", code=" + this.f22322b + ", encodedPayload=" + this.f22323c + ", eventMillis=" + this.f22324d + ", uptimeMillis=" + this.f22325e + ", autoMetadata=" + this.f22326f + "}";
    }
}
