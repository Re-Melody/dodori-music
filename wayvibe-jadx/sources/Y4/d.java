package Y4;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Handler.Callback, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f13356e = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile long f13357a = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f13358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Choreographer f13359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13360d;

    public d() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.f13358b = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.f13357a = j10;
        this.f13359c.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            this.f13359c = Choreographer.getInstance();
            return true;
        }
        if (i10 == 1) {
            int i11 = this.f13360d + 1;
            this.f13360d = i11;
            if (i11 == 1) {
                this.f13359c.postFrameCallback(this);
            }
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        int i12 = this.f13360d - 1;
        this.f13360d = i12;
        if (i12 == 0) {
            this.f13359c.removeFrameCallback(this);
            this.f13357a = -9223372036854775807L;
        }
        return true;
    }
}
