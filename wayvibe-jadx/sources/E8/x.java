package E8;

import E9.C0348i;

/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0348i f3322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3324c;

    public x(C0348i c0348i, int i10) {
        this.f3322a = c0348i;
        this.f3323b = i10;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        this.f3322a.I(bArr, i10, i11);
        this.f3323b -= i11;
        this.f3324c += i11;
    }
}
