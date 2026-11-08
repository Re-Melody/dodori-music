package p020b4;

import B2.AbstractC0112b;
import Z3.b;
import Z3.c;
import Z3.l;
import Z3.m;
import android.graphics.Rect;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static c a(m mVar, FoldingFeature foldingFeature) {
        b bVar;
        b bVar2;
        int type = foldingFeature.getType();
        if (type == 1) {
            bVar = b.f13613i;
        } else {
            if (type != 2) {
                return null;
            }
            bVar = b.f13614j;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            bVar2 = b.f13611g;
        } else {
            if (state != 2) {
                return null;
            }
            bVar2 = b.f13612h;
        }
        Rect bounds = foldingFeature.getBounds();
        kotlin.jvm.internal.m.e(bounds, "oemFeature.bounds");
        int i10 = bounds.left;
        int i11 = bounds.top;
        int i12 = bounds.right;
        int i13 = bounds.bottom;
        if (i10 > i12) {
            throw new IllegalArgumentException(AbstractC0112b.e("Left must be less than or equal to right, left: ", i10, i12, ", right: ").toString());
        }
        if (i11 > i13) {
            throw new IllegalArgumentException(AbstractC0112b.e("top must be less than or equal to bottom, top: ", i11, i13, ", bottom: ").toString());
        }
        Rect rectA = mVar.f13641a.a();
        int i14 = i13 - i11;
        if (i14 == 0 && i12 - i10 == 0) {
            return null;
        }
        int i15 = i12 - i10;
        if (i15 != rectA.width() && i14 != rectA.height()) {
            return null;
        }
        if (i15 < rectA.width() && i14 < rectA.height()) {
            return null;
        }
        if (i15 == rectA.width() && i14 == rectA.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        kotlin.jvm.internal.m.e(bounds2, "oemFeature.bounds");
        return new c(new V3.b(bounds2), bVar, bVar2);
    }

    public static l b(m mVar, WindowLayoutInfo windowLayoutInfo) {
        c cVarA;
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        kotlin.jvm.internal.m.e(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature feature : displayFeatures) {
            if (feature instanceof FoldingFeature) {
                kotlin.jvm.internal.m.e(feature, "feature");
                cVarA = a(mVar, feature);
            } else {
                cVarA = null;
            }
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        return new l(arrayList);
    }
}
