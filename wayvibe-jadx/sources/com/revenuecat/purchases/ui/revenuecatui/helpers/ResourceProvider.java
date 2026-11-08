package com.revenuecat.purchases.ui.revenuecatui.helpers;

import D7.W;
import T0.AbstractC0818v;
import android.content.res.AssetManager;
import com.revenuecat.purchases.UiConfig;
import com.revenuecat.purchases.paywalls.DownloadedFontFamily;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface ResourceProvider {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final List<String> ASSETS_FONTS_DIRS = W.U("fonts", "public/assets");

        private Companion() {
        }

        public final List<String> getASSETS_FONTS_DIRS() {
            return ASSETS_FONTS_DIRS;
        }
    }

    String getApplicationName();

    Map<String, String> getAssetFontPaths(List<String> list);

    AssetManager getAssetManager();

    DownloadedFontFamily getCachedFontFamilyOrStartDownload(UiConfig.AppConfig.FontsConfig.FontInfo.Name name);

    Locale getLocale();

    int getResourceIdentifier(String str, String str2);

    String getString(int i10, Object... objArr);

    AbstractC0818v getXmlFontFamily(int i10);
}
