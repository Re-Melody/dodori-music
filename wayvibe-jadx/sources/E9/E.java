package E9;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class E implements InterfaceC0349j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f3341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0348i f3342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3343c;

    public E(K sink) {
        kotlin.jvm.internal.m.f(sink, "sink");
        this.f3341a = sink;
        this.f3342b = new C0348i();
    }

    public final InterfaceC0349j b() {
        if (this.f3343c) {
            throw new IllegalStateException("closed");
        }
        C0348i c0348i = this.f3342b;
        long jC = c0348i.c();
        if (jC > 0) {
            this.f3341a.r(jC, c0348i);
        }
        return this;
    }

    public final InterfaceC0349j c(long j10) {
        if (this.f3343c) {
            throw new IllegalStateException("closed");
        }
        this.f3342b.L(j10);
        b();
        return this;
    }

    @Override // E9.K, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        K k = this.f3341a;
        if (this.f3343c) {
            return;
        }
        C0348i c0348i = this.f3342b;
        long j10 = c0348i.f3387b;
        if (j10 > 0) {
            k.r(j10, c0348i);
        }
        th = null;
        try {
            k.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f3343c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // E9.K
    public final O f() {
        return this.f3341a.f();
    }

    @Override // E9.InterfaceC0349j, E9.K, java.io.Flushable
    public final void flush() {
        if (this.f3343c) {
            throw new IllegalStateException("closed");
        }
        C0348i c0348i = this.f3342b;
        long j10 = c0348i.f3387b;
        K k = this.f3341a;
        if (j10 > 0) {
            k.r(j10, c0348i);
        }
        k.flush();
    }

    @Override // E9.InterfaceC0349j
    public final InterfaceC0349j h(int i10) {
        if (this.f3343c) {
            throw new IllegalStateException("closed");
        }
        this.f3342b.O(i10);
        b();
        return this;
    }

    @Override // E9.InterfaceC0349j
    public final InterfaceC0349j i(int i10) {
        if (this.f3343c) {
            throw new IllegalStateException("closed");
        }
        this.f3342b.N(i10);
        b();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f3343c;
    }

    @Override // E9.InterfaceC0349j
    public final InterfaceC0349j j(int i10) {
        if (this.f3343c) {
            throw new IllegalStateException("closed");
        }
        this.f3342b.K(i10);
        b();
        return this;
    }

    @Override // E9.InterfaceC0349j
    public final InterfaceC0349j o(C0351l byteString) {
        kotlin.jvm.internal.m.f(byteString, "byteString");
        if (this.f3343c) {
            throw new IllegalStateException("closed");
        }
        this.f3342b.H(byteString);
        b();
        return this;
    }

    @Override // E9.InterfaceC0349j
    public final InterfaceC0349j p(String string) {
        kotlin.jvm.internal.m.f(string, "string");
        if (this.f3343c) {
            throw new IllegalStateException("closed");
        }
        this.f3342b.R(string);
        b();
        return this;
    }

    @Override // E9.K
    public final void r(long j10, C0348i source) {
        kotlin.jvm.internal.m.f(source, "source");
        if (this.f3343c) {
            throw new IllegalStateException("closed");
        }
        this.f3342b.r(j10, source);
        b();
    }

    public final String toString() {
        return "buffer(" + this.f3341a + ')';
    }

    @Override // E9.InterfaceC0349j
    public final InterfaceC0349j u(byte[] source) {
        kotlin.jvm.internal.m.f(source, "source");
        if (this.f3343c) {
            throw new IllegalStateException("closed");
        }
        this.f3342b.I(source, 0, source.length);
        b();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        kotlin.jvm.internal.m.f(source, "source");
        if (this.f3343c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f3342b.write(source);
        b();
        return iWrite;
    }
}
