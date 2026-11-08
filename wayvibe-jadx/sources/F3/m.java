package F3;

import Z2.F;
import android.util.SparseArray;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f4371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4373c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final B2.t f4376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f4377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4378h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4379i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f4380j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f4381l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4384o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f4385p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f4386q;
    public boolean r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f4387s;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray f4374d = new SparseArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f4375e = new SparseArray();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public D4.j f4382m = new D4.j();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public D4.j f4383n = new D4.j();

    public m(F f10, boolean z10, boolean z11) {
        this.f4371a = f10;
        this.f4372b = z10;
        this.f4373c = z11;
        byte[] bArr = new byte[ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD];
        this.f4377g = bArr;
        this.f4376f = new B2.t(0, bArr, 0, 1);
        this.k = false;
        this.f4384o = false;
        D4.j jVar = this.f4383n;
        jVar.f1984b = false;
        jVar.f1983a = false;
    }

    public final void a() {
        boolean z10;
        int i10;
        boolean z11 = false;
        if (this.f4372b) {
            D4.j jVar = this.f4383n;
            z10 = jVar.f1984b && ((i10 = jVar.f1986d) == 7 || i10 == 2);
        } else {
            z10 = this.f4387s;
        }
        boolean z12 = this.r;
        int i11 = this.f4379i;
        if (i11 == 5 || (z10 && i11 == 1)) {
            z11 = true;
        }
        this.r = z12 | z11;
    }
}
