package U4;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import com.apple.android.music.playback.model.MediaPlayerException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f12201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f12202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SpannableStringBuilder f12203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Layout.Alignment f12204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f12205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f12206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12207g;

    public f() {
        a();
    }

    public final void a() {
        this.f12201a = 0L;
        this.f12202b = 0L;
        this.f12203c = null;
        this.f12204d = null;
        this.f12205e = Float.MIN_VALUE;
        this.f12206f = Float.MIN_VALUE;
        this.f12207g = MediaPlayerException.ERROR_UNKNOWN;
    }

    public final g b() {
        if (this.f12206f != Float.MIN_VALUE && this.f12207g == Integer.MIN_VALUE) {
            Layout.Alignment alignment = this.f12204d;
            if (alignment == null) {
                this.f12207g = MediaPlayerException.ERROR_UNKNOWN;
            } else {
                int i10 = e.f12200a[alignment.ordinal()];
                if (i10 == 1) {
                    this.f12207g = 0;
                } else if (i10 == 2) {
                    this.f12207g = 1;
                } else if (i10 != 3) {
                    Objects.toString(this.f12204d);
                    this.f12207g = 0;
                } else {
                    this.f12207g = 2;
                }
            }
        }
        return new g(this.f12201a, this.f12202b, this.f12203c, this.f12205e, this.f12206f);
    }
}
