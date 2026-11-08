package M8;

import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8431a;

    public /* synthetic */ v(int i10) {
        this.f8431a = i10;
    }

    public static String a(int i10) {
        return String.valueOf(((long) i10) & 4294967295L);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return kotlin.jvm.internal.m.g(this.f8431a ^ MediaPlayerException.ERROR_UNKNOWN, ((v) obj).f8431a ^ MediaPlayerException.ERROR_UNKNOWN);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            return this.f8431a == ((v) obj).f8431a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8431a);
    }

    public final String toString() {
        return a(this.f8431a);
    }
}
