package T0;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.List;
import org.apache.tika.pipes.PipesConfigBase;

/* JADX INFO: loaded from: classes.dex */
public final class I implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final I f11451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final I f11452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final I f11453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final I f11454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final I f11455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final I f11456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final I f11457h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final I f11458i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final I f11459j;
    public static final I k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final I f11460l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final I f11461m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final List f11462n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11463a;

    static {
        I i10 = new I(100);
        I i11 = new I(200);
        I i12 = new I(300);
        I i13 = new I(RCHTTPStatusCodes.BAD_REQUEST);
        f11451b = i13;
        I i14 = new I(500);
        f11452c = i14;
        I i15 = new I(PipesConfigBase.DEFAULT_STALE_FETCHER_TIMEOUT_SECONDS);
        f11453d = i15;
        I i16 = new I(ColorExtractionConstants.MAXIMUM_BRIGHTNESS_THRESHOLD);
        I i17 = new I(800);
        I i18 = new I(900);
        f11454e = i10;
        f11455f = i11;
        f11456g = i12;
        f11457h = i13;
        f11458i = i14;
        f11459j = i15;
        k = i16;
        f11460l = i17;
        f11461m = i18;
        f11462n = D7.W.U(i10, i11, i12, i13, i14, i15, i16, i17, i18);
    }

    public I(int i10) {
        this.f11463a = i10;
        if (1 > i10 || i10 >= 1001) {
            throw new IllegalArgumentException(p134m1.b.j(i10, "Font weight can be in range [1, 1000]. Current value: ").toString());
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(I i10) {
        return kotlin.jvm.internal.m.g(this.f11463a, i10.f11463a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof I) {
            return this.f11463a == ((I) obj).f11463a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11463a;
    }

    public final String toString() {
        return V0.p.q(new StringBuilder("FontWeight(weight="), this.f11463a, ')');
    }
}
