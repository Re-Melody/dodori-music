package C4;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A4.f f1454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f1456d;

    public s(String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        int i13 = 1;
        X4.a.k((bArr2 == null) ^ (i10 == 0));
        this.f1453a = str;
        this.f1455c = i10;
        this.f1456d = bArr2;
        if (str != null && (str.equals("cbc1") || str.equals("cbcs"))) {
            i13 = 2;
        }
        this.f1454b = new A4.f(i13, bArr, i11, i12);
    }
}
