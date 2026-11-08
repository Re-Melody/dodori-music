package H2;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class S extends p263z2.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5888i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5889j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5890l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f5891m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5892n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f5893o;

    @Override // p263z2.e, p263z2.d
    public final ByteBuffer a() {
        int i10;
        if (super.e() && (i10 = this.f5892n) > 0) {
            j(i10).put(this.f5891m, 0, this.f5892n).flip();
            this.f5892n = 0;
        }
        return super.a();
    }

    @Override // p263z2.d
    public final void b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.f5890l);
        this.f5893o += (long) (iMin / this.f29810b.f29808d);
        this.f5890l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f5890l > 0) {
            return;
        }
        int i11 = i10 - iMin;
        int length = (this.f5892n + i11) - this.f5891m.length;
        ByteBuffer byteBufferJ = j(length);
        int iJ = B2.C.j(length, 0, this.f5892n);
        byteBufferJ.put(this.f5891m, 0, iJ);
        int iJ2 = B2.C.j(length - iJ, 0, i11);
        byteBuffer.limit(byteBuffer.position() + iJ2);
        byteBufferJ.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i12 = i11 - iJ2;
        int i13 = this.f5892n - iJ;
        this.f5892n = i13;
        byte[] bArr = this.f5891m;
        System.arraycopy(bArr, iJ, bArr, 0, i13);
        byteBuffer.get(this.f5891m, this.f5892n, i12);
        this.f5892n += i12;
        byteBufferJ.flip();
    }

    @Override // p263z2.e, p263z2.d
    public final boolean e() {
        return super.e() && this.f5892n == 0;
    }

    @Override // p263z2.e
    public final p263z2.b f(p263z2.b bVar) throws p263z2.c {
        if (bVar.f29807c != 2) {
            throw new p263z2.c(bVar);
        }
        this.k = true;
        return (this.f5888i == 0 && this.f5889j == 0) ? p263z2.b.f29804e : bVar;
    }

    @Override // p263z2.e
    public final void g() {
        if (this.k) {
            this.k = false;
            int i10 = this.f5889j;
            int i11 = this.f29810b.f29808d;
            this.f5891m = new byte[i10 * i11];
            this.f5890l = this.f5888i * i11;
        }
        this.f5892n = 0;
    }

    @Override // p263z2.e
    public final void h() {
        if (this.k) {
            int i10 = this.f5892n;
            if (i10 > 0) {
                this.f5893o += (long) (i10 / this.f29810b.f29808d);
            }
            this.f5892n = 0;
        }
    }

    @Override // p263z2.e
    public final void i() {
        this.f5891m = B2.C.f565f;
    }
}
