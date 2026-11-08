package H2;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class x extends p263z2.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f5986i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f5987j;

    @Override // p263z2.d
    public final void b(ByteBuffer byteBuffer) {
        int[] iArr = this.f5987j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferJ = j(((iLimit - iPosition) / this.f29810b.f29808d) * this.f29811c.f29808d);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                byteBufferJ.putShort(byteBuffer.getShort((i10 * 2) + iPosition));
            }
            iPosition += this.f29810b.f29808d;
        }
        byteBuffer.position(iLimit);
        byteBufferJ.flip();
    }

    @Override // p263z2.e
    public final p263z2.b f(p263z2.b bVar) throws p263z2.c {
        int[] iArr = this.f5986i;
        if (iArr == null) {
            return p263z2.b.f29804e;
        }
        if (bVar.f29807c != 2) {
            throw new p263z2.c(bVar);
        }
        int length = iArr.length;
        int i10 = bVar.f29806b;
        boolean z10 = i10 != length;
        int i11 = 0;
        while (i11 < iArr.length) {
            int i12 = iArr[i11];
            if (i12 >= i10) {
                throw new p263z2.c(bVar);
            }
            z10 |= i12 != i11;
            i11++;
        }
        return z10 ? new p263z2.b(bVar.f29805a, iArr.length, 2) : p263z2.b.f29804e;
    }

    @Override // p263z2.e
    public final void g() {
        this.f5987j = this.f5986i;
    }

    @Override // p263z2.e
    public final void i() {
        this.f5987j = null;
        this.f5986i = null;
    }
}
