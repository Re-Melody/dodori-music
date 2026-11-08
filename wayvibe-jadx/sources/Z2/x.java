package Z2;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Serializable f13599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13602g;

    public boolean a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (!((i10 & (-2097152)) == -2097152) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        this.f13596a = i11;
        this.f13599d = AbstractC0961b.f13497s[3 - i12];
        int i15 = AbstractC0961b.f13498t[i14];
        this.f13598c = i15;
        if (i11 == 2) {
            this.f13598c = i15 / 2;
        } else if (i11 == 0) {
            this.f13598c = i15 / 4;
        }
        int i16 = (i10 >>> 9) & 1;
        int i17 = 1152;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalArgumentException();
                }
                i17 = 384;
            }
        } else if (i11 != 3) {
            i17 = 576;
        }
        this.f13602g = i17;
        if (i12 == 3) {
            int i18 = i11 == 3 ? AbstractC0961b.f13499u[i13 - 1] : AbstractC0961b.f13500v[i13 - 1];
            this.f13601f = i18;
            this.f13597b = (((i18 * 12) / this.f13598c) + i16) * 4;
        } else {
            if (i11 == 3) {
                int i19 = i12 == 2 ? AbstractC0961b.f13501w[i13 - 1] : AbstractC0961b.f13502x[i13 - 1];
                this.f13601f = i19;
                this.f13597b = ((i19 * 144) / this.f13598c) + i16;
            } else {
                int i20 = AbstractC0961b.f13503y[i13 - 1];
                this.f13601f = i20;
                this.f13597b = (((i12 == 1 ? 72 : 144) * i20) / this.f13598c) + i16;
            }
        }
        this.f13600e = ((i10 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
