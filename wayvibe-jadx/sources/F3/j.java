package F3;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f4346f = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f4351e;

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f4347a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f4351e;
            int length = bArr2.length;
            int i13 = this.f4349c + i12;
            if (length < i13) {
                this.f4351e = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i10, this.f4351e, this.f4349c, i12);
            this.f4349c += i12;
        }
    }
}
