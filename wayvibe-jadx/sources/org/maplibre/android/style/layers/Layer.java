package org.maplibre.android.style.layers;

import Aa.c;
import androidx.annotation.Keep;
import com.google.gson.JsonElement;
import org.maplibre.android.style.types.Formatted;
import p046da.a;
import p206t6.b;
import za.g;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Layer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f25120a;

    @Keep
    private boolean invalidated;

    @Keep
    private long nativePtr;

    static {
        a.a();
    }

    @Keep
    public Layer(long j10) {
        a();
        this.nativePtr = j10;
    }

    public static void a() {
        b.l("Mbgl-Layer");
    }

    public final String b() {
        a();
        return nativeGetId();
    }

    public final long c() {
        return this.nativePtr;
    }

    public final void d(float f10) {
        a();
        nativeSetMaxZoom(f10);
    }

    public final void e(float f10) {
        a();
        nativeSetMinZoom(f10);
    }

    public final void f(c... cVarArr) {
        if (this.f25120a) {
            return;
        }
        a();
        if (cVarArr.length == 0) {
            return;
        }
        for (c cVar : cVarArr) {
            Object array = cVar.f509b;
            if (array instanceof g) {
                array = ((g) array).g();
            } else if (array instanceof Formatted) {
                array = ((Formatted) array).toArray();
            }
            boolean z10 = cVar instanceof Aa.b;
            String str = cVar.f508a;
            if (z10) {
                nativeSetPaintProperty(str, array);
            } else {
                nativeSetLayoutProperty(str, array);
            }
        }
    }

    @Keep
    public native void finalize();

    @Keep
    public native JsonElement nativeGetFilter();

    @Keep
    public native String nativeGetId();

    @Keep
    public native float nativeGetMaxZoom();

    @Keep
    public native float nativeGetMinZoom();

    @Keep
    public native String nativeGetSourceId();

    @Keep
    public native String nativeGetSourceLayer();

    @Keep
    public native Object nativeGetVisibility();

    @Keep
    public native void nativeSetFilter(Object[] objArr);

    @Keep
    public native void nativeSetLayoutProperty(String str, Object obj);

    @Keep
    public native void nativeSetMaxZoom(float f10);

    @Keep
    public native void nativeSetMinZoom(float f10);

    @Keep
    public native void nativeSetPaintProperty(String str, Object obj);

    @Keep
    public native void nativeSetSourceLayer(String str);

    public Layer() {
        a();
    }
}
