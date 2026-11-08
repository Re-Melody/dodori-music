package H2;

import android.media.AudioTrack;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {
    public static void a(AudioTrack audioTrack, C0541k c0541k) {
        audioTrack.setPreferredDevice(c0541k == null ? null : c0541k.f5918a);
    }
}
