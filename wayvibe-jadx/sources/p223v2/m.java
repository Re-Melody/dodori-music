package p223v2;

import B9.d;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class m extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t f27463g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(t tVar) {
        super(tVar);
        this.f27463g = tVar;
    }

    @Override // B9.d
    public final void s(Bundle bundle, String str) {
        if (bundle != null) {
            ((k) this.f903c).notifyChildrenChanged(str, bundle);
        } else {
            super.s(bundle, str);
        }
    }

    @Override // B9.d
    public final void t() {
        l lVar = new l(this, this.f27463g);
        this.f903c = lVar;
        lVar.onCreate();
    }
}
