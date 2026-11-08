package p170p7;

import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25260b;

    public f(String str, String str2) {
        this.f25259a = str;
        this.f25260b = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        f fVar = (f) obj;
        int iCompareTo = this.f25259a.compareTo(fVar.f25259a);
        return iCompareTo != 0 ? iCompareTo : this.f25260b.compareTo(fVar.f25260b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.f25259a.equals(fVar.f25259a) && this.f25260b.equals(fVar.f25260b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f25260b.hashCode() + (this.f25259a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DatabaseId(");
        sb.append(this.f25259a);
        sb.append(", ");
        return b.m(sb, this.f25260b, ")");
    }
}
