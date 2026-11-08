package p245x3;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.apple.android.music.playback.model.MediaPlayerException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f28346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f28347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StringBuilder f28348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f28351f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f28352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f28353h;

    public b(int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f28346a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f28347b = arrayList2;
        StringBuilder sb = new StringBuilder();
        this.f28348c = sb;
        this.f28352g = i10;
        arrayList.clear();
        arrayList2.clear();
        sb.setLength(0);
        this.f28349d = 15;
        this.f28350e = 0;
        this.f28351f = 0;
        this.f28353h = i11;
    }

    public final void a(char c3) {
        StringBuilder sb = this.f28348c;
        if (sb.length() < 32) {
            sb.append(c3);
        }
    }

    public final void b() {
        StringBuilder sb = this.f28348c;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            ArrayList arrayList = this.f28346a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) arrayList.get(size);
                int i10 = aVar.f28345c;
                if (i10 != length) {
                    return;
                }
                aVar.f28345c = i10 - 1;
            }
        }
    }

    public final A2.b c(int i10) {
        int i11;
        float f10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f28347b;
            if (i12 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i12));
            spannableStringBuilder.append('\n');
            i12++;
        }
        spannableStringBuilder.append((CharSequence) d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i13 = this.f28350e + this.f28351f;
        int length = (32 - i13) - spannableStringBuilder.length();
        int i14 = i13 - length;
        if (i10 != Integer.MIN_VALUE) {
            i11 = i10;
        } else if (this.f28352g != 2 || (Math.abs(i14) >= 3 && length >= 0)) {
            i11 = (this.f28352g != 2 || i14 <= 0) ? 0 : 2;
        } else {
            i11 = 1;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                i13 = 32 - length;
            }
            f10 = ((i13 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f10 = 0.5f;
        }
        float f11 = f10;
        int i15 = this.f28349d;
        if (i15 > 7) {
            i15 -= 17;
        } else if (this.f28352g == 1) {
            i15 -= this.f28353h - 1;
        }
        return new A2.b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i15, 1, MediaPlayerException.ERROR_UNKNOWN, f11, i11, MediaPlayerException.ERROR_UNKNOWN, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, MediaPlayerException.ERROR_UNKNOWN, 0.0f);
    }

    public final SpannableString d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f28348c);
        int length = spannableStringBuilder.length();
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = 0;
        int i15 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f28346a;
            if (i14 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i14);
            boolean z11 = aVar.f28344b;
            int i16 = aVar.f28343a;
            if (i16 != 8) {
                boolean z12 = i16 == 7;
                if (i16 != 7) {
                    i13 = c.f28355B[i16];
                }
                z10 = z12;
            }
            int i17 = aVar.f28345c;
            i14++;
            if (i17 != (i14 < arrayList.size() ? ((a) arrayList.get(i14)).f28345c : length)) {
                if (i10 != -1 && !z11) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i17, 33);
                    i10 = -1;
                } else if (i10 == -1 && z11) {
                    i10 = i17;
                }
                if (i11 != -1 && !z10) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i11, i17, 33);
                    i11 = -1;
                } else if (i11 == -1 && z10) {
                    i11 = i17;
                }
                if (i13 != i12) {
                    if (i12 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i15, i17, 33);
                    }
                    i12 = i13;
                    i15 = i17;
                }
            }
        }
        if (i10 != -1 && i10 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
        }
        if (i11 != -1 && i11 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i11, length, 33);
        }
        if (i15 != length && i12 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i15, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        return this.f28346a.isEmpty() && this.f28347b.isEmpty() && this.f28348c.length() == 0;
    }
}
