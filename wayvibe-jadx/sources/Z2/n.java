package Z2;

import java.io.EOFException;
import p255y2.C2339o;
import p255y2.InterfaceC2333i;

/* JADX INFO: loaded from: classes.dex */
public final class n implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f13562a = new byte[4096];

    @Override // Z2.F
    public final void c(B2.u uVar, int i10, int i11) {
        uVar.G(i10);
    }

    @Override // Z2.F
    public final int d(InterfaceC2333i interfaceC2333i, int i10, boolean z10) throws EOFException {
        byte[] bArr = this.f13562a;
        int i11 = interfaceC2333i.read(bArr, 0, Math.min(bArr.length, i10));
        if (i11 != -1) {
            return i11;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // Z2.F
    public final void b(C2339o c2339o) {
    }

    @Override // Z2.F
    public final void a(long j10, int i10, int i11, int i12, E e2) {
    }
}
