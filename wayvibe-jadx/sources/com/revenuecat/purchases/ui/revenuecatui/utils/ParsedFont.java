package com.revenuecat.purchases.ui.revenuecatui.utils;

import T0.C;
import kotlin.jvm.internal.f;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public final class ParsedFont {
    public static final int $stable = 0;
    private final int resId;
    private final int style;
    private final int weight;

    public /* synthetic */ ParsedFont(int i10, int i11, int i12, f fVar) {
        this(i10, i11, i12);
    }

    /* JADX INFO: renamed from: copy-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ ParsedFont m895copyRetOiIg$default(ParsedFont parsedFont, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = parsedFont.resId;
        }
        if ((i13 & 2) != 0) {
            i11 = parsedFont.weight;
        }
        if ((i13 & 4) != 0) {
            i12 = parsedFont.style;
        }
        return parsedFont.m897copyRetOiIg(i10, i11, i12);
    }

    public final int component1() {
        return this.resId;
    }

    public final int component2() {
        return this.weight;
    }

    /* JADX INFO: renamed from: component3-_-LCdwA, reason: not valid java name */
    public final int m896component3_LCdwA() {
        return this.style;
    }

    /* JADX INFO: renamed from: copy-RetOiIg, reason: not valid java name */
    public final ParsedFont m897copyRetOiIg(int i10, int i11, int i12) {
        return new ParsedFont(i10, i11, i12, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParsedFont)) {
            return false;
        }
        ParsedFont parsedFont = (ParsedFont) obj;
        return this.resId == parsedFont.resId && this.weight == parsedFont.weight && this.style == parsedFont.style;
    }

    public final int getResId() {
        return this.resId;
    }

    /* JADX INFO: renamed from: getStyle-_-LCdwA, reason: not valid java name */
    public final int m898getStyle_LCdwA() {
        return this.style;
    }

    public final int getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return Integer.hashCode(this.style) + b.c(this.weight, Integer.hashCode(this.resId) * 31, 31);
    }

    public String toString() {
        return "ParsedFont(resId=" + this.resId + ", weight=" + this.weight + ", style=" + ((Object) C.a(this.style)) + ')';
    }

    private ParsedFont(int i10, int i11, int i12) {
        this.resId = i10;
        this.weight = i11;
        this.style = i12;
    }
}
