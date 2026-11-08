package oa;

import android.content.Context;
import android.opengl.GLSurfaceView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WeakReference f23914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GLSurfaceView.EGLConfigChooser f23915g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public GLSurfaceView.EGLContextFactory f23916h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public GLSurfaceView.EGLWindowSurfaceFactory f23917i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f23918j;

    public b(Context context) {
        super(context);
        this.f23914f = new WeakReference(this);
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.f23918j;
    }

    public void setEGLConfigChooser(GLSurfaceView.EGLConfigChooser eGLConfigChooser) {
        if (this.f23921c != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
        this.f23915g = eGLConfigChooser;
    }

    public void setEGLContextFactory(GLSurfaceView.EGLContextFactory eGLContextFactory) {
        if (this.f23921c != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
        this.f23916h = eGLContextFactory;
    }

    public void setEGLWindowSurfaceFactory(GLSurfaceView.EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
        if (this.f23921c != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
        this.f23917i = eGLWindowSurfaceFactory;
    }

    public void setPreserveEGLContextOnPause(boolean z10) {
        this.f23918j = z10;
    }

    @Override // oa.d
    public void setRenderer(f fVar) {
        if (this.f23915g == null) {
            throw new IllegalStateException("No eglConfigChooser provided");
        }
        if (this.f23916h == null) {
            throw new IllegalStateException("No eglContextFactory provided");
        }
        if (this.f23917i == null) {
            throw new IllegalStateException("No eglWindowSurfaceFactory provided");
        }
        super.setRenderer(fVar);
    }
}
