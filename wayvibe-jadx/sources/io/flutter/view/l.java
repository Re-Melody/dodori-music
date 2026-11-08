package io.flutter.view;

import Ca.C0168a;
import android.graphics.Rect;
import android.opengl.Matrix;
import android.text.SpannableString;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f21060A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f21061B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f21062C;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f21065F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f21066G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f21067H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f21068I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f21069J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public String f21070K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public String f21071L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public float f21072M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public float f21073N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public float f21074O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public float f21075P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public float[] f21076Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public float[] f21077R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public l f21078S;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public ArrayList f21081V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public j f21082W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public j f21083X;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public float[] f21085Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f21086a;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float[] f21089b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f21090c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Rect f21091c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21096h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21097i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f21098j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f21099l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f21100m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f21101n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f21102o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f21103p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f21104q;
    public String r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f21105s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f21106t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f21107u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f21108v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f21109w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f21110x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList f21111y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f21112z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21088b = -1;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f21063D = -1;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f21064E = false;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final ArrayList f21079T = new ArrayList();

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final ArrayList f21080U = new ArrayList();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f21084Y = true;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f21087a0 = true;

    public l(m mVar) {
        this.f21086a = mVar;
    }

    public static boolean a(l lVar, i iVar) {
        return (lVar.f21092d & iVar.value) != 0;
    }

    public static CharSequence b(l lVar) {
        int i10 = 28;
        boolean z10 = false;
        C0168a c0168a = new C0168a(i10, z10);
        c0168a.f1501b = lVar.r;
        c0168a.f1502c = lVar.f21105s;
        c0168a.f1503d = lVar.d();
        SpannableString spannableStringS = c0168a.s();
        C0168a c0168a2 = new C0168a(i10, z10);
        c0168a2.f1501b = lVar.f21103p;
        c0168a2.f1502c = lVar.f21104q;
        c0168a2.f1504e = lVar.f21060A;
        c0168a2.f1503d = lVar.d();
        SpannableString spannableStringS2 = c0168a2.s();
        C0168a c0168a3 = new C0168a(i10, z10);
        c0168a3.f1501b = lVar.f21110x;
        c0168a3.f1502c = lVar.f21111y;
        c0168a3.f1503d = lVar.d();
        CharSequence[] charSequenceArr = {spannableStringS, spannableStringS2, c0168a3.s()};
        CharSequence charSequenceConcat = null;
        for (int i11 = 0; i11 < 3; i11++) {
            CharSequence charSequence = charSequenceArr[i11];
            if (charSequence != null && charSequence.length() > 0) {
                charSequenceConcat = (charSequenceConcat == null || charSequenceConcat.length() == 0) ? charSequence : TextUtils.concat(charSequenceConcat, ", ", charSequence);
            }
        }
        return charSequenceConcat;
    }

    public static ArrayList f(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        int i10 = byteBuffer.getInt();
        if (i10 == -1) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = byteBuffer.getInt();
            int i13 = byteBuffer.getInt();
            q qVar = q.values()[byteBuffer.getInt()];
            int i14 = g.f21054a[qVar.ordinal()];
            if (i14 == 1) {
                byteBuffer.getInt();
                o oVar = new o();
                oVar.f21139a = i12;
                oVar.f21140b = i13;
                oVar.f21141c = qVar;
                arrayList.add(oVar);
            } else if (i14 == 2) {
                ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                n nVar = new n();
                nVar.f21139a = i12;
                nVar.f21140b = i13;
                nVar.f21141c = qVar;
                nVar.f21138d = StandardCharsets.UTF_8.decode(byteBuffer2).toString();
                arrayList.add(nVar);
            }
        }
        return arrayList;
    }

    public static void j(float[] fArr, float[] fArr2, float[] fArr3) {
        Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
        float f10 = fArr[3];
        fArr[0] = fArr[0] / f10;
        fArr[1] = fArr[1] / f10;
        fArr[2] = fArr[2] / f10;
        fArr[3] = 0.0f;
    }

    public final void c(ArrayList arrayList) {
        if (g(k.SCOPES_ROUTE)) {
            arrayList.add(this);
        }
        Iterator it = this.f21079T.iterator();
        while (it.hasNext()) {
            ((l) it.next()).c(arrayList);
        }
    }

    public final String d() {
        String str = this.f21061B;
        return (str == null || str.isEmpty()) ? this.f21086a.f21127m : this.f21061B;
    }

    public final String e() {
        String str;
        if (g(k.NAMES_ROUTE) && (str = this.f21103p) != null && !str.isEmpty()) {
            return this.f21103p;
        }
        Iterator it = this.f21079T.iterator();
        while (it.hasNext()) {
            String strE = ((l) it.next()).e();
            if (strE != null && !strE.isEmpty()) {
                return strE;
            }
        }
        return null;
    }

    public final boolean g(k kVar) {
        return (this.f21090c & ((long) kVar.value)) != 0;
    }

    public final l h(float[] fArr, boolean z10) {
        float f10 = fArr[3];
        boolean z11 = false;
        float f11 = fArr[0] / f10;
        float f12 = fArr[1] / f10;
        if (f11 < this.f21072M || f11 >= this.f21074O || f12 < this.f21073N || f12 >= this.f21075P) {
            return null;
        }
        float[] fArr2 = new float[4];
        for (l lVar : this.f21080U) {
            if (!lVar.g(k.IS_HIDDEN)) {
                if (lVar.f21084Y) {
                    lVar.f21084Y = false;
                    if (lVar.f21085Z == null) {
                        lVar.f21085Z = new float[16];
                    }
                    if (!Matrix.invertM(lVar.f21085Z, 0, lVar.f21077R, 0)) {
                        Arrays.fill(lVar.f21085Z, 0.0f);
                    }
                }
                float[] fArr3 = fArr;
                Matrix.multiplyMV(fArr2, 0, lVar.f21085Z, 0, fArr3, 0);
                l lVarH = lVar.h(fArr2, z10);
                if (lVarH != null) {
                    return lVarH;
                }
                fArr = fArr3;
            }
        }
        if (z10 && this.f21097i != -1) {
            z11 = true;
        }
        if (i() || z11) {
            return this;
        }
        return null;
    }

    public final boolean i() {
        String str;
        String str2;
        String str3;
        if (g(k.SCOPES_ROUTE)) {
            return false;
        }
        if (g(k.IS_FOCUSABLE)) {
            return true;
        }
        if (g(k.IS_ACCESSIBILITY_FOCUS_BLOCKED)) {
            return false;
        }
        return ((this.f21092d & (~m.f21114y)) == 0 && (this.f21090c & ((long) m.f21115z)) == 0 && ((str = this.f21103p) == null || str.isEmpty()) && (((str2 = this.r) == null || str2.isEmpty()) && ((str3 = this.f21110x) == null || str3.isEmpty()))) ? false : true;
    }

    public final void k(float[] fArr, HashSet hashSet, boolean z10) {
        hashSet.add(this);
        if (this.f21087a0) {
            z10 = true;
        }
        if (z10) {
            if (this.f21089b0 == null) {
                this.f21089b0 = new float[16];
            }
            if (this.f21076Q == null) {
                this.f21076Q = new float[16];
            }
            Matrix.multiplyMM(this.f21089b0, 0, fArr, 0, this.f21076Q, 0);
            float[] fArr2 = {this.f21072M, this.f21073N, 0.0f, 1.0f};
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            float[] fArr5 = new float[4];
            float[] fArr6 = new float[4];
            j(fArr3, this.f21089b0, fArr2);
            fArr2[0] = this.f21074O;
            fArr2[1] = this.f21073N;
            j(fArr4, this.f21089b0, fArr2);
            fArr2[0] = this.f21074O;
            fArr2[1] = this.f21075P;
            j(fArr5, this.f21089b0, fArr2);
            fArr2[0] = this.f21072M;
            fArr2[1] = this.f21075P;
            j(fArr6, this.f21089b0, fArr2);
            if (this.f21091c0 == null) {
                this.f21091c0 = new Rect();
            }
            this.f21091c0.set(Math.round(Math.min(fArr3[0], Math.min(fArr4[0], Math.min(fArr5[0], fArr6[0])))), Math.round(Math.min(fArr3[1], Math.min(fArr4[1], Math.min(fArr5[1], fArr6[1])))), Math.round(Math.max(fArr3[0], Math.max(fArr4[0], Math.max(fArr5[0], fArr6[0])))), Math.round(Math.max(fArr3[1], Math.max(fArr4[1], Math.max(fArr5[1], fArr6[1])))));
            this.f21087a0 = false;
        }
        int i10 = -1;
        for (l lVar : this.f21079T) {
            lVar.f21063D = i10;
            i10 = lVar.f21088b;
            lVar.k(this.f21089b0, hashSet, z10);
        }
    }
}
