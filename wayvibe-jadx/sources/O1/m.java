package O1;

import android.os.Bundle;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f9018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f9019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f9020c;

    public m(Bundle bundle, Bundle bundle2, boolean z10, Set allowedProviders, int i10) {
        kotlin.jvm.internal.m.f(allowedProviders, "allowedProviders");
        kotlin.jvm.internal.m.f(allowedProviders, "allowedProviders");
        this.f9018a = bundle;
        this.f9019b = bundle2;
        this.f9020c = allowedProviders;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z10);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z10);
        bundle.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", i10);
        bundle2.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", i10);
        if (i10 == 100) {
            throw new IllegalArgumentException("Custom types should not have passkey level priority.");
        }
    }
}
