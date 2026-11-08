package D6;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f2137c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f2138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2139b;

    static {
        new a(new int[0]);
    }

    public a(int[] iArr) {
        int length = iArr.length;
        this.f2138a = iArr;
        this.f2139b = length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            int i10 = aVar.f2139b;
            int i11 = this.f2139b;
            if (i11 == i10) {
                for (int i12 = 0; i12 < i11; i12++) {
                    p229v9.a.j(i12, i11);
                    int i13 = this.f2138a[i12];
                    p229v9.a.j(i12, aVar.f2139b);
                    if (i13 == aVar.f2138a[i12]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f2139b; i11++) {
            i10 = (i10 * 31) + this.f2138a[i11];
        }
        return i10;
    }

    public final String toString() {
        int i10 = this.f2139b;
        if (i10 == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i10 * 5);
        sb.append('[');
        int[] iArr = this.f2138a;
        sb.append(iArr[0]);
        for (int i11 = 1; i11 < i10; i11++) {
            sb.append(", ");
            sb.append(iArr[i11]);
        }
        sb.append(']');
        return sb.toString();
    }
}
