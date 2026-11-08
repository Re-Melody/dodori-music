package p199t;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.m;
import p209u.a;

/* JADX INFO: loaded from: classes.dex */
public class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f26266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f26267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26268c;

    public G(int i10) {
        this.f26266a = i10 == 0 ? a.f27013a : new int[i10];
        this.f26267b = i10 == 0 ? a.f27015c : new Object[i10 << 1];
    }

    public final int a(Object obj) {
        int i10 = this.f26268c * 2;
        Object[] objArr = this.f26267b;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i10) {
        int i11 = this.f26268c;
        int[] iArr = this.f26266a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            m.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f26266a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f26267b, i10 * 2);
            m.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f26267b = objArrCopyOf;
        }
        if (this.f26268c != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i10, Object obj) {
        int i11 = this.f26268c;
        if (i11 == 0) {
            return -1;
        }
        int iA = a.a(this.f26266a, i11, i10);
        if (iA < 0 || m.b(obj, this.f26267b[iA << 1])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f26266a[i12] == i10) {
            if (m.b(obj, this.f26267b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f26266a[i13] == i10; i13--) {
            if (m.b(obj, this.f26267b[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public final void clear() {
        if (this.f26268c > 0) {
            this.f26266a = a.f27013a;
            this.f26267b = a.f27015c;
            this.f26268c = 0;
        }
        if (this.f26268c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i10 = this.f26268c;
        if (i10 == 0) {
            return -1;
        }
        int iA = a.a(this.f26266a, i10, 0);
        if (iA < 0 || this.f26267b[iA << 1] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f26266a[i11] == 0) {
            if (this.f26267b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f26266a[i12] == 0; i12--) {
            if (this.f26267b[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof G) {
                int i10 = this.f26268c;
                if (i10 != ((G) obj).f26268c) {
                    return false;
                }
                G g3 = (G) obj;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object objG = g(i11);
                    Object objJ = j(i11);
                    Object obj2 = g3.get(objG);
                    if (objJ == null) {
                        if (obj2 != null || !g3.containsKey(objG)) {
                            return false;
                        }
                    } else if (!objJ.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f26268c != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f26268c;
            for (int i13 = 0; i13 < i12; i13++) {
                Object objG2 = g(i13);
                Object objJ2 = j(i13);
                Object obj3 = ((Map) obj).get(objG2);
                if (objJ2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objG2)) {
                        return false;
                    }
                } else if (!objJ2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object g(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f26268c) {
            z10 = true;
        }
        if (z10) {
            return this.f26267b[i10 << 1];
        }
        a.c("Expected index to be within 0..size()-1, but was " + i10);
        throw null;
    }

    public Object get(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.f26267b[(iD << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iD = d(obj);
        return iD >= 0 ? this.f26267b[(iD << 1) + 1] : obj2;
    }

    public final Object h(int i10) {
        if (!(i10 >= 0 && i10 < this.f26268c)) {
            a.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        Object[] objArr = this.f26267b;
        int i11 = i10 << 1;
        Object obj = objArr[i11 + 1];
        int i12 = this.f26268c;
        if (i12 <= 1) {
            clear();
            return obj;
        }
        int i13 = i12 - 1;
        int[] iArr = this.f26266a;
        if (iArr.length <= 8 || i12 >= iArr.length / 3) {
            if (i10 < i13) {
                int i14 = i10 + 1;
                N8.m.h0(i10, i14, i12, iArr, iArr);
                Object[] objArr2 = this.f26267b;
                N8.m.k0(objArr2, i11, objArr2, i14 << 1, i12 << 1);
            }
            Object[] objArr3 = this.f26267b;
            int i15 = i13 << 1;
            objArr3[i15] = null;
            objArr3[i15 + 1] = null;
        } else {
            int i16 = i12 > 8 ? i12 + (i12 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i16);
            m.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f26266a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f26267b, i16 << 1);
            m.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f26267b = objArrCopyOf;
            if (i12 != this.f26268c) {
                throw new ConcurrentModificationException();
            }
            if (i10 > 0) {
                N8.m.h0(0, 0, i10, iArr, this.f26266a);
                N8.m.k0(objArr, 0, this.f26267b, 0, i11);
            }
            if (i10 < i13) {
                int i17 = i10 + 1;
                N8.m.h0(i10, i17, i12, iArr, this.f26266a);
                N8.m.k0(objArr, i11, this.f26267b, i17 << 1, i12 << 1);
            }
        }
        if (i12 != this.f26268c) {
            throw new ConcurrentModificationException();
        }
        this.f26268c = i13;
        return obj;
    }

    public final int hashCode() {
        int[] iArr = this.f26266a;
        Object[] objArr = this.f26267b;
        int i10 = this.f26268c;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public final Object i(int i10, Object obj) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f26268c) {
            z10 = true;
        }
        if (!z10) {
            a.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f26267b;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    public final boolean isEmpty() {
        return this.f26268c <= 0;
    }

    public final Object j(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f26268c) {
            z10 = true;
        }
        if (z10) {
            return this.f26267b[(i10 << 1) + 1];
        }
        a.c("Expected index to be within 0..size()-1, but was " + i10);
        throw null;
    }

    public final Object put(Object obj, Object obj2) {
        int i10 = this.f26268c;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iC = obj != null ? c(iHashCode, obj) : e();
        if (iC >= 0) {
            int i11 = (iC << 1) + 1;
            Object[] objArr = this.f26267b;
            Object obj3 = objArr[i11];
            objArr[i11] = obj2;
            return obj3;
        }
        int i12 = ~iC;
        int[] iArr = this.f26266a;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            m.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f26266a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f26267b, i13 << 1);
            m.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f26267b = objArrCopyOf;
            if (i10 != this.f26268c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f26266a;
            int i14 = i12 + 1;
            N8.m.h0(i14, i12, i10, iArr2, iArr2);
            Object[] objArr2 = this.f26267b;
            N8.m.k0(objArr2, i14 << 1, objArr2, i12 << 1, this.f26268c << 1);
        }
        int i15 = this.f26268c;
        if (i10 == i15) {
            int[] iArr3 = this.f26266a;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.f26267b;
                int i16 = i12 << 1;
                objArr3[i16] = obj;
                objArr3[i16 + 1] = obj2;
                this.f26268c = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return h(iD);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD >= 0) {
            return i(iD, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f26268c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f26268c * 28);
        sb.append('{');
        int i10 = this.f26268c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            Object objG = g(i11);
            if (objG != sb) {
                sb.append(objG);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objJ = j(i11);
            if (objJ != sb) {
                sb.append(objJ);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        m.e(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0 || !m.b(obj2, j(iD))) {
            return false;
        }
        h(iD);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iD = d(obj);
        if (iD < 0 || !m.b(obj2, j(iD))) {
            return false;
        }
        i(iD, obj3);
        return true;
    }
}
