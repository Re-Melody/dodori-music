package p220v;

import p028c1.b;

/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f27337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f27338b;

    public Q(float f10, b bVar) {
        this.f27337a = f10;
        float fA = bVar.a();
        float f11 = S.f27339a;
        this.f27338b = fA * 386.0878f * 160.0f * 0.84f;
    }

    public final P a(float f10) {
        double dB = b(f10);
        double d10 = S.f27339a;
        double d11 = d10 - 1.0d;
        return new P(f10, (float) (Math.exp((d10 / d11) * dB) * ((double) (this.f27337a * this.f27338b))), (long) (Math.exp(dB / d11) * 1000.0d));
    }

    public final double b(float f10) {
        float[] fArr = AbstractC2245b.f27356a;
        return Math.log(((double) (Math.abs(f10) * 0.35f)) / ((double) (this.f27337a * this.f27338b)));
    }
}
