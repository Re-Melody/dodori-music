package androidx.fragment.app;

/* JADX INFO: renamed from: androidx.fragment.app.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1102w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f15450b;

    public /* synthetic */ RunnableC1102w(F f10, int i10) {
        this.f15449a = i10;
        this.f15450b = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15449a) {
            case 0:
                this.f15450b.startPostponedEnterTransition();
                break;
            default:
                this.f15450b.callStartTransitionListener(false);
                break;
        }
    }
}
