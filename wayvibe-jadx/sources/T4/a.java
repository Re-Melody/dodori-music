package T4;

import N4.d;
import X4.f;
import X4.j;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.nio.charset.Charset;
import java.util.List;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: loaded from: classes.dex */
public final class a extends N4.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f11627s = j.k("styl");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f11628t = j.k("tbox");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f11629l = new f();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f11630m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f11631n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f11632o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f11633p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f11634q;
    public final int r;

    public a(List list) {
        if (list == null || list.size() != 1) {
            this.f11631n = 0;
            this.f11632o = -1;
            this.f11633p = "sans-serif";
            this.f11630m = false;
            this.f11634q = 0.85f;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f11631n = bArr[24];
        this.f11632o = ((bArr[26] & ForkServer.ERROR) << 24) | ((bArr[27] & ForkServer.ERROR) << 16) | ((bArr[28] & ForkServer.ERROR) << 8) | (bArr[29] & ForkServer.ERROR);
        this.f11633p = "Serif".equals(new String(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i10 = bArr[25] * 20;
        this.r = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.f11630m = z10;
        if (!z10) {
            this.f11634q = 0.85f;
            return;
        }
        float f10 = ((bArr[11] & ForkServer.ERROR) | ((bArr[10] & ForkServer.ERROR) << 8)) / i10;
        this.f11634q = f10;
        this.f11634q = Math.max(0.15f, Math.min(f10, 0.85f));
    }

    public static String f(f fVar) throws N4.f {
        if (fVar.a() < 2) {
            throw new N4.f("Unexpected subtitle format.");
        }
        int iK = fVar.k();
        if (iK == 0) {
            return "";
        }
        if (fVar.a() >= 2) {
            byte[] bArr = fVar.f13220a;
            int i10 = fVar.f13221b;
            char c3 = (char) ((bArr[i10 + 1] & ForkServer.ERROR) | ((bArr[i10] & ForkServer.ERROR) << 8));
            if (c3 == 65279 || c3 == 65534) {
                String str = new String(fVar.f13220a, fVar.f13221b, iK, Charset.forName("UTF-16"));
                fVar.f13221b += iK;
                return str;
            }
        }
        String str2 = new String(fVar.f13220a, fVar.f13221b, iK, Charset.forName("UTF-8"));
        fVar.f13221b += iK;
        return str2;
    }

    public static void g(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z10 = (i10 & 1) != 0;
            boolean z11 = (i10 & 2) != 0;
            if (z10) {
                if (z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z11) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            boolean z12 = (i10 & 4) != 0;
            if (z12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (z12 || z10 || z11) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
        }
    }

    public static void h(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & ColorExtractionConstants.COLOR_COMPONENT_MASK) << 24)), i12, i13, i14 | 33);
        }
    }

    @Override // N4.b
    public final d a(byte[] bArr, int i10, int i11, boolean z10) throws N4.f {
        f fVar = this.f11629l;
        fVar.c(bArr, i10 + i11);
        fVar.f(i10);
        try {
            String strF = f(fVar);
            if (strF.isEmpty()) {
                return b.f11635b;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strF);
            g(spannableStringBuilder, this.f11631n, 0, 0, spannableStringBuilder.length(), 16711680);
            h(spannableStringBuilder, this.f11632o, -1, 0, spannableStringBuilder.length(), 16711680);
            String str = this.f11633p;
            int length = spannableStringBuilder.length();
            if (str != "sans-serif") {
                spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
            }
            float fMax = this.f11634q;
            while (fVar.a() >= 8) {
                int i12 = fVar.f13221b;
                int iN = fVar.n();
                int iN2 = fVar.n();
                if (iN2 == f11627s) {
                    if (fVar.a() < 2) {
                        throw new N4.f("Unexpected subtitle format.");
                    }
                    int iK = fVar.k();
                    for (int i13 = 0; i13 < iK; i13++) {
                        if (fVar.a() < 12) {
                            throw new N4.f("Unexpected subtitle format.");
                        }
                        int iK2 = fVar.k();
                        int iK3 = fVar.k();
                        fVar.g(2);
                        int i14 = fVar.i();
                        fVar.g(1);
                        int iN3 = fVar.n();
                        g(spannableStringBuilder, i14, this.f11631n, iK2, iK3, 0);
                        h(spannableStringBuilder, iN3, this.f11632o, iK2, iK3, 0);
                    }
                } else if (iN2 == f11628t && this.f11630m) {
                    if (fVar.a() < 2) {
                        throw new N4.f("Unexpected subtitle format.");
                    }
                    fMax = Math.max(0.15f, Math.min(fVar.k() / this.r, 0.85f));
                }
                fVar.f(i12 + iN);
            }
            return new b(new N4.a(spannableStringBuilder, fMax, Float.MIN_VALUE, null));
        } catch (Exception unused) {
            return b.f11635b;
        }
    }
}
