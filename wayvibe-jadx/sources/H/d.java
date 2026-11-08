package H;

import kotlin.jvm.internal.m;
import p067g0.q;

/* JADX INFO: loaded from: classes.dex */
public final class d extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f5709a;

    @Override // p067g0.q
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // p067g0.q
    public final void onAttach() {
        c cVar = this.f5709a;
        if (cVar != null) {
            cVar.f5708a.n(this);
        }
        if (cVar != null) {
            cVar.f5708a.b(this);
        }
        this.f5709a = cVar;
    }

    @Override // p067g0.q
    public final void onDetach() {
        c cVar = this.f5709a;
        if (cVar != null) {
            m.d(cVar, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            cVar.f5708a.n(this);
        }
    }
}
