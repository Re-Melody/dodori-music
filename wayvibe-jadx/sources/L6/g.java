package L6;

import O6.E;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class g implements F6.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f7904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E f7905b;

    public g(f fVar, E e2) {
        this.f7904a = fVar;
        this.f7905b = e2;
    }

    @Override // F6.b
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArrA = this.f7904a.f7903a.a(bArr, bArr2);
        int length = bArr.length;
        return bArrA;
    }

    @Override // F6.b
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Iterator it = this.f7905b.a(bArr).iterator();
        while (it.hasNext()) {
            try {
                return ((f) it.next()).f7903a.b(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
