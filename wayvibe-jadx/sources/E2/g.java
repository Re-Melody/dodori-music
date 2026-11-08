package E2;

import B2.AbstractC0112b;
import java.nio.ByteBuffer;
import p255y2.AbstractC2347x;
import p255y2.C2339o;

/* JADX INFO: loaded from: classes.dex */
public class g extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C2339o f3028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f3029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ByteBuffer f3030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f3032g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ByteBuffer f3033h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f3034i;

    static {
        AbstractC2347x.a("media3.decoder");
    }

    public g(int i10) {
        super(0, (byte) 0);
        this.f3029d = new c();
        this.f3034i = i10;
    }

    public void i() {
        this.f3017b = 0;
        ByteBuffer byteBuffer = this.f3030e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f3033h;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f3031f = false;
    }

    public final ByteBuffer j(int i10) {
        int i11 = this.f3034i;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f3030e;
        throw new f(AbstractC0112b.f("Buffer too small (", byteBuffer == null ? 0 : byteBuffer.capacity(), " < ", i10, ")"));
    }

    public final void k(int i10) {
        ByteBuffer byteBuffer = this.f3030e;
        if (byteBuffer == null) {
            this.f3030e = j(i10);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i11 = i10 + iPosition;
        if (iCapacity >= i11) {
            this.f3030e = byteBuffer;
            return;
        }
        ByteBuffer byteBufferJ = j(i11);
        byteBufferJ.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferJ.put(byteBuffer);
        }
        this.f3030e = byteBufferJ;
    }

    public final void l() {
        ByteBuffer byteBuffer = this.f3030e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f3033h;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
