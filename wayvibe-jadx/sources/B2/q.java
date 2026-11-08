package B2;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* JADX INFO: loaded from: classes.dex */
public final class q extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f614a;

    public q(s sVar) {
        this.f614a = sVar;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        boolean z10 = overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5;
        s.b(z10 ? 10 : 5, this.f614a);
    }
}
