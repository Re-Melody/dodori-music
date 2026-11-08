package U2;

import A6.C0094t;
import A6.E;
import A6.V;
import A6.W;
import B2.AbstractC0111a;
import B2.C;
import F2.L;
import R2.d0;
import U.P;
import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import p255y2.C2329e;
import p255y2.C2339o;
import p255y2.S;

/* JADX INFO: loaded from: classes.dex */
public final class p extends t {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final V f12153j = new C0094t(new E3.d(10));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f12155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p050e5.f f12156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f12157f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j f12158g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final P f12159h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C2329e f12160i;

    public p(Context context) {
        p050e5.f fVar = new p050e5.f(18);
        int i10 = j.f12118A;
        j jVar = new j(new i(context));
        this.f12154c = new Object();
        this.f12155d = context.getApplicationContext();
        this.f12156e = fVar;
        this.f12158g = jVar;
        this.f12160i = C2329e.f28869e;
        boolean zH = C.H(context);
        this.f12157f = zH;
        if (!zH && C.f560a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            this.f12159h = audioManager == null ? null : new P(audioManager.getSpatializer());
        }
        boolean z10 = this.f12158g.f12122v;
    }

    public static int b(C2339o c2339o, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(c2339o.f28946d)) {
            return 4;
        }
        String strE = e(str);
        String strE2 = e(c2339o.f28946d);
        if (strE2 == null || strE == null) {
            return (z10 && strE2 == null) ? 1 : 0;
        }
        if (strE2.startsWith(strE) || strE.startsWith(strE2)) {
            return 3;
        }
        int i10 = C.f560a;
        return strE2.split("-", 2)[0].equals(strE.split("-", 2)[0]) ? 2 : 0;
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean f(j jVar, int i10, C2339o c2339o) {
        if ((i10 & 3584) == 0) {
            return false;
        }
        S s8 = jVar.f28841m;
        if (s8.f28813c && (i10 & 2048) == 0) {
            return false;
        }
        if (s8.f28812b) {
            boolean z10 = (c2339o.f28935D == 0 && c2339o.f28936E == 0) ? false : true;
            boolean z11 = (i10 & 1024) != 0;
            if (z10 && !z11) {
                return false;
            }
        }
        return true;
    }

    public static Pair g(int i10, s sVar, int[][][] iArr, m mVar, Comparator comparator) {
        RandomAccess randomAccessX;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < sVar.f12163a; i11++) {
            if (i10 == ((int[]) sVar.f12164b)[i11]) {
                d0 d0Var = ((d0[]) sVar.f12166d)[i11];
                for (int i12 = 0; i12 < d0Var.f10814a; i12++) {
                    p255y2.P pA = d0Var.a(i12);
                    W wA = mVar.a(i11, pA, iArr[i11][i12]);
                    int i13 = pA.f28802a;
                    boolean[] zArr = new boolean[i13];
                    for (int i14 = 0; i14 < i13; i14++) {
                        n nVar = (n) wA.get(i14);
                        int iA = nVar.a();
                        if (!zArr[i14] && iA != 0) {
                            boolean z10 = true;
                            if (iA == 1) {
                                randomAccessX = E.x(nVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(nVar);
                                int i15 = i14 + 1;
                                while (i15 < i13) {
                                    boolean z11 = z10;
                                    n nVar2 = (n) wA.get(i15);
                                    if (nVar2.a() == 2 && nVar.b(nVar2)) {
                                        arrayList2.add(nVar2);
                                        zArr[i15] = z11;
                                    }
                                    i15++;
                                    z10 = z11;
                                }
                                randomAccessX = arrayList2;
                            }
                            arrayList.add(randomAccessX);
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i16 = 0; i16 < list.size(); i16++) {
            iArr2[i16] = ((n) list.get(i16)).f12138c;
        }
        n nVar3 = (n) list.get(0);
        return Pair.create(new q(nVar3.f12137b, iArr2), Integer.valueOf(nVar3.f12136a));
    }

    @Override // U2.t
    public final void a(C2329e c2329e) {
        boolean zEquals;
        synchronized (this.f12154c) {
            zEquals = this.f12160i.equals(c2329e);
            this.f12160i = c2329e;
        }
        if (zEquals) {
            return;
        }
        d();
    }

    public final j c() {
        j jVar;
        synchronized (this.f12154c) {
            jVar = this.f12158g;
        }
        return jVar;
    }

    public final void d() {
        boolean z10;
        L l10;
        P p10;
        synchronized (this.f12154c) {
            try {
                z10 = this.f12158g.f12122v && !this.f12157f && C.f560a >= 32 && (p10 = this.f12159h) != null && p10.f11785b;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z10 || (l10 = this.f12169a) == null) {
            return;
        }
        l10.f3960h.e(10);
    }

    public final void h(j jVar) {
        boolean zEquals;
        synchronized (this.f12154c) {
            zEquals = this.f12158g.equals(jVar);
            this.f12158g = jVar;
        }
        if (zEquals) {
            return;
        }
        if (jVar.f12122v && this.f12155d == null) {
            AbstractC0111a.x("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        L l10 = this.f12169a;
        if (l10 != null) {
            l10.f3960h.e(10);
        }
    }
}
