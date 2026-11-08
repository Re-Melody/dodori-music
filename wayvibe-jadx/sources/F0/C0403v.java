package F0;

import java.util.Arrays;

/* JADX INFO: renamed from: F0.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0403v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f3847b;

    public C0403v(int i10, boolean z10) {
        switch (i10) {
            case 2:
                this.f3847b = new int[10];
                break;
            default:
                this.f3847b = new int[10];
                break;
        }
    }

    public boolean a(int i10) {
        return ((1 << i10) & this.f3846a) != 0;
    }

    public int b() {
        int[] iArr = this.f3847b;
        int i10 = this.f3846a - 1;
        this.f3846a = i10;
        return iArr[i10];
    }

    public void c(int i10) {
        int i11 = this.f3846a;
        int[] iArr = this.f3847b;
        if (i11 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            kotlin.jvm.internal.m.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f3847b = iArrCopyOf;
        }
        int[] iArr2 = this.f3847b;
        int i12 = this.f3846a;
        this.f3846a = i12 + 1;
        iArr2[i12] = i10;
    }

    public void d(int i10, int i11, int i12) {
        int i13 = this.f3846a;
        int i14 = i13 + 3;
        int[] iArr = this.f3847b;
        if (i14 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            kotlin.jvm.internal.m.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f3847b = iArrCopyOf;
        }
        int[] iArr2 = this.f3847b;
        iArr2[i13] = i10 + i12;
        iArr2[i13 + 1] = i11 + i12;
        iArr2[i13 + 2] = i12;
        this.f3846a = i14;
    }

    public void e(int i10, int i11, int i12, int i13) {
        int i14 = this.f3846a;
        int i15 = i14 + 4;
        int[] iArr = this.f3847b;
        if (i15 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            kotlin.jvm.internal.m.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f3847b = iArrCopyOf;
        }
        int[] iArr2 = this.f3847b;
        iArr2[i14] = i10;
        iArr2[i14 + 1] = i11;
        iArr2[i14 + 2] = i12;
        iArr2[i14 + 3] = i13;
        this.f3846a = i15;
    }

    public void f(int i10, int i11) {
        if (i10 < i11) {
            int i12 = i10 - 3;
            for (int i13 = i10; i13 < i11; i13 += 3) {
                int[] iArr = this.f3847b;
                int i14 = iArr[i13];
                int i15 = iArr[i11];
                if (i14 < i15 || (i14 == i15 && iArr[i13 + 1] <= iArr[i11 + 1])) {
                    i12 += 3;
                    h(i12, i13);
                }
            }
            h(i12 + 3, i11);
            f(i10, i12);
            f(i12 + 6, i11);
        }
    }

    public void g(int i10, int i11) {
        int[] iArr = this.f3847b;
        if (i10 >= iArr.length) {
            return;
        }
        this.f3846a = (1 << i10) | this.f3846a;
        iArr[i10] = i11;
    }

    public void h(int i10, int i11) {
        int[] iArr = this.f3847b;
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
        int i13 = i10 + 1;
        int i14 = i11 + 1;
        int i15 = iArr[i13];
        iArr[i13] = iArr[i14];
        iArr[i14] = i15;
        int i16 = i10 + 2;
        int i17 = i11 + 2;
        int i18 = iArr[i16];
        iArr[i16] = iArr[i17];
        iArr[i17] = i18;
    }

    public C0403v(int i10) {
        this.f3847b = new int[i10];
    }
}
