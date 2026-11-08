package p089i1;

/* JADX INFO: loaded from: classes.dex */
public final class b extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f20424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f20425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f20426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f20427f;

    public b(Object obj) {
        super(obj);
        this.f20423b = obj;
        this.f20424c = new d(obj, -2, this);
        this.f20425d = new c(obj, 0, this);
        this.f20426e = new d(obj, -1, this);
        this.f20427f = new c(obj, 1, this);
    }

    @Override // p089i1.l
    public final Object a() {
        return this.f20423b;
    }
}
