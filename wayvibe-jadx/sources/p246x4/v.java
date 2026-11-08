package p246x4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class v implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u f28567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f28568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f28569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f28570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ByteBuffer f28571h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ShortBuffer f28572i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ByteBuffer f28573j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f28574l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f28575m;

    @Override // p246x4.e
    public final boolean a(int i10, int i11, int i12) throws d {
        if (i12 != 2) {
            throw new d(i10, i11, i12);
        }
        if (this.f28566c == i10 && this.f28565b == i11 && this.f28570g == i10) {
            return false;
        }
        this.f28566c = i10;
        this.f28565b = i11;
        this.f28570g = i10;
        return true;
    }

    @Override // p246x4.e
    public final int b() {
        return this.f28565b;
    }

    @Override // p246x4.e
    public final int d() {
        return this.f28570g;
    }

    @Override // p246x4.e
    public final void e() {
        u uVar = this.f28567d;
        int i10 = uVar.r;
        float f10 = uVar.f28544c;
        float f11 = uVar.f28545d;
        int i11 = uVar.f28558s + ((int) ((((i10 / (f10 / f11)) + uVar.f28559t) / (uVar.f28546e * f11)) + 0.5f));
        int i12 = uVar.f28549h * 2;
        uVar.d(i12 + i10);
        int i13 = 0;
        while (true) {
            int i14 = uVar.f28543b;
            if (i13 >= i12 * i14) {
                break;
            }
            uVar.k[(i14 * i10) + i13] = 0;
            i13++;
        }
        uVar.r = i12 + uVar.r;
        uVar.f();
        if (uVar.f28558s > i11) {
            uVar.f28558s = i11;
        }
        uVar.r = 0;
        uVar.f28560u = 0;
        uVar.f28559t = 0;
        this.f28575m = true;
    }

    @Override // p246x4.e
    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.f28573j;
        this.f28573j = e.f28440a;
        return byteBuffer;
    }

    @Override // p246x4.e
    public final boolean g() {
        if (!this.f28575m) {
            return false;
        }
        u uVar = this.f28567d;
        return uVar == null || uVar.f28558s == 0;
    }

    @Override // p246x4.e
    public final void h() {
        this.f28567d = new u(this.f28568e, this.f28569f, this.f28566c, this.f28565b, this.f28570g);
        this.f28573j = e.f28440a;
        this.k = 0L;
        this.f28574l = 0L;
        this.f28575m = false;
    }

    @Override // p246x4.e
    public final void i() {
        this.f28567d = null;
        ByteBuffer byteBuffer = e.f28440a;
        this.f28571h = byteBuffer;
        this.f28572i = byteBuffer.asShortBuffer();
        this.f28573j = byteBuffer;
        this.f28565b = -1;
        this.f28566c = -1;
        this.f28570g = -1;
        this.k = 0L;
        this.f28574l = 0L;
        this.f28575m = false;
    }

    @Override // p246x4.e
    public final boolean a() {
        return Math.abs(this.f28568e - 1.0f) >= 0.01f || Math.abs(this.f28569f - 1.0f) >= 0.01f || this.f28570g != this.f28566c;
    }

    @Override // p246x4.e
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.k += (long) iRemaining;
            u uVar = this.f28567d;
            uVar.getClass();
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i10 = uVar.f28543b;
            int i11 = iRemaining2 / i10;
            uVar.d(i11);
            shortBufferAsShortBuffer.get(uVar.k, uVar.r * i10, ((i11 * i10) * 2) / 2);
            uVar.r += i11;
            uVar.f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
        int i12 = this.f28567d.f28558s * this.f28565b * 2;
        if (i12 > 0) {
            if (this.f28571h.capacity() < i12) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i12).order(ByteOrder.nativeOrder());
                this.f28571h = byteBufferOrder;
                this.f28572i = byteBufferOrder.asShortBuffer();
            } else {
                this.f28571h.clear();
                this.f28572i.clear();
            }
            u uVar2 = this.f28567d;
            ShortBuffer shortBuffer = this.f28572i;
            uVar2.getClass();
            int iRemaining3 = shortBuffer.remaining();
            int i13 = uVar2.f28543b;
            int iMin = Math.min(iRemaining3 / i13, uVar2.f28558s);
            int i14 = iMin * i13;
            shortBuffer.put(uVar2.f28553m, 0, i14);
            int i15 = uVar2.f28558s - iMin;
            uVar2.f28558s = i15;
            short[] sArr = uVar2.f28553m;
            System.arraycopy(sArr, i14, sArr, 0, i15 * i13);
            this.f28574l += (long) i12;
            this.f28571h.limit(i12);
            this.f28573j = this.f28571h;
        }
    }
}
