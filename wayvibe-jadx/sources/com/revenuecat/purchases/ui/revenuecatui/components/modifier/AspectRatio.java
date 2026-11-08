package com.revenuecat.purchases.ui.revenuecatui.components.modifier;

import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public final class AspectRatio {
    public static final int $stable = 0;
    private final boolean matchHeightConstraintsFirst;
    private final float ratio;

    public AspectRatio(float f10, boolean z10) {
        this.ratio = f10;
        this.matchHeightConstraintsFirst = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AspectRatio)) {
            return false;
        }
        AspectRatio aspectRatio = (AspectRatio) obj;
        return Float.compare(this.ratio, aspectRatio.ratio) == 0 && this.matchHeightConstraintsFirst == aspectRatio.matchHeightConstraintsFirst;
    }

    public final /* synthetic */ boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    public final /* synthetic */ float getRatio() {
        return this.ratio;
    }

    public int hashCode() {
        return Boolean.hashCode(this.matchHeightConstraintsFirst) + (Float.hashCode(this.ratio) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AspectRatio(ratio=");
        sb.append(this.ratio);
        sb.append(", matchHeightConstraintsFirst=");
        return b.o(sb, this.matchHeightConstraintsFirst, ')');
    }
}
