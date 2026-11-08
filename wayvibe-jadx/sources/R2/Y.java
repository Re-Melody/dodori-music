package R2;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Random f10771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f10772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f10773c;

    public Y() {
        this(new Random());
    }

    public final Y a() {
        return new Y(new Random(this.f10771a.nextLong()));
    }

    public final Y b(int i10, int i11) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i11];
        int[] iArr3 = new int[i11];
        int i12 = 0;
        while (true) {
            iArr = this.f10772b;
            random = this.f10771a;
            if (i12 >= i11) {
                break;
            }
            iArr2[i12] = random.nextInt(iArr.length + 1);
            int i13 = i12 + 1;
            int iNextInt = random.nextInt(i13);
            iArr3[i12] = iArr3[iNextInt];
            iArr3[iNextInt] = i12 + i10;
            i12 = i13;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i11];
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < iArr.length + i11; i16++) {
            if (i14 >= i11 || i15 != iArr2[i14]) {
                int i17 = i15 + 1;
                int i18 = iArr[i15];
                iArr4[i16] = i18;
                if (i18 >= i10) {
                    iArr4[i16] = i18 + i11;
                }
                i15 = i17;
            } else {
                iArr4[i16] = iArr3[i14];
                i14++;
            }
        }
        return new Y(iArr4, new Random(random.nextLong()));
    }

    public final Y c(int i10, int i11) {
        int i12 = i11 - i10;
        int[] iArr = this.f10772b;
        int[] iArr2 = new int[iArr.length - i12];
        int i13 = 0;
        for (int i14 = 0; i14 < iArr.length; i14++) {
            int i15 = iArr[i14];
            if (i15 < i10 || i15 >= i11) {
                int i16 = i14 - i13;
                if (i15 >= i10) {
                    i15 -= i12;
                }
                iArr2[i16] = i15;
            } else {
                i13++;
            }
        }
        return new Y(iArr2, new Random(this.f10771a.nextLong()));
    }

    public Y(int[] iArr, Random random) {
        this.f10772b = iArr;
        this.f10771a = random;
        this.f10773c = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.f10773c[iArr[i10]] = i10;
        }
    }

    public Y(Random random) {
        this(new int[0], random);
    }
}
