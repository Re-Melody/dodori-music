package J8;

import B8.AbstractC0120g;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f6698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC0120g f6699c;

    public l(n nVar, AbstractC0120g abstractC0120g, int i10) {
        this.f6697a = i10;
        switch (i10) {
            case 1:
                p229v9.a.g("success rate ejection config is null", nVar.f6708e != null);
                this.f6698b = nVar;
                this.f6699c = abstractC0120g;
                break;
            default:
                this.f6698b = nVar;
                this.f6699c = abstractC0120g;
                break;
        }
    }
}
