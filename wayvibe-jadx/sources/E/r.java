package E;

import D0.X;
import com.apple.android.music.playback.model.MediaPlayerException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r implements F.D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p028c1.k f2953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f2954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f2955f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f2956g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.a f2957h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f2958i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f2959j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f2960l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2961m = MediaPlayerException.ERROR_UNKNOWN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f2962n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f2963o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2964p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2965q;

    public r(int i10, Object obj, int i11, int i12, p028c1.k kVar, int i13, int i14, List list, long j10, Object obj2, androidx.compose.foundation.lazy.layout.a aVar, long j11, int i15, int i16) {
        this.f2950a = i10;
        this.f2951b = obj;
        this.f2952c = i11;
        this.f2953d = kVar;
        this.f2954e = list;
        this.f2955f = j10;
        this.f2956g = obj2;
        this.f2957h = aVar;
        this.f2958i = i15;
        this.f2959j = i16;
        int size = list.size();
        int iMax = 0;
        for (int i17 = 0; i17 < size; i17++) {
            iMax = Math.max(iMax, ((X) list.get(i17)).f1763b);
        }
        this.k = iMax;
        int i18 = i12 + iMax;
        this.f2960l = i18 >= 0 ? i18 : 0;
        this.f2962n = p025b9.a.f(this.f2952c, iMax);
        this.f2963o = 0L;
        this.f2964p = -1;
        this.f2965q = -1;
    }

    @Override // F.D
    public final int a() {
        return this.f2954e.size();
    }

    @Override // F.D
    public final int b() {
        return this.f2960l;
    }

    @Override // F.D
    public final int c() {
        return this.f2959j;
    }

    @Override // F.D
    public final Object d(int i10) {
        return ((X) this.f2954e.get(i10)).J();
    }

    @Override // F.D
    public final long e(int i10) {
        return this.f2963o;
    }

    @Override // F.D
    public final int f() {
        return this.f2958i;
    }

    public final void g(int i10, int i11, int i12) {
        h(i10, 0, i11, i12, -1, -1);
    }

    @Override // F.D
    public final Object getKey() {
        return this.f2951b;
    }

    public final void h(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f2961m = i13;
        if (this.f2953d == p028c1.k.Rtl) {
            i11 = (i12 - i11) - this.f2952c;
        }
        this.f2963o = S9.b.a(i11, i10);
        this.f2964p = i14;
        this.f2965q = i15;
    }
}
