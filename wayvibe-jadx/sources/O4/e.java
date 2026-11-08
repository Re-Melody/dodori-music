package O4;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int[] f9188A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int[] f9189B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int[] f9190C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int[] f9191D;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f9192u = a(2, 2, 2, 0);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f9193v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int[] f9194w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f9195x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f9196y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final boolean[] f9197z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList f9198a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SpannableStringBuilder f9199b = new SpannableStringBuilder();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9205h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9206i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9207j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9208l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9209m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9210n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f9211o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f9212p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f9213q;
    public int r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9214s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f9215t;

    static {
        int iA = a(0, 0, 0, 0);
        f9193v = iA;
        int iA2 = a(0, 0, 0, 3);
        f9194w = new int[]{0, 0, 0, 0, 0, 2, 0};
        f9195x = new int[]{0, 0, 0, 0, 0, 0, 2};
        f9196y = new int[]{3, 3, 3, 3, 3, 3, 1};
        f9197z = new boolean[]{false, false, false, true, true, true, false};
        f9188A = new int[]{iA, iA2, iA, iA, iA2, iA, iA};
        f9189B = new int[]{0, 1, 2, 3, 4, 3, 4};
        f9190C = new int[]{0, 0, 0, 0, 0, 3, 3};
        f9191D = new int[]{iA, iA, iA, iA, iA, iA2, iA2};
    }

    public e() {
        e();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public static int a(int i10, int i11, int i12, int i13) {
        int i14;
        X4.a.h(i10, 4);
        X4.a.h(i11, 4);
        X4.a.h(i12, 4);
        X4.a.h(i13, 4);
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

    public final void b(char c3) {
        SpannableStringBuilder spannableStringBuilder = this.f9199b;
        if (c3 != '\n') {
            spannableStringBuilder.append(c3);
            return;
        }
        LinkedList linkedList = this.f9198a;
        linkedList.add(f());
        spannableStringBuilder.clear();
        if (this.f9210n != -1) {
            this.f9210n = 0;
        }
        if (this.f9211o != -1) {
            this.f9211o = 0;
        }
        if (this.f9212p != -1) {
            this.f9212p = 0;
        }
        if (this.r != -1) {
            this.r = 0;
        }
        while (true) {
            if ((!this.f9207j || linkedList.size() < this.f9206i) && linkedList.size() < 15) {
                return;
            } else {
                linkedList.remove(0);
            }
        }
    }

    public final void c(int i10, int i11) {
        int i12 = this.f9212p;
        SpannableStringBuilder spannableStringBuilder = this.f9199b;
        if (i12 != -1 && this.f9213q != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f9213q), this.f9212p, spannableStringBuilder.length(), 33);
        }
        if (i10 != f9192u) {
            this.f9212p = spannableStringBuilder.length();
            this.f9213q = i10;
        }
        if (this.r != -1 && this.f9214s != i11) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f9214s), this.r, spannableStringBuilder.length(), 33);
        }
        if (i11 != f9193v) {
            this.r = spannableStringBuilder.length();
            this.f9214s = i11;
        }
    }

    public final void d(boolean z10, boolean z11) {
        int i10 = this.f9210n;
        SpannableStringBuilder spannableStringBuilder = this.f9199b;
        if (i10 != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f9210n, spannableStringBuilder.length(), 33);
                this.f9210n = -1;
            }
        } else if (z10) {
            this.f9210n = spannableStringBuilder.length();
        }
        if (this.f9211o == -1) {
            if (z11) {
                this.f9211o = spannableStringBuilder.length();
            }
        } else {
            if (z11) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f9211o, spannableStringBuilder.length(), 33);
            this.f9211o = -1;
        }
    }

    public final void e() {
        this.f9198a.clear();
        this.f9199b.clear();
        this.f9210n = -1;
        this.f9211o = -1;
        this.f9212p = -1;
        this.r = -1;
        this.f9215t = 0;
        this.f9200c = false;
        this.f9201d = false;
        this.f9202e = 4;
        this.f9203f = false;
        this.f9204g = 0;
        this.f9205h = 0;
        this.f9206i = 15;
        this.f9207j = true;
        this.k = 0;
        this.f9208l = 0;
        this.f9209m = 0;
        int i10 = f9193v;
        this.f9213q = f9192u;
        this.f9214s = i10;
    }

    public final SpannableString f() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f9199b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f9210n != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f9210n, length, 33);
            }
            if (this.f9211o != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f9211o, length, 33);
            }
            if (this.f9212p != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f9213q), this.f9212p, length, 33);
            }
            if (this.r != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f9214s), this.r, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }
}
