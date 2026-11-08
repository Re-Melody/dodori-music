package p223v2;

import android.media.AudioFocusRequest;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static int a(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
        return audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    public static int b(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
        return audioManager.requestAudioFocus(audioFocusRequest);
    }
}
