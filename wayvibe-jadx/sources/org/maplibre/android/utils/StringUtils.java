package org.maplibre.android.utils;

import androidx.annotation.Keep;
import java.text.Normalizer;

/* JADX INFO: loaded from: classes2.dex */
@Keep
class StringUtils {
    @Keep
    public static String unaccent(String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("(\\p{InCombiningDiacriticalMarks}|\\p{InCombiningDiacriticalMarksForSymbols}|\\p{InCombiningDiacriticalMarksSupplement})+", "");
    }
}
