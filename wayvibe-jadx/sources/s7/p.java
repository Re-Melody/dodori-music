package s7;

import D7.EnumC0211c0;
import D7.EnumC0227k0;
import D7.G0;
import D7.I0;
import D7.K0;
import D7.P0;
import D7.Q;
import D7.V0;
import D7.g1;
import D7.s1;
import p140m7.EnumC2052d;
import p140m7.EnumC2063o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f26224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f26225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f26226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int[] f26227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int[] f26228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int[] f26229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int[] f26230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int[] f26231h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int[] f26232i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int[] f26233j;
    public static final /* synthetic */ int[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int[] f26234l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int[] f26235m;

    static {
        int[] iArr = new int[EnumC0211c0.values().length];
        f26235m = iArr;
        try {
            iArr[EnumC0211c0.TARGET_CHANGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f26235m[EnumC0211c0.DOCUMENT_CHANGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f26235m[EnumC0211c0.DOCUMENT_DELETE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f26235m[EnumC0211c0.DOCUMENT_REMOVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f26235m[EnumC0211c0.FILTER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f26235m[EnumC0211c0.RESPONSETYPE_NOT_SET.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr2 = new int[g1.values().length];
        f26234l = iArr2;
        try {
            iArr2[g1.NO_CHANGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f26234l[g1.ADD.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f26234l[g1.REMOVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f26234l[g1.CURRENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f26234l[g1.RESET.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f26234l[g1.UNRECOGNIZED.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        int[] iArr3 = new int[I0.values().length];
        k = iArr3;
        try {
            iArr3[I0.ASCENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            k[I0.DESCENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        int[] iArr4 = new int[K0.values().length];
        f26233j = iArr4;
        try {
            iArr4[K0.LESS_THAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            f26233j[K0.LESS_THAN_OR_EQUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            f26233j[K0.EQUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            f26233j[K0.NOT_EQUAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            f26233j[K0.GREATER_THAN_OR_EQUAL.ordinal()] = 5;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            f26233j[K0.GREATER_THAN.ordinal()] = 6;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            f26233j[K0.ARRAY_CONTAINS.ordinal()] = 7;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            f26233j[K0.IN.ordinal()] = 8;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            f26233j[K0.ARRAY_CONTAINS_ANY.ordinal()] = 9;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            f26233j[K0.NOT_IN.ordinal()] = 10;
        } catch (NoSuchFieldError unused24) {
        }
        int[] iArr5 = new int[EnumC2063o.values().length];
        f26232i = iArr5;
        try {
            iArr5[EnumC2063o.LESS_THAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            f26232i[EnumC2063o.LESS_THAN_OR_EQUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            f26232i[EnumC2063o.EQUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            f26232i[EnumC2063o.NOT_EQUAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            f26232i[EnumC2063o.GREATER_THAN.ordinal()] = 5;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            f26232i[EnumC2063o.GREATER_THAN_OR_EQUAL.ordinal()] = 6;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            f26232i[EnumC2063o.ARRAY_CONTAINS.ordinal()] = 7;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            f26232i[EnumC2063o.IN.ordinal()] = 8;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            f26232i[EnumC2063o.ARRAY_CONTAINS_ANY.ordinal()] = 9;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            f26232i[EnumC2063o.NOT_IN.ordinal()] = 10;
        } catch (NoSuchFieldError unused34) {
        }
        int[] iArr6 = new int[V0.values().length];
        f26231h = iArr6;
        try {
            iArr6[V0.IS_NAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            f26231h[V0.IS_NULL.ordinal()] = 2;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            f26231h[V0.IS_NOT_NAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            f26231h[V0.IS_NOT_NULL.ordinal()] = 4;
        } catch (NoSuchFieldError unused38) {
        }
        int[] iArr7 = new int[P0.values().length];
        f26230g = iArr7;
        try {
            iArr7[P0.COMPOSITE_FILTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            f26230g[P0.FIELD_FILTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            f26230g[P0.UNARY_FILTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused41) {
        }
        int[] iArr8 = new int[G0.values().length];
        f26229f = iArr8;
        try {
            iArr8[G0.AND.ordinal()] = 1;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            f26229f[G0.OR.ordinal()] = 2;
        } catch (NoSuchFieldError unused43) {
        }
        int[] iArr9 = new int[EnumC2052d.values().length];
        f26228e = iArr9;
        try {
            iArr9[EnumC2052d.AND.ordinal()] = 1;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            f26228e[EnumC2052d.OR.ordinal()] = 2;
        } catch (NoSuchFieldError unused45) {
        }
        int[] iArr10 = new int[p160o7.A.values().length];
        f26227d = iArr10;
        try {
            iArr10[p160o7.A.LISTEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            f26227d[p160o7.A.EXISTENCE_FILTER_MISMATCH.ordinal()] = 2;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            f26227d[p160o7.A.EXISTENCE_FILTER_MISMATCH_BLOOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            f26227d[p160o7.A.LIMBO_RESOLUTION.ordinal()] = 4;
        } catch (NoSuchFieldError unused49) {
        }
        int[] iArr11 = new int[Q.values().length];
        f26226c = iArr11;
        try {
            iArr11[Q.SET_TO_SERVER_VALUE.ordinal()] = 1;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            f26226c[Q.APPEND_MISSING_ELEMENTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            f26226c[Q.REMOVE_ALL_FROM_ARRAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            f26226c[Q.INCREMENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused53) {
        }
        int[] iArr12 = new int[EnumC0227k0.values().length];
        f26225b = iArr12;
        try {
            iArr12[EnumC0227k0.UPDATE_TIME.ordinal()] = 1;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            f26225b[EnumC0227k0.EXISTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            f26225b[EnumC0227k0.CONDITIONTYPE_NOT_SET.ordinal()] = 3;
        } catch (NoSuchFieldError unused56) {
        }
        int[] iArr13 = new int[s1.values().length];
        f26224a = iArr13;
        try {
            iArr13[s1.UPDATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            f26224a[s1.DELETE.ordinal()] = 2;
        } catch (NoSuchFieldError unused58) {
        }
        try {
            f26224a[s1.VERIFY.ordinal()] = 3;
        } catch (NoSuchFieldError unused59) {
        }
    }
}
