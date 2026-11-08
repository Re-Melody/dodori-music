package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import kotlin.jvm.internal.m;
import p143n0.C2096x;

/* JADX INFO: loaded from: classes2.dex */
public interface ColorStyle {

    public static final class Gradient implements ColorStyle {
        private final /* synthetic */ GradientBrush brush;

        private /* synthetic */ Gradient(GradientBrush gradientBrush) {
            this.brush = gradientBrush;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Gradient m414boximpl(GradientBrush gradientBrush) {
            return new Gradient(gradientBrush);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static GradientBrush m415constructorimpl(GradientBrush brush) {
            m.f(brush, "brush");
            return brush;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m416equalsimpl(GradientBrush gradientBrush, Object obj) {
            return (obj instanceof Gradient) && m.b(gradientBrush, ((Gradient) obj).m420unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m417equalsimpl0(GradientBrush gradientBrush, GradientBrush gradientBrush2) {
            return m.b(gradientBrush, gradientBrush2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m418hashCodeimpl(GradientBrush gradientBrush) {
            return gradientBrush.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m419toStringimpl(GradientBrush gradientBrush) {
            return "Gradient(brush=" + gradientBrush + ')';
        }

        public boolean equals(Object obj) {
            return m416equalsimpl(this.brush, obj);
        }

        public final GradientBrush getBrush() {
            return this.brush;
        }

        public int hashCode() {
            return m418hashCodeimpl(this.brush);
        }

        public String toString() {
            return m419toStringimpl(this.brush);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ GradientBrush m420unboximpl() {
            return this.brush;
        }
    }

    public static final class Solid implements ColorStyle {
        private final /* synthetic */ long color;

        private /* synthetic */ Solid(long j10) {
            this.color = j10;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Solid m421boximpl(long j10) {
            return new Solid(j10);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static long m422constructorimpl(long j10) {
            return j10;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m423equalsimpl(long j10, Object obj) {
            return (obj instanceof Solid) && C2096x.c(j10, ((Solid) obj).m428unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m424equalsimpl0(long j10, long j11) {
            return C2096x.c(j10, j11);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m425hashCodeimpl(long j10) {
            int i10 = C2096x.f22803n;
            return Long.hashCode(j10);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m426toStringimpl(long j10) {
            return "Solid(color=" + ((Object) C2096x.i(j10)) + ')';
        }

        public boolean equals(Object obj) {
            return m423equalsimpl(this.color, obj);
        }

        /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
        public final long m427getColor0d7_KjU() {
            return this.color;
        }

        public int hashCode() {
            return m425hashCodeimpl(this.color);
        }

        public String toString() {
            return m426toStringimpl(this.color);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ long m428unboximpl() {
            return this.color;
        }
    }
}
