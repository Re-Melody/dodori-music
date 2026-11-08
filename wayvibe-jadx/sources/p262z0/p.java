package p262z0;

import D4.u;
import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p067g0.r;
import p133m0.c;
import p133m0.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2441a f29763a = new C2441a(PipesIterator.DEFAULT_QUEUE_SIZE);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2441a f29764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final StackTraceElement[] f29765c;

    static {
        new C2441a(1007);
        new C2441a(1008);
        f29764b = new C2441a(1002);
        f29765c = new StackTraceElement[0];
    }

    public static final boolean a(r rVar) {
        return !rVar.f29774h && rVar.f29770d;
    }

    public static final boolean b(r rVar) {
        return (rVar.b() || !rVar.f29774h || rVar.f29770d) ? false : true;
    }

    public static final boolean c(r rVar) {
        return rVar.f29774h && !rVar.f29770d;
    }

    public static final boolean d(r rVar, long j10) {
        long j11 = rVar.f29769c;
        float fD = c.d(j11);
        float fE = c.e(j11);
        return fD < 0.0f || fD > ((float) ((int) (j10 >> 32))) || fE < 0.0f || fE > ((float) ((int) (j10 & 4294967295L)));
    }

    public static final boolean e(r rVar, long j10, long j11) {
        if (rVar.f29775i != 1) {
            return d(rVar, j10);
        }
        long j12 = rVar.f29769c;
        float fD = c.d(j12);
        float fE = c.e(j12);
        return fD < (-f.d(j11)) || fD > f.d(j11) + ((float) ((int) (j10 >> 32))) || fE < (-f.b(j11)) || fE > f.b(j11) + ((float) ((int) (j10 & 4294967295L)));
    }

    public static r f(r rVar, C2441a c2441a) {
        return rVar.then(new PointerHoverIconModifierElement(c2441a));
    }

    public static final long g(r rVar, boolean z10) {
        long jG = c.g(rVar.f29769c, rVar.f29773g);
        if (z10 || !rVar.b()) {
            return jG;
        }
        return 0L;
    }

    public static final void h(i iVar, long j10, Z8.c cVar, boolean z10) {
        u uVar = iVar.f29756b;
        MotionEvent motionEvent = uVar != null ? (MotionEvent) ((p161o8.p) uVar.f2107d).f23830b : null;
        if (motionEvent == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEvent.getAction();
        if (z10) {
            motionEvent.setAction(3);
        }
        motionEvent.offsetLocation(-c.d(j10), -c.e(j10));
        cVar.invoke(motionEvent);
        motionEvent.offsetLocation(c.d(j10), c.e(j10));
        motionEvent.setAction(action);
    }
}
