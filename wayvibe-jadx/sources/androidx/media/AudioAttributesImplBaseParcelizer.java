package androidx.media;

import R3.b;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(b bVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f15584a = bVar.f(audioAttributesImplBase.f15584a, 1);
        audioAttributesImplBase.f15585b = bVar.f(audioAttributesImplBase.f15585b, 2);
        audioAttributesImplBase.f15586c = bVar.f(audioAttributesImplBase.f15586c, 3);
        audioAttributesImplBase.f15587d = bVar.f(audioAttributesImplBase.f15587d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, b bVar) {
        bVar.getClass();
        bVar.j(audioAttributesImplBase.f15584a, 1);
        bVar.j(audioAttributesImplBase.f15585b, 2);
        bVar.j(audioAttributesImplBase.f15586c, 3);
        bVar.j(audioAttributesImplBase.f15587d, 4);
    }
}
