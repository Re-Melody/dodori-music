package H2;

import B2.AbstractC0111a;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.nio.ByteBuffer;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.pipes.PipesConfigBase;
import org.apache.tika.pipes.pipesiterator.PipesIterator;

/* JADX INFO: loaded from: classes.dex */
public final class P extends p263z2.e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5879n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f5880o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f5881p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f5882q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public byte[] f5883s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte[] f5886v;
    public int r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f5884t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f5885u = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f5877l = PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f5875i = 0.2f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f5878m = 2000000;
    public final int k = 10;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final short f5876j = 1024;

    public P() {
        byte[] bArr = B2.C.f565f;
        this.f5883s = bArr;
        this.f5886v = bArr;
    }

    @Override // p263z2.d
    public final void b(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f29815g.hasRemaining()) {
            int i10 = this.f5881p;
            short s8 = this.f5876j;
            if (i10 == 0) {
                int iLimit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit2, byteBuffer.position() + this.f5883s.length));
                int iLimit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit3 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit3) << 8) | (byteBuffer.get(iLimit3 - 1) & ForkServer.ERROR)) > s8) {
                        int i11 = this.f5879n;
                        iPosition = ((iLimit3 / i11) * i11) + i11;
                        break;
                    }
                    iLimit3 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.f5881p = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    j(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit2);
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException();
                }
                AbstractC0111a.h(this.f5884t < this.f5883s.length);
                int iLimit4 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & ForkServer.ERROR)) > s8) {
                        int i12 = this.f5879n;
                        iLimit = (iPosition2 / i12) * i12;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int length = this.f5884t;
                int i13 = this.f5885u;
                int length2 = length + i13;
                byte[] bArr = this.f5883s;
                if (length2 < bArr.length) {
                    length = bArr.length;
                } else {
                    length2 = i13 - (bArr.length - length);
                }
                int i14 = length - length2;
                boolean z10 = iLimit < iLimit4;
                int iMin = Math.min(iPosition3, i14);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.f5883s, length2, iMin);
                int i15 = this.f5885u + iMin;
                this.f5885u = i15;
                AbstractC0111a.h(i15 <= this.f5883s.length);
                boolean z11 = z10 && iPosition3 < i14;
                m(z11);
                if (z11) {
                    this.f5881p = 0;
                    this.r = 0;
                }
                byteBuffer.limit(iLimit4);
            }
        }
    }

    @Override // p263z2.e
    public final p263z2.b f(p263z2.b bVar) throws p263z2.c {
        if (bVar.f29807c == 2) {
            return bVar.f29805a == -1 ? p263z2.b.f29804e : bVar;
        }
        throw new p263z2.c(bVar);
    }

    @Override // p263z2.e
    public final void g() {
        if (isActive()) {
            p263z2.b bVar = this.f29810b;
            int i10 = bVar.f29806b * 2;
            this.f5879n = i10;
            int i11 = ((((int) ((this.f5877l * ((long) bVar.f29805a)) / 1000000)) / 2) / i10) * i10 * 2;
            if (this.f5883s.length != i11) {
                this.f5883s = new byte[i11];
                this.f5886v = new byte[i11];
            }
        }
        this.f5881p = 0;
        this.f5882q = 0L;
        this.r = 0;
        this.f5884t = 0;
        this.f5885u = 0;
    }

    @Override // p263z2.e
    public final void h() {
        if (this.f5885u > 0) {
            m(true);
            this.r = 0;
        }
    }

    @Override // p263z2.e
    public final void i() {
        this.f5880o = false;
        byte[] bArr = B2.C.f565f;
        this.f5883s = bArr;
        this.f5886v = bArr;
    }

    @Override // p263z2.e, p263z2.d
    public final boolean isActive() {
        return super.isActive() && this.f5880o;
    }

    public final int l(int i10) {
        int length = ((((int) ((this.f5878m * ((long) this.f29810b.f29805a)) / 1000000)) - this.r) * this.f5879n) - (this.f5883s.length / 2);
        AbstractC0111a.h(length >= 0);
        int iMin = (int) Math.min((i10 * this.f5875i) + 0.5f, length);
        int i11 = this.f5879n;
        return (iMin / i11) * i11;
    }

    public final void m(boolean z10) {
        int length;
        int iL;
        int i10 = this.f5885u;
        byte[] bArr = this.f5883s;
        if (i10 == bArr.length || z10) {
            if (this.r == 0) {
                if (z10) {
                    n(i10, 3);
                    length = i10;
                } else {
                    AbstractC0111a.h(i10 >= bArr.length / 2);
                    length = this.f5883s.length / 2;
                    n(length, 0);
                }
                iL = length;
            } else if (z10) {
                int length2 = i10 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iL2 = l(length2) + (this.f5883s.length / 2);
                n(iL2, 2);
                iL = iL2;
                length = length3;
            } else {
                length = i10 - (bArr.length / 2);
                iL = l(length);
                n(iL, 1);
            }
            AbstractC0111a.g("bytesConsumed is not aligned to frame size: %s" + length, length % this.f5879n == 0);
            AbstractC0111a.h(i10 >= iL);
            this.f5885u -= length;
            int i11 = this.f5884t + length;
            this.f5884t = i11;
            this.f5884t = i11 % this.f5883s.length;
            int i12 = this.r;
            int i13 = this.f5879n;
            this.r = (iL / i13) + i12;
            this.f5882q += (long) ((length - iL) / i13);
        }
    }

    public final void n(int i10, int i11) {
        if (i10 == 0) {
            return;
        }
        AbstractC0111a.d(this.f5885u >= i10);
        if (i11 == 2) {
            int i12 = this.f5884t;
            int i13 = this.f5885u;
            int i14 = i12 + i13;
            byte[] bArr = this.f5883s;
            if (i14 <= bArr.length) {
                System.arraycopy(bArr, i14 - i10, this.f5886v, 0, i10);
            } else {
                int length = i13 - (bArr.length - i12);
                if (length >= i10) {
                    System.arraycopy(bArr, length - i10, this.f5886v, 0, i10);
                } else {
                    int i15 = i10 - length;
                    System.arraycopy(bArr, bArr.length - i15, this.f5886v, 0, i15);
                    System.arraycopy(this.f5883s, 0, this.f5886v, i15, length);
                }
            }
        } else {
            int i16 = this.f5884t;
            int i17 = i16 + i10;
            byte[] bArr2 = this.f5883s;
            if (i17 <= bArr2.length) {
                System.arraycopy(bArr2, i16, this.f5886v, 0, i10);
            } else {
                int length2 = bArr2.length - i16;
                System.arraycopy(bArr2, i16, this.f5886v, 0, length2);
                System.arraycopy(this.f5883s, 0, this.f5886v, length2, i10 - length2);
            }
        }
        AbstractC0111a.c("sizeToOutput is not aligned to frame size: " + i10, i10 % this.f5879n == 0);
        AbstractC0111a.h(this.f5884t < this.f5883s.length);
        byte[] bArr3 = this.f5886v;
        AbstractC0111a.c("byteOutput size is not aligned to frame size " + i10, i10 % this.f5879n == 0);
        if (i11 != 3) {
            for (int i18 = 0; i18 < i10; i18 += 2) {
                int i19 = i18 + 1;
                int i20 = (bArr3[i19] << 8) | (bArr3[i18] & ForkServer.ERROR);
                int i21 = this.k;
                if (i11 == 0) {
                    i21 = ((((i18 * PipesIterator.DEFAULT_QUEUE_SIZE) / (i10 - 1)) * (i21 - 100)) / PipesIterator.DEFAULT_QUEUE_SIZE) + 100;
                } else if (i11 == 2) {
                    i21 += (((i18 * PipesIterator.DEFAULT_QUEUE_SIZE) * (100 - i21)) / (i10 - 1)) / PipesIterator.DEFAULT_QUEUE_SIZE;
                }
                int i22 = (i20 * i21) / 100;
                if (i22 >= 32767) {
                    bArr3[i18] = -1;
                    bArr3[i19] = 127;
                } else if (i22 <= -32768) {
                    bArr3[i18] = 0;
                    bArr3[i19] = -128;
                } else {
                    bArr3[i18] = (byte) (i22 & ColorExtractionConstants.COLOR_COMPONENT_MASK);
                    bArr3[i19] = (byte) (i22 >> 8);
                }
            }
        }
        j(i10).put(bArr3, 0, i10).flip();
    }
}
