package org.maplibre.android.maps.renderer;

import android.content.Context;
import android.view.Surface;
import oa.f;
import org.maplibre.android.maps.renderer.egl.d;
import org.maplibre.android.maps.renderer.egl.e;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f25010b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, oa.b bVar, String str, Runnable runnable) {
        super(context, bVar, str);
        this.f25010b = runnable;
        bVar.setEGLContextFactory(new e());
        bVar.setEGLWindowSurfaceFactory(new org.maplibre.android.maps.renderer.egl.f());
        bVar.setEGLConfigChooser(new d(false));
        bVar.setRenderer(this);
        bVar.setRenderingRefreshMode(a.WHEN_DIRTY);
        bVar.setPreserveEGLContextOnPause(true);
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final void onSurfaceCreated(Surface surface) {
        this.f25010b.run();
        super.onSurfaceCreated(surface);
    }
}
