package p203t3;

import B2.AbstractC0111a;
import Z2.E;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E f26807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f26809e;

    /* JADX WARN: Code duplicated, block: B:11:0x0020 A[FALL_THROUGH] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public p(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        int i13 = 2;
        byte b10 = 0;
        AbstractC0111a.d((i10 == 0) ^ (bArr2 == null));
        this.f26805a = z10;
        this.f26806b = str;
        this.f26808d = i10;
        this.f26809e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals("cbc1")) {
                        b10 = -1;
                    }
                    break;
                case 3046671:
                    b10 = !str.equals("cbcs") ? (byte) -1 : (byte) 1;
                    break;
                case 3049879:
                    b10 = !str.equals("cenc") ? (byte) -1 : (byte) 2;
                    break;
                case 3049895:
                    b10 = !str.equals("cens") ? (byte) -1 : (byte) 3;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                case 1:
                    break;
                default:
                    AbstractC0111a.x("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                case 2:
                case 3:
                    i13 = 1;
                    break;
            }
        } else {
            i13 = 1;
        }
        this.f26807c = new E(i13, bArr, i11, i12);
    }
}
