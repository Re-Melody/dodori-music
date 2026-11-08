package U;

/* JADX INFO: loaded from: classes.dex */
public final class L0 extends p048e0.C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f11771c;

    public L0(Object obj) {
        this.f11771c = obj;
    }

    @Override // p048e0.C
    public final void a(p048e0.C c3) {
        kotlin.jvm.internal.m.d(c3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.f11771c = ((L0) c3).f11771c;
    }

    @Override // p048e0.C
    public final p048e0.C b() {
        return new L0(this.f11771c);
    }
}
