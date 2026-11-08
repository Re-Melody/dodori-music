package Z3;

import p045d8.t;
import p141m9.q;
import p141m9.r;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements J1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13631b;

    public /* synthetic */ i(Object obj, int i10) {
        this.f13630a = i10;
        this.f13631b = obj;
    }

    @Override // J1.a
    public final void accept(Object obj) {
        switch (this.f13630a) {
            case 0:
                ((q) ((r) this.f13631b)).i((l) obj);
                break;
            case 1:
                ((q) ((r) this.f13631b)).i((l) obj);
                break;
            default:
                ((t) this.f13631b).setWindowInfoListenerDisplayFeatures((l) obj);
                break;
        }
    }
}
