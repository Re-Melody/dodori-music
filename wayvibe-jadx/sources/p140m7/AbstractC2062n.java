package p140m7;

/* JADX INFO: renamed from: m7.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2062n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f22468a;

    static {
        int[] iArr = new int[EnumC2063o.values().length];
        f22468a = iArr;
        try {
            iArr[EnumC2063o.LESS_THAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f22468a[EnumC2063o.LESS_THAN_OR_EQUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f22468a[EnumC2063o.EQUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f22468a[EnumC2063o.NOT_EQUAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f22468a[EnumC2063o.GREATER_THAN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f22468a[EnumC2063o.GREATER_THAN_OR_EQUAL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
