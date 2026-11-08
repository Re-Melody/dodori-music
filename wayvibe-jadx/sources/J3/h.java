package J3;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f6581b;

    public /* synthetic */ h(Runnable runnable, int i10) {
        this.f6580a = i10;
        this.f6581b = runnable;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        switch (this.f6580a) {
            case 0:
                this.f6581b.run();
                break;
            default:
                this.f6581b.run();
                break;
        }
    }
}
