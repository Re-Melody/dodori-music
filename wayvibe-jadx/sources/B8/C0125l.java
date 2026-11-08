package B8;

import D8.C0309r1;
import D8.L1;
import com.revenuecat.purchases.common.HTTPClient;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: renamed from: B8.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0125l implements InterfaceC0126m, d0, p0, a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0125l f832b = new C0125l(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f833c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f834a;

    public /* synthetic */ C0125l(int i10) {
        this.f834a = i10;
    }

    @Override // B8.a0
    public String a(Object obj) {
        return (String) obj;
    }

    @Override // B8.p0
    public boolean b(Object obj) {
        switch (this.f834a) {
            case 6:
                ((S) obj).getClass();
                break;
            case 7:
                ((W) obj).getClass();
                break;
            default:
                ((l0) obj).getClass();
                break;
        }
        return true;
    }

    @Override // B8.p0
    public int c(Object obj) {
        switch (this.f834a) {
            case 6:
                ((S) obj).getClass();
                return 5;
            case 7:
                ((E8.k) ((W) obj)).getClass();
                try {
                    Class.forName("android.app.Application", false, E8.k.class.getClassLoader());
                    return 8;
                } catch (Exception unused) {
                    return 3;
                }
            default:
                ((l0) obj).getClass();
                return 5;
        }
    }

    @Override // B8.InterfaceC0126m
    public String d() {
        switch (this.f834a) {
            case 0:
                return "identity";
            default:
                return HTTPClient.RC_FORMAT_ACCEPT_ENCODING;
        }
    }

    @Override // B8.InterfaceC0126m
    public OutputStream f(C0309r1 c0309r1) {
        switch (this.f834a) {
            case 0:
                return c0309r1;
            default:
                return new GZIPOutputStream(c0309r1);
        }
    }

    @Override // B8.InterfaceC0126m
    public InputStream g(L1 l10) {
        switch (this.f834a) {
            case 0:
                return l10;
            default:
                return new GZIPInputStream(l10);
        }
    }

    @Override // B8.d0
    public Object h(byte[] bArr) {
        int i10;
        byte b10;
        switch (this.f834a) {
            case 1:
                for (int i11 = 0; i11 < bArr.length; i11++) {
                    byte b11 = bArr[i11];
                    if (b11 < 32 || b11 >= 126 || (b11 == 37 && i11 + 2 < bArr.length)) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length);
                        int i12 = 0;
                        while (i12 < bArr.length) {
                            if (bArr[i12] == 37 && i12 + 2 < bArr.length) {
                                try {
                                    byteBufferAllocate.put((byte) Integer.parseInt(new String(bArr, i12 + 1, 2, p267z6.h.f29877a), 16));
                                    i12 += 3;
                                } catch (NumberFormatException unused) {
                                    byteBufferAllocate.put(bArr[i12]);
                                    i12++;
                                }
                            }
                            byteBufferAllocate.put(bArr[i12]);
                            i12++;
                        }
                        return new String(byteBufferAllocate.array(), 0, byteBufferAllocate.position(), p267z6.h.f29879c);
                    }
                }
                return new String(bArr, 0);
            default:
                char c3 = 0;
                if (bArr.length == 1 && bArr[0] == 48) {
                    return r0.f848e;
                }
                int length = bArr.length;
                if (length != 1) {
                    if (length == 2 && (b10 = bArr[0]) >= 48 && b10 <= 57) {
                        i10 = (b10 - 48) * 10;
                        c3 = 1;
                    }
                    return r0.f850g.g("Unknown code ".concat(new String(bArr, p267z6.h.f29877a)));
                }
                i10 = 0;
                byte b12 = bArr[c3];
                if (b12 >= 48 && b12 <= 57) {
                    int i13 = (b12 - 48) + i10;
                    List list = r0.f847d;
                    if (i13 < list.size()) {
                        return (r0) list.get(i13);
                    }
                }
                return r0.f850g.g("Unknown code ".concat(new String(bArr, p267z6.h.f29877a)));
        }
    }

    public String toString() {
        switch (this.f834a) {
            case 5:
                return "internal:health-check-consumer-listener";
            default:
                return super.toString();
        }
    }

    public C0125l(SSLSession sSLSession) {
        this.f834a = 4;
        sSLSession.getCipherSuite();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            Certificate certificate = localCertificates[0];
        }
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            if (peerCertificates != null) {
                Certificate certificate2 = peerCertificates[0];
            }
        } catch (SSLPeerUnverifiedException e2) {
            E.f726d.log(Level.FINE, "Peer cert not available for peerHost=" + sSLSession.getPeerHost(), (Throwable) e2);
        }
    }

    @Override // B8.d0
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public byte[] mo0a(Object obj) {
        switch (this.f834a) {
            case 1:
                byte[] bytes = ((String) obj).getBytes(p267z6.h.f29879c);
                int i10 = 0;
                while (i10 < bytes.length) {
                    byte b10 = bytes[i10];
                    if (b10 < 32 || b10 >= 126 || b10 == 37) {
                        byte[] bArr = new byte[((bytes.length - i10) * 3) + i10];
                        if (i10 != 0) {
                            System.arraycopy(bytes, 0, bArr, 0, i10);
                        }
                        int i11 = i10;
                        while (i10 < bytes.length) {
                            byte b11 = bytes[i10];
                            if (b11 < 32 || b11 >= 126 || b11 == 37) {
                                bArr[i11] = 37;
                                byte[] bArr2 = f833c;
                                bArr[i11 + 1] = bArr2[(b11 >> 4) & 15];
                                bArr[i11 + 2] = bArr2[b11 & 15];
                                i11 += 3;
                            } else {
                                bArr[i11] = b11;
                                i11++;
                            }
                            i10++;
                        }
                        return Arrays.copyOf(bArr, i11);
                    }
                    i10++;
                }
                return bytes;
            default:
                return q0.a(((r0) obj).f859a);
        }
    }

    @Override // B8.a0
    public Object e(String str) {
        return str;
    }
}
