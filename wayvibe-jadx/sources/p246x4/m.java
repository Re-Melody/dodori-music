package p246x4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class m implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f28445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f28446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f28447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f28448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ByteBuffer f28449h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f28450i;

    @Override // p246x4.e
    public final boolean a(int i10, int i11, int i12) throws d {
        boolean zEquals = Arrays.equals(this.f28445d, this.f28447f);
        boolean z10 = !zEquals;
        int[] iArr = this.f28445d;
        this.f28447f = iArr;
        if (iArr == null) {
            this.f28446e = false;
            return z10;
        }
        if (i12 != 2) {
            throw new d(i10, i11, i12);
        }
        if (zEquals && this.f28444c == i10 && this.f28443b == i11) {
            return false;
        }
        this.f28444c = i10;
        this.f28443b = i11;
        this.f28446e = i11 != iArr.length;
        int i13 = 0;
        while (true) {
            int[] iArr2 = this.f28447f;
            if (i13 >= iArr2.length) {
                return true;
            }
            int i14 = iArr2[i13];
            if (i14 >= i11) {
                throw new d(i10, i11, i12);
            }
            this.f28446e = (i14 != i13) | this.f28446e;
            i13++;
        }
    }

    @Override // p246x4.e
    public final int b() {
        int[] iArr = this.f28447f;
        return iArr == null ? this.f28443b : iArr.length;
    }

    @Override // p246x4.e
    public final int d() {
        return this.f28444c;
    }

    @Override // p246x4.e
    public final void e() {
        this.f28450i = true;
    }

    @Override // p246x4.e
    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.f28449h;
        this.f28449h = e.f28440a;
        return byteBuffer;
    }

    @Override // p246x4.e
    public final boolean g() {
        return this.f28450i && this.f28449h == e.f28440a;
    }

    @Override // p246x4.e
    public final void h() {
        this.f28449h = e.f28440a;
        this.f28450i = false;
    }

    @Override // p246x4.e
    public final void i() {
        h();
        this.f28448g = e.f28440a;
        this.f28443b = -1;
        this.f28444c = -1;
        this.f28447f = null;
        this.f28446e = false;
    }

    @Override // p246x4.e
    public final boolean a() {
        return this.f28446e;
    }

    @Override // p246x4.e
    public final void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int length = ((iLimit - iPosition) / (this.f28443b * 2)) * this.f28447f.length * 2;
        if (this.f28448g.capacity() < length) {
            this.f28448g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f28448g.clear();
        }
        while (iPosition < iLimit) {
            for (int i10 : this.f28447f) {
                this.f28448g.putShort(byteBuffer.getShort((i10 * 2) + iPosition));
            }
            iPosition += this.f28443b * 2;
        }
        byteBuffer.position(iLimit);
        this.f28448g.flip();
        this.f28449h = this.f28448g;
    }
}
