package B8;

/* JADX INFO: loaded from: classes2.dex */
public final class w0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f895c;

    public w0(Runnable runnable) {
        this.f893a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f894b) {
            return;
        }
        this.f895c = true;
        this.f893a.run();
    }
}
