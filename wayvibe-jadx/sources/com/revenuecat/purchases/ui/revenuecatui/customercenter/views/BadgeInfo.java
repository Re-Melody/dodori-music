package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p143n0.C2096x;
import p241x.C2318v;

/* JADX INFO: loaded from: classes2.dex */
final class BadgeInfo {
    private final C2318v border;
    private final C2096x color;
    private final String text;
    private final C2096x textColor;

    public /* synthetic */ BadgeInfo(String str, C2096x c2096x, C2318v c2318v, C2096x c2096x2, f fVar) {
        this(str, c2096x, c2318v, c2096x2);
    }

    /* JADX INFO: renamed from: copy-yw5i9vo$default, reason: not valid java name */
    public static /* synthetic */ BadgeInfo m672copyyw5i9vo$default(BadgeInfo badgeInfo, String str, C2096x c2096x, C2318v c2318v, C2096x c2096x2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = badgeInfo.text;
        }
        if ((i10 & 2) != 0) {
            c2096x = badgeInfo.color;
        }
        if ((i10 & 4) != 0) {
            c2318v = badgeInfo.border;
        }
        if ((i10 & 8) != 0) {
            c2096x2 = badgeInfo.textColor;
        }
        return badgeInfo.m675copyyw5i9vo(str, c2096x, c2318v, c2096x2);
    }

    public final String component1() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2-QN2ZGVo, reason: not valid java name */
    public final C2096x m673component2QN2ZGVo() {
        return this.color;
    }

    public final C2318v component3() {
        return this.border;
    }

    /* JADX INFO: renamed from: component4-QN2ZGVo, reason: not valid java name */
    public final C2096x m674component4QN2ZGVo() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: copy-yw5i9vo, reason: not valid java name */
    public final BadgeInfo m675copyyw5i9vo(String str, C2096x c2096x, C2318v c2318v, C2096x c2096x2) {
        return new BadgeInfo(str, c2096x, c2318v, c2096x2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgeInfo)) {
            return false;
        }
        BadgeInfo badgeInfo = (BadgeInfo) obj;
        return m.b(this.text, badgeInfo.text) && m.b(this.color, badgeInfo.color) && m.b(this.border, badgeInfo.border) && m.b(this.textColor, badgeInfo.textColor);
    }

    public final C2318v getBorder() {
        return this.border;
    }

    /* JADX INFO: renamed from: getColor-QN2ZGVo, reason: not valid java name */
    public final C2096x m676getColorQN2ZGVo() {
        return this.color;
    }

    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: getTextColor-QN2ZGVo, reason: not valid java name */
    public final C2096x m677getTextColorQN2ZGVo() {
        return this.textColor;
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C2096x c2096x = this.color;
        int iHashCode2 = (iHashCode + (c2096x == null ? 0 : Long.hashCode(c2096x.f22804a))) * 31;
        C2318v c2318v = this.border;
        int iHashCode3 = (iHashCode2 + (c2318v == null ? 0 : c2318v.hashCode())) * 31;
        C2096x c2096x2 = this.textColor;
        return iHashCode3 + (c2096x2 != null ? Long.hashCode(c2096x2.f22804a) : 0);
    }

    public String toString() {
        return "BadgeInfo(text=" + this.text + ", color=" + this.color + ", border=" + this.border + ", textColor=" + this.textColor + ')';
    }

    private BadgeInfo(String str, C2096x c2096x, C2318v c2318v, C2096x c2096x2) {
        this.text = str;
        this.color = c2096x;
        this.border = c2318v;
        this.textColor = c2096x2;
    }

    public /* synthetic */ BadgeInfo(String str, C2096x c2096x, C2318v c2318v, C2096x c2096x2, int i10, f fVar) {
        this(str, c2096x, (i10 & 4) != 0 ? null : c2318v, (i10 & 8) != 0 ? null : c2096x2, null);
    }
}
