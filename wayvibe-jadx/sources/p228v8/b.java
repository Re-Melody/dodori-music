package p228v8;

import com.google.firebase.firestore.EnumC1215k;
import io.flutter.plugins.firebase.firestore.K;
import io.flutter.plugins.firebase.firestore.L;
import io.flutter.plugins.firebase.firestore.n;
import io.flutter.plugins.firebase.firestore.w;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f27529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f27530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f27531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int[] f27532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int[] f27533e;

    static {
        int[] iArr = new int[n.values().length];
        f27533e = iArr;
        try {
            iArr[n.SERVER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        int[] iArr2 = new int[w.values().length];
        f27532d = iArr2;
        try {
            iArr2[w.DEFAULT_SOURCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f27532d[w.CACHE.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr3 = new int[EnumC1215k.values().length];
        f27531c = iArr3;
        try {
            iArr3[EnumC1215k.ADDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f27531c[EnumC1215k.MODIFIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f27531c[EnumC1215k.REMOVED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr4 = new int[K.values().length];
        f27530b = iArr4;
        try {
            iArr4[K.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f27530b[K.ESTIMATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f27530b[K.PREVIOUS.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        int[] iArr5 = new int[L.values().length];
        f27529a = iArr5;
        try {
            iArr5[L.CACHE.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f27529a[L.SERVER_AND_CACHE.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f27529a[L.SERVER.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
