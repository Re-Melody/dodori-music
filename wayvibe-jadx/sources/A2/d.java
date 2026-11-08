package A2;

import B2.C;
import android.os.Bundle;
import android.text.Spanned;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f209e;

    static {
        int i10 = C.f560a;
        f205a = Integer.toString(0, 36);
        f206b = Integer.toString(1, 36);
        f207c = Integer.toString(2, 36);
        f208d = Integer.toString(3, 36);
        f209e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f205a, spanned.getSpanStart(obj));
        bundle2.putInt(f206b, spanned.getSpanEnd(obj));
        bundle2.putInt(f207c, spanned.getSpanFlags(obj));
        bundle2.putInt(f208d, i10);
        if (bundle != null) {
            bundle2.putBundle(f209e, bundle);
        }
        return bundle2;
    }
}
