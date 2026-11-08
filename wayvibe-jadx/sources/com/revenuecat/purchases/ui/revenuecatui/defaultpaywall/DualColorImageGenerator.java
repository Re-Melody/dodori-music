package com.revenuecat.purchases.ui.revenuecatui.defaultpaywall;

import B2.AbstractC0112b;
import D7.W;
import M8.h;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.revenuecat.purchases.ui.revenuecatui.helpers.AppStyleExtractor;
import java.util.List;
import kotlin.jvm.internal.m;
import p143n0.C2096x;

/* JADX INFO: loaded from: classes2.dex */
public final class DualColorImageGenerator {
    private static final int DEFAULT_IMAGE_SIZE = 200;
    public static final DualColorImageGenerator INSTANCE = new DualColorImageGenerator();
    private static final h redGreen$delegate = W.S(DualColorImageGenerator$redGreen$2.INSTANCE);
    private static final h blueGreen$delegate = W.S(DualColorImageGenerator$blueGreen$2.INSTANCE);
    private static final h purpleOrange$delegate = W.S(DualColorImageGenerator$purpleOrange$2.INSTANCE);
    public static final int $stable = 8;

    public static final class PreviewAppIcon {
        public static final int $stable = 8;
        private final Bitmap bitmap;
        private final List<C2096x> prominentColors;

        public PreviewAppIcon(Bitmap bitmap, List<C2096x> prominentColors) {
            m.f(bitmap, "bitmap");
            m.f(prominentColors, "prominentColors");
            this.bitmap = bitmap;
            this.prominentColors = prominentColors;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PreviewAppIcon copy$default(PreviewAppIcon previewAppIcon, Bitmap bitmap, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bitmap = previewAppIcon.bitmap;
            }
            if ((i10 & 2) != 0) {
                list = previewAppIcon.prominentColors;
            }
            return previewAppIcon.copy(bitmap, list);
        }

        public final Bitmap component1() {
            return this.bitmap;
        }

        public final List<C2096x> component2() {
            return this.prominentColors;
        }

        public final PreviewAppIcon copy(Bitmap bitmap, List<C2096x> prominentColors) {
            m.f(bitmap, "bitmap");
            m.f(prominentColors, "prominentColors");
            return new PreviewAppIcon(bitmap, prominentColors);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PreviewAppIcon)) {
                return false;
            }
            PreviewAppIcon previewAppIcon = (PreviewAppIcon) obj;
            return m.b(this.bitmap, previewAppIcon.bitmap) && m.b(this.prominentColors, previewAppIcon.prominentColors);
        }

        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public final List<C2096x> getProminentColors() {
            return this.prominentColors;
        }

        public int hashCode() {
            return this.prominentColors.hashCode() + (this.bitmap.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("PreviewAppIcon(bitmap=");
            sb.append(this.bitmap);
            sb.append(", prominentColors=");
            return AbstractC0112b.m(sb, this.prominentColors, ')');
        }
    }

    private DualColorImageGenerator() {
    }

    /* JADX INFO: renamed from: create-RFnl5yQ$default, reason: not valid java name */
    public static /* synthetic */ PreviewAppIcon m776createRFnl5yQ$default(DualColorImageGenerator dualColorImageGenerator, long j10, long j11, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 200;
        }
        if ((i12 & 8) != 0) {
            i11 = 200;
        }
        return dualColorImageGenerator.m777createRFnl5yQ(j10, j11, i10, i11);
    }

    private final Bitmap createBitmap(int i10, int i11, int i12, int i13) {
        if (i12 <= 0 || i13 <= 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i12, i13, Bitmap.Config.ARGB_8888);
        m.e(bitmapCreateBitmap, "createBitmap(width, heig… Bitmap.Config.ARGB_8888)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        float f10 = i12;
        float f11 = f10 / 2.0f;
        paint.setColor(i10);
        float f12 = i13;
        canvas.drawRect(0.0f, 0.0f, f11, f12, paint);
        paint.setColor(i11);
        canvas.drawRect(f11, 0.0f, f10, f12, paint);
        return bitmapCreateBitmap;
    }

    public static /* synthetic */ void getPurpleOrange$annotations() {
    }

    /* JADX INFO: renamed from: create-RFnl5yQ, reason: not valid java name */
    public final PreviewAppIcon m777createRFnl5yQ(long j10, long j11, int i10, int i11) {
        Bitmap bitmapCreateBitmap = createBitmap(p143n0.W.E(j10), p143n0.W.E(j11), i10, i11);
        if (bitmapCreateBitmap == null) {
            return null;
        }
        return new PreviewAppIcon(bitmapCreateBitmap, AppStyleExtractor.INSTANCE.extractProminentColors$revenuecatui_defaultsRelease(bitmapCreateBitmap, 2));
    }

    public final PreviewAppIcon getBlueGreen() {
        return (PreviewAppIcon) blueGreen$delegate.getValue();
    }

    public final PreviewAppIcon getPurpleOrange() {
        return (PreviewAppIcon) purpleOrange$delegate.getValue();
    }

    public final PreviewAppIcon getRedGreen() {
        return (PreviewAppIcon) redGreen$delegate.getValue();
    }
}
