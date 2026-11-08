package H6;

import A9.AbstractC0106f;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes.dex */
public final class q extends AbstractC0106f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6114c;

    public q(byte[] bArr, int i10, int i11) throws InvalidKeyException {
        this.f6114c = i11;
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f458b = o.e(bArr);
        this.f457a = i10;
    }

    @Override // A9.AbstractC0106f
    public final int[] c(int[] iArr, int i10) {
        switch (this.f6114c) {
            case 0:
                if (iArr.length != 3) {
                    throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
                }
                int[] iArr2 = new int[16];
                int[] iArr3 = (int[]) this.f458b;
                int[] iArr4 = o.f6111a;
                System.arraycopy(iArr4, 0, iArr2, 0, iArr4.length);
                System.arraycopy(iArr3, 0, iArr2, iArr4.length, 8);
                iArr2[12] = i10;
                System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
                return iArr2;
            default:
                if (iArr.length != 6) {
                    throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
                }
                int[] iArr5 = new int[16];
                int[] iArrB = o.b((int[]) this.f458b, iArr);
                int[] iArr6 = o.f6111a;
                System.arraycopy(iArr6, 0, iArr5, 0, iArr6.length);
                System.arraycopy(iArrB, 0, iArr5, iArr6.length, 8);
                iArr5[12] = i10;
                iArr5[13] = 0;
                iArr5[14] = iArr[4];
                iArr5[15] = iArr[5];
                return iArr5;
        }
    }

    @Override // A9.AbstractC0106f
    public final int i() {
        switch (this.f6114c) {
            case 0:
                return 12;
            default:
                return 24;
        }
    }
}
