package p153o0;

import java.util.Arrays;
import kotlin.jvm.internal.m;
import p143n0.C2096x;
import p143n0.W;

/* JADX INFO: loaded from: classes.dex */
public final class f extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f23525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q f23526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f23527g;

    public f(q qVar, q qVar2) {
        float[] fArrH;
        super(qVar2, qVar, qVar2, null);
        this.f23525e = qVar;
        this.f23526f = qVar2;
        s sVar = qVar2.f23551d;
        s sVar2 = qVar.f23551d;
        boolean zD = j.d(sVar2, sVar);
        float[] fArrH2 = qVar.f23556i;
        float[] fArrG = qVar2.f23557j;
        if (zD) {
            fArrH = j.h(fArrG, fArrH2);
        } else {
            float[] fArrA = sVar2.a();
            s sVar3 = qVar2.f23551d;
            float[] fArrA2 = sVar3.a();
            s sVar4 = j.f23534b;
            boolean zD2 = j.d(sVar2, sVar4);
            float[] fArr = j.f23537e;
            float[] fArr2 = a.f23496b.f23497a;
            if (!zD2) {
                float[] fArrCopyOf = Arrays.copyOf(fArr, 3);
                m.e(fArrCopyOf, "copyOf(this, size)");
                fArrH2 = j.h(j.c(fArr2, fArrA, fArrCopyOf), fArrH2);
            }
            if (!j.d(sVar3, sVar4)) {
                float[] fArrCopyOf2 = Arrays.copyOf(fArr, 3);
                m.e(fArrCopyOf2, "copyOf(this, size)");
                fArrG = j.g(j.h(j.c(fArr2, fArrA2, fArrCopyOf2), qVar2.f23556i));
            }
            fArrH = j.h(fArrG, fArrH2);
        }
        this.f23527g = fArrH;
    }

    @Override // p153o0.g
    public final long a(long j10) {
        float fH = C2096x.h(j10);
        float fG = C2096x.g(j10);
        float fE = C2096x.e(j10);
        float fD = C2096x.d(j10);
        m mVar = this.f23525e.f23562p;
        float fC = (float) mVar.c(fH);
        float fC2 = (float) mVar.c(fG);
        float fC3 = (float) mVar.c(fE);
        float[] fArr = this.f23527g;
        float f10 = (fArr[6] * fC3) + (fArr[3] * fC2) + (fArr[0] * fC);
        float f11 = (fArr[7] * fC3) + (fArr[4] * fC2) + (fArr[1] * fC);
        float f12 = (fArr[8] * fC3) + (fArr[5] * fC2) + (fArr[2] * fC);
        q qVar = this.f23526f;
        float fC4 = (float) qVar.f23559m.c(f10);
        double d10 = f11;
        m mVar2 = qVar.f23559m;
        return W.b(fC4, (float) mVar2.c(d10), (float) mVar2.c(f12), fD, qVar);
    }
}
