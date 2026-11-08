package H2;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {
    public static C0543m a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return C0543m.f5922d;
        }
        C0542l c0542l = new C0542l();
        boolean z11 = B2.C.f560a > 32 && playbackOffloadSupport == 2;
        c0542l.f5919a = true;
        c0542l.f5920b = z11;
        c0542l.f5921c = z10;
        return c0542l.a();
    }
}
