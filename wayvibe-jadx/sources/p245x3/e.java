package p245x3;

import B2.AbstractC0111a;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final boolean[] f28381A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int[] f28382B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int[] f28383C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int[] f28384D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int[] f28385E;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f28386v = c(2, 2, 2, 0);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f28387w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f28388x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f28389y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f28390z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f28391a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SpannableStringBuilder f28392b = new SpannableStringBuilder();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f28393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f28394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f28396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f28397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f28398h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f28399i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f28400j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f28401l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f28402m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f28403n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f28404o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f28405p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f28406q;
    public int r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f28407s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f28408t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f28409u;

    static {
        int iC = c(0, 0, 0, 0);
        f28387w = iC;
        int iC2 = c(0, 0, 0, 3);
        f28388x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f28389y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f28390z = new int[]{3, 3, 3, 3, 3, 3, 1};
        f28381A = new boolean[]{false, false, false, true, true, true, false};
        f28382B = new int[]{iC, iC2, iC, iC, iC2, iC, iC};
        f28383C = new int[]{0, 1, 2, 3, 4, 3, 4};
        f28384D = new int[]{0, 0, 0, 0, 0, 3, 3};
        f28385E = new int[]{iC, iC, iC, iC, iC, iC2, iC2};
    }

    public e() {
        d();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public static int c(int i10, int i11, int i12, int i13) {
        int i14;
        AbstractC0111a.f(i10, 4);
        AbstractC0111a.f(i11, 4);
        AbstractC0111a.f(i12, 4);
        AbstractC0111a.f(i13, 4);
        if (i13 == 0 || i13 == 1) {
            i14 = 255;
        } else if (i13 == 2) {
            i14 = 127;
        } else if (i13 != 3) {
            i14 = 255;
        } else {
            i14 = 0;
        }
        return Color.argb(i14, i10 > 1 ? 255 : 0, i11 > 1 ? 255 : 0, i12 > 1 ? 255 : 0);
    }

    public final void a(char c3) {
        SpannableStringBuilder spannableStringBuilder = this.f28392b;
        if (c3 != '\n') {
            spannableStringBuilder.append(c3);
            return;
        }
        ArrayList arrayList = this.f28391a;
        arrayList.add(b());
        spannableStringBuilder.clear();
        if (this.f28404o != -1) {
            this.f28404o = 0;
        }
        if (this.f28405p != -1) {
            this.f28405p = 0;
        }
        if (this.f28406q != -1) {
            this.f28406q = 0;
        }
        if (this.f28407s != -1) {
            this.f28407s = 0;
        }
        while (true) {
            if (arrayList.size() < this.f28400j && arrayList.size() < 15) {
                this.f28409u = arrayList.size();
                return;
            }
            arrayList.remove(0);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f28392b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f28404o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f28404o, length, 33);
            }
            if (this.f28405p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f28405p, length, 33);
            }
            if (this.f28406q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.r), this.f28406q, length, 33);
            }
            if (this.f28407s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f28408t), this.f28407s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f28391a.clear();
        this.f28392b.clear();
        this.f28404o = -1;
        this.f28405p = -1;
        this.f28406q = -1;
        this.f28407s = -1;
        this.f28409u = 0;
        this.f28393c = false;
        this.f28394d = false;
        this.f28395e = 4;
        this.f28396f = false;
        this.f28397g = 0;
        this.f28398h = 0;
        this.f28399i = 0;
        this.f28400j = 15;
        this.k = 0;
        this.f28401l = 0;
        this.f28402m = 0;
        int i10 = f28387w;
        this.f28403n = i10;
        this.r = f28386v;
        this.f28408t = i10;
    }

    public final void e(boolean z10, boolean z11) {
        int i10 = this.f28404o;
        SpannableStringBuilder spannableStringBuilder = this.f28392b;
        if (i10 != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f28404o, spannableStringBuilder.length(), 33);
                this.f28404o = -1;
            }
        } else if (z10) {
            this.f28404o = spannableStringBuilder.length();
        }
        if (this.f28405p == -1) {
            if (z11) {
                this.f28405p = spannableStringBuilder.length();
            }
        } else {
            if (z11) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f28405p, spannableStringBuilder.length(), 33);
            this.f28405p = -1;
        }
    }

    public final void f(int i10, int i11) {
        int i12 = this.f28406q;
        SpannableStringBuilder spannableStringBuilder = this.f28392b;
        if (i12 != -1 && this.r != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.r), this.f28406q, spannableStringBuilder.length(), 33);
        }
        if (i10 != f28386v) {
            this.f28406q = spannableStringBuilder.length();
            this.r = i10;
        }
        if (this.f28407s != -1 && this.f28408t != i11) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f28408t), this.f28407s, spannableStringBuilder.length(), 33);
        }
        if (i11 != f28387w) {
            this.f28407s = spannableStringBuilder.length();
            this.f28408t = i11;
        }
    }
}
