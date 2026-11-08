package p200t0;

import java.util.List;
import kotlin.jvm.internal.m;
import p134m1.b;
import p143n0.AbstractC2091s;

/* JADX INFO: loaded from: classes.dex */
public final class J extends H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f26403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC2091s f26405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f26406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbstractC2091s f26407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f26408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f26409h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f26410i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f26411j;
    public final float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f26412l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f26413m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f26414n;

    public J(String str, List list, int i10, AbstractC2091s abstractC2091s, float f10, AbstractC2091s abstractC2091s2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16) {
        this.f26402a = str;
        this.f26403b = list;
        this.f26404c = i10;
        this.f26405d = abstractC2091s;
        this.f26406e = f10;
        this.f26407f = abstractC2091s2;
        this.f26408g = f11;
        this.f26409h = f12;
        this.f26410i = i11;
        this.f26411j = i12;
        this.k = f13;
        this.f26412l = f14;
        this.f26413m = f15;
        this.f26414n = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || J.class != obj.getClass()) {
            return false;
        }
        J j10 = (J) obj;
        return this.f26402a.equals(j10.f26402a) && m.b(this.f26405d, j10.f26405d) && this.f26406e == j10.f26406e && m.b(this.f26407f, j10.f26407f) && this.f26408g == j10.f26408g && this.f26409h == j10.f26409h && this.f26410i == j10.f26410i && this.f26411j == j10.f26411j && this.k == j10.k && this.f26412l == j10.f26412l && this.f26413m == j10.f26413m && this.f26414n == j10.f26414n && this.f26404c == j10.f26404c && m.b(this.f26403b, j10.f26403b);
    }

    public final int hashCode() {
        int iHashCode = (this.f26403b.hashCode() + (this.f26402a.hashCode() * 31)) * 31;
        AbstractC2091s abstractC2091s = this.f26405d;
        int iB = b.b(this.f26406e, (iHashCode + (abstractC2091s != null ? abstractC2091s.hashCode() : 0)) * 31, 31);
        AbstractC2091s abstractC2091s2 = this.f26407f;
        return Integer.hashCode(this.f26404c) + b.b(this.f26414n, b.b(this.f26413m, b.b(this.f26412l, b.b(this.k, b.c(this.f26411j, b.c(this.f26410i, b.b(this.f26409h, b.b(this.f26408g, (iB + (abstractC2091s2 != null ? abstractC2091s2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
