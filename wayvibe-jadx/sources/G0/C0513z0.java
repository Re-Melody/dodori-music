package G0;

/* JADX INFO: renamed from: G0.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0513z0 implements p037d0.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B0 f5337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p037d0.l f5338b;

    public C0513z0(p037d0.l lVar, B0 b10) {
        this.f5337a = b10;
        this.f5338b = lVar;
    }

    @Override // p037d0.k
    public final boolean a(Object obj) {
        return this.f5338b.a(obj);
    }

    @Override // p037d0.k
    public final p037d0.j b(String str, Z8.a aVar) {
        return this.f5338b.b(str, aVar);
    }

    @Override // p037d0.k
    public final Object c(String str) {
        return this.f5338b.c(str);
    }
}
