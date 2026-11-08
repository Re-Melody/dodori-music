package B8;

/* JADX INFO: loaded from: classes2.dex */
public final class Z extends b0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a0 f766e;

    public Z(String str, a0 a0Var) {
        super(a0Var, str, false);
        if (str.endsWith("-bin")) {
            throw new IllegalArgumentException(p234w3.c.c("ASCII header is named %s.  Only binary headers may end with %s", str, "-bin"));
        }
        p229v9.a.k(a0Var, "marshaller");
        this.f766e = a0Var;
    }

    @Override // B8.b0
    public final Object a(byte[] bArr) {
        return this.f766e.e(new String(bArr, p267z6.h.f29877a));
    }

    @Override // B8.b0
    public final byte[] b(Object obj) {
        String strA = this.f766e.a(obj);
        p229v9.a.k(strA, "null marshaller.toAsciiString()");
        return strA.getBytes(p267z6.h.f29877a);
    }
}
