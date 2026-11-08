package D2;

import B2.AbstractC0111a;
import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC0202c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k f1853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f1854f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1855g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1856h;

    @Override // D2.h
    public final void close() {
        if (this.f1854f != null) {
            this.f1854f = null;
            b();
        }
        this.f1853e = null;
    }

    @Override // D2.h
    public final long l(k kVar) throws i, p255y2.D {
        c();
        this.f1853e = kVar;
        Uri uriNormalizeScheme = kVar.f1865a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        AbstractC0111a.c("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i10 = B2.C.f560a;
        String[] strArrSplit = schemeSpecificPart.split(com.amazon.a.a.o.b.f.f16451a, -1);
        if (strArrSplit.length != 2) {
            throw new p255y2.D("Unexpected URI format: " + uriNormalizeScheme, null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f1854f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e2) {
                throw new p255y2.D(p134m1.b.k("Error while parsing Base64 encoded string: ", str), e2, true, 0);
            }
        } else {
            this.f1854f = URLDecoder.decode(str, p267z6.h.f29877a.name()).getBytes(p267z6.h.f29879c);
        }
        byte[] bArr = this.f1854f;
        long length = bArr.length;
        long j10 = kVar.f1869e;
        if (j10 > length) {
            this.f1854f = null;
            throw new i(2008);
        }
        int i11 = (int) j10;
        this.f1855g = i11;
        int length2 = bArr.length - i11;
        this.f1856h = length2;
        long j11 = kVar.f1870f;
        if (j11 != -1) {
            this.f1856h = (int) Math.min(length2, j11);
        }
        e(kVar);
        return j11 != -1 ? j11 : this.f1856h;
    }

    @Override // p255y2.InterfaceC2333i
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f1856h;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        byte[] bArr2 = this.f1854f;
        int i13 = B2.C.f560a;
        System.arraycopy(bArr2, this.f1855g, bArr, i10, iMin);
        this.f1855g += iMin;
        this.f1856h -= iMin;
        a(iMin);
        return iMin;
    }

    @Override // D2.h
    public final Uri s() {
        k kVar = this.f1853e;
        if (kVar != null) {
            return kVar.f1865a;
        }
        return null;
    }
}
