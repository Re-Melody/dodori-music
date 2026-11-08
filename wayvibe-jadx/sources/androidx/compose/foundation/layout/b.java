package androidx.compose.foundation.layout;

import C.InterfaceC0163v;
import p067g0.e;
import p067g0.r;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC0163v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f14713a = new b();

    @Override // C.InterfaceC0163v
    public final r a(r rVar, e eVar) {
        return rVar.then(new BoxChildDataElement(eVar, false));
    }

    @Override // C.InterfaceC0163v
    public final r b() {
        return new BoxChildDataElement(p067g0.b.f19942e, true);
    }
}
