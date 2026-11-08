package p217u7;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f27253b;

    public a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f27252a = str;
        this.f27253b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f27252a.equals(aVar.f27252a) && this.f27253b.equals(aVar.f27253b);
    }

    public final int hashCode() {
        return ((this.f27252a.hashCode() ^ 1000003) * 1000003) ^ this.f27253b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f27252a + ", usedDates=" + this.f27253b + "}";
    }
}
