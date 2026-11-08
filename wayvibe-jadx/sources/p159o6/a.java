package p159o6;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.StateSet;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f23662a = {R.attr.state_pressed};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f23663b = {R.attr.state_selected, R.attr.state_pressed};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f23664c = {R.attr.state_selected};

    public static ColorStateList a(ColorStateList colorStateList) {
        int[] iArr = f23664c;
        int colorForState = colorStateList != null ? colorStateList.getColorForState(f23663b, colorStateList.getDefaultColor()) : 0;
        int iD = B1.a.d(colorForState, Math.min(Color.alpha(colorForState) * 2, ColorExtractionConstants.COLOR_COMPONENT_MASK));
        int[][] iArr2 = {iArr, StateSet.NOTHING};
        int colorForState2 = colorStateList != null ? colorStateList.getColorForState(f23662a, colorStateList.getDefaultColor()) : 0;
        return new ColorStateList(iArr2, new int[]{iD, B1.a.d(colorForState2, Math.min(Color.alpha(colorForState2) * 2, ColorExtractionConstants.COLOR_COMPONENT_MASK))});
    }
}
