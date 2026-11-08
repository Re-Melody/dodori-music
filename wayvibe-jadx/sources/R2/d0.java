package R2;

import B2.AbstractC0111a;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d0 f10813d = new d0(new p255y2.P[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A6.W f10815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10816c;

    static {
        B2.C.D(0);
    }

    public d0(p255y2.P... pArr) {
        this.f10815b = A6.E.s(pArr);
        this.f10814a = pArr.length;
        int i10 = 0;
        while (true) {
            A6.W w10 = this.f10815b;
            if (i10 >= w10.f331d) {
                return;
            }
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < w10.f331d; i12++) {
                if (((p255y2.P) w10.get(i10)).equals(w10.get(i12))) {
                    AbstractC0111a.m("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final p255y2.P a(int i10) {
        return (p255y2.P) this.f10815b.get(i10);
    }

    public final int b(p255y2.P p10) {
        int iIndexOf = this.f10815b.indexOf(p10);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d0.class != obj.getClass()) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f10814a == d0Var.f10814a && this.f10815b.equals(d0Var.f10815b);
    }

    public final int hashCode() {
        if (this.f10816c == 0) {
            this.f10816c = this.f10815b.hashCode();
        }
        return this.f10816c;
    }
}
