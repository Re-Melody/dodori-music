package p245x3;

import A2.b;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import com.apple.android.music.playback.model.MediaPlayerException;
import p170p7.r;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f28378c = new r(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f28379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28380b;

    public d(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f10, int i10, float f11, int i11, boolean z10, int i12, int i13) {
        boolean z11;
        int i14;
        if (z10) {
            z11 = true;
            i14 = i12;
        } else {
            z11 = false;
            i14 = -16777216;
        }
        this.f28379a = new b(spannableStringBuilder, alignment, null, null, f10, 0, i10, f11, i11, MediaPlayerException.ERROR_UNKNOWN, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z11, i14, MediaPlayerException.ERROR_UNKNOWN, 0.0f);
        this.f28380b = i13;
    }
}
