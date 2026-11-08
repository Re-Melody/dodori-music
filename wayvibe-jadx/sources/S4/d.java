package S4;

import android.text.Layout;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11114f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11115g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11116h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11117i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f11118j = -1;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f11119l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Layout.Alignment f11120m;

    public final void a(d dVar) {
        if (dVar != null) {
            if (!this.f11111c && dVar.f11111c) {
                this.f11110b = dVar.f11110b;
                this.f11111c = true;
            }
            if (this.f11116h == -1) {
                this.f11116h = dVar.f11116h;
            }
            if (this.f11117i == -1) {
                this.f11117i = dVar.f11117i;
            }
            if (this.f11109a == null) {
                this.f11109a = dVar.f11109a;
            }
            if (this.f11114f == -1) {
                this.f11114f = dVar.f11114f;
            }
            if (this.f11115g == -1) {
                this.f11115g = dVar.f11115g;
            }
            if (this.f11120m == null) {
                this.f11120m = dVar.f11120m;
            }
            if (this.f11118j == -1) {
                this.f11118j = dVar.f11118j;
                this.k = dVar.k;
            }
            if (this.f11113e || !dVar.f11113e) {
                return;
            }
            this.f11112d = dVar.f11112d;
            this.f11113e = true;
        }
    }
}
