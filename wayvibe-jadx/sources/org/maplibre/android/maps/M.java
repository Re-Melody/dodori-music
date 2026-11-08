package org.maplibre.android.maps;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.maplibre.android.style.layers.Layer;
import org.maplibre.android.style.sources.Source;

/* JADX INFO: loaded from: classes2.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H f24849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f24850b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f24851c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f24852d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final B9.d f24853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f24854f;

    public M(B9.d dVar, H h10) {
        this.f24853e = dVar;
        this.f24849a = h10;
    }

    public final void a(String str, Bitmap bitmap, boolean z10) {
        q("addImage");
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        if (config != config2) {
            bitmap = bitmap.copy(config2, false);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(byteBufferAllocate);
        ((NativeMapView) this.f24849a).a(new Image[]{new Image(byteBufferAllocate.array(), bitmap.getDensity() / 160.0f, str, bitmap.getWidth(), bitmap.getHeight(), z10)});
    }

    public final void b(Layer layer) {
        q("addLayer");
        ((NativeMapView) this.f24849a).b(layer);
        this.f24851c.put(layer.b(), layer);
    }

    public final void c(Layer layer, String str) {
        q("addLayerAbove");
        ((NativeMapView) this.f24849a).c(layer, str);
        this.f24851c.put(layer.b(), layer);
    }

    public final void d(Layer layer, String str) {
        q("addLayerBelow");
        ((NativeMapView) this.f24849a).d(layer, str);
        this.f24851c.put(layer.b(), layer);
    }

    public final void e(Source source) {
        q("addSource");
        ((NativeMapView) this.f24849a).f(source);
        this.f24850b.put(source.getId(), source);
    }

    public final void f() {
        this.f24854f = false;
        HashMap map = this.f24851c;
        for (Layer layer : map.values()) {
            if (layer != null) {
                layer.f25120a = true;
            }
        }
        HashMap map2 = this.f24850b;
        for (Source source : map2.values()) {
            if (source != null) {
                source.setDetached();
            }
        }
        HashMap map3 = this.f24852d;
        for (Map.Entry entry : map3.entrySet()) {
            ((NativeMapView) this.f24849a).K((String) entry.getKey());
            ((Bitmap) entry.getValue()).recycle();
        }
        map2.clear();
        map.clear();
        map3.clear();
    }

    public final String g() {
        q("getJson");
        return ((NativeMapView) this.f24849a).x();
    }

    public final Layer h(String str) {
        q("getLayer");
        Layer layer = (Layer) this.f24851c.get(str);
        return layer == null ? ((NativeMapView) this.f24849a).p(str) : layer;
    }

    public final List i() {
        q("getLayers");
        return ((NativeMapView) this.f24849a).q();
    }

    public final Source j(String str) {
        q("getSource");
        Source source = (Source) this.f24850b.get(str);
        return source == null ? ((NativeMapView) this.f24849a).v(str) : source;
    }

    public final Source k(String str) {
        q("getSourceAs");
        HashMap map = this.f24850b;
        return map.containsKey(str) ? (Source) map.get(str) : ((NativeMapView) this.f24849a).v(str);
    }

    public final List l() {
        q("getSources");
        return ((NativeMapView) this.f24849a).w();
    }

    public final String m() {
        q("getUrl");
        return ((NativeMapView) this.f24849a).y();
    }

    public final void n() {
        q("removeImage");
        ((NativeMapView) this.f24849a).K("mapbox-location-shadow-icon");
    }

    public final void o(String str) {
        Layer layerP;
        q("removeLayer");
        this.f24851c.remove(str);
        NativeMapView nativeMapView = (NativeMapView) this.f24849a;
        if (nativeMapView.h("removeLayer") || (layerP = nativeMapView.p(str)) == null) {
            return;
        }
        nativeMapView.L(layerP);
    }

    public final void p(String str) {
        q("removeSource");
        if (((NativeMapView) this.f24849a).M(str)) {
            this.f24850b.remove(str);
        }
    }

    public final void q(String str) {
        if (!this.f24854f) {
            throw new IllegalStateException(V0.p.o("Calling ", str, " when a newer style is loading/has loaded."));
        }
    }
}
