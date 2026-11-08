package H6;

import G0.C0467f0;
import O6.T;
import android.os.Build;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0467f0 f6079a = new C0467f0(1);

    public static AlgorithmParameterSpec a(byte[] bArr, int i10, int i11) {
        int i12 = T.f9277a;
        Integer numValueOf = !Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT);
        return (numValueOf == null || numValueOf.intValue() > 19) ? new GCMParameterSpec(ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD, bArr, i10, i11) : new IvParameterSpec(bArr, i10, i11);
    }
}
