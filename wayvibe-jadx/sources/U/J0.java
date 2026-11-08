package U;

/* JADX INFO: loaded from: classes.dex */
public final class J0 extends p048e0.C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11765c;

    public J0(int i10) {
        this.f11765c = i10;
    }

    @Override // p048e0.C
    public final void a(p048e0.C c3) {
        kotlin.jvm.internal.m.d(c3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f11765c = ((J0) c3).f11765c;
    }

    @Override // p048e0.C
    public final p048e0.C b() {
        return new J0(this.f11765c);
    }
}
