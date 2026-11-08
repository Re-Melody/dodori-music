package J3;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new h(runnable, 0));
    }
}
