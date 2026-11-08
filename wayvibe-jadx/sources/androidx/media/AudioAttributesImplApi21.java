package androidx.media;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAttributes f15582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15583b = -1;

    public AudioAttributesImplApi21() {
    }

    @Override // androidx.media.AudioAttributesImpl
    public final int a() {
        int i10 = this.f15583b;
        return i10 != -1 ? i10 : AudioAttributesCompat.c(this.f15582a.getFlags(), this.f15582a.getUsage());
    }

    @Override // androidx.media.AudioAttributesImpl
    public final Object b() {
        return this.f15582a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f15582a.equals(((AudioAttributesImplApi21) obj).f15582a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15582a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f15582a;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this.f15582a = audioAttributes;
    }
}
