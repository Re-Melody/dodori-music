package p160o7;

import p188r7.c;
import p188r7.j;

/* JADX INFO: renamed from: o7.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2180i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f23757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f23758b;

    static {
        int[] iArr = new int[j.values().length];
        f23758b = iArr;
        try {
            iArr[j.DOCUMENTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f23758b[j.QUERY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[c.values().length];
        f23757a = iArr2;
        try {
            iArr2[c.DOCUMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f23757a[c.NO_DOCUMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f23757a[c.UNKNOWN_DOCUMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
