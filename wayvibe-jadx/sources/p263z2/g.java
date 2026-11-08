package p263z2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class g implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f29838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f29839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f29840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f29841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f29842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f29843h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f29844i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f f29845j;
    public ByteBuffer k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ShortBuffer f29846l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ByteBuffer f29847m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f29848n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f29849o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f29850p;

    @Override // p263z2.d
    public final ByteBuffer a() {
        f fVar = this.f29845j;
        if (fVar != null) {
            int i10 = fVar.f29828m;
            int i11 = fVar.f29818b;
            int i12 = i10 * i11 * 2;
            if (i12 > 0) {
                if (this.k.capacity() < i12) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i12).order(ByteOrder.nativeOrder());
                    this.k = byteBufferOrder;
                    this.f29846l = byteBufferOrder.asShortBuffer();
                } else {
                    this.k.clear();
                    this.f29846l.clear();
                }
                ShortBuffer shortBuffer = this.f29846l;
                int iMin = Math.min(shortBuffer.remaining() / i11, fVar.f29828m);
                int i13 = iMin * i11;
                shortBuffer.put(fVar.f29827l, 0, i13);
                int i14 = fVar.f29828m - iMin;
                fVar.f29828m = i14;
                short[] sArr = fVar.f29827l;
                System.arraycopy(sArr, i13, sArr, 0, i14 * i11);
                this.f29849o += (long) i12;
                this.k.limit(i12);
                this.f29847m = this.k;
            }
        }
        ByteBuffer byteBuffer = this.f29847m;
        this.f29847m = d.f29809a;
        return byteBuffer;
    }

    @Override // p263z2.d
    public final void b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            f fVar = this.f29845j;
            fVar.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f29848n += (long) iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i10 = fVar.f29818b;
            int i11 = iRemaining2 / i10;
            short[] sArrC = fVar.c(fVar.f29826j, fVar.k, i11);
            fVar.f29826j = sArrC;
            shortBufferAsShortBuffer.get(sArrC, fVar.k * i10, ((i11 * i10) * 2) / 2);
            fVar.k += i11;
            fVar.f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // p263z2.d
    public final b c(b bVar) throws c {
        if (bVar.f29807c != 2) {
            throw new c(bVar);
        }
        int i10 = this.f29837b;
        if (i10 == -1) {
            i10 = bVar.f29805a;
        }
        this.f29840e = bVar;
        b bVar2 = new b(i10, bVar.f29806b, 2);
        this.f29841f = bVar2;
        this.f29844i = true;
        return bVar2;
    }

    @Override // p263z2.d
    public final void d() {
        f fVar = this.f29845j;
        if (fVar != null) {
            int i10 = fVar.k;
            float f10 = fVar.f29819c;
            float f11 = fVar.f29820d;
            int i11 = fVar.f29828m + ((int) ((((i10 / (f10 / f11)) + fVar.f29830o) / (fVar.f29821e * f11)) + 0.5f));
            short[] sArr = fVar.f29826j;
            int i12 = fVar.f29824h * 2;
            fVar.f29826j = fVar.c(sArr, i10, i12 + i10);
            int i13 = 0;
            while (true) {
                int i14 = fVar.f29818b;
                if (i13 >= i12 * i14) {
                    break;
                }
                fVar.f29826j[(i14 * i10) + i13] = 0;
                i13++;
            }
            fVar.k = i12 + fVar.k;
            fVar.f();
            if (fVar.f29828m > i11) {
                fVar.f29828m = i11;
            }
            fVar.k = 0;
            fVar.r = 0;
            fVar.f29830o = 0;
        }
        this.f29850p = true;
    }

    @Override // p263z2.d
    public final boolean e() {
        if (!this.f29850p) {
            return false;
        }
        f fVar = this.f29845j;
        return fVar == null || (fVar.f29828m * fVar.f29818b) * 2 == 0;
    }

    @Override // p263z2.d
    public final void flush() {
        if (isActive()) {
            b bVar = this.f29840e;
            this.f29842g = bVar;
            b bVar2 = this.f29841f;
            this.f29843h = bVar2;
            if (this.f29844i) {
                int i10 = bVar.f29805a;
                this.f29845j = new f(this.f29838c, this.f29839d, i10, bVar.f29806b, bVar2.f29805a);
            } else {
                f fVar = this.f29845j;
                if (fVar != null) {
                    fVar.k = 0;
                    fVar.f29828m = 0;
                    fVar.f29830o = 0;
                    fVar.f29831p = 0;
                    fVar.f29832q = 0;
                    fVar.r = 0;
                    fVar.f29833s = 0;
                    fVar.f29834t = 0;
                    fVar.f29835u = 0;
                    fVar.f29836v = 0;
                }
            }
        }
        this.f29847m = d.f29809a;
        this.f29848n = 0L;
        this.f29849o = 0L;
        this.f29850p = false;
    }

    @Override // p263z2.d
    public final boolean isActive() {
        if (this.f29841f.f29805a != -1) {
            return Math.abs(this.f29838c - 1.0f) >= 1.0E-4f || Math.abs(this.f29839d - 1.0f) >= 1.0E-4f || this.f29841f.f29805a != this.f29840e.f29805a;
        }
        return false;
    }

    @Override // p263z2.d
    public final void k() {
        this.f29838c = 1.0f;
        this.f29839d = 1.0f;
        b bVar = b.f29804e;
        this.f29840e = bVar;
        this.f29841f = bVar;
        this.f29842g = bVar;
        this.f29843h = bVar;
        ByteBuffer byteBuffer = d.f29809a;
        this.k = byteBuffer;
        this.f29846l = byteBuffer.asShortBuffer();
        this.f29847m = byteBuffer;
        this.f29837b = -1;
        this.f29844i = false;
        this.f29845j = null;
        this.f29848n = 0L;
        this.f29849o = 0L;
        this.f29850p = false;
    }
}
