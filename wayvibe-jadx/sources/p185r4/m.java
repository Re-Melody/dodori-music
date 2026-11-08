package p185r4;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.Arrays;
import okhttp3.Headers;
import p134m1.b;
import p195s4.f;
import p195s4.g;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap.Config f25949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f25950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f25951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f25952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f25953f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f25954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Headers f25955h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p f25956i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n f25957j;
    public final b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f25958l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f25959m;

    public m(Context context, Bitmap.Config config, g gVar, f fVar, boolean z10, boolean z11, boolean z12, Headers headers, p pVar, n nVar, b bVar, b bVar2, b bVar3) {
        this.f25948a = context;
        this.f25949b = config;
        this.f25950c = gVar;
        this.f25951d = fVar;
        this.f25952e = z10;
        this.f25953f = z11;
        this.f25954g = z12;
        this.f25955h = headers;
        this.f25956i = pVar;
        this.f25957j = nVar;
        this.k = bVar;
        this.f25958l = bVar2;
        this.f25959m = bVar3;
    }

    public static m a(m mVar) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Context context = mVar.f25948a;
        mVar.getClass();
        g gVar = mVar.f25950c;
        f fVar = mVar.f25951d;
        boolean z10 = mVar.f25952e;
        boolean z11 = mVar.f25953f;
        boolean z12 = mVar.f25954g;
        mVar.getClass();
        Headers headers = mVar.f25955h;
        p pVar = mVar.f25956i;
        n nVar = mVar.f25957j;
        b bVar = mVar.k;
        b bVar2 = mVar.f25958l;
        b bVar3 = mVar.f25959m;
        mVar.getClass();
        return new m(context, config, gVar, fVar, z10, z11, z12, headers, pVar, nVar, bVar, bVar2, bVar3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.m.b(this.f25948a, mVar.f25948a) && this.f25949b == mVar.f25949b && kotlin.jvm.internal.m.b(this.f25950c, mVar.f25950c) && this.f25951d == mVar.f25951d && this.f25952e == mVar.f25952e && this.f25953f == mVar.f25953f && this.f25954g == mVar.f25954g && kotlin.jvm.internal.m.b(this.f25955h, mVar.f25955h) && this.f25956i.equals(mVar.f25956i) && this.f25957j.equals(mVar.f25957j) && this.k == mVar.k && this.f25958l == mVar.f25958l && this.f25959m == mVar.f25959m;
    }

    public final int hashCode() {
        return this.f25959m.hashCode() + ((this.f25958l.hashCode() + ((this.k.hashCode() + b.e(b.e((b.f(b.f(b.f((this.f25951d.hashCode() + ((this.f25950c.hashCode() + ((this.f25949b.hashCode() + (this.f25948a.hashCode() * 31)) * 961)) * 31)) * 31, 31, this.f25952e), 31, this.f25953f), 961, this.f25954g) + Arrays.hashCode(this.f25955h.f24031a)) * 31, 31, this.f25956i.f25970a), 31, this.f25957j.f25961a)) * 31)) * 31);
    }
}
