package V4;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.concurrent.atomic.AtomicReference;
import p235w4.l;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f12583a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public A1.d f12586d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f12584b = new SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f12585c = new SparseBooleanArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference f12587e = new AtomicReference(new c());

    public static int a(int i10, int i11) {
        if (i10 > i11) {
            return 1;
        }
        return i11 > i10 ? -1 : 0;
    }

    public static boolean b(int i10, boolean z10) {
        int i11 = i10 & 7;
        if (i11 != 4) {
            return z10 && i11 == 3;
        }
        return true;
    }
}
