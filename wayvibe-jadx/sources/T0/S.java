package T0;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final S f11473a = new S();

    public static FontVariationAxis[] d(H h10, Context context) {
        p242x0.c.a(context);
        ArrayList arrayList = h10.f11450a;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            E e2 = (E) arrayList.get(i10);
            arrayList2.add(new FontVariationAxis(e2.b(), e2.a()));
        }
        return (FontVariationAxis[]) arrayList2.toArray(new FontVariationAxis[0]);
    }

    public final Typeface a(AssetManager assetManager, String str, Context context, H h10) {
        if (context == null) {
            return null;
        }
        return P0.f.d(assetManager, str).setFontVariationSettings(d(h10, context)).build();
    }

    public final Typeface b(File file, Context context, H h10) {
        if (context == null) {
            return null;
        }
        return P0.f.f(file).setFontVariationSettings(d(h10, context)).build();
    }

    public final Typeface c(ParcelFileDescriptor parcelFileDescriptor, Context context, H h10) {
        if (context == null) {
            return null;
        }
        P0.f.q();
        return P0.f.g(parcelFileDescriptor.getFileDescriptor()).setFontVariationSettings(d(h10, context)).build();
    }
}
