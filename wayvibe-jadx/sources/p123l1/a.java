package p123l1;

import B2.AbstractC0112b;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f21926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f21927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f21929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f21930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f21932g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String[] f21933h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21934i;

    public final void a(float f10, int i10) {
        int i11 = this.f21931f;
        int[] iArr = this.f21929d;
        if (i11 >= iArr.length) {
            this.f21929d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f21930e;
            this.f21930e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f21929d;
        int i12 = this.f21931f;
        iArr2[i12] = i10;
        float[] fArr2 = this.f21930e;
        this.f21931f = i12 + 1;
        fArr2[i12] = f10;
    }

    public final void b(int i10, int i11) {
        int i12 = this.f21928c;
        int[] iArr = this.f21926a;
        if (i12 >= iArr.length) {
            this.f21926a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f21927b;
            this.f21927b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f21926a;
        int i13 = this.f21928c;
        iArr3[i13] = i10;
        int[] iArr4 = this.f21927b;
        this.f21928c = i13 + 1;
        iArr4[i13] = i11;
    }

    public final void c(int i10, String str) {
        int i11 = this.f21934i;
        int[] iArr = this.f21932g;
        if (i11 >= iArr.length) {
            this.f21932g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f21933h;
            this.f21933h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f21932g;
        int i12 = this.f21934i;
        iArr2[i12] = i10;
        String[] strArr2 = this.f21933h;
        this.f21934i = i12 + 1;
        strArr2[i12] = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypedBundle{mCountInt=");
        sb.append(this.f21928c);
        sb.append(", mCountFloat=");
        sb.append(this.f21931f);
        sb.append(", mCountString=");
        return AbstractC0112b.i(sb, this.f21934i, ", mCountBoolean=0}");
    }
}
