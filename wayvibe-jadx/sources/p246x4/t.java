package p246x4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: loaded from: classes.dex */
public final class t implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ByteBuffer f28539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f28540f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f28541g;

    @Override // p246x4.e
    public final boolean a(int i10, int i11, int i12) throws d {
        if (i12 != 3 && i12 != 2 && i12 != Integer.MIN_VALUE && i12 != 1073741824) {
            throw new d(i10, i11, i12);
        }
        if (this.f28536b == i10 && this.f28537c == i11 && this.f28538d == i12) {
            return false;
        }
        this.f28536b = i10;
        this.f28537c = i11;
        this.f28538d = i12;
        if (i12 != 2) {
            return true;
        }
        this.f28539e = e.f28440a;
        return true;
    }

    @Override // p246x4.e
    public final int b() {
        return this.f28537c;
    }

    @Override // p246x4.e
    public final int d() {
        return this.f28536b;
    }

    @Override // p246x4.e
    public final void e() {
        this.f28541g = true;
    }

    @Override // p246x4.e
    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.f28540f;
        this.f28540f = e.f28440a;
        return byteBuffer;
    }

    @Override // p246x4.e
    public final boolean g() {
        return this.f28541g && this.f28540f == e.f28440a;
    }

    @Override // p246x4.e
    public final void h() {
        this.f28540f = e.f28440a;
        this.f28541g = false;
    }

    @Override // p246x4.e
    public final void i() {
        h();
        this.f28539e = e.f28440a;
        this.f28536b = -1;
        this.f28537c = -1;
        this.f28538d = 0;
    }

    @Override // p246x4.e
    public final boolean a() {
        int i10 = this.f28538d;
        return (i10 == 0 || i10 == 2) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0045 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0047 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0049 A[ADDED_TO_REGION, LOOP:0: B:19:0x0049->B:20:0x004b, LOOP_START, PHI: r0
  0x0049: PHI (r0v6 int) = (r0v0 int), (r0v7 int) binds: [B:18:0x0047, B:20:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x004b A[LOOP:0: B:19:0x0049->B:20:0x004b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x006a A[ADDED_TO_REGION, LOOP:1: B:23:0x006a->B:24:0x006c, LOOP_START, PHI: r0
  0x006a: PHI (r0v4 int) = (r0v0 int), (r0v5 int) binds: [B:17:0x0045, B:24:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x006c A[LOOP:1: B:23:0x006a->B:24:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0083 A[ADDED_TO_REGION, LOOP:2: B:25:0x0083->B:26:0x0085, LOOP_START, PHI: r0
  0x0083: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:16:0x0043, B:26:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0085 A[LOOP:2: B:25:0x0083->B:26:0x0085, LOOP_END] */
    @Override // p246x4.e
    public final void a(ByteBuffer byteBuffer) {
        int i10;
        int i11;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i12 = iLimit - iPosition;
        int i13 = this.f28538d;
        if (i13 == Integer.MIN_VALUE) {
            i12 /= 3;
        } else {
            if (i13 != 3) {
                if (i13 == 1073741824) {
                    i10 = i12 / 2;
                } else {
                    throw new IllegalStateException();
                }
            }
            if (this.f28539e.capacity() < i10) {
                this.f28539e = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
            } else {
                this.f28539e.clear();
            }
            i11 = this.f28538d;
            if (i11 != Integer.MIN_VALUE) {
                while (iPosition < iLimit) {
                    this.f28539e.put(byteBuffer.get(iPosition + 1));
                    this.f28539e.put(byteBuffer.get(iPosition + 2));
                    iPosition += 3;
                }
            } else if (i11 != 3) {
                while (iPosition < iLimit) {
                    this.f28539e.put((byte) 0);
                    this.f28539e.put((byte) ((byteBuffer.get(iPosition) & ForkServer.ERROR) - 128));
                    iPosition++;
                }
            } else {
                if (i11 == 1073741824) {
                    throw new IllegalStateException();
                }
                while (iPosition < iLimit) {
                    this.f28539e.put(byteBuffer.get(iPosition + 2));
                    this.f28539e.put(byteBuffer.get(iPosition + 3));
                    iPosition += 4;
                }
            }
            byteBuffer.position(byteBuffer.limit());
            this.f28539e.flip();
            this.f28540f = this.f28539e;
        }
        i10 = i12 * 2;
        if (this.f28539e.capacity() < i10) {
            this.f28539e = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f28539e.clear();
        }
        i11 = this.f28538d;
        if (i11 != Integer.MIN_VALUE) {
            while (iPosition < iLimit) {
                this.f28539e.put(byteBuffer.get(iPosition + 1));
                this.f28539e.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i11 != 3) {
            while (iPosition < iLimit) {
                this.f28539e.put((byte) 0);
                this.f28539e.put((byte) ((byteBuffer.get(iPosition) & ForkServer.ERROR) - 128));
                iPosition++;
            }
        } else {
            if (i11 == 1073741824) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                this.f28539e.put(byteBuffer.get(iPosition + 2));
                this.f28539e.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        this.f28539e.flip();
        this.f28540f = this.f28539e;
    }
}
