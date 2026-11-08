package O4;

import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes.dex */
public final class d extends N4.a implements Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9187d;

    public d(SpannableStringBuilder spannableStringBuilder, float f10, float f11, int i10) {
        super(spannableStringBuilder, f10, f11, null);
        this.f9187d = i10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i10 = ((d) obj).f9187d;
        int i11 = this.f9187d;
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }
}
