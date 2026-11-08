package p256y4;

import B2.AbstractC0112b;
import E2.a;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class d extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B9.d f29072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f29073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ByteBuffer f29074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f29075f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f29076g;

    public d(int i10) {
        super(2, (byte) 0);
        this.f29072c = new B9.d(17);
        a aVar = new a();
        aVar.f29067a = null;
        aVar.f29068b = null;
        aVar.f29069c = 1;
        this.f29073d = aVar;
        this.f29076g = i10;
    }

    public final void i() {
        this.f3017b = 0;
        ByteBuffer byteBuffer = this.f29074e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final void j(int i10) {
        ByteBuffer byteBuffer = this.f29074e;
        if (byteBuffer == null) {
            this.f29074e = k(i10);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = this.f29074e.position();
        int i11 = i10 + iPosition;
        if (iCapacity >= i11) {
            return;
        }
        ByteBuffer byteBufferK = k(i11);
        if (iPosition > 0) {
            this.f29074e.position(0);
            this.f29074e.limit(iPosition);
            byteBufferK.put(this.f29074e);
        }
        this.f29074e = byteBufferK;
    }

    public final ByteBuffer k(int i10) {
        int i11 = this.f29076g;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f29074e;
        throw new IllegalStateException(AbstractC0112b.f("Buffer too small (", byteBuffer == null ? 0 : byteBuffer.capacity(), " < ", i10, ")"));
    }
}
