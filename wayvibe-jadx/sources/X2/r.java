package X2;

import B2.AbstractC0111a;
import B2.C;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Choreographer.FrameCallback, Handler.Callback {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f13153e = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile long f13154a = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f13155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Choreographer f13156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13157d;

    public r() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i10 = C.f560a;
        Handler handler = new Handler(looper, this);
        this.f13155b = handler;
        handler.sendEmptyMessage(1);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.f13154a = j10;
        Choreographer choreographer = this.f13156c;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            try {
                this.f13156c = Choreographer.getInstance();
            } catch (RuntimeException e2) {
                AbstractC0111a.y("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e2);
            }
            return true;
        }
        if (i10 == 2) {
            Choreographer choreographer = this.f13156c;
            if (choreographer != null) {
                int i11 = this.f13157d + 1;
                this.f13157d = i11;
                if (i11 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i10 != 3) {
            return false;
        }
        Choreographer choreographer2 = this.f13156c;
        if (choreographer2 != null) {
            int i12 = this.f13157d - 1;
            this.f13157d = i12;
            if (i12 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f13154a = -9223372036854775807L;
            }
        }
        return true;
    }
}
