package L3;

import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: renamed from: L3.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0634k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7753e;

    public C0634k(int i10) {
        this.f7749a = i10;
        switch (i10) {
            case 1:
                break;
            default:
                this.f7750b = -1;
                this.f7751c = MediaPlayerException.ERROR_UNKNOWN;
                this.f7752d = false;
                this.f7753e = false;
                break;
        }
    }

    public String toString() {
        switch (this.f7749a) {
            case 0:
                StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
                sb.append(this.f7750b);
                sb.append(", mCoordinate=");
                sb.append(this.f7751c);
                sb.append(", mLayoutFromEnd=");
                sb.append(this.f7752d);
                sb.append(", mValid=");
                return p134m1.b.o(sb, this.f7753e, '}');
            default:
                return super.toString();
        }
    }
}
