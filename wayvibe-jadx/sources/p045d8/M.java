package p045d8;

import android.os.Build;
import android.view.SurfaceHolder;
import io.flutter.embedding.engine.renderer.k;

/* JADX INFO: loaded from: classes2.dex */
public final class M implements SurfaceHolder.Callback2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1942n f19335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f19336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SurfaceHolderCallbackC1941m f19337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1933e f19338d = new C1933e(this, 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final L f19339e;

    public M(SurfaceHolderCallbackC1941m surfaceHolderCallbackC1941m, C1942n c1942n, k kVar) {
        boolean z10 = Build.VERSION.SDK_INT < 26;
        this.f19339e = z10 ? new L(this, 1) : new L(this, 0);
        this.f19337c = surfaceHolderCallbackC1941m;
        this.f19336b = kVar;
        this.f19335a = c1942n;
        if (z10) {
            c1942n.setAlpha(0.0f);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        SurfaceHolderCallbackC1941m surfaceHolderCallbackC1941m = this.f19337c;
        if (surfaceHolderCallbackC1941m != null) {
            surfaceHolderCallbackC1941m.surfaceChanged(surfaceHolder, i10, i11, i12);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceHolderCallbackC1941m surfaceHolderCallbackC1941m = this.f19337c;
        if (surfaceHolderCallbackC1941m != null) {
            surfaceHolderCallbackC1941m.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        SurfaceHolderCallbackC1941m surfaceHolderCallbackC1941m = this.f19337c;
        if (surfaceHolderCallbackC1941m != null) {
            surfaceHolderCallbackC1941m.surfaceDestroyed(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        k kVar = this.f19336b;
        if (kVar == null) {
            return;
        }
        kVar.a(new K(this, runnable));
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }
}
