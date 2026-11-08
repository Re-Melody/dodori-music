package p246x4;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: loaded from: classes.dex */
public final class p extends o {
    public final AudioTimestamp k = new AudioTimestamp();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f28463l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f28464m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f28465n;

    @Override // p246x4.o
    public final void a(AudioTrack audioTrack, boolean z10) {
        super.a(audioTrack, z10);
        this.f28463l = 0L;
        this.f28464m = 0L;
        this.f28465n = 0L;
    }

    @Override // p246x4.o
    public final boolean c() {
        AudioTrack audioTrack = this.f28453a;
        AudioTimestamp audioTimestamp = this.k;
        boolean timestamp = audioTrack.getTimestamp(audioTimestamp);
        if (timestamp) {
            long j10 = audioTimestamp.framePosition;
            if (this.f28464m > j10) {
                this.f28463l++;
            }
            this.f28464m = j10;
            this.f28465n = j10 + (this.f28463l << 32);
        }
        return timestamp;
    }

    @Override // p246x4.o
    public final long d() {
        return this.k.nanoTime;
    }

    @Override // p246x4.o
    public final long e() {
        return this.f28465n;
    }
}
