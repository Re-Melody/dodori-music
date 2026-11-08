package p141m9;

import M8.D;
import Z8.c;
import p119k9.C2028n;
import p262z0.x;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22537a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f22538b;

    public /* synthetic */ p() {
    }

    @Override // Z8.c
    public final Object invoke(Object obj) {
        switch (this.f22537a) {
            case 0:
                D d10 = D.f8402a;
                ((C2028n) this.f22538b).resumeWith(d10);
                return d10;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                x xVar = (x) this.f22538b;
                if (xVar != null) {
                    xVar.f29796c = zBooleanValue;
                }
                return D.f8402a;
        }
    }

    public p(C2028n c2028n) {
        this.f22538b = c2028n;
    }
}
