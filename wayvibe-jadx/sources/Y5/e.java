package Y5;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.AbstractC1170l;
import com.google.android.gms.internal.identity_credentials.zze;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC1170l {
    @Override // com.google.android.gms.common.internal.AbstractC1164f
    public final IInterface createServiceInterface(IBinder iBinder) {
        m.f(iBinder, "iBinder");
        int i10 = c.f13380a;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        return iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new b(iBinder, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f
    public final H5.d[] getApiFeatures() {
        H5.d[] ALL_FEATURES = zze.zzo;
        m.e(ALL_FEATURES, "ALL_FEATURES");
        return ALL_FEATURES;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f
    public final String getStartServiceAction() {
        return "com.google.android.gms.identitycredentials.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f
    public final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
