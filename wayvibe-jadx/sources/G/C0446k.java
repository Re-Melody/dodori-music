package G;

import D0.X;
import com.apple.android.music.playback.model.MediaPlayerException;
import java.util.List;
import p261z.EnumC2391a0;

/* JADX INFO: renamed from: G.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0446k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f4785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p067g0.c f4788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p067g0.d f4789f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p028c1.k f4790g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f4791h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f4792i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f4793j;
    public final int[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4794l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4795m;

    public C0446k(int i10, int i11, List list, long j10, Object obj, EnumC2391a0 enumC2391a0, p067g0.c cVar, p067g0.d dVar, p028c1.k kVar, boolean z10) {
        this.f4784a = i10;
        this.f4785b = list;
        this.f4786c = j10;
        this.f4787d = obj;
        this.f4788e = cVar;
        this.f4789f = dVar;
        this.f4790g = kVar;
        this.f4791h = z10;
        this.f4792i = enumC2391a0 == EnumC2391a0.Vertical;
        int size = list.size();
        int iMax = 0;
        for (int i12 = 0; i12 < size; i12++) {
            X x10 = (X) list.get(i12);
            iMax = Math.max(iMax, !this.f4792i ? x10.f1763b : x10.f1762a);
        }
        this.f4793j = iMax;
        this.k = new int[this.f4785b.size() * 2];
        this.f4795m = MediaPlayerException.ERROR_UNKNOWN;
    }

    public final void a(int i10) {
        this.f4794l += i10;
        int[] iArr = this.k;
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            boolean z10 = this.f4792i;
            if ((z10 && i11 % 2 == 1) || (!z10 && i11 % 2 == 0)) {
                iArr[i11] = iArr[i11] + i10;
            }
        }
    }

    public final void b(int i10, int i11, int i12) {
        int i13;
        this.f4794l = i10;
        boolean z10 = this.f4792i;
        this.f4795m = z10 ? i12 : i11;
        List list = this.f4785b;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            X x10 = (X) list.get(i14);
            int i15 = i14 * 2;
            int[] iArr = this.k;
            if (z10) {
                p067g0.c cVar = this.f4788e;
                if (cVar == null) {
                    throw new IllegalArgumentException("null horizontalAlignment");
                }
                iArr[i15] = ((p067g0.g) cVar).a(x10.f1762a, i11, this.f4790g);
                iArr[i15 + 1] = i10;
                i13 = x10.f1763b;
            } else {
                iArr[i15] = i10;
                int i16 = i15 + 1;
                p067g0.d dVar = this.f4789f;
                if (dVar == null) {
                    throw new IllegalArgumentException("null verticalAlignment");
                }
                iArr[i16] = ((p067g0.h) dVar).a(x10.f1763b, i12);
                i13 = x10.f1762a;
            }
            i10 += i13;
        }
    }
}
