package S0;

import T0.C0811n;
import T0.C0812o;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f11013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f11014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11015c;

    public final Object a(Object obj) {
        int iC = obj == null ? c() : b(obj.hashCode(), obj);
        if (iC >= 0) {
            return this.f11014b[(iC << 1) + 1];
        }
        return null;
    }

    public final int b(int i10, Object obj) {
        int i11 = this.f11015c;
        if (i11 == 0) {
            return -1;
        }
        int iA = a.a(this.f11013a, i11, i10);
        if (iA < 0 || m.b(obj, this.f11014b[iA << 1])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f11013a[i12] == i10) {
            if (m.b(obj, this.f11014b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f11013a[i13] == i10; i13--) {
            if (m.b(obj, this.f11014b[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public final int c() {
        int i10 = this.f11015c;
        if (i10 == 0) {
            return -1;
        }
        int iA = a.a(this.f11013a, i10, 0);
        if (iA < 0 || this.f11014b[iA << 1] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f11013a[i11] == 0) {
            if (this.f11014b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f11013a[i12] == 0; i12--) {
            if (this.f11014b[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final Object d(C0812o c0812o, C0811n c0811n) {
        int iHashCode;
        int iB;
        int i10 = this.f11015c;
        if (c0812o == null) {
            iB = c();
            iHashCode = 0;
        } else {
            iHashCode = c0812o.hashCode();
            iB = b(iHashCode, c0812o);
        }
        if (iB >= 0) {
            int i11 = (iB << 1) + 1;
            Object[] objArr = this.f11014b;
            Object obj = objArr[i11];
            objArr[i11] = c0811n;
            return obj;
        }
        int i12 = ~iB;
        int[] iArr = this.f11013a;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            m.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f11013a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f11014b, i13 << 1);
            m.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f11014b = objArrCopyOf;
            if (i10 != this.f11015c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f11013a;
            int i14 = i12 + 1;
            N8.m.h0(i14, i12, i10, iArr2, iArr2);
            Object[] objArr2 = this.f11014b;
            N8.m.k0(objArr2, i14 << 1, objArr2, i12 << 1, this.f11015c << 1);
        }
        int i15 = this.f11015c;
        if (i10 == i15) {
            int[] iArr3 = this.f11013a;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.f11014b;
                int i16 = i12 << 1;
                objArr3[i16] = c0812o;
                objArr3[i16 + 1] = c0811n;
                this.f11015c = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof c) {
                c cVar = (c) obj;
                int i11 = this.f11015c;
                if (i11 == cVar.f11015c) {
                    for (int i12 = 0; i12 < i11; i12++) {
                        Object[] objArr = this.f11014b;
                        int i13 = i12 << 1;
                        Object obj2 = objArr[i13];
                        Object obj3 = objArr[i13 + 1];
                        Object objA = cVar.a(obj2);
                        if (obj3 == null) {
                            if (objA == null) {
                                if ((obj2 == null ? cVar.c() : cVar.b(obj2.hashCode(), obj2)) >= 0) {
                                }
                            }
                        } else if (obj3.equals(objA)) {
                        }
                    }
                    return true;
                }
            } else if ((obj instanceof Map) && this.f11015c == ((Map) obj).size()) {
                int i14 = this.f11015c;
                for (0; i10 < i14; i10 + 1) {
                    Object[] objArr2 = this.f11014b;
                    int i15 = i10 << 1;
                    Object obj4 = objArr2[i15];
                    Object obj5 = objArr2[i15 + 1];
                    Object obj6 = ((Map) obj).get(obj4);
                    if (obj5 == null) {
                        i10 = (obj6 == null && ((Map) obj).containsKey(obj4)) ? i10 + 1 : 0;
                    } else if (obj5.equals(obj6)) {
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f11013a;
        Object[] objArr = this.f11014b;
        int i10 = this.f11015c;
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

    public final String toString() {
        int i10 = this.f11015c;
        if (i10 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i10 * 28);
        sb.append('{');
        int i11 = this.f11015c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb.append(", ");
            }
            int i13 = i12 << 1;
            Object obj = this.f11014b[i13];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object obj2 = this.f11014b[i13 + 1];
            if (obj2 != this) {
                sb.append(obj2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
