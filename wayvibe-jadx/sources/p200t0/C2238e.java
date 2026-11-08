package p200t0;

import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.ArrayList;
import p143n0.C2096x;
import p143n0.e0;
import p206t6.b;

/* JADX INFO: renamed from: t0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2238e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f26449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f26450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f26451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f26452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f26453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f26454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f26455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f26456i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C2237d f26457j;
    public boolean k;

    public C2238e(String str, float f10, float f11, float f12, float f13, long j10, int i10, boolean z10, int i11) {
        str = (i11 & 1) != 0 ? "" : str;
        long j11 = (i11 & 32) != 0 ? C2096x.f22802m : j10;
        int i12 = (i11 & 64) != 0 ? 5 : i10;
        boolean z11 = (i11 & ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD) != 0 ? false : z10;
        this.f26448a = str;
        this.f26449b = f10;
        this.f26450c = f11;
        this.f26451d = f12;
        this.f26452e = f13;
        this.f26453f = j11;
        this.f26454g = i12;
        this.f26455h = z11;
        ArrayList arrayList = new ArrayList();
        this.f26456i = arrayList;
        C2237d c2237d = new C2237d(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.f26457j = c2237d;
        arrayList.add(c2237d);
    }

    public static void a(C2238e c2238e, ArrayList arrayList, e0 e0Var, int i10) {
        if (c2238e.k) {
            b.g0("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            throw null;
        }
        ((C2237d) p134m1.b.i(1, c2238e.f26456i)).f26447j.add(new J("", arrayList, 0, e0Var, 1.0f, null, 1.0f, 1.0f, 0, i10, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    public final C2239f b() {
        if (this.k) {
            b.g0("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            throw null;
        }
        while (true) {
            ArrayList arrayList = this.f26456i;
            if (arrayList.size() <= 1) {
                C2237d c2237d = this.f26457j;
                C2239f c2239f = new C2239f(this.f26448a, this.f26449b, this.f26450c, this.f26451d, this.f26452e, new F(c2237d.f26438a, c2237d.f26439b, c2237d.f26440c, c2237d.f26441d, c2237d.f26442e, c2237d.f26443f, c2237d.f26444g, c2237d.f26445h, c2237d.f26446i, c2237d.f26447j), this.f26453f, this.f26454g, this.f26455h);
                this.k = true;
                return c2239f;
            }
            if (this.k) {
                b.g0("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                throw null;
            }
            C2237d c2237d2 = (C2237d) arrayList.remove(arrayList.size() - 1);
            ((C2237d) p134m1.b.i(1, arrayList)).f26447j.add(new F(c2237d2.f26438a, c2237d2.f26439b, c2237d2.f26440c, c2237d2.f26441d, c2237d2.f26442e, c2237d2.f26443f, c2237d2.f26444g, c2237d2.f26445h, c2237d2.f26446i, c2237d2.f26447j));
        }
    }
}
