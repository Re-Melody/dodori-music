package p212u2;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntentFilter f27165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BroadcastReceiver f27166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f27167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f27168d;

    public a(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        this.f27165a = intentFilter;
        this.f27166b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);
        sb.append("Receiver{");
        sb.append(this.f27166b);
        sb.append(" filter=");
        sb.append(this.f27165a);
        if (this.f27168d) {
            sb.append(" DEAD");
        }
        sb.append("}");
        return sb.toString();
    }
}
