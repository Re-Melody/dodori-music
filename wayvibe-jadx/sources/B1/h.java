package B1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p046da.b f538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p199t.n f539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Paint f540c;

    static {
        Trace.beginSection(p046da.b.g0("TypefaceCompat static init"));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            f538a = new n();
        } else if (i10 >= 29) {
            f538a = new m();
        } else if (i10 >= 28) {
            f538a = new l();
        } else if (i10 >= 26) {
            f538a = new k();
        } else {
            Method method = j.f546l;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f538a = new j();
            } else {
                f538a = new i();
            }
        }
        f539b = new p199t.n(16);
        f540c = null;
        Trace.endSection();
    }

    public static Typeface a(Context context, A1.e eVar, Resources resources, int i10, String str, int i11, int i12, A1.b bVar, boolean z10) {
        Typeface typefaceM;
        Typeface typefaceBuild;
        FontFamily fontFamilyBuild;
        boolean z11 = eVar instanceof A1.h;
        p199t.n nVar = f539b;
        if (z11) {
            A1.h hVar = (A1.h) eVar;
            String str2 = hVar.f128d;
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            ArrayList arrayList = hVar.f125a;
            if (zIsEmpty || (typefaceBuild = c(str2)) == null) {
                if (arrayList.size() != 1) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i13 = 0;
                        while (true) {
                            if (i13 >= arrayList.size()) {
                                int i14 = 0;
                                Typeface.CustomFallbackBuilder customFallbackBuilderD = null;
                                while (true) {
                                    if (i14 < arrayList.size()) {
                                        H1.c cVar = (H1.c) arrayList.get(i14);
                                        if (i14 == arrayList.size() - 1 && TextUtils.isEmpty(cVar.f5740g)) {
                                            customFallbackBuilderD.setSystemFallback(cVar.f5739f);
                                        } else {
                                            Font fontD = d(c(cVar.f5739f));
                                            if (fontD == null) {
                                                Log.w("TypefaceCompat", "Unable identify the primary font for " + cVar.f5739f + ". Falling back to provider font.");
                                            } else {
                                                String str3 = cVar.f5740g;
                                                if (TextUtils.isEmpty(str3)) {
                                                    try {
                                                        e.k();
                                                        e.w();
                                                        fontFamilyBuild = e.h(f.d(fontD).setFontVariationSettings(str3).build()).build();
                                                    } catch (IOException unused) {
                                                        Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                                    }
                                                } else {
                                                    fontFamilyBuild = e.h(fontD).build();
                                                }
                                                if (customFallbackBuilderD == null) {
                                                    customFallbackBuilderD = e.d(fontFamilyBuild);
                                                } else {
                                                    customFallbackBuilderD.addCustomFallback(fontFamilyBuild);
                                                }
                                                i14++;
                                            }
                                        }
                                    }
                                    typefaceBuild = customFallbackBuilderD.build();
                                    break;
                                }
                            }
                            if (c(((H1.c) arrayList.get(i13)).f5739f) != null) {
                                i13++;
                            }
                            typefaceBuild = null;
                            break;
                        }
                    }
                    typefaceBuild = null;
                    break;
                }
                typefaceBuild = c(((H1.c) arrayList.get(0)).f5739f);
            }
            if (typefaceBuild != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new A1.k(0, bVar, typefaceBuild));
                }
                nVar.put(b(resources, i10, str, i11, i12), typefaceBuild);
                return typefaceBuild;
            }
            boolean z12 = !z10 ? bVar != null : hVar.f127c != 0;
            int i15 = z10 ? hVar.f126b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            g gVar = new g();
            gVar.f537e = bVar;
            typefaceM = p003a.a.L(context, arrayList, i12, z12, i15, handler, gVar);
        } else {
            typefaceM = f538a.m(context, (A1.f) eVar, resources, i12);
            if (bVar != null) {
                if (typefaceM != null) {
                    new Handler(Looper.getMainLooper()).post(new A1.k(0, bVar, typefaceM));
                } else {
                    bVar.a(-3);
                }
            }
        }
        if (typefaceM != null) {
            nVar.put(b(resources, i10, str, i11, i12), typefaceM);
        }
        return typefaceM;
    }

    public static String b(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        if (f540c == null) {
            f540c = new Paint();
        }
        f540c.setTextSize(10.0f);
        f540c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) StringUtils.SPACE, 0, 1, 0, 1, 0.0f, 0.0f, false, f540c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
