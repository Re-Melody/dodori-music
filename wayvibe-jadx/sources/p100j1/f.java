package p100j1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f21423a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f21427e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e f21431i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21424b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21425c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21426d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21428f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f21429g = new float[9];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f21430h = new float[9];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b[] f21432j = new b[16];
    public int k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f21433l = 0;

    public f(e eVar) {
        this.f21431i = eVar;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.k;
            if (i10 >= i11) {
                b[] bVarArr = this.f21432j;
                if (i11 >= bVarArr.length) {
                    this.f21432j = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f21432j;
                int i12 = this.k;
                bVarArr2[i12] = bVar;
                this.k = i12 + 1;
                return;
            }
            if (this.f21432j[i10] == bVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void b(b bVar) {
        int i10 = this.k;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f21432j[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f21432j;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.k--;
                return;
            }
            i11++;
        }
    }

    public final void c() {
        this.f21431i = e.UNKNOWN;
        this.f21426d = 0;
        this.f21424b = -1;
        this.f21425c = -1;
        this.f21427e = 0.0f;
        this.f21428f = false;
        int i10 = this.k;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f21432j[i11] = null;
        }
        this.k = 0;
        this.f21433l = 0;
        this.f21423a = false;
        Arrays.fill(this.f21430h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f21424b - ((f) obj).f21424b;
    }

    public final void d(c cVar, float f10) {
        this.f21427e = f10;
        this.f21428f = true;
        int i10 = this.k;
        this.f21425c = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f21432j[i11].h(cVar, this, false);
        }
        this.k = 0;
    }

    public final void e(c cVar, b bVar) {
        int i10 = this.k;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f21432j[i11].i(cVar, bVar, false);
        }
        this.k = 0;
    }

    public final String toString() {
        return "" + this.f21424b;
    }
}
