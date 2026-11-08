package H7;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class o extends E7.y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f6194b = new m(new o(E7.x.LAZILY_PARSED_NUMBER), 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E7.x f6195a;

    public o(E7.x xVar) {
        this.f6195a = xVar;
    }

    @Override // E7.y
    public final Object read(M7.b bVar) {
        M7.c cVarN = bVar.N();
        int i10 = n.f6193a[cVarN.ordinal()];
        if (i10 == 1) {
            bVar.J();
            return null;
        }
        if (i10 == 2 || i10 == 3) {
            return this.f6195a.a(bVar);
        }
        throw new E7.n("Expecting number, got: " + cVarN + "; at path " + bVar.w());
    }

    @Override // E7.y
    public final void write(M7.d dVar, Object obj) throws IOException {
        dVar.E((Number) obj);
    }
}
