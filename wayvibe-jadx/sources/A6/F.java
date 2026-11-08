package A6;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f302c;

    public F(Object obj, Object obj2, Object obj3) {
        this.f300a = obj;
        this.f301b = obj2;
        this.f302c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f300a;
        sb.append(obj);
        sb.append(com.amazon.a.a.o.b.f.f16452b);
        sb.append(this.f301b);
        sb.append(" and ");
        sb.append(obj);
        sb.append(com.amazon.a.a.o.b.f.f16452b);
        sb.append(this.f302c);
        return new IllegalArgumentException(sb.toString());
    }
}
