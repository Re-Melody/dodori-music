package p120ka;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f21848a;

    public p(q qVar) {
        this.f21848a = qVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            q qVar = this.f21848a;
            qVar.f21858w = true;
            qVar.f21859x = new PointF(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }
}
