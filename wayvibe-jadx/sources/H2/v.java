package H2;

import android.media.AudioTrack;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f5946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f5948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f5949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f5950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f5951f;

    public v(AudioTrack audioTrack) {
        this.f5946a = new u(audioTrack);
        a();
    }

    public final void a() {
        if (this.f5946a != null) {
            b(0);
        }
    }

    public final void b(int i10) {
        this.f5947b = i10;
        if (i10 == 0) {
            this.f5950e = 0L;
            this.f5951f = -1L;
            this.f5948c = System.nanoTime() / 1000;
            this.f5949d = 10000L;
            return;
        }
        if (i10 == 1) {
            this.f5949d = 10000L;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.f5949d = 10000000L;
        } else {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            this.f5949d = 500000L;
        }
    }
}
