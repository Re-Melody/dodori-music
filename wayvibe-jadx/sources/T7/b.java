package T7;

import B8.C0116c;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0116c f11681b;

    public /* synthetic */ b(C0116c c0116c, int i10) {
        this.f11680a = i10;
        this.f11681b = c0116c;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f11680a) {
            case 0:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    this.f11681b.k("onBecomingNoisy", new Object[0]);
                }
                break;
            default:
                this.f11681b.k("onScoAudioStateUpdated", Integer.valueOf(intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1)), Integer.valueOf(intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -1)));
                break;
        }
    }
}
