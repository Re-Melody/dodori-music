package B1;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class k extends i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Class f548o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Constructor f549p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Method f550q;
    public final Method r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Method f551s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Method f552t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Method f553u;

    public k() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method methodT0;
        Method method2;
        Method method3;
        Method methodU0;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            methodT0 = t0(cls);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
            method3 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            methodU0 = u0(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e2.getClass().getName()), e2);
            cls = null;
            method = null;
            constructor = null;
            methodT0 = null;
            method2 = null;
            method3 = null;
            methodU0 = null;
        }
        this.f548o = cls;
        this.f549p = constructor;
        this.f550q = methodT0;
        this.r = method2;
        this.f551s = method3;
        this.f552t = method;
        this.f553u = methodU0;
    }

    public static Method t0(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    @Override // B1.i, p046da.b
    public final Typeface m(Context context, A1.f fVar, Resources resources, int i10) {
        Method method = this.f550q;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.m(context, fVar, resources, i10);
        }
        Object objS0 = s0();
        if (objS0 != null) {
            A1.g[] gVarArr = fVar.f118a;
            int length = gVarArr.length;
            int i11 = 0;
            while (i11 < length) {
                A1.g gVar = gVarArr[i11];
                String str = gVar.f119a;
                FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(gVar.f122d);
                Context context2 = context;
                if (!p0(context2, objS0, str, gVar.f123e, gVar.f120b, gVar.f121c ? 1 : 0, fontVariationAxisArrFromFontVariationSettings)) {
                    o0(objS0);
                    return null;
                }
                i11++;
                context = context2;
            }
            if (r0(objS0)) {
                return q0(objS0);
            }
        }
        return null;
    }

    @Override // B1.i, p046da.b
    public final Typeface n(Context context, H1.h[] hVarArr, int i10) {
        Typeface typefaceQ0;
        boolean zBooleanValue;
        if (hVarArr.length >= 1) {
            Method method = this.f550q;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            if (method != null) {
                HashMap map = new HashMap();
                for (H1.h hVar : hVarArr) {
                    if (hVar.f5760f == 0) {
                        Uri uri = hVar.f5755a;
                        if (!map.containsKey(uri)) {
                            map.put(uri, org.slf4j.helpers.i.E(context, uri));
                        }
                    }
                }
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                Object objS0 = s0();
                if (objS0 != null) {
                    int length = hVarArr.length;
                    int i11 = 0;
                    boolean z10 = false;
                    while (i11 < length) {
                        H1.h hVar2 = hVarArr[i11];
                        ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(hVar2.f5755a);
                        if (byteBuffer != null) {
                            try {
                                zBooleanValue = ((Boolean) this.r.invoke(objS0, byteBuffer, Integer.valueOf(hVar2.f5756b), null, Integer.valueOf(hVar2.f5757c), Integer.valueOf(hVar2.f5758d ? 1 : 0))).booleanValue();
                            } catch (IllegalAccessException | InvocationTargetException unused) {
                                zBooleanValue = false;
                            }
                            if (!zBooleanValue) {
                                o0(objS0);
                                return null;
                            }
                            z10 = true;
                        }
                        i11++;
                        z10 = z10;
                    }
                    if (!z10) {
                        o0(objS0);
                        return null;
                    }
                    if (r0(objS0) && (typefaceQ0 = q0(objS0)) != null) {
                        return Typeface.create(typefaceQ0, i10);
                    }
                }
            } else {
                H1.h hVarW = w(hVarArr, i10);
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(hVarW.f5755a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(hVarW.f5757c).setItalic(hVarW.f5758d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                } catch (IOException unused2) {
                }
            }
        }
        return null;
    }

    public final void o0(Object obj) {
        try {
            this.f552t.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean p0(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f550q.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // p046da.b
    public final Typeface q(Context context, Resources resources, int i10, String str, int i11) {
        Method method = this.f550q;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.q(context, resources, i10, str, i11);
        }
        Object objS0 = s0();
        if (objS0 != null) {
            if (!p0(context, objS0, str, 0, -1, -1, null)) {
                o0(objS0);
                return null;
            }
            if (r0(objS0)) {
                return q0(objS0);
            }
        }
        return null;
    }

    public Typeface q0(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f548o, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f553u.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean r0(Object obj) {
        try {
            return ((Boolean) this.f551s.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final Object s0() {
        try {
            return this.f549p.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method u0(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
