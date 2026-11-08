package E;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r[] f2967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f2968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f2969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2971f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2972g;

    public s(int i10, r[] rVarArr, u uVar, List list, int i11) {
        this.f2966a = i10;
        this.f2967b = rVarArr;
        this.f2968c = uVar;
        this.f2969d = list;
        this.f2970e = i11;
        int iMax = 0;
        for (r rVar : rVarArr) {
            iMax = Math.max(iMax, rVar.k);
        }
        this.f2971f = iMax;
        int i12 = iMax + this.f2970e;
        this.f2972g = i12 >= 0 ? i12 : 0;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    public final r[] a(int i10, int i11, int i12) {
        r[] rVarArr = this.f2967b;
        int length = rVarArr.length;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < length) {
            r rVar = rVarArr[i13];
            int i16 = i14 + 1;
            int i17 = (int) ((C0335b) this.f2969d.get(i14)).f2877a;
            rVar.h(i10, this.f2968c.f2974b[i15], i11, i12, this.f2966a, i15);
            i15 += i17;
            i13++;
            i14 = i16;
        }
        return rVarArr;
    }
}
