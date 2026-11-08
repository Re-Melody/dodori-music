package com.revenuecat.purchases.ui.revenuecatui.defaultpaywall;

import Z8.a;
import kotlin.jvm.internal.n;
import p143n0.C2096x;

/* JADX INFO: loaded from: classes2.dex */
public final class DualColorImageGenerator$blueGreen$2 extends n implements a {
    public static final DualColorImageGenerator$blueGreen$2 INSTANCE = new DualColorImageGenerator$blueGreen$2();

    public DualColorImageGenerator$blueGreen$2() {
        super(0);
    }

    @Override // Z8.a
    public final DualColorImageGenerator.PreviewAppIcon invoke() {
        DualColorImageGenerator dualColorImageGenerator = DualColorImageGenerator.INSTANCE;
        int i10 = C2096x.f22803n;
        DualColorImageGenerator.PreviewAppIcon previewAppIconM776createRFnl5yQ$default = DualColorImageGenerator.m776createRFnl5yQ$default(dualColorImageGenerator, C2096x.f22799i, C2096x.f22798h, 0, 0, 12, null);
        if (previewAppIconM776createRFnl5yQ$default != null) {
            return previewAppIconM776createRFnl5yQ$default;
        }
        throw new IllegalStateException("Failed to generate blueGreen preview icon");
    }
}
