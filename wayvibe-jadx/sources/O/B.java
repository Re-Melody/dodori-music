package O;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K.P f8662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A f8664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8665d;

    public B(K.P p10, long j10, A a10, boolean z10) {
        this.f8662a = p10;
        this.f8663b = j10;
        this.f8664c = a10;
        this.f8665d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b10 = (B) obj;
        return this.f8662a == b10.f8662a && p133m0.c.b(this.f8663b, b10.f8663b) && this.f8664c == b10.f8664c && this.f8665d == b10.f8665d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8665d) + ((this.f8664c.hashCode() + p134m1.b.g(this.f8663b, this.f8662a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.f8662a);
        sb.append(", position=");
        sb.append((Object) p133m0.c.j(this.f8663b));
        sb.append(", anchor=");
        sb.append(this.f8664c);
        sb.append(", visible=");
        return p134m1.b.o(sb, this.f8665d, ')');
    }
}
