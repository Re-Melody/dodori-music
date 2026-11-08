package p255y2;

import B2.C;

/* JADX INFO: renamed from: y2.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2348y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f28991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f28992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f28993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f28994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f28995e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f28996f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f28997g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f28998h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Integer f28999i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f29000j;
    public Boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Integer f29001l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Integer f29002m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Integer f29003n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Integer f29004o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Integer f29005p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Integer f29006q;
    public CharSequence r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f29007s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CharSequence f29008t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public CharSequence f29009u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public CharSequence f29010v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Integer f29011w;

    public final void a(byte[] bArr, int i10) {
        if (this.f28996f != null) {
            Integer numValueOf = Integer.valueOf(i10);
            int i11 = C.f560a;
            if (!numValueOf.equals(3) && C.a(this.f28997g, 3)) {
                return;
            }
        }
        this.f28996f = (byte[]) bArr.clone();
        this.f28997g = Integer.valueOf(i10);
    }
}
