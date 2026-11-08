package p144n1;

/* JADX INFO: loaded from: classes.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f22867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f22868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f22869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f22870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f22871e;

    @Override // p144n1.d
    public final float value() {
        float f10 = this.f22870d;
        if (f10 >= this.f22871e) {
            this.f22867a = true;
        }
        if (!this.f22867a) {
            this.f22870d = f10 + 1.0f;
        }
        return this.f22870d;
    }
}
