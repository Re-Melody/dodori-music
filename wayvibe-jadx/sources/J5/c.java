package J5;

import H5.d;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.InterfaceC1141h;
import com.google.android.gms.common.api.internal.InterfaceC1151s;
import com.google.android.gms.common.internal.AbstractC1170l;
import com.google.android.gms.common.internal.C1167i;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.internal.base.zaf;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC1170l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f6655a;

    public c(Context context, Looper looper, C1167i c1167i, w wVar, InterfaceC1141h interfaceC1141h, InterfaceC1151s interfaceC1151s) {
        super(context, looper, 270, c1167i, interfaceC1141h, interfaceC1151s);
        this.f6655a = wVar;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f
    public final d[] getApiFeatures() {
        return zaf.zab;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f
    public final Bundle getGetServiceRequestExtraArgs() {
        this.f6655a.getClass();
        return new Bundle();
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f
    public final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f
    public final boolean getUseDynamicLookup() {
        return true;
    }
}
