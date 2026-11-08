package androidx.media;

import R3.b;
import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(b bVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f15582a = (AudioAttributes) bVar.g(audioAttributesImplApi26.f15582a, 1);
        audioAttributesImplApi26.f15583b = bVar.f(audioAttributesImplApi26.f15583b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, b bVar) {
        bVar.getClass();
        bVar.k(audioAttributesImplApi26.f15582a, 1);
        bVar.j(audioAttributesImplApi26.f15583b, 2);
    }
}
