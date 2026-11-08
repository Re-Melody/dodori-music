package B1;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class m extends p046da.b {
    public static Font m0(FontFamily fontFamily, int i10) {
        FontStyle fontStyle = new FontStyle((i10 & 1) != 0 ? ColorExtractionConstants.MAXIMUM_BRIGHTNESS_THRESHOLD : RCHTTPStatusCodes.BAD_REQUEST, (i10 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iP0 = p0(fontStyle, font.getStyle());
        for (int i11 = 1; i11 < fontFamily.getSize(); i11++) {
            Font font2 = fontFamily.getFont(i11);
            int iP1 = p0(fontStyle, font2.getStyle());
            if (iP1 < iP0) {
                font = font2;
                iP0 = iP1;
            }
        }
        return font;
    }

    public static int p0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // p046da.b
    public final Typeface m(Context context, A1.f fVar, Resources resources, int i10) {
        try {
            FontFamily.Builder builder = null;
            for (A1.g gVar : fVar.f118a) {
                try {
                    Font fontBuild = new Font.Builder(resources, gVar.f124f).setWeight(gVar.f120b).setSlant(gVar.f121c ? 1 : 0).setTtcIndex(gVar.f123e).setFontVariationSettings(gVar.f122d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m0(fontFamilyBuild, i10).getStyle()).build();
        } catch (Exception e2) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
            return null;
        }
    }

    @Override // p046da.b
    public final Typeface n(Context context, H1.h[] hVarArr, int i10) {
        try {
            FontFamily fontFamilyN0 = n0(hVarArr, context.getContentResolver());
            if (fontFamilyN0 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyN0).setStyle(m0(fontFamilyN0, i10).getStyle()).build();
        } catch (Exception e2) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
            return null;
        }
    }

    public final FontFamily n0(H1.h[] hVarArr, ContentResolver contentResolver) {
        Font fontBuild;
        FontFamily.Builder builder = null;
        for (H1.h hVar : hVarArr) {
            if (Objects.equals(hVar.f5755a.getScheme(), "systemfont")) {
                fontBuild = o0(hVar);
            } else {
                try {
                    Uri uri = hVar.f5755a;
                    String str = hVar.f5759e;
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        }
                        fontBuild = null;
                    } else {
                        try {
                            Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(hVar.f5757c).setSlant(hVar.f5758d ? 1 : 0).setTtcIndex(hVar.f5756b);
                            if (!TextUtils.isEmpty(str)) {
                                ttcIndex.setFontVariationSettings(str);
                            }
                            fontBuild = ttcIndex.build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                } catch (IOException e2) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
                    fontBuild = null;
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    @Override // p046da.b
    public final Typeface o(Context context, List list, int i10) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyN0 = n0((H1.h[]) list.get(0), contentResolver);
            if (fontFamilyN0 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyN0);
            for (int i11 = 1; i11 < list.size(); i11++) {
                FontFamily fontFamilyN1 = n0((H1.h[]) list.get(i11), contentResolver);
                if (fontFamilyN1 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyN1);
                }
            }
            return customFallbackBuilder.setStyle(m0(fontFamilyN0, i10).getStyle()).build();
        } catch (Exception e2) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
            return null;
        }
    }

    public Font o0(H1.h hVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // p046da.b
    public final Typeface p(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // p046da.b
    public final Typeface q(Context context, Resources resources, int i10, String str, int i11) {
        try {
            Font fontBuild = new Font.Builder(resources, i10).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e2) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
            return null;
        }
    }

    @Override // p046da.b
    public final H1.h w(H1.h[] hVarArr, int i10) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
