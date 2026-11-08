package p261z;

/* JADX INFO: renamed from: z.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2427t implements InterfaceC2399e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2429u f29668a;

    public C2427t(C2429u c2429u) {
        this.f29668a = c2429u;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Z8.c, kotlin.jvm.internal.n] */
    @Override // p261z.InterfaceC2399e0
    public final float a(float f10) {
        if (Float.isNaN(f10)) {
            return 0.0f;
        }
        C2429u c2429u = this.f29668a;
        float fFloatValue = ((Number) c2429u.f29672a.invoke(Float.valueOf(f10))).floatValue();
        c2429u.f29676e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
        c2429u.f29677f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
