package R2;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10655e;

    public D(Object obj) {
        this(-1L, obj);
    }

    public final D a(Object obj) {
        if (this.f10651a.equals(obj)) {
            return this;
        }
        return new D(obj, this.f10652b, this.f10653c, this.f10654d, this.f10655e);
    }

    public final boolean b() {
        return this.f10652b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        return this.f10651a.equals(d10.f10651a) && this.f10652b == d10.f10652b && this.f10653c == d10.f10653c && this.f10654d == d10.f10654d && this.f10655e == d10.f10655e;
    }

    public final int hashCode() {
        return ((((((((this.f10651a.hashCode() + 527) * 31) + this.f10652b) * 31) + this.f10653c) * 31) + ((int) this.f10654d)) * 31) + this.f10655e;
    }

    public D(long j10, Object obj) {
        this(obj, -1, -1, j10, -1);
    }

    public D(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }

    public D(Object obj, int i10, int i11, long j10, int i12) {
        this.f10651a = obj;
        this.f10652b = i10;
        this.f10653c = i11;
        this.f10654d = j10;
        this.f10655e = i12;
    }
}
