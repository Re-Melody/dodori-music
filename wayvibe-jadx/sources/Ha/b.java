package Ha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f6245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile a[] f6246c;

    static {
        a aVar = new a();
        new ThreadLocal();
        f6244a = aVar;
        f6245b = new ArrayList();
        f6246c = new a[0];
    }

    public static final void a(a... aVarArr) {
        a aVar = f6244a;
        aVar.getClass();
        int length = aVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            a aVar2 = aVarArr[i10];
            i10++;
            if (aVar2 == null) {
                throw new IllegalArgumentException("trees contained null");
            }
            if (aVar2 == aVar) {
                throw new IllegalArgumentException("Cannot plant Timber into itself.");
            }
        }
        ArrayList arrayList = f6245b;
        synchronized (arrayList) {
            Collections.addAll(arrayList, Arrays.copyOf(aVarArr, aVarArr.length));
            Object[] array = arrayList.toArray(new a[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            f6246c = (a[]) array;
        }
    }
}
