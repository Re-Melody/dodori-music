package D4;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f1965e = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f1969d;

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f1966a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f1969d;
            int length = bArr2.length;
            int i13 = this.f1967b + i12;
            if (length < i13) {
                this.f1969d = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i10, this.f1969d, this.f1967b, i12);
            this.f1967b += i12;
        }
    }
}
