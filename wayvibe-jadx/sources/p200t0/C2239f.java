package p200t0;

import kotlin.jvm.internal.m;
import p028c1.e;
import p098j.u;
import p134m1.b;
import p143n0.C2096x;

/* JADX INFO: renamed from: t0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2239f {
    public static final u k = new u();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f26458l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f26460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f26461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f26462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f26463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final F f26464f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f26465g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f26466h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f26467i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f26468j;

    public C2239f(String str, float f10, float f11, float f12, float f13, F f14, long j10, int i10, boolean z10) {
        int i11;
        synchronized (k) {
            i11 = f26458l;
            f26458l = i11 + 1;
        }
        this.f26459a = str;
        this.f26460b = f10;
        this.f26461c = f11;
        this.f26462d = f12;
        this.f26463e = f13;
        this.f26464f = f14;
        this.f26465g = j10;
        this.f26466h = i10;
        this.f26467i = z10;
        this.f26468j = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2239f)) {
            return false;
        }
        C2239f c2239f = (C2239f) obj;
        return m.b(this.f26459a, c2239f.f26459a) && e.a(this.f26460b, c2239f.f26460b) && e.a(this.f26461c, c2239f.f26461c) && this.f26462d == c2239f.f26462d && this.f26463e == c2239f.f26463e && this.f26464f.equals(c2239f.f26464f) && C2096x.c(this.f26465g, c2239f.f26465g) && this.f26466h == c2239f.f26466h && this.f26467i == c2239f.f26467i;
    }

    public final int hashCode() {
        int iHashCode = (this.f26464f.hashCode() + b.b(this.f26463e, b.b(this.f26462d, b.b(this.f26461c, b.b(this.f26460b, this.f26459a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i10 = C2096x.f22803n;
        return Boolean.hashCode(this.f26467i) + b.c(this.f26466h, b.g(this.f26465g, iHashCode, 31), 31);
    }
}
