package B8;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 extends b0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d0 f783e;

    public c0(String str, boolean z10, d0 d0Var) {
        super(d0Var, str, z10);
        if (str.endsWith("-bin")) {
            throw new IllegalArgumentException(p234w3.c.c("ASCII header is named %s.  Only binary headers may end with %s", str, "-bin"));
        }
        this.f783e = d0Var;
    }

    @Override // B8.b0
    public final Object a(byte[] bArr) {
        return this.f783e.h(bArr);
    }

    @Override // B8.b0
    public final byte[] b(Object obj) {
        byte[] bArrMo0a = this.f783e.mo0a(obj);
        p229v9.a.k(bArrMo0a, "null marshaller.toAsciiString()");
        return bArrMo0a;
    }
}
