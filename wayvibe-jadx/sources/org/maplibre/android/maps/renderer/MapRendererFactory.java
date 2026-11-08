package org.maplibre.android.maps.renderer;

import android.content.Context;
import android.view.TextureView;
import androidx.annotation.Keep;
import oa.f;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class MapRendererFactory {
    public static f newSurfaceViewMapRenderer(Context context, String str, boolean z10, Runnable runnable) {
        oa.b bVar = new oa.b(context);
        bVar.setZOrderMediaOverlay(z10);
        return new c(context, bVar, str, runnable);
    }

    public static pa.b newTextureViewMapRenderer(Context context, TextureView textureView, String str, boolean z10, Runnable runnable) {
        b bVar = new b(context, textureView, str, z10, runnable);
        pa.a aVar = new pa.a(textureView, bVar);
        bVar.f25360a = aVar;
        aVar.setName("TextureViewRenderer");
        bVar.f25360a.start();
        return bVar;
    }
}
