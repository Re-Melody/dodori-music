package U6;

import java.nio.charset.Charset;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f12250a = Charset.forName("UTF-8");

    /* JADX WARN: Code duplicated, block: B:37:0x00b9  */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e2, code lost:
    
        if (r7 != 4) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] a(java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U6.f.a(java.lang.String):byte[]");
    }

    public static byte[] b(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = e.f12249d;
        int i10 = (length / 3) * 4;
        if (length % 3 > 0) {
            i10 += 4;
        }
        byte[] bArr3 = new byte[i10];
        int i11 = 0;
        int i12 = -1;
        int i13 = 0;
        while (true) {
            int i14 = i11 + 3;
            if (i14 > length) {
                break;
            }
            int i15 = (bArr[i11 + 2] & ForkServer.ERROR) | ((bArr[i11] & ForkServer.ERROR) << 16) | ((bArr[i11 + 1] & ForkServer.ERROR) << 8);
            bArr3[i13] = bArr2[(i15 >> 18) & 63];
            bArr3[i13 + 1] = bArr2[(i15 >> 12) & 63];
            bArr3[i13 + 2] = bArr2[(i15 >> 6) & 63];
            bArr3[i13 + 3] = bArr2[i15 & 63];
            int i16 = i13 + 4;
            i12--;
            if (i12 == 0) {
                i13 += 5;
                bArr3[i16] = 10;
                i12 = 19;
            } else {
                i13 = i16;
            }
            i11 = i14;
        }
        if (i11 == length - 1) {
            int i17 = (bArr[i11] & ForkServer.ERROR) << 4;
            bArr3[i13] = bArr2[(i17 >> 6) & 63];
            bArr3[i13 + 1] = bArr2[i17 & 63];
            bArr3[i13 + 2] = 61;
            bArr3[i13 + 3] = 61;
            return bArr3;
        }
        if (i11 == length - 2) {
            int i18 = ((bArr[i11 + 1] & ForkServer.ERROR) << 2) | ((bArr[i11] & ForkServer.ERROR) << 10);
            bArr3[i13] = bArr2[(i18 >> 12) & 63];
            bArr3[i13 + 1] = bArr2[(i18 >> 6) & 63];
            bArr3[i13 + 2] = bArr2[i18 & 63];
            bArr3[i13 + 3] = 61;
        }
        return bArr3;
    }
}
