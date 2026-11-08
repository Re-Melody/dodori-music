package D4;

import android.util.SparseArray;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J4.k f1998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2000c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final B2.t f2003f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f2004g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2005h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2006i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f2007j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f2008l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2011o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f2012p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f2013q;
    public boolean r;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray f2001d = new SparseArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f2002e = new SparseArray();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j f2009m = new j();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public j f2010n = new j();

    public k(J4.k kVar, boolean z10, boolean z11) {
        this.f1998a = kVar;
        this.f1999b = z10;
        this.f2000c = z11;
        byte[] bArr = new byte[ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD];
        this.f2004g = bArr;
        this.f2003f = new B2.t(0, bArr, 0, 3);
        this.k = false;
        this.f2011o = false;
        j jVar = this.f2010n;
        jVar.f1984b = false;
        jVar.f1983a = false;
    }
}
