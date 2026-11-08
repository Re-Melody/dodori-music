package p140m7;

/* JADX INFO: renamed from: m7.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2056h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f22456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f22457b;

    static {
        int[] iArr = new int[EnumC2058j.values().length];
        f22457b = iArr;
        try {
            iArr[EnumC2058j.TERMINATE_LOCAL_LISTEN_AND_REQUIRE_WATCH_DISCONNECTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f22457b[EnumC2058j.TERMINATE_LOCAL_LISTEN_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f22457b[EnumC2058j.REQUIRE_WATCH_DISCONNECTION_ONLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[EnumC2059k.values().length];
        f22456a = iArr2;
        try {
            iArr2[EnumC2059k.INITIALIZE_LOCAL_LISTEN_AND_REQUIRE_WATCH_CONNECTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f22456a[EnumC2059k.INITIALIZE_LOCAL_LISTEN_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f22456a[EnumC2059k.REQUIRE_WATCH_CONNECTION_ONLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
