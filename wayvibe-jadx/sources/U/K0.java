package U;

/* JADX INFO: loaded from: classes.dex */
public final class K0 extends p048e0.C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f11767c;

    public K0(long j10) {
        this.f11767c = j10;
    }

    @Override // p048e0.C
    public final void a(p048e0.C c3) {
        kotlin.jvm.internal.m.d(c3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f11767c = ((K0) c3).f11767c;
    }

    @Override // p048e0.C
    public final p048e0.C b() {
        return new K0(this.f11767c);
    }
}
