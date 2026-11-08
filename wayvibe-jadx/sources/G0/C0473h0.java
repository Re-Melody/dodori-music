package G0;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import p119k9.AbstractC2040y;

/* JADX INFO: renamed from: G0.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0473h0 extends AbstractC2040y {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final M8.q f5219m = D7.W.S(W.f5137h);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0467f0 f5220n = new C0467f0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Choreographer f5221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f5222d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5227i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f5228j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0479j0 f5229l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f5223e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final N8.k f5224f = new N8.k();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f5225g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f5226h = new ArrayList();
    public final ChoreographerFrameCallbackC0470g0 k = new ChoreographerFrameCallbackC0470g0(this);

    public C0473h0(Choreographer choreographer, Handler handler) {
        this.f5221c = choreographer;
        this.f5222d = handler;
        this.f5229l = new C0479j0(choreographer, this);
    }

    public static final void z(C0473h0 c0473h0) {
        Runnable runnable;
        boolean z10;
        do {
            synchronized (c0473h0.f5223e) {
                N8.k kVar = c0473h0.f5224f;
                runnable = (Runnable) (kVar.isEmpty() ? null : kVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (c0473h0.f5223e) {
                    N8.k kVar2 = c0473h0.f5224f;
                    runnable = (Runnable) (kVar2.isEmpty() ? null : kVar2.removeFirst());
                }
            }
            synchronized (c0473h0.f5223e) {
                if (c0473h0.f5224f.isEmpty()) {
                    z10 = false;
                    c0473h0.f5227i = false;
                } else {
                    z10 = true;
                }
            }
        } while (z10);
    }

    @Override // p119k9.AbstractC2040y
    public final void l(Q8.i iVar, Runnable runnable) {
        synchronized (this.f5223e) {
            this.f5224f.addLast(runnable);
            if (!this.f5227i) {
                this.f5227i = true;
                this.f5222d.post(this.k);
                if (!this.f5228j) {
                    this.f5228j = true;
                    this.f5221c.postFrameCallback(this.k);
                }
            }
        }
    }
}
