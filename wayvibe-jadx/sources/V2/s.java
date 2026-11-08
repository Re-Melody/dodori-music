package V2;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final E3.d f12538h = new E3.d(17);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final E3.d f12539i = new E3.d(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12540a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12546g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r[] f12542c = new r[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f12541b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12543d = -1;

    public s(int i10) {
        this.f12540a = i10;
    }

    public final void a(float f10, int i10) {
        r rVar;
        int i11 = this.f12543d;
        ArrayList arrayList = this.f12541b;
        if (i11 != 1) {
            Collections.sort(arrayList, f12538h);
            this.f12543d = 1;
        }
        int i12 = this.f12546g;
        r[] rVarArr = this.f12542c;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f12546g = i13;
            rVar = rVarArr[i13];
        } else {
            rVar = new r();
        }
        int i14 = this.f12544e;
        this.f12544e = i14 + 1;
        rVar.f12535a = i14;
        rVar.f12536b = i10;
        rVar.f12537c = f10;
        arrayList.add(rVar);
        this.f12545f += i10;
        while (true) {
            int i15 = this.f12545f;
            int i16 = this.f12540a;
            if (i15 <= i16) {
                return;
            }
            int i17 = i15 - i16;
            r rVar2 = (r) arrayList.get(0);
            int i18 = rVar2.f12536b;
            if (i18 <= i17) {
                this.f12545f -= i18;
                arrayList.remove(0);
                int i19 = this.f12546g;
                if (i19 < 5) {
                    this.f12546g = i19 + 1;
                    rVarArr[i19] = rVar2;
                }
            } else {
                rVar2.f12536b = i18 - i17;
                this.f12545f -= i17;
            }
        }
    }

    public final float b() {
        int i10 = this.f12543d;
        ArrayList arrayList = this.f12541b;
        if (i10 != 0) {
            Collections.sort(arrayList, f12539i);
            this.f12543d = 0;
        }
        float f10 = 0.5f * this.f12545f;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            r rVar = (r) arrayList.get(i12);
            i11 += rVar.f12536b;
            if (i11 >= f10) {
                return rVar.f12537c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((r) p134m1.b.i(1, arrayList)).f12537c;
    }
}
