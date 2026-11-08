package p255y2;

import B2.C;
import java.util.Arrays;
import p134m1.b;

/* JADX INFO: renamed from: y2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2326b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2326b f28865c = new C2326b(new C2325a[0]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2325a f28866d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2325a[] f28868b;

    static {
        C2325a c2325a = new C2325a(-1, -1, new int[0], new C2346w[0], new long[0]);
        int[] iArr = c2325a.f28863e;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = c2325a.f28864f;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        f28866d = new C2325a(0, c2325a.f28860b, iArrCopyOf, (C2346w[]) Arrays.copyOf(c2325a.f28862d, 0), jArrCopyOf);
        C.D(1);
        C.D(2);
        C.D(3);
        C.D(4);
    }

    public C2326b(C2325a[] c2325aArr) {
        this.f28867a = c2325aArr.length;
        this.f28868b = c2325aArr;
    }

    public final C2325a a(int i10) {
        return i10 < 0 ? f28866d : this.f28868b[i10];
    }

    public final boolean b(int i10) {
        if (i10 != this.f28867a - 1) {
            return false;
        }
        a(i10).getClass();
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2326b.class != obj.getClass()) {
            return false;
        }
        C2326b c2326b = (C2326b) obj;
        int i10 = C.f560a;
        return this.f28867a == c2326b.f28867a && Arrays.equals(this.f28868b, c2326b.f28868b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f28868b) + (((((this.f28867a * 961) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 961);
    }

    public final String toString() {
        return b.k("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[", "])");
    }
}
