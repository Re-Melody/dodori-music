package O0;

import T0.AbstractC0818v;
import com.apple.android.music.playback.model.MediaPlayerException;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import p143n0.C2096x;
import p143n0.b0;

/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final L f8893d = new L(0, 0, null, null, 0, 0, 0, 16777215);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f8894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f8895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f8896c;

    public L(E e2, t tVar, x xVar) {
        this.f8894a = e2;
        this.f8895b = tVar;
        this.f8896c = xVar;
    }

    public static L a(L l10, long j10, long j11, T0.I i10, AbstractC0818v abstractC0818v, long j12, long j13, p005a1.g gVar, int i11) {
        p005a1.n cVar;
        x xVar = S.a.f10949a;
        long jB = (i11 & 1) != 0 ? l10.f8894a.f8849a.b() : j10;
        long j14 = (i11 & 2) != 0 ? l10.f8894a.f8850b : j11;
        T0.I i12 = (i11 & 4) != 0 ? l10.f8894a.f8851c : i10;
        E e2 = l10.f8894a;
        T0.C c3 = e2.f8852d;
        T0.D d10 = e2.f8853e;
        AbstractC0818v abstractC0818v2 = (i11 & 32) != 0 ? e2.f8854f : abstractC0818v;
        String str = e2.f8855g;
        long j15 = (i11 & ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD) != 0 ? e2.f8856h : j12;
        p005a1.a aVar = e2.f8857i;
        p005a1.o oVar = e2.f8858j;
        W0.b bVar = e2.k;
        long j16 = e2.f8859l;
        p005a1.j jVar = e2.f8860m;
        b0 b0Var = e2.f8861n;
        p163p0.f fVar = e2.f8863p;
        t tVar = l10.f8895b;
        int i13 = tVar.f8954a;
        int i14 = tVar.f8955b;
        long j17 = (i11 & 131072) != 0 ? tVar.f8956c : j13;
        p005a1.p pVar = tVar.f8957d;
        x xVar2 = (i11 & 524288) != 0 ? l10.f8896c : xVar;
        p005a1.g gVar2 = (i11 & 1048576) != 0 ? tVar.f8959f : gVar;
        int i15 = tVar.f8960g;
        int i16 = tVar.f8961h;
        p005a1.q qVar = tVar.f8962i;
        if (C2096x.c(jB, e2.f8849a.b())) {
            cVar = e2.f8849a;
        } else {
            cVar = jB != 16 ? new p005a1.c(jB) : p005a1.l.f14100a;
        }
        return new L(new E(cVar, j14, i12, c3, d10, abstractC0818v2, str, j15, aVar, oVar, bVar, j16, jVar, b0Var, xVar2 != null ? xVar2.f8968a : null, fVar), new t(i13, i14, j17, pVar, xVar2 != null ? xVar2.f8969b : null, gVar2, i15, i16, qVar), xVar2);
    }

    public static L e(L l10, long j10, long j11, T0.I i10, long j12, int i11, long j13, int i12) {
        long j14 = (i12 & 2) != 0 ? p028c1.m.f15861c : j11;
        T0.I i13 = (i12 & 4) != 0 ? null : i10;
        long j15 = (i12 & ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD) != 0 ? p028c1.m.f15861c : j12;
        long j16 = C2096x.f22802m;
        int i14 = (32768 & i12) != 0 ? MediaPlayerException.ERROR_UNKNOWN : i11;
        long j17 = (i12 & 131072) != 0 ? p028c1.m.f15861c : j13;
        E eA = F.a(l10.f8894a, j10, null, Float.NaN, j14, i13, null, null, null, null, j15, null, null, null, j16, null, null, null, null);
        t tVarA = u.a(l10.f8895b, i14, MediaPlayerException.ERROR_UNKNOWN, j17, null, null, null, 0, MediaPlayerException.ERROR_UNKNOWN, null);
        return (l10.f8894a == eA && l10.f8895b == tVarA) ? l10 : new L(eA, tVarA);
    }

    public final long b() {
        return this.f8894a.f8849a.b();
    }

    public final boolean c(L l10) {
        if (this != l10) {
            return kotlin.jvm.internal.m.b(this.f8895b, l10.f8895b) && this.f8894a.a(l10.f8894a);
        }
        return true;
    }

    public final L d(L l10) {
        return (l10 == null || l10.equals(f8893d)) ? this : new L(this.f8894a.c(l10.f8894a), this.f8895b.a(l10.f8895b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l10 = (L) obj;
        return kotlin.jvm.internal.m.b(this.f8894a, l10.f8894a) && kotlin.jvm.internal.m.b(this.f8895b, l10.f8895b) && kotlin.jvm.internal.m.b(this.f8896c, l10.f8896c);
    }

    public final int hashCode() {
        int iHashCode = (this.f8895b.hashCode() + (this.f8894a.hashCode() * 31)) * 31;
        x xVar = this.f8896c;
        return iHashCode + (xVar != null ? xVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) C2096x.i(b()));
        sb.append(", brush=");
        E e2 = this.f8894a;
        sb.append(e2.f8849a.c());
        sb.append(", alpha=");
        sb.append(e2.f8849a.a());
        sb.append(", fontSize=");
        sb.append((Object) p028c1.m.d(e2.f8850b));
        sb.append(", fontWeight=");
        sb.append(e2.f8851c);
        sb.append(", fontStyle=");
        sb.append(e2.f8852d);
        sb.append(", fontSynthesis=");
        sb.append(e2.f8853e);
        sb.append(", fontFamily=");
        sb.append(e2.f8854f);
        sb.append(", fontFeatureSettings=");
        sb.append(e2.f8855g);
        sb.append(", letterSpacing=");
        sb.append((Object) p028c1.m.d(e2.f8856h));
        sb.append(", baselineShift=");
        sb.append(e2.f8857i);
        sb.append(", textGeometricTransform=");
        sb.append(e2.f8858j);
        sb.append(", localeList=");
        sb.append(e2.k);
        sb.append(", background=");
        p134m1.b.u(e2.f8859l, ", textDecoration=", sb);
        sb.append(e2.f8860m);
        sb.append(", shadow=");
        sb.append(e2.f8861n);
        sb.append(", drawStyle=");
        sb.append(e2.f8863p);
        sb.append(", textAlign=");
        t tVar = this.f8895b;
        sb.append((Object) p005a1.i.a(tVar.f8954a));
        sb.append(", textDirection=");
        sb.append((Object) p005a1.k.a(tVar.f8955b));
        sb.append(", lineHeight=");
        sb.append((Object) p028c1.m.d(tVar.f8956c));
        sb.append(", textIndent=");
        sb.append(tVar.f8957d);
        sb.append(", platformStyle=");
        sb.append(this.f8896c);
        sb.append(", lineHeightStyle=");
        sb.append(tVar.f8959f);
        sb.append(", lineBreak=");
        sb.append((Object) p005a1.e.a(tVar.f8960g));
        sb.append(", hyphens=");
        sb.append((Object) p005a1.d.a(tVar.f8961h));
        sb.append(", textMotion=");
        sb.append(tVar.f8962i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public L(E e2, t tVar) {
        w wVar = e2.f8862o;
        v vVar = tVar.f8958e;
        this(e2, tVar, (wVar == null && vVar == null) ? null : new x(wVar, vVar));
    }

    public L(long j10, long j11, T0.I i10, AbstractC0818v abstractC0818v, long j12, int i11, long j13, int i12) {
        this(new E((i12 & 1) != 0 ? C2096x.f22802m : j10, (i12 & 2) != 0 ? p028c1.m.f15861c : j11, (i12 & 4) != 0 ? null : i10, (T0.C) null, (T0.D) null, (i12 & 32) != 0 ? null : abstractC0818v, (String) null, (i12 & ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD) != 0 ? p028c1.m.f15861c : j12, (p005a1.a) null, (p005a1.o) null, (W0.b) null, C2096x.f22802m, (i12 & 4096) != 0 ? null : p005a1.j.f14097d, (b0) null, (w) null), new t((32768 & i12) != 0 ? MediaPlayerException.ERROR_UNKNOWN : i11, MediaPlayerException.ERROR_UNKNOWN, (i12 & 131072) != 0 ? p028c1.m.f15861c : j13, null, null, null, 0, MediaPlayerException.ERROR_UNKNOWN, null), null);
    }
}
