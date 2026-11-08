package E9;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class G implements InterfaceC0350k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M f3345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0348i f3346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3347c;

    public G(M source) {
        kotlin.jvm.internal.m.f(source, "source");
        this.f3345a = source;
        this.f3346b = new C0348i();
    }

    @Override // E9.InterfaceC0350k
    public final C0351l a(long j10) throws EOFException {
        y(j10);
        return this.f3346b.a(j10);
    }

    public final boolean b() {
        if (this.f3347c) {
            throw new IllegalStateException("closed");
        }
        C0348i c0348i = this.f3346b;
        return c0348i.g() && this.f3345a.d(8192L, c0348i) == -1;
    }

    public final long c(long j10, long j11, byte b10) {
        if (this.f3347c) {
            throw new IllegalStateException("closed");
        }
        if (0 > j11) {
            throw new IllegalArgumentException(V0.p.j(j11, "fromIndex=0 toIndex=").toString());
        }
        long jMax = 0;
        while (jMax < j11) {
            C0348i c0348i = this.f3346b;
            long j12 = j11;
            byte b11 = b10;
            long jV = c0348i.v(jMax, j12, b11);
            if (jV != -1) {
                return jV;
            }
            long j13 = c0348i.f3387b;
            if (j13 >= j12 || this.f3345a.d(8192L, c0348i) == -1) {
                break;
            }
            jMax = Math.max(jMax, j13);
            j11 = j12;
            b10 = b11;
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f3347c) {
            return;
        }
        this.f3347c = true;
        this.f3345a.close();
        this.f3346b.b();
    }

    @Override // E9.M
    public final long d(long j10, C0348i sink) {
        kotlin.jvm.internal.m.f(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(V0.p.j(j10, "byteCount < 0: ").toString());
        }
        if (this.f3347c) {
            throw new IllegalStateException("closed");
        }
        C0348i c0348i = this.f3346b;
        if (c0348i.f3387b == 0) {
            if (j10 == 0) {
                return 0L;
            }
            if (this.f3345a.d(8192L, c0348i) == -1) {
                return -1L;
            }
        }
        return c0348i.d(Math.min(j10, c0348i.f3387b), sink);
    }

    public final int e() throws EOFException {
        y(4L);
        return AbstractC0341b.g(this.f3346b.readInt());
    }

    @Override // E9.M
    public final O f() {
        return this.f3345a.f();
    }

    public final long g() throws EOFException {
        long j10;
        y(8L);
        C0348i c0348i = this.f3346b;
        if (c0348i.f3387b < 8) {
            throw new EOFException();
        }
        H h10 = c0348i.f3386a;
        kotlin.jvm.internal.m.c(h10);
        int i10 = h10.f3349b;
        int i11 = h10.f3350c;
        if (i11 - i10 < 8) {
            j10 = ((((long) c0348i.readInt()) & 4294967295L) << 32) | (4294967295L & ((long) c0348i.readInt()));
        } else {
            byte[] bArr = h10.f3348a;
            int i12 = i10 + 7;
            long j11 = ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
            int i13 = i10 + 8;
            long j12 = j11 | (((long) bArr[i12]) & 255);
            c0348i.f3387b -= 8;
            if (i13 == i11) {
                c0348i.f3386a = h10.a();
                I.a(h10);
            } else {
                h10.f3349b = i13;
            }
            j10 = j12;
        }
        return ((j10 & 255) << 56) | (((-72057594037927936L) & j10) >>> 56) | ((71776119061217280L & j10) >>> 40) | ((280375465082880L & j10) >>> 24) | ((1095216660480L & j10) >>> 8) | ((4278190080L & j10) << 8) | ((16711680 & j10) << 24) | ((65280 & j10) << 40);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f3347c;
    }

    @Override // E9.InterfaceC0350k
    public final byte[] k() {
        M m8 = this.f3345a;
        C0348i c0348i = this.f3346b;
        c0348i.J(m8);
        return c0348i.z(c0348i.f3387b);
    }

    public final short l() throws EOFException {
        y(2L);
        return this.f3346b.B();
    }

    @Override // E9.InterfaceC0350k
    public final C0348i m() {
        return this.f3346b;
    }

    @Override // E9.InterfaceC0350k
    public final String n(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(V0.p.j(j10, "limit < 0: ").toString());
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        long jC = c(0L, j11, (byte) 10);
        C0348i c0348i = this.f3346b;
        if (jC != -1) {
            return F9.a.b(jC, c0348i);
        }
        if (j11 < Long.MAX_VALUE && s(j11) && c0348i.l(j11 - 1) == 13 && s(j11 + 1) && c0348i.l(j11) == 10) {
            return F9.a.b(j11, c0348i);
        }
        C0348i c0348i2 = new C0348i();
        c0348i.e(c0348i2, 0L, Math.min(32, c0348i.f3387b));
        throw new EOFException("\\n not found: limit=" + Math.min(c0348i.f3387b, j10) + " content=" + c0348i2.a(c0348i2.f3387b).l() + (char) 8230);
    }

    public final String q(long j10) throws EOFException {
        y(j10);
        C0348i c0348i = this.f3346b;
        c0348i.getClass();
        return c0348i.C(j10, p097i9.a.f20563a);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.m.f(sink, "sink");
        C0348i c0348i = this.f3346b;
        if (c0348i.f3387b == 0 && this.f3345a.d(8192L, c0348i) == -1) {
            return -1;
        }
        return c0348i.read(sink);
    }

    @Override // E9.InterfaceC0350k
    public final byte readByte() throws EOFException {
        y(1L);
        return this.f3346b.readByte();
    }

    @Override // E9.InterfaceC0350k
    public final int readInt() throws EOFException {
        y(4L);
        return this.f3346b.readInt();
    }

    @Override // E9.InterfaceC0350k
    public final short readShort() throws EOFException {
        y(2L);
        return this.f3346b.readShort();
    }

    @Override // E9.InterfaceC0350k
    public final boolean s(long j10) {
        C0348i c0348i;
        if (j10 < 0) {
            throw new IllegalArgumentException(V0.p.j(j10, "byteCount < 0: ").toString());
        }
        if (this.f3347c) {
            throw new IllegalStateException("closed");
        }
        do {
            c0348i = this.f3346b;
            if (c0348i.f3387b >= j10) {
                return true;
            }
        } while (this.f3345a.d(8192L, c0348i) != -1);
        return false;
    }

    @Override // E9.InterfaceC0350k
    public final void skip(long j10) throws EOFException {
        if (this.f3347c) {
            throw new IllegalStateException("closed");
        }
        while (j10 > 0) {
            C0348i c0348i = this.f3346b;
            if (c0348i.f3387b == 0 && this.f3345a.d(8192L, c0348i) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, c0348i.f3387b);
            c0348i.skip(jMin);
            j10 -= jMin;
        }
    }

    @Override // E9.InterfaceC0350k
    public final long t(E e2) {
        C0348i c0348i;
        long j10 = 0;
        while (true) {
            c0348i = this.f3346b;
            if (this.f3345a.d(8192L, c0348i) == -1) {
                break;
            }
            long jC = c0348i.c();
            if (jC > 0) {
                j10 += jC;
                e2.r(jC, c0348i);
            }
        }
        long j11 = c0348i.f3387b;
        if (j11 <= 0) {
            return j10;
        }
        long j12 = j10 + j11;
        e2.r(j11, c0348i);
        return j12;
    }

    public final String toString() {
        return "buffer(" + this.f3345a + ')';
    }

    @Override // E9.InterfaceC0350k
    public final void y(long j10) throws EOFException {
        if (!s(j10)) {
            throw new EOFException();
        }
    }
}
