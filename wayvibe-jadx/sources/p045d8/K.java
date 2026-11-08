package p045d8;

import io.flutter.embedding.engine.renderer.k;
import io.flutter.embedding.engine.renderer.l;

/* JADX INFO: loaded from: classes2.dex */
public final class K implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f19331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M f19332b;

    public K(M m8, Runnable runnable) {
        this.f19332b = m8;
        this.f19331a = runnable;
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void b() {
        this.f19331a.run();
        k kVar = this.f19332b.f19336b;
        if (kVar != null) {
            kVar.g(this);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void a() {
    }
}
