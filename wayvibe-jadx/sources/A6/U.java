package A6;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class U extends V implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final U f326b = new U(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final U f327c = new U(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f328a;

    public /* synthetic */ U(int i10) {
        this.f328a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f328a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // A6.V
    public final V f() {
        switch (this.f328a) {
            case 0:
                return f327c;
            default:
                return f326b;
        }
    }

    public final String toString() {
        switch (this.f328a) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
