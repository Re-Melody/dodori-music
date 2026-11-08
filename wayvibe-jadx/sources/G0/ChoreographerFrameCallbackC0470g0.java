package G0;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: renamed from: G0.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC0470g0 implements Choreographer.FrameCallback, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0473h0 f5217a;

    public ChoreographerFrameCallbackC0470g0(C0473h0 c0473h0) {
        this.f5217a = c0473h0;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.f5217a.f5222d.removeCallbacks(this);
        C0473h0.z(this.f5217a);
        C0473h0 c0473h0 = this.f5217a;
        synchronized (c0473h0.f5223e) {
            if (c0473h0.f5228j) {
                c0473h0.f5228j = false;
                ArrayList arrayList = c0473h0.f5225g;
                c0473h0.f5225g = c0473h0.f5226h;
                c0473h0.f5226h = arrayList;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((Choreographer.FrameCallback) arrayList.get(i10)).doFrame(j10);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0473h0.z(this.f5217a);
        C0473h0 c0473h0 = this.f5217a;
        synchronized (c0473h0.f5223e) {
            if (c0473h0.f5225g.isEmpty()) {
                c0473h0.f5221c.removeFrameCallback(this);
                c0473h0.f5228j = false;
            }
        }
    }
}
