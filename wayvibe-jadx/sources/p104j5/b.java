package p104j5;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21497a;

    public b(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f21497a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f21497a.equals(((b) obj).f21497a);
    }

    public final int hashCode() {
        return this.f21497a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return p134m1.b.m(new StringBuilder("Encoding{name=\""), this.f21497a, "\"}");
    }
}
