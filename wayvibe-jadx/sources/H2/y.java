package H2;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {
    public static C0543m a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return C0543m.f5922d;
        }
        C0542l c0542l = new C0542l();
        c0542l.f5919a = true;
        c0542l.f5921c = z10;
        return c0542l.a();
    }
}
