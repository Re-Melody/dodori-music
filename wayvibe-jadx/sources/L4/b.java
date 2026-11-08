package L4;

import java.util.Arrays;
import p235w4.n;

/* JADX INFO: loaded from: classes.dex */
public final class b extends K4.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f7779j;
    public byte[] k;

    public b(W4.c cVar, W4.e eVar, n nVar, int i10, Object obj, byte[] bArr, String str) {
        super(cVar, eVar, 3, nVar, i10, obj, bArr);
        this.f7779j = str;
    }

    @Override // K4.b
    public final void b(byte[] bArr, int i10) {
        this.k = Arrays.copyOf(bArr, i10);
    }
}
