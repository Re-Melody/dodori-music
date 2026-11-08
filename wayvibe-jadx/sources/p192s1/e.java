package p192s1;

import java.util.Arrays;
import p100j1.a;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f26061d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f26063f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26058a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26059b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26060c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f26062e = new float[7];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a[] f26064g = new a[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f26065h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f26066i = 0;

    public e(d dVar) {
        this.f26063f = dVar;
    }

    public final void a(a aVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f26065h;
            if (i10 >= i11) {
                a[] aVarArr = this.f26064g;
                if (i11 >= aVarArr.length) {
                    this.f26064g = (a[]) Arrays.copyOf(aVarArr, aVarArr.length * 2);
                }
                a[] aVarArr2 = this.f26064g;
                int i12 = this.f26065h;
                aVarArr2[i12] = aVar;
                this.f26065h = i12 + 1;
                return;
            }
            if (this.f26064g[i10] == aVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void b(a aVar) {
        int i10 = this.f26065h;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f26064g[i11] == aVar) {
                for (int i12 = 0; i12 < (i10 - i11) - 1; i12++) {
                    a[] aVarArr = this.f26064g;
                    int i13 = i11 + i12;
                    aVarArr[i13] = aVarArr[i13 + 1];
                }
                this.f26065h--;
                return;
            }
        }
    }

    public final void c() {
        this.f26063f = d.UNKNOWN;
        this.f26060c = 0;
        this.f26058a = -1;
        this.f26059b = -1;
        this.f26061d = 0.0f;
        this.f26065h = 0;
        this.f26066i = 0;
    }

    public final void d(a aVar) {
        e eVar;
        int i10 = this.f26065h;
        for (int i11 = 0; i11 < i10; i11++) {
            a aVar2 = this.f26064g[i11];
            a aVar3 = aVar2.f26042c;
            int i12 = aVar3.f21394g;
            while (true) {
                int i13 = 0;
                while (true) {
                    if (i12 == -1 || i13 >= aVar3.f21389b) {
                        break;
                    }
                    int i14 = aVar3.f21391d[i12];
                    eVar = aVar.f26040a;
                    if (i14 == eVar.f26058a) {
                        break;
                    }
                    i12 = aVar3.f21392e[i12];
                    i13++;
                }
                float f10 = aVar3.f21393f[i12];
                aVar3.n(eVar, false);
                a aVar4 = aVar.f26042c;
                int i15 = aVar4.f21394g;
                for (int i16 = 0; i15 != -1 && i16 < aVar4.f21389b; i16++) {
                    aVar3.b(((e[]) ((p150n8.a) aVar3.k).f22981c)[aVar4.f21391d[i15]], aVar4.f21393f[i15] * f10, false);
                    i15 = aVar4.f21392e[i15];
                }
                aVar2.f26041b = (aVar.f26041b * f10) + aVar2.f26041b;
                i12 = aVar3.f21394g;
            }
        }
        this.f26065h = 0;
    }

    public final String toString() {
        return "null";
    }
}
