package p199t;

import java.util.ConcurrentModificationException;
import p209u.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f26298a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object[] f26299b = new Object[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f26300c = new Object();

    public static final void a(C2231f c2231f, int i10) {
        kotlin.jvm.internal.m.f(c2231f, "<this>");
        c2231f.f26286a = new int[i10];
        c2231f.f26287b = new Object[i10];
    }

    public static final int b(C2231f c2231f, Object obj, int i10) {
        kotlin.jvm.internal.m.f(c2231f, "<this>");
        int i11 = c2231f.f26288c;
        if (i11 == 0) {
            return -1;
        }
        try {
            int iA = a.a(c2231f.f26286a, c2231f.f26288c, i10);
            if (iA < 0 || kotlin.jvm.internal.m.b(obj, c2231f.f26287b[iA])) {
                return iA;
            }
            int i12 = iA + 1;
            while (i12 < i11 && c2231f.f26286a[i12] == i10) {
                if (kotlin.jvm.internal.m.b(obj, c2231f.f26287b[i12])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = iA - 1; i13 >= 0 && c2231f.f26286a[i13] == i10; i13--) {
                if (kotlin.jvm.internal.m.b(obj, c2231f.f26287b[i13])) {
                    return i13;
                }
            }
            return ~i12;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
