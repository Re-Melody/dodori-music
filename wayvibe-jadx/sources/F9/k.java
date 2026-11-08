package F9;

import E9.C;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f4643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f4647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f4648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f4650h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f4651i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f4652j;
    public final Long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Long f4653l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Long f4654m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f4655n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Integer f4656o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f4657p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f4658q;

    public k(C canonicalPath, boolean z10, String comment, long j10, long j11, long j12, int i10, long j13, int i11, int i12, Long l10, Long l11, Long l12, Integer num, Integer num2, Integer num3) {
        kotlin.jvm.internal.m.f(canonicalPath, "canonicalPath");
        kotlin.jvm.internal.m.f(comment, "comment");
        this.f4643a = canonicalPath;
        this.f4644b = z10;
        this.f4645c = comment;
        this.f4646d = j10;
        this.f4647e = j11;
        this.f4648f = j12;
        this.f4649g = i10;
        this.f4650h = j13;
        this.f4651i = i11;
        this.f4652j = i12;
        this.k = l10;
        this.f4653l = l11;
        this.f4654m = l12;
        this.f4655n = num;
        this.f4656o = num2;
        this.f4657p = num3;
        this.f4658q = new ArrayList();
    }

    public /* synthetic */ k(C c3, boolean z10, String str, long j10, long j11, long j12, int i10, long j13, int i11, int i12, Long l10, Long l11, Long l12, int i13) {
        this(c3, z10, (i13 & 4) != 0 ? "" : str, (i13 & 8) != 0 ? -1L : j10, (i13 & 16) != 0 ? -1L : j11, (i13 & 32) != 0 ? -1L : j12, (i13 & 64) != 0 ? -1 : i10, (i13 & ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD) != 0 ? -1L : j13, (i13 & 256) != 0 ? -1 : i11, (i13 & 512) != 0 ? -1 : i12, (i13 & 1024) != 0 ? null : l10, (i13 & 2048) != 0 ? null : l11, (i13 & 4096) != 0 ? null : l12, null, null, null);
    }
}
