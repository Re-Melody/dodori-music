package F2;

import B2.AbstractC0111a;
import B2.AbstractC0112b;
import android.text.TextUtils;
import p255y2.C2339o;

/* JADX INFO: renamed from: F2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0414g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2339o f4126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2339o f4127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4129e;

    public C0414g(String str, C2339o c2339o, C2339o c2339o2, int i10, int i11) {
        AbstractC0111a.d(i10 == 0 || i11 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f4125a = str;
        c2339o.getClass();
        this.f4126b = c2339o;
        c2339o2.getClass();
        this.f4127c = c2339o2;
        this.f4128d = i10;
        this.f4129e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0414g.class == obj.getClass()) {
            C0414g c0414g = (C0414g) obj;
            if (this.f4128d == c0414g.f4128d && this.f4129e == c0414g.f4129e && this.f4125a.equals(c0414g.f4125a) && this.f4126b.equals(c0414g.f4126b) && this.f4127c.equals(c0414g.f4127c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4127c.hashCode() + ((this.f4126b.hashCode() + AbstractC0112b.a((((527 + this.f4128d) * 31) + this.f4129e) * 31, 31, this.f4125a)) * 31);
    }
}
