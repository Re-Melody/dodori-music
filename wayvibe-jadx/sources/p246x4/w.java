package p246x4;

import X4.j;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class w implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f28576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f28580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f28581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ByteBuffer f28582h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ByteBuffer f28583i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f28584j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f28585l;

    @Override // p246x4.e
    public final boolean a(int i10, int i11, int i12) throws d {
        if (i12 != 2) {
            throw new d(i10, i11, i12);
        }
        this.f28579e = i11;
        this.f28580f = i10;
        int i13 = this.f28578d;
        this.f28584j = new byte[i13 * i11 * 2];
        this.k = 0;
        int i14 = this.f28577c;
        this.f28581g = i11 * i14 * 2;
        boolean z10 = this.f28576b;
        boolean z11 = (i14 == 0 && i13 == 0) ? false : true;
        this.f28576b = z11;
        return z10 != z11;
    }

    @Override // p246x4.e
    public final int b() {
        return this.f28579e;
    }

    @Override // p246x4.e
    public final int d() {
        return this.f28580f;
    }

    @Override // p246x4.e
    public final void e() {
        this.f28585l = true;
    }

    @Override // p246x4.e
    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.f28583i;
        this.f28583i = e.f28440a;
        return byteBuffer;
    }

    @Override // p246x4.e
    public final boolean g() {
        return this.f28585l && this.f28583i == e.f28440a;
    }

    @Override // p246x4.e
    public final void h() {
        this.f28583i = e.f28440a;
        this.f28585l = false;
        this.f28581g = 0;
        this.k = 0;
    }

    @Override // p246x4.e
    public final void i() {
        h();
        this.f28582h = e.f28440a;
        this.f28579e = -1;
        this.f28580f = -1;
        this.f28584j = null;
    }

    @Override // p246x4.e
    public final boolean a() {
        return this.f28576b;
    }

    @Override // p246x4.e
    public final void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int iMin = Math.min(i10, this.f28581g);
        this.f28581g -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f28581g > 0) {
            return;
        }
        int i11 = i10 - iMin;
        int length = (this.k + i11) - this.f28584j.length;
        if (this.f28582h.capacity() < length) {
            this.f28582h = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f28582h.clear();
        }
        int iB = j.b(length, 0, this.k);
        this.f28582h.put(this.f28584j, 0, iB);
        int iB2 = j.b(length - iB, 0, i11);
        byteBuffer.limit(byteBuffer.position() + iB2);
        this.f28582h.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i12 = i11 - iB2;
        int i13 = this.k - iB;
        this.k = i13;
        byte[] bArr = this.f28584j;
        System.arraycopy(bArr, iB, bArr, 0, i13);
        byteBuffer.get(this.f28584j, this.k, i12);
        this.k += i12;
        this.f28582h.flip();
        this.f28583i = this.f28582h;
    }
}
