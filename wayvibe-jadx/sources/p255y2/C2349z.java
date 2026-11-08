package p255y2;

import B2.C;
import D7.p1;
import com.amazon.c.a.a.c;
import com.revenuecat.purchases.ui.revenuecatui.composables.BackgroundUIConstants;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.Arrays;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import org.apache.tika.utils.XMLReaderUtils;
import p134m1.b;

/* JADX INFO: renamed from: y2.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2349z {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C2349z f29012y = new C2349z(new C2348y());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f29013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f29014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f29015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f29016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f29017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f29018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f29019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f29020h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f29021i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f29022j;
    public final Boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f29023l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Integer f29024m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f29025n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Integer f29026o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f29027p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Integer f29028q;
    public final Integer r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CharSequence f29029s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CharSequence f29030t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CharSequence f29031u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final CharSequence f29032v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final CharSequence f29033w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Integer f29034x;

    static {
        b.y(0, 1, 2, 3, 4);
        b.y(5, 6, 8, 9, 10);
        b.y(11, 12, 13, 14, 15);
        b.y(16, 17, 18, 19, 20);
        b.y(21, 22, 23, 24, 25);
        b.y(26, 27, 28, 29, 30);
        C.D(31);
        C.D(32);
        C.D(33);
        C.D(PipesIterator.DEFAULT_QUEUE_SIZE);
    }

    public C2349z(C2348y c2348y) {
        Boolean boolValueOf = c2348y.k;
        Integer numValueOf = c2348y.f29000j;
        Integer numValueOf2 = c2348y.f29011w;
        int i10 = 1;
        int i11 = 0;
        int i12 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        case 19:
                        case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                        case c.f16581h /* 32 */:
                        case 33:
                        case 34:
                        case 35:
                            break;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i10 = 0;
                            break;
                        case 21:
                            i10 = 2;
                            break;
                        case 22:
                            i10 = 3;
                            break;
                        case 23:
                            i10 = 4;
                            break;
                        case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                            i10 = 5;
                            break;
                        case 25:
                            i10 = 6;
                            break;
                    }
                    i12 = i10;
                }
                numValueOf = Integer.valueOf(i12);
            }
        } else if (numValueOf != null) {
            boolean z10 = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z10);
            if (z10 && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i11 = 21;
                        break;
                    case 3:
                        i11 = 22;
                        break;
                    case 4:
                        i11 = 23;
                        break;
                    case 5:
                        i11 = 24;
                        break;
                    case 6:
                        i11 = 25;
                        break;
                    default:
                        i11 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i11);
            }
        }
        this.f29013a = c2348y.f28991a;
        this.f29014b = c2348y.f28992b;
        this.f29015c = c2348y.f28993c;
        this.f29016d = c2348y.f28994d;
        this.f29017e = c2348y.f28995e;
        this.f29018f = c2348y.f28996f;
        this.f29019g = c2348y.f28997g;
        this.f29020h = c2348y.f28998h;
        this.f29021i = c2348y.f28999i;
        this.f29022j = numValueOf;
        this.k = boolValueOf;
        Integer num = c2348y.f29001l;
        this.f29023l = num;
        this.f29024m = num;
        this.f29025n = c2348y.f29002m;
        this.f29026o = c2348y.f29003n;
        this.f29027p = c2348y.f29004o;
        this.f29028q = c2348y.f29005p;
        this.r = c2348y.f29006q;
        this.f29029s = c2348y.r;
        this.f29030t = c2348y.f29007s;
        this.f29031u = c2348y.f29008t;
        this.f29032v = c2348y.f29009u;
        this.f29033w = c2348y.f29010v;
        this.f29034x = numValueOf2;
    }

    public final C2348y a() {
        C2348y c2348y = new C2348y();
        c2348y.f28991a = this.f29013a;
        c2348y.f28992b = this.f29014b;
        c2348y.f28993c = this.f29015c;
        c2348y.f28994d = this.f29016d;
        c2348y.f28995e = this.f29017e;
        c2348y.f28996f = this.f29018f;
        c2348y.f28997g = this.f29019g;
        c2348y.f28998h = this.f29020h;
        c2348y.f28999i = this.f29021i;
        c2348y.f29000j = this.f29022j;
        c2348y.k = this.k;
        c2348y.f29001l = this.f29024m;
        c2348y.f29002m = this.f29025n;
        c2348y.f29003n = this.f29026o;
        c2348y.f29004o = this.f29027p;
        c2348y.f29005p = this.f29028q;
        c2348y.f29006q = this.r;
        c2348y.r = this.f29029s;
        c2348y.f29007s = this.f29030t;
        c2348y.f29008t = this.f29031u;
        c2348y.f29009u = this.f29032v;
        c2348y.f29010v = this.f29033w;
        c2348y.f29011w = this.f29034x;
        return c2348y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2349z.class != obj.getClass()) {
            return false;
        }
        C2349z c2349z = (C2349z) obj;
        return C.a(this.f29013a, c2349z.f29013a) && C.a(this.f29014b, c2349z.f29014b) && C.a(this.f29015c, c2349z.f29015c) && C.a(this.f29016d, c2349z.f29016d) && C.a(this.f29017e, c2349z.f29017e) && Arrays.equals(this.f29018f, c2349z.f29018f) && C.a(this.f29019g, c2349z.f29019g) && C.a(this.f29020h, c2349z.f29020h) && C.a(this.f29021i, c2349z.f29021i) && C.a(this.f29022j, c2349z.f29022j) && C.a(this.k, c2349z.k) && C.a(this.f29024m, c2349z.f29024m) && C.a(this.f29025n, c2349z.f29025n) && C.a(this.f29026o, c2349z.f29026o) && C.a(this.f29027p, c2349z.f29027p) && C.a(this.f29028q, c2349z.f29028q) && C.a(this.r, c2349z.r) && C.a(this.f29029s, c2349z.f29029s) && C.a(this.f29030t, c2349z.f29030t) && C.a(this.f29031u, c2349z.f29031u) && C.a(this.f29032v, c2349z.f29032v) && C.a(this.f29033w, c2349z.f29033w) && C.a(this.f29034x, c2349z.f29034x);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29013a, this.f29014b, this.f29015c, this.f29016d, null, null, this.f29017e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f29018f)), this.f29019g, null, this.f29020h, this.f29021i, this.f29022j, this.k, null, this.f29024m, this.f29025n, this.f29026o, this.f29027p, this.f29028q, this.r, this.f29029s, this.f29030t, this.f29031u, null, null, this.f29032v, null, this.f29033w, this.f29034x, true});
    }
}
