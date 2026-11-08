package U;

/* JADX INFO: loaded from: classes.dex */
public final class I0 extends p048e0.C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f11759c;

    public I0(float f10) {
        this.f11759c = f10;
    }

    @Override // p048e0.C
    public final void a(p048e0.C c3) {
        kotlin.jvm.internal.m.d(c3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f11759c = ((I0) c3).f11759c;
    }

    @Override // p048e0.C
    public final p048e0.C b() {
        return new I0(this.f11759c);
    }
}
