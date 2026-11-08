package Ka;

import Ja.l;
import android.media.MediaPlayer;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f7410a;

    public b(byte[] bArr) {
        this.f7410a = new a(bArr);
    }

    @Override // Ka.c
    public final void a(MediaPlayer mediaPlayer) {
        m.f(mediaPlayer, "mediaPlayer");
        mediaPlayer.setDataSource(this.f7410a);
    }

    @Override // Ka.c
    public final void b(l soundPoolPlayer) {
        m.f(soundPoolPlayer, "soundPoolPlayer");
        throw new IllegalStateException("Bytes sources are not supported on LOW_LATENCY mode yet.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && m.b(this.f7410a, ((b) obj).f7410a);
    }

    public final int hashCode() {
        return this.f7410a.hashCode();
    }

    public final String toString() {
        return "BytesSource(dataSource=" + this.f7410a + ')';
    }
}
