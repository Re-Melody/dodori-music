package p048e0;

import X.d;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class u extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f19527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19528d;

    public u(d dVar) {
        this.f19527c = dVar;
    }

    @Override // p048e0.C
    public final void a(C c3) {
        m.d(c3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
        u uVar = (u) c3;
        synchronized (t.f19526b) {
            this.f19527c = uVar.f19527c;
            this.f19528d = uVar.f19528d;
        }
    }

    @Override // p048e0.C
    public final C b() {
        return new u(this.f19527c);
    }
}
