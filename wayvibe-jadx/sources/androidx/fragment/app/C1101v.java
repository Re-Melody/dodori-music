package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: androidx.fragment.app.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1101v extends p066g.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f15446a;

    public C1101v(AtomicReference atomicReference) {
        this.f15446a = atomicReference;
    }

    @Override // p066g.d
    public final void a(Object obj) {
        p066g.d dVar = (p066g.d) this.f15446a.get();
        if (dVar == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        dVar.a(obj);
    }
}
