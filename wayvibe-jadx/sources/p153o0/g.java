package p153o0;

import p143n0.C2096x;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f23528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f23529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f23530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f23531d;

    public g(c cVar, c cVar2, c cVar3, float[] fArr) {
        this.f23528a = cVar;
        this.f23529b = cVar2;
        this.f23530c = cVar3;
        this.f23531d = fArr;
    }

    public long a(long j10) {
        float fH = C2096x.h(j10);
        float fG = C2096x.g(j10);
        float fE = C2096x.e(j10);
        float fD = C2096x.d(j10);
        c cVar = this.f23529b;
        long jD = cVar.d(fH, fG, fE);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & 4294967295L));
        float fE2 = cVar.e(fH, fG, fE);
        float[] fArr = this.f23531d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fE2 *= fArr[2];
        }
        float f10 = fIntBitsToFloat;
        float f11 = fIntBitsToFloat2;
        return this.f23530c.f(f10, f11, fE2, fD, this.f23528a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX WARN: Illegal instructions before constructor call */
    public g(c cVar, c cVar2, int i10) {
        float[] fArr;
        long j10 = cVar.f23504b;
        long j11 = b.f23498a;
        c cVarA = b.a(j10, j11) ? j.a(cVar) : cVar;
        c cVarA2 = b.a(cVar2.f23504b, j11) ? j.a(cVar2) : cVar2;
        if (i10 == 3) {
            boolean zA = b.a(cVar.f23504b, j11);
            boolean zA2 = b.a(cVar2.f23504b, j11);
            if (!(zA && zA2) && (zA || zA2)) {
                cVar = zA ? cVar : cVar2;
                float[] fArrA = j.f23537e;
                s sVar = ((q) cVar).f23551d;
                float[] fArrA2 = zA ? sVar.a() : fArrA;
                fArrA = zA2 ? sVar.a() : fArrA;
                fArr = new float[]{fArrA2[0] / fArrA[0], fArrA2[1] / fArrA[1], fArrA2[2] / fArrA[2]};
            } else {
                fArr = null;
            }
        } else {
            fArr = null;
        }
        this(cVar2, cVarA, cVarA2, fArr);
    }
}
