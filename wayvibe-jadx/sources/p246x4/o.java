package p246x4;

import X4.j;
import android.media.AudioTrack;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioTrack f28453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f28454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f28456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f28457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f28458f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f28459g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f28460h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f28461i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f28462j;

    public void a(AudioTrack audioTrack, boolean z10) {
        this.f28453a = audioTrack;
        this.f28454b = z10;
        this.f28459g = -9223372036854775807L;
        this.f28460h = -9223372036854775807L;
        this.f28456d = 0L;
        this.f28457e = 0L;
        this.f28458f = 0L;
        if (audioTrack != null) {
            this.f28455c = audioTrack.getSampleRate();
        }
    }

    public final long b() {
        if (this.f28459g != -9223372036854775807L) {
            return Math.min(this.f28462j, this.f28461i + ((((SystemClock.elapsedRealtime() * 1000) - this.f28459g) * ((long) this.f28455c)) / 1000000));
        }
        int playState = this.f28453a.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = ((long) this.f28453a.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f28454b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f28458f = this.f28456d;
            }
            playbackHeadPosition += this.f28458f;
        }
        if (j.f13232a <= 26) {
            if (playbackHeadPosition == 0 && this.f28456d > 0 && playState == 3) {
                if (this.f28460h == -9223372036854775807L) {
                    this.f28460h = SystemClock.elapsedRealtime();
                }
                return this.f28456d;
            }
            this.f28460h = -9223372036854775807L;
        }
        if (this.f28456d > playbackHeadPosition) {
            this.f28457e++;
        }
        this.f28456d = playbackHeadPosition;
        return playbackHeadPosition + (this.f28457e << 32);
    }

    public boolean c() {
        return false;
    }

    public long d() {
        throw new UnsupportedOperationException();
    }

    public long e() {
        throw new UnsupportedOperationException();
    }
}
