package p048e0;

import Y.c;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class r extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f19521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19523e;

    public r(c cVar) {
        this.f19521c = cVar;
    }

    @Override // p048e0.C
    public final void a(C c3) {
        synchronized (t.f19525a) {
            m.d(c3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>");
            this.f19521c = ((r) c3).f19521c;
            this.f19522d = ((r) c3).f19522d;
            this.f19523e = ((r) c3).f19523e;
        }
    }

    @Override // p048e0.C
    public final C b() {
        return new r(this.f19521c);
    }
}
