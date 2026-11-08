package H2;

import android.graphics.text.LineBreakConfig;
import android.location.Geocoder$GeocodeListener;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.inputmethod.EditorBoundsInfo;

/* JADX INFO: renamed from: H2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0533c {
    public static /* synthetic */ LineBreakConfig.Builder d() {
        return new LineBreakConfig.Builder();
    }

    public static /* bridge */ /* synthetic */ Geocoder$GeocodeListener g(Object obj) {
        return (Geocoder$GeocodeListener) obj;
    }

    public static /* synthetic */ BoringLayout i(CharSequence charSequence, TextPaint textPaint, int i10, Layout.Alignment alignment, float f10, float f11, BoringLayout.Metrics metrics, boolean z10, boolean z11, TextUtils.TruncateAt truncateAt, int i11) {
        return new BoringLayout(charSequence, textPaint, i10, alignment, f10, f11, metrics, z10, truncateAt, i11, z11);
    }

    public static /* synthetic */ EditorBoundsInfo.Builder l() {
        return new EditorBoundsInfo.Builder();
    }

    public static /* bridge */ /* synthetic */ boolean y(Object obj) {
        return obj instanceof Geocoder$GeocodeListener;
    }
}
