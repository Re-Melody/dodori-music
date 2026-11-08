package com.revenuecat.purchases.paywalls;

import N8.n;
import android.graphics.Color;
import java.util.regex.Matcher;
import kotlin.jvm.internal.m;
import p046da.b;
import p097i9.g;
import p097i9.h;
import p097i9.j;
import p097i9.k;

/* JADX INFO: loaded from: classes2.dex */
public final class ColorUtilsKt {
    private static final int ALPHA_MATCH_GROUP_INDEX = 4;
    private static final int ALPHA_SHIFT_BITS = 24;
    private static final String DEFAULT_ALPHA_HEX = "FF";
    private static final int GREEN_SHIFT_BITS = 8;
    private static final int HEX_RADIX = 16;
    private static final int RED_SHIFT_BITS = 16;
    private static final j rgbaColorRegex = new j("^#([A-Fa-f0-9]{2})([A-Fa-f0-9]{2})([A-Fa-f0-9]{2})([A-Fa-f0-9]{2})?$");

    public static final int colorInt(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    public static final int parseRGBAColor(String stringRepresentation) {
        m.f(stringRepresentation, "stringRepresentation");
        j jVar = rgbaColorRegex;
        jVar.getClass();
        Matcher matcher = jVar.f20587a.matcher(stringRepresentation);
        m.e(matcher, "matcher(...)");
        Object obj = null;
        h hVar = !matcher.matches() ? null : new h(matcher, stringRepresentation);
        if (hVar == null) {
            return Color.parseColor(stringRepresentation);
        }
        String str = (String) ((g) hVar.a()).get(1);
        String str2 = (String) ((g) hVar.a()).get(2);
        String str3 = (String) ((g) hVar.a()).get(3);
        Object objE0 = n.E0(4, hVar.a());
        String str4 = (String) objE0;
        if (str4 != null && !k.x0(str4)) {
            obj = objE0;
        }
        String str5 = (String) obj;
        if (str5 == null) {
            str5 = DEFAULT_ALPHA_HEX;
        }
        b.i(16);
        int i10 = Integer.parseInt(str5, 16);
        b.i(16);
        int i11 = Integer.parseInt(str, 16);
        b.i(16);
        int i12 = Integer.parseInt(str2, 16);
        b.i(16);
        return colorInt(i10, i11, i12, Integer.parseInt(str3, 16));
    }
}
