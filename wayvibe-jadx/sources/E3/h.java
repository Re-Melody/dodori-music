package E3;

import B2.AbstractC0112b;
import android.text.Layout;
import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f3074c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f3072a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3073b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3075d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f3076e = -3.4028235E38f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3077f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3078g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f3079h = -3.4028235E38f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3080i = MediaPlayerException.ERROR_UNKNOWN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f3081j = 1.0f;
    public int k = MediaPlayerException.ERROR_UNKNOWN;

    /* JADX WARN: Code duplicated, block: B:20:0x0032  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    public final A2.a a() {
        Layout.Alignment alignment;
        float f10 = this.f3079h;
        float f11 = -3.4028235E38f;
        if (f10 == -3.4028235E38f) {
            int i10 = this.f3075d;
            if (i10 != 4) {
                f10 = i10 != 5 ? 0.5f : 1.0f;
            } else {
                f10 = 0.0f;
            }
        }
        int i11 = this.f3080i;
        if (i11 == Integer.MIN_VALUE) {
            int i12 = this.f3075d;
            if (i12 == 1) {
                i11 = 0;
            } else if (i12 == 3) {
                i11 = 2;
            } else if (i12 == 4) {
                i11 = 0;
            } else if (i12 != 5) {
                i11 = 1;
            } else {
                i11 = 2;
            }
        }
        A2.a aVar = new A2.a();
        int i13 = this.f3075d;
        if (i13 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i13 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i13 == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i13 == 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i13 != 5) {
            AbstractC0112b.r(i13, "Unknown textAlignment: ", "WebvttCueParser");
            alignment = null;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        aVar.f155c = alignment;
        float f12 = this.f3076e;
        int i14 = this.f3077f;
        if (f12 != -3.4028235E38f && i14 == 0 && (f12 < 0.0f || f12 > 1.0f)) {
            f11 = 1.0f;
        } else if (f12 != -3.4028235E38f) {
            f11 = f12;
        } else if (i14 == 0) {
            f11 = 1.0f;
        }
        aVar.f157e = f11;
        aVar.f158f = i14;
        aVar.f159g = this.f3078g;
        aVar.f160h = f10;
        aVar.f161i = i11;
        float f13 = this.f3081j;
        if (i11 == 0) {
            f10 = 1.0f - f10;
        } else if (i11 == 1) {
            f10 = f10 <= 0.5f ? f10 * 2.0f : (1.0f - f10) * 2.0f;
        } else if (i11 != 2) {
            throw new IllegalStateException(String.valueOf(i11));
        }
        aVar.f163l = Math.min(f13, f10);
        aVar.f167p = this.k;
        CharSequence charSequence = this.f3074c;
        if (charSequence != null) {
            aVar.f153a = charSequence;
        }
        return aVar;
    }
}
