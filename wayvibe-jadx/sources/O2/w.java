package O2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w f9150b = new w(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9151a;

    public /* synthetic */ w(int i10) {
        this.f9151a = i10;
    }

    @Override // O2.B
    public int c(Object obj) {
        n nVar = (n) obj;
        switch (this.f9151a) {
            case 1:
                String str = nVar.f9070a;
                if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                    return 1;
                }
                return (B2.C.f560a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            default:
                return nVar.f9070a.startsWith("OMX.google") ? 1 : 0;
        }
    }
}
