package J8;

import B8.C0129p;
import B8.P;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P f6676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f6677c;

    public /* synthetic */ f(b bVar, P p10, int i10) {
        this.f6675a = i10;
        this.f6677c = bVar;
        this.f6676b = p10;
    }

    @Override // B8.P
    public final void a(C0129p c0129p) {
        switch (this.f6675a) {
            case 0:
                this.f6676b.a(c0129p);
                ((g) this.f6677c).f6679b.a(c0129p);
                break;
            default:
                r rVar = (r) this.f6677c;
                rVar.f6719d = c0129p;
                if (!rVar.f6718c) {
                    this.f6676b.a(c0129p);
                }
                break;
        }
    }
}
