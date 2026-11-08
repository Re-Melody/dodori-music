package O2;

import B2.AbstractC0111a;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class g extends E2.g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f9061j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9062l;

    @Override // E2.g
    public final void i() {
        super.i();
        this.k = 0;
    }

    public final boolean m(E2.g gVar) {
        ByteBuffer byteBuffer;
        AbstractC0111a.d(!gVar.e(1073741824));
        AbstractC0111a.d(!gVar.e(268435456));
        AbstractC0111a.d(!gVar.e(4));
        if (o()) {
            if (this.k >= this.f9062l) {
                return false;
            }
            ByteBuffer byteBuffer2 = gVar.f3030e;
            if (byteBuffer2 != null && (byteBuffer = this.f3030e) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i10 = this.k;
        this.k = i10 + 1;
        if (i10 == 0) {
            this.f3032g = gVar.f3032g;
            if (gVar.e(1)) {
                this.f3017b = 1;
            }
        }
        ByteBuffer byteBuffer3 = gVar.f3030e;
        if (byteBuffer3 != null) {
            k(byteBuffer3.remaining());
            this.f3030e.put(byteBuffer3);
        }
        this.f9061j = gVar.f3032g;
        return true;
    }

    public final boolean o() {
        return this.k > 0;
    }
}
