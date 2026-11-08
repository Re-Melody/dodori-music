package C3;

import android.text.Layout;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f1210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1214e;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f1220l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Layout.Alignment f1223o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Layout.Alignment f1224p;
    public b r;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1215f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1216g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1217h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1218i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1219j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1221m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1222n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1225q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f1226s = Float.MAX_VALUE;

    public final void a(h hVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (hVar != null) {
            if (!this.f1212c && hVar.f1212c) {
                this.f1211b = hVar.f1211b;
                this.f1212c = true;
            }
            if (this.f1217h == -1) {
                this.f1217h = hVar.f1217h;
            }
            if (this.f1218i == -1) {
                this.f1218i = hVar.f1218i;
            }
            if (this.f1210a == null && (str = hVar.f1210a) != null) {
                this.f1210a = str;
            }
            if (this.f1215f == -1) {
                this.f1215f = hVar.f1215f;
            }
            if (this.f1216g == -1) {
                this.f1216g = hVar.f1216g;
            }
            if (this.f1222n == -1) {
                this.f1222n = hVar.f1222n;
            }
            if (this.f1223o == null && (alignment2 = hVar.f1223o) != null) {
                this.f1223o = alignment2;
            }
            if (this.f1224p == null && (alignment = hVar.f1224p) != null) {
                this.f1224p = alignment;
            }
            if (this.f1225q == -1) {
                this.f1225q = hVar.f1225q;
            }
            if (this.f1219j == -1) {
                this.f1219j = hVar.f1219j;
                this.k = hVar.k;
            }
            if (this.r == null) {
                this.r = hVar.r;
            }
            if (this.f1226s == Float.MAX_VALUE) {
                this.f1226s = hVar.f1226s;
            }
            if (!this.f1214e && hVar.f1214e) {
                this.f1213d = hVar.f1213d;
                this.f1214e = true;
            }
            if (this.f1221m != -1 || (i10 = hVar.f1221m) == -1) {
                return;
            }
            this.f1221m = i10;
        }
    }
}
