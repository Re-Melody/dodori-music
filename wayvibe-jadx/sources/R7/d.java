package R7;

import p161o8.i;

/* JADX INFO: loaded from: classes.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10927b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f10926a = i10;
        this.f10927b = obj;
    }

    @Override // p161o8.i
    public final void a(Object obj, p161o8.h hVar) {
        switch (this.f10926a) {
            case 0:
                ((b) this.f10927b).f10923h = hVar;
                break;
            default:
                ((V7.c) this.f10927b).f12744a = hVar;
                break;
        }
    }

    @Override // p161o8.i
    public final void onCancel() {
        switch (this.f10926a) {
            case 0:
                ((b) this.f10927b).f10923h = null;
                break;
            default:
                ((V7.c) this.f10927b).f12744a = null;
                break;
        }
    }
}
