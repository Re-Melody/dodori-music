package U4;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class b extends N4.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f12181n = X4.j.k("payl");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f12182o = X4.j.k("sttg");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f12183p = X4.j.k("vttc");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final X4.f f12184l = new X4.f();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f12185m = new f();

    @Override // N4.b
    public final N4.d a(byte[] bArr, int i10, int i11, boolean z10) throws N4.f {
        X4.f fVar = this.f12184l;
        fVar.c(bArr, i11 + i10);
        fVar.f(i10);
        ArrayList arrayList = new ArrayList();
        while (fVar.a() > 0) {
            if (fVar.a() < 8) {
                throw new N4.f("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int iN = fVar.n();
            if (fVar.n() == f12183p) {
                int i12 = iN - 8;
                f fVar2 = this.f12185m;
                fVar2.a();
                while (i12 > 0) {
                    if (i12 < 8) {
                        throw new N4.f("Incomplete vtt cue box header found.");
                    }
                    int iN2 = fVar.n();
                    int iN3 = fVar.n();
                    int i13 = iN2 - 8;
                    String str = new String(fVar.f13220a, fVar.f13221b, i13);
                    fVar.g(i13);
                    i12 = (i12 - 8) - i13;
                    if (iN3 == f12182o) {
                        j.a(str, fVar2);
                    } else if (iN3 == f12181n) {
                        j.c(null, str.trim(), fVar2, Collections.EMPTY_LIST);
                    }
                }
                arrayList.add(fVar2.b());
            } else {
                fVar.g(iN - 8);
            }
        }
        return new c(0, arrayList);
    }
}
