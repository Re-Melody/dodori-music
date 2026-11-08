package A9;

import androidx.datastore.preferences.protobuf.C1049g;
import com.google.crypto.tink.shaded.protobuf.C1187h;
import com.google.crypto.tink.shaded.protobuf.C1189j;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: A9.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0106f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f458b;

    public static int d(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long e(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static C1189j h(byte[] bArr, int i10, int i11, boolean z10) {
        C1189j c1189j = new C1189j(bArr, i10, i11, z10);
        try {
            c1189j.l(i11);
            return c1189j;
        } catch (com.google.crypto.tink.shaded.protobuf.G e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public abstract String A();

    public abstract String B();

    public abstract int C();

    public abstract int D();

    public abstract long E();

    public abstract boolean F(int i10);

    public void G() {
        boolean zF;
        do {
            int iC = C();
            if (iC == 0) {
                return;
            }
            int i10 = this.f457a;
            if (i10 >= 100) {
                throw new androidx.datastore.preferences.protobuf.C("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f457a = i10 + 1;
            zF = F(iC);
            this.f457a--;
        } while (zF);
    }

    public ByteBuffer a(byte[] bArr, int i10) {
        int[] iArrC = c(H6.o.e(bArr), i10);
        int[] iArr = (int[]) iArrC.clone();
        H6.o.d(iArr);
        for (int i11 = 0; i11 < iArrC.length; i11++) {
            iArrC[i11] = iArrC[i11] + iArr[i11];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrC, 0, 16);
        return byteBufferOrder;
    }

    public abstract void b(int i10);

    public abstract int[] c(int[] iArr, int i10);

    public abstract int f();

    public abstract boolean g();

    public abstract int i();

    public abstract void j(int i10);

    public void k(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != i()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + i());
        }
        int iRemaining = byteBuffer2.remaining();
        int i10 = iRemaining / 64;
        int i11 = i10 + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            ByteBuffer byteBufferA = a(bArr, this.f457a + i12);
            if (i12 == i10) {
                S9.b.D0(byteBuffer, byteBuffer2, byteBufferA, iRemaining % 64);
            } else {
                S9.b.D0(byteBuffer, byteBuffer2, byteBufferA, 64);
            }
        }
    }

    public abstract int l(int i10);

    public abstract boolean m();

    public abstract C1049g n();

    public abstract C1187h o();

    public abstract double p();

    public abstract int q();

    public abstract int r();

    public abstract long s();

    public abstract float t();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract long x();

    public abstract int y();

    public abstract long z();
}
