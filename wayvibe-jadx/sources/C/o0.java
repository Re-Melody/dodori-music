package C;

import androidx.compose.foundation.layout.LayoutWeightElement;

/* JADX INFO: loaded from: classes.dex */
public final class o0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0 f1044a = new o0();

    public final p067g0.r a(p067g0.r rVar, float f10) {
        if (f10 > 0.0d) {
            if (f10 > Float.MAX_VALUE) {
                f10 = Float.MAX_VALUE;
            }
            return rVar.then(new LayoutWeightElement(f10, true));
        }
        throw new IllegalArgumentException(("invalid weight " + f10 + "; must be greater than zero").toString());
    }
}
