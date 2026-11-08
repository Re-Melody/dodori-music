package p127l5;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f22037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f22038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f22039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f22040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f22041g;

    public l(long j10, long j11, j jVar, Integer num, String str, ArrayList arrayList, w wVar) {
        this.f22035a = j10;
        this.f22036b = j11;
        this.f22037c = jVar;
        this.f22038d = num;
        this.f22039e = str;
        this.f22040f = arrayList;
        this.f22041g = wVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        l lVar = (l) ((s) obj);
        if (this.f22035a != lVar.f22035a) {
            return false;
        }
        if (this.f22036b != lVar.f22036b) {
            return false;
        }
        if (!this.f22037c.equals(lVar.f22037c)) {
            return false;
        }
        Integer num = lVar.f22038d;
        Integer num2 = this.f22038d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = lVar.f22039e;
        String str2 = this.f22039e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f22040f.equals(lVar.f22040f)) {
            return false;
        }
        w wVar = lVar.f22041g;
        w wVar2 = this.f22041g;
        if (wVar2 == null) {
            return wVar == null;
        }
        return wVar2.equals(wVar);
    }

    public final int hashCode() {
        long j10 = this.f22035a;
        long j11 = this.f22036b;
        int iHashCode = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f22037c.hashCode()) * 1000003;
        Integer num = this.f22038d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f22039e;
        int iHashCode3 = (((iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f22040f.hashCode()) * 1000003;
        w wVar = this.f22041g;
        return iHashCode3 ^ (wVar != null ? wVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f22035a + ", requestUptimeMs=" + this.f22036b + ", clientInfo=" + this.f22037c + ", logSource=" + this.f22038d + ", logSourceName=" + this.f22039e + ", logEvents=" + this.f22040f + ", qosTier=" + this.f22041g + "}";
    }
}
