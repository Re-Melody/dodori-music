package H6;

import T6.EnumC0842j0;
import T6.Z0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f6069b;

    static {
        int[] iArr = new int[EnumC0842j0.values().length];
        f6069b = iArr;
        try {
            iArr[EnumC0842j0.SHA1.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6069b[EnumC0842j0.SHA224.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f6069b[EnumC0842j0.SHA256.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f6069b[EnumC0842j0.SHA384.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f6069b[EnumC0842j0.SHA512.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[Z0.values().length];
        f6068a = iArr2;
        try {
            iArr2[Z0.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f6068a[Z0.CRUNCHY.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f6068a[Z0.LEGACY.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f6068a[Z0.RAW.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
