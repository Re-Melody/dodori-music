package p220v;

import N8.t;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.m;
import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O f27348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W f27349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2263u f27350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T f27351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f27352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f27353f;

    public Y(O o10, W w10, C2263u c2263u, T t10, boolean z10, Map map) {
        this.f27348a = o10;
        this.f27349b = w10;
        this.f27350c = c2263u;
        this.f27351d = t10;
        this.f27352e = z10;
        this.f27353f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y6 = (Y) obj;
        return m.b(this.f27348a, y6.f27348a) && m.b(this.f27349b, y6.f27349b) && m.b(this.f27350c, y6.f27350c) && m.b(this.f27351d, y6.f27351d) && this.f27352e == y6.f27352e && m.b(this.f27353f, y6.f27353f);
    }

    public final int hashCode() {
        O o10 = this.f27348a;
        int iHashCode = (o10 == null ? 0 : o10.hashCode()) * 31;
        W w10 = this.f27349b;
        int iHashCode2 = (iHashCode + (w10 == null ? 0 : w10.hashCode())) * 31;
        C2263u c2263u = this.f27350c;
        int iHashCode3 = (iHashCode2 + (c2263u == null ? 0 : c2263u.hashCode())) * 31;
        T t10 = this.f27351d;
        return this.f27353f.hashCode() + b.f((iHashCode3 + (t10 != null ? t10.hashCode() : 0)) * 31, 31, this.f27352e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionData(fade=");
        sb.append(this.f27348a);
        sb.append(", slide=");
        sb.append(this.f27349b);
        sb.append(", changeSize=");
        sb.append(this.f27350c);
        sb.append(", scale=");
        sb.append(this.f27351d);
        sb.append(", hold=");
        sb.append(this.f27352e);
        sb.append(", effectsMap=");
        return b.n(sb, this.f27353f, ')');
    }

    public /* synthetic */ Y(O o10, W w10, C2263u c2263u, T t10, LinkedHashMap linkedHashMap, int i10) {
        this((i10 & 1) != 0 ? null : o10, (i10 & 2) != 0 ? null : w10, (i10 & 4) != 0 ? null : c2263u, (i10 & 8) != 0 ? null : t10, (i10 & 16) == 0, (i10 & 32) != 0 ? t.f8651a : linkedHashMap);
    }
}
