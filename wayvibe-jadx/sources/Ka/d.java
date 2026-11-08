package Ka;

import Ja.l;
import android.media.MediaPlayer;
import java.io.IOException;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7412b;

    public d(String str, boolean z10) {
        this.f7411a = str;
        this.f7412b = z10;
    }

    @Override // Ka.c
    public final void a(MediaPlayer mediaPlayer) throws IOException {
        m.f(mediaPlayer, "mediaPlayer");
        mediaPlayer.setDataSource(this.f7411a);
    }

    @Override // Ka.c
    public final void b(l soundPoolPlayer) throws Throwable {
        m.f(soundPoolPlayer, "soundPoolPlayer");
        soundPoolPlayer.release();
        soundPoolPlayer.a(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return m.b(this.f7411a, dVar.f7411a) && this.f7412b == dVar.f7412b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7412b) + (this.f7411a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UrlSource(url=");
        sb.append(this.f7411a);
        sb.append(", isLocal=");
        return p134m1.b.o(sb, this.f7412b, ')');
    }
}
