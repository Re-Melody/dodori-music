package org.maplibre.android.maps.renderer;

import android.content.Context;
import android.view.Surface;
import android.view.TextureView;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends pa.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f25009d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, TextureView textureView, String str, boolean z10, Runnable runnable) {
        super(context, str);
        this.f25009d = runnable;
        this.f25362c = textureView;
        this.f25361b = z10;
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final void onSurfaceCreated(Surface surface) {
        this.f25009d.run();
        super.onSurfaceCreated(surface);
    }
}
