package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import Q8.d;
import T0.AbstractC0800c;
import T0.InterfaceC0799b;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
final class LocalFileFontTypefaceLoader implements InterfaceC0799b {
    public static final LocalFileFontTypefaceLoader INSTANCE = new LocalFileFontTypefaceLoader();

    private LocalFileFontTypefaceLoader() {
    }

    private final Typeface fallbackTypeface(LocalFileFont localFileFont, String str) {
        Logger.INSTANCE.e("Failed to load downloaded font from " + localFileFont.getFile().getPath() + " (" + str + "). Falling back to default typeface.");
        return fallbackTypeface(localFileFont);
    }

    @Override // T0.InterfaceC0799b
    public Object awaitLoad(Context context, AbstractC0800c abstractC0800c, d dVar) {
        return loadBlocking(context, abstractC0800c);
    }

    @Override // T0.InterfaceC0799b
    public Typeface loadBlocking(Context context, AbstractC0800c font) {
        m.f(context, "context");
        m.f(font, "font");
        LocalFileFont localFileFont = font instanceof LocalFileFont ? (LocalFileFont) font : null;
        if (localFileFont == null) {
            Logger.INSTANCE.e("Expected font to be LocalFileFont, but was " + font.getClass().getSimpleName() + ". Falling back to default typeface.");
            return fallbackTypeface(font);
        }
        try {
            Typeface typefaceLoad = localFileFont.getFileTypefaceLoader().load(localFileFont.getFile());
            return typefaceLoad == null ? fallbackTypeface(localFileFont, "loader returned null") : typefaceLoad;
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null) {
                message = th.getClass().getSimpleName();
            }
            return fallbackTypeface(localFileFont, message);
        }
    }

    private final Typeface fallbackTypeface(AbstractC0800c abstractC0800c) {
        if (Build.VERSION.SDK_INT >= 28) {
            Typeface typeface = Typeface.DEFAULT;
            Typeface typefaceCreate = Typeface.create(Typeface.DEFAULT, abstractC0800c.getWeight().f11463a, abstractC0800c.mo9getStyle_LCdwA() == 1);
            m.e(typefaceCreate, "{\n            Typeface.c…ntStyle.Italic)\n        }");
            return typefaceCreate;
        }
        Typeface typeface2 = Typeface.DEFAULT;
        m.e(typeface2, "{\n            Typeface.DEFAULT\n        }");
        return typeface2;
    }
}
