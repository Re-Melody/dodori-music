package F2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends AbstractC0408a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f4162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f4163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p255y2.O[] f4164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object[] f4165j;
    public final HashMap k;

    public i0(p255y2.O[] oArr, Object[] objArr, R2.Y y6) {
        super(y6);
        int length = oArr.length;
        this.f4164i = oArr;
        this.f4162g = new int[length];
        this.f4163h = new int[length];
        this.f4165j = objArr;
        this.k = new HashMap();
        int length2 = oArr.length;
        int i10 = 0;
        int iO = 0;
        int iH = 0;
        int i11 = 0;
        while (i10 < length2) {
            p255y2.O o10 = oArr[i10];
            this.f4164i[i11] = o10;
            this.f4163h[i11] = iO;
            this.f4162g[i11] = iH;
            iO += o10.o();
            iH += this.f4164i[i11].h();
            this.k.put(objArr[i11], Integer.valueOf(i11));
            i10++;
            i11++;
        }
        this.f4160e = iO;
        this.f4161f = iH;
    }

    @Override // p255y2.O
    public final int h() {
        return this.f4161f;
    }

    @Override // p255y2.O
    public final int o() {
        return this.f4160e;
    }

    @Override // F2.AbstractC0408a
    public final int q(Object obj) {
        Integer num = (Integer) this.k.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // F2.AbstractC0408a
    public final int r(int i10) {
        return B2.C.e(this.f4162g, i10 + 1, false, false);
    }

    @Override // F2.AbstractC0408a
    public final int s(int i10) {
        return B2.C.e(this.f4163h, i10 + 1, false, false);
    }

    @Override // F2.AbstractC0408a
    public final Object t(int i10) {
        return this.f4165j[i10];
    }

    @Override // F2.AbstractC0408a
    public final int u(int i10) {
        return this.f4162g[i10];
    }

    @Override // F2.AbstractC0408a
    public final int v(int i10) {
        return this.f4163h[i10];
    }

    @Override // F2.AbstractC0408a
    public final p255y2.O y(int i10) {
        return this.f4164i[i10];
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i0(ArrayList arrayList, R2.Y y6) {
        p255y2.O[] oArr = new p255y2.O[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            oArr[i11] = ((V) it.next()).h();
            i11++;
        }
        Object[] objArr = new Object[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            objArr[i10] = ((V) it2.next()).g();
            i10++;
        }
        this(oArr, objArr, y6);
    }
}
