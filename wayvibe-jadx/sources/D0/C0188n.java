package D0;

import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: renamed from: D0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0188n extends X {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1818f;

    public C0188n(int i10, int i11, int i12) {
        this.f1818f = i12;
        switch (i12) {
            case 1:
                p0(p025b9.a.f(i10, i11));
                break;
            case 2:
                p0(p025b9.a.f(i10, i11));
                break;
            default:
                p0(p025b9.a.f(i10, i11));
                break;
        }
    }

    @Override // D0.X
    public final int k0(C0189o c0189o) {
        switch (this.f1818f) {
        }
        return MediaPlayerException.ERROR_UNKNOWN;
    }

    @Override // D0.X
    public final void o0(long j10, float f10, Z8.c cVar) {
        int i10 = this.f1818f;
    }

    private final void r0(long j10, float f10, Z8.c cVar) {
    }

    private final void s0(long j10, float f10, Z8.c cVar) {
    }

    private final void t0(long j10, float f10, Z8.c cVar) {
    }
}
