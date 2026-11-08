package A0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f86a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f87b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f86a == aVar.f86a && Float.compare(this.f87b, aVar.f87b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f87b) + (Long.hashCode(this.f86a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.f86a);
        sb.append(", dataPoint=");
        return p134m1.b.l(sb, this.f87b, ')');
    }
}
