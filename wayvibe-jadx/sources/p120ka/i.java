package p120ka;

import B8.C0116c;
import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.HashSet;
import java.util.Set;
import org.apache.tika.pipes.pipesiterator.PipesIterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i extends f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Set f21829p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f21830q;
    public boolean r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public VelocityTracker f21831s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f21832t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f21833u;

    public i(Context context, C0116c c0116c) {
        super(context, c0116c);
        this.f21829p = j();
    }

    @Override // p120ka.f, p120ka.a
    public boolean a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 5 || actionMasked == 6 || actionMasked == 3) {
            g();
        }
        if (this.r) {
            this.r = false;
            g();
            i();
        }
        VelocityTracker velocityTracker = this.f21831s;
        if (velocityTracker != null) {
            velocityTracker.addMovement(this.f21798d);
        }
        boolean zA = super.a(motionEvent);
        if (actionMasked == 1 || actionMasked == 6) {
            if (this.f21821l.size() < d() && this.f21830q) {
                i();
                return true;
            }
        } else if (actionMasked == 3 && this.f21830q) {
            i();
            return true;
        }
        return zA;
    }

    public final void h() {
        this.f21830q = true;
        if (this.f21831s == null) {
            this.f21831s = VelocityTracker.obtain();
        }
    }

    public void i() {
        this.f21830q = false;
        VelocityTracker velocityTracker = this.f21831s;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(PipesIterator.DEFAULT_QUEUE_SIZE);
            this.f21832t = this.f21831s.getXVelocity();
            this.f21833u = this.f21831s.getYVelocity();
            this.f21831s.recycle();
            this.f21831s = null;
        }
        g();
    }

    public abstract HashSet j();
}
