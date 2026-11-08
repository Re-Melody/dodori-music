package C;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;

/* JADX INFO: loaded from: classes.dex */
public final class D implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D f922a = new D();

    public final p067g0.r b(p067g0.r rVar, p067g0.g gVar) {
        return rVar.then(new HorizontalAlignElement(gVar));
    }

    public final p067g0.r c(p067g0.r rVar, float f10, boolean z10) {
        if (f10 > 0.0d) {
            if (f10 > Float.MAX_VALUE) {
                f10 = Float.MAX_VALUE;
            }
            return rVar.then(new LayoutWeightElement(f10, z10));
        }
        throw new IllegalArgumentException(("invalid weight " + f10 + "; must be greater than zero").toString());
    }
}
