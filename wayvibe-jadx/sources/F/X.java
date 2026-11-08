package F;

/* JADX INFO: loaded from: classes.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f3501e;

    public int a(int i10) {
        int i11 = this.f3497a + 1;
        int[] iArr = (int[]) this.f3499c;
        int length = iArr.length;
        if (i11 > length) {
            int i12 = length * 2;
            int[] iArr2 = new int[i12];
            int[] iArr3 = new int[i12];
            N8.m.l0(0, 0, 14, iArr, iArr2);
            N8.m.l0(0, 0, 14, (int[]) this.f3500d, iArr3);
            this.f3499c = iArr2;
            this.f3500d = iArr3;
        }
        int i13 = this.f3497a;
        this.f3497a = i13 + 1;
        int length2 = ((int[]) this.f3501e).length;
        if (this.f3498b >= length2) {
            int i14 = length2 * 2;
            int[] iArr4 = new int[i14];
            int i15 = 0;
            while (i15 < i14) {
                int i16 = i15 + 1;
                iArr4[i15] = i16;
                i15 = i16;
            }
            N8.m.l0(0, 0, 14, (int[]) this.f3501e, iArr4);
            this.f3501e = iArr4;
        }
        int i17 = this.f3498b;
        int[] iArr5 = (int[]) this.f3501e;
        this.f3498b = iArr5[i17];
        int[] iArr6 = (int[]) this.f3499c;
        iArr6[i13] = i10;
        ((int[]) this.f3500d)[i13] = i17;
        iArr5[i17] = i13;
        int i18 = iArr6[i13];
        while (i13 > 0) {
            int i19 = ((i13 + 1) >> 1) - 1;
            if (iArr6[i19] <= i18) {
                break;
            }
            b(i19, i13);
            i13 = i19;
        }
        return i17;
    }

    public void b(int i10, int i11) {
        int[] iArr = (int[]) this.f3499c;
        int[] iArr2 = (int[]) this.f3500d;
        int[] iArr3 = (int[]) this.f3501e;
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
        int i13 = iArr2[i10];
        iArr2[i10] = iArr2[i11];
        iArr2[i11] = i13;
        iArr3[iArr2[i10]] = i10;
        iArr3[iArr2[i11]] = i11;
    }
}
