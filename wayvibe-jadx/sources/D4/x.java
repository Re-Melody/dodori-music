package D4;

import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f2124e;

    public x() {
        this(MediaPlayerException.ERROR_UNKNOWN, 0, 1, 0);
    }

    public void a() {
        int i10 = this.f2123d;
        this.f2123d = i10 == Integer.MIN_VALUE ? this.f2121b : i10 + this.f2122c;
        this.f2124e = this.f2120a + this.f2123d;
    }

    public void b() {
        if (this.f2123d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public void c() {
        int i10 = this.f2123d;
        this.f2123d = i10 == Integer.MIN_VALUE ? this.f2121b : i10 + this.f2122c;
        this.f2124e = this.f2120a + this.f2123d;
    }

    public void d() {
        if (this.f2123d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public x(int i10, int i11, int i12, int i13) {
        String str;
        String str2;
        switch (i13) {
            case 1:
                if (i10 != Integer.MIN_VALUE) {
                    str = i10 + "/";
                } else {
                    str = "";
                }
                this.f2120a = str;
                this.f2121b = i11;
                this.f2122c = i12;
                this.f2123d = MediaPlayerException.ERROR_UNKNOWN;
                this.f2124e = "";
                break;
            default:
                if (i10 != Integer.MIN_VALUE) {
                    str2 = i10 + "/";
                } else {
                    str2 = "";
                }
                this.f2120a = str2;
                this.f2121b = i11;
                this.f2122c = i12;
                this.f2123d = MediaPlayerException.ERROR_UNKNOWN;
                break;
        }
    }

    public x(int i10, int i11) {
        this(MediaPlayerException.ERROR_UNKNOWN, i10, i11, 1);
    }
}
