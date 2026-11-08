package com.revenuecat.purchases.ui.revenuecatui.composables;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p134m1.b;
import p143n0.AbstractC2091s;
import p143n0.C2096x;
import p143n0.e0;
import p230w.G;

/* JADX INFO: loaded from: classes2.dex */
public final class Fade implements PlaceholderHighlight {
    public static final int $stable = 8;
    private final G animationSpec;
    private final e0 brush;
    private final long highlightColor;

    public /* synthetic */ Fade(long j10, G g3, f fVar) {
        this(j10, g3);
    }

    /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name */
    private final long m541component10d7_KjU() {
        return this.highlightColor;
    }

    /* JADX INFO: renamed from: copy-DxMtmZc$default, reason: not valid java name */
    public static /* synthetic */ Fade m542copyDxMtmZc$default(Fade fade, long j10, G g3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = fade.highlightColor;
        }
        if ((i10 & 2) != 0) {
            g3 = fade.animationSpec;
        }
        return fade.m544copyDxMtmZc(j10, g3);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.composables.PlaceholderHighlight
    public float alpha(float f10) {
        return f10;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.composables.PlaceholderHighlight
    /* JADX INFO: renamed from: brush-d16Qtg0, reason: not valid java name */
    public AbstractC2091s mo543brushd16Qtg0(float f10, long j10) {
        return this.brush;
    }

    public final G component2() {
        return this.animationSpec;
    }

    /* JADX INFO: renamed from: copy-DxMtmZc, reason: not valid java name */
    public final Fade m544copyDxMtmZc(long j10, G animationSpec) {
        m.f(animationSpec, "animationSpec");
        return new Fade(j10, animationSpec, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fade)) {
            return false;
        }
        Fade fade = (Fade) obj;
        return C2096x.c(this.highlightColor, fade.highlightColor) && m.b(this.animationSpec, fade.animationSpec);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.composables.PlaceholderHighlight
    public G getAnimationSpec() {
        return this.animationSpec;
    }

    public int hashCode() {
        long j10 = this.highlightColor;
        int i10 = C2096x.f22803n;
        return this.animationSpec.hashCode() + (Long.hashCode(j10) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Fade(highlightColor=");
        b.u(this.highlightColor, ", animationSpec=", sb);
        sb.append(this.animationSpec);
        sb.append(')');
        return sb.toString();
    }

    private Fade(long j10, G animationSpec) {
        m.f(animationSpec, "animationSpec");
        this.highlightColor = j10;
        this.animationSpec = animationSpec;
        this.brush = new e0(j10);
    }
}
