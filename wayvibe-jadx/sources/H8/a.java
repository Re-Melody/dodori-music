package H8;

import B8.K;
import com.google.protobuf.AbstractC1230a;
import com.google.protobuf.AbstractC1267t;
import com.google.protobuf.InterfaceC1274w0;
import com.google.protobuf.J;
import com.google.protobuf.r;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends InputStream implements K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC1230a f6233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1274w0 f6234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteArrayInputStream f6235c;

    public a(AbstractC1230a abstractC1230a, InterfaceC1274w0 interfaceC1274w0) {
        this.f6233a = abstractC1230a;
        this.f6234b = interfaceC1274w0;
    }

    @Override // java.io.InputStream
    public final int available() {
        AbstractC1230a abstractC1230a = this.f6233a;
        if (abstractC1230a != null) {
            return ((J) abstractC1230a).c(null);
        }
        ByteArrayInputStream byteArrayInputStream = this.f6235c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f6233a != null) {
            this.f6235c = new ByteArrayInputStream(this.f6233a.d());
            this.f6233a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f6235c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        AbstractC1230a abstractC1230a = this.f6233a;
        if (abstractC1230a != null) {
            int iC = ((J) abstractC1230a).c(null);
            if (iC == 0) {
                this.f6233a = null;
                this.f6235c = null;
                return -1;
            }
            if (i11 >= iC) {
                Logger logger = AbstractC1267t.f18812d;
                r rVar = new r(bArr, i10, iC);
                this.f6233a.e(rVar);
                if (rVar.a0() == 0) {
                    this.f6233a = null;
                    this.f6235c = null;
                    return iC;
                }
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            this.f6235c = new ByteArrayInputStream(this.f6233a.d());
            this.f6233a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f6235c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i10, i11);
        }
        return -1;
    }
}
