package p185r4;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.lifecycle.AbstractC1121p;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.m;
import okhttp3.Headers;
import p012a8.b;
import p119k9.AbstractC2040y;
import p195s4.d;
import p195s4.f;
import p195s4.h;
import p214u4.e;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f25924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f25925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bitmap.Config f25926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f25927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f25928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f25929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Headers f25930h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p f25931i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f25932j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f25933l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f25934m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f25935n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f25936o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f25937p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AbstractC2040y f25938q;
    public final AbstractC2040y r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AbstractC2040y f25939s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AbstractC2040y f25940t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AbstractC1121p f25941u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h f25942v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f f25943w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final n f25944x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final d f25945y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final c f25946z;

    public i(Context context, Object obj, b bVar, Bitmap.Config config, d dVar, List list, e eVar, Headers headers, p pVar, boolean z10, boolean z11, boolean z12, boolean z13, b bVar2, b bVar3, b bVar4, AbstractC2040y abstractC2040y, AbstractC2040y abstractC2040y2, AbstractC2040y abstractC2040y3, AbstractC2040y abstractC2040y4, AbstractC1121p abstractC1121p, h hVar, f fVar, n nVar, d dVar2, c cVar) {
        this.f25923a = context;
        this.f25924b = obj;
        this.f25925c = bVar;
        this.f25926d = config;
        this.f25927e = dVar;
        this.f25928f = list;
        this.f25929g = eVar;
        this.f25930h = headers;
        this.f25931i = pVar;
        this.f25932j = z10;
        this.k = z11;
        this.f25933l = z12;
        this.f25934m = z13;
        this.f25935n = bVar2;
        this.f25936o = bVar3;
        this.f25937p = bVar4;
        this.f25938q = abstractC2040y;
        this.r = abstractC2040y2;
        this.f25939s = abstractC2040y3;
        this.f25940t = abstractC2040y4;
        this.f25941u = abstractC1121p;
        this.f25942v = hVar;
        this.f25943w = fVar;
        this.f25944x = nVar;
        this.f25945y = dVar2;
        this.f25946z = cVar;
    }

    public static h a(i iVar) {
        Context context = iVar.f25923a;
        iVar.getClass();
        return new h(iVar, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return m.b(this.f25923a, iVar.f25923a) && this.f25924b.equals(iVar.f25924b) && m.b(this.f25925c, iVar.f25925c) && this.f25926d == iVar.f25926d && this.f25927e == iVar.f25927e && m.b(this.f25928f, iVar.f25928f) && m.b(this.f25929g, iVar.f25929g) && m.b(this.f25930h, iVar.f25930h) && this.f25931i.equals(iVar.f25931i) && this.f25932j == iVar.f25932j && this.k == iVar.k && this.f25933l == iVar.f25933l && this.f25934m == iVar.f25934m && this.f25935n == iVar.f25935n && this.f25936o == iVar.f25936o && this.f25937p == iVar.f25937p && m.b(this.f25938q, iVar.f25938q) && m.b(this.r, iVar.r) && m.b(this.f25939s, iVar.f25939s) && m.b(this.f25940t, iVar.f25940t) && m.b(this.f25941u, iVar.f25941u) && this.f25942v.equals(iVar.f25942v) && this.f25943w == iVar.f25943w && this.f25944x.equals(iVar.f25944x) && this.f25945y.equals(iVar.f25945y) && m.b(this.f25946z, iVar.f25946z);
    }

    public final int hashCode() {
        int iHashCode = (this.f25924b.hashCode() + (this.f25923a.hashCode() * 31)) * 31;
        b bVar = this.f25925c;
        return this.f25946z.hashCode() + ((this.f25945y.hashCode() + p134m1.b.e((this.f25943w.hashCode() + ((this.f25942v.hashCode() + ((this.f25941u.hashCode() + ((this.f25940t.hashCode() + ((this.f25939s.hashCode() + ((this.r.hashCode() + ((this.f25938q.hashCode() + ((this.f25937p.hashCode() + ((this.f25936o.hashCode() + ((this.f25935n.hashCode() + p134m1.b.f(p134m1.b.f(p134m1.b.f(p134m1.b.f(p134m1.b.e((((this.f25929g.hashCode() + p134m1.b.d((this.f25927e.hashCode() + ((this.f25926d.hashCode() + ((iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 923521)) * 961)) * 29791, 31, this.f25928f)) * 31) + Arrays.hashCode(this.f25930h.f24031a)) * 31, 31, this.f25931i.f25970a), 31, this.f25932j), 31, this.k), 31, this.f25933l), 31, this.f25934m)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, -1807454463, this.f25944x.f25961a)) * 31);
    }
}
