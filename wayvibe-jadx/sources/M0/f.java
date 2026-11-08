package M0;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f8017b = new f(new p064f9.d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p064f9.d f8018a;

    public f(p064f9.d dVar) {
        this.f8018a = dVar;
        if (Float.isNaN(0.0f)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        fVar.getClass();
        return this.f8018a.equals(fVar.f8018a);
    }

    public final int hashCode() {
        return (this.f8018a.hashCode() + (Float.hashCode(0.0f) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=0.0, range=" + this.f8018a + ", steps=0)";
    }
}
