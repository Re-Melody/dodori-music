package O8;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Map, Serializable, p013a9.e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final e f9347n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f9348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f9349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f9350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f9351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9355h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9356i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f f9357j;
    public g k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f9358l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f9359m;

    static {
        e eVar = new e(0);
        eVar.f9359m = true;
        f9347n = eVar;
    }

    public e(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i10];
        int[] iArr = new int[i10];
        int iHighestOneBit = Integer.highestOneBit((i10 < 1 ? 1 : i10) * 3);
        this.f9348a = objArr;
        this.f9349b = null;
        this.f9350c = iArr;
        this.f9351d = new int[iHighestOneBit];
        this.f9352e = 2;
        this.f9353f = 0;
        this.f9354g = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    public final int a(Object obj) {
        g();
        while (true) {
            int iO = o(obj);
            int i10 = this.f9352e * 2;
            int length = this.f9351d.length / 2;
            if (i10 > length) {
                i10 = length;
            }
            int i11 = 0;
            while (true) {
                int[] iArr = this.f9351d;
                int i12 = iArr[iO];
                if (i12 <= 0) {
                    int i13 = this.f9353f;
                    Object[] objArr = this.f9348a;
                    if (i13 >= objArr.length) {
                        k(1);
                        break;
                    }
                    int i14 = i13 + 1;
                    this.f9353f = i14;
                    objArr[i13] = obj;
                    this.f9350c[i13] = iO;
                    iArr[iO] = i14;
                    this.f9356i++;
                    this.f9355h++;
                    if (i11 > this.f9352e) {
                        this.f9352e = i11;
                    }
                    return i13;
                }
                if (m.b(this.f9348a[i12 - 1], obj)) {
                    return -i12;
                }
                i11++;
                if (i11 > i10) {
                    p(this.f9351d.length * 2);
                    break;
                }
                iO = iO == 0 ? this.f9351d.length - 1 : iO - 1;
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        g();
        int i10 = this.f9353f - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.f9350c;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.f9351d[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        p206t6.b.Y(this.f9348a, 0, this.f9353f);
        Object[] objArr = this.f9349b;
        if (objArr != null) {
            p206t6.b.Y(objArr, 0, this.f9353f);
        }
        this.f9356i = 0;
        this.f9353f = 0;
        this.f9355h++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return l(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return n(obj) >= 0;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        f fVar = this.f9358l;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this, 0);
        this.f9358l = fVar2;
        return fVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.f9356i == map.size() && i(map.entrySet());
    }

    public final void g() {
        if (this.f9359m) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iL = l(obj);
        if (iL < 0) {
            return null;
        }
        Object[] objArr = this.f9349b;
        m.c(objArr);
        return objArr[iL];
    }

    public final void h(boolean z10) {
        int i10;
        Object[] objArr = this.f9349b;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f9353f;
            if (i11 >= i10) {
                break;
            }
            int[] iArr = this.f9350c;
            int i13 = iArr[i11];
            if (i13 >= 0) {
                Object[] objArr2 = this.f9348a;
                objArr2[i12] = objArr2[i11];
                if (objArr != null) {
                    objArr[i12] = objArr[i11];
                }
                if (z10) {
                    iArr[i12] = i13;
                    this.f9351d[i13] = i12 + 1;
                }
                i12++;
            }
            i11++;
        }
        p206t6.b.Y(this.f9348a, i12, i10);
        if (objArr != null) {
            p206t6.b.Y(objArr, i12, this.f9353f);
        }
        this.f9353f = i12;
    }

    @Override // java.util.Map
    public final int hashCode() {
        c cVar = new c(this, 0);
        int i10 = 0;
        while (cVar.hasNext()) {
            int i11 = cVar.f7240a;
            e eVar = (e) cVar.f7243d;
            if (i11 >= eVar.f9353f) {
                throw new NoSuchElementException();
            }
            cVar.f7240a = i11 + 1;
            cVar.f7241b = i11;
            Object obj = eVar.f9348a[i11];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = eVar.f9349b;
            m.c(objArr);
            Object obj2 = objArr[cVar.f7241b];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            cVar.e();
            i10 += iHashCode ^ iHashCode2;
        }
        return i10;
    }

    public final boolean i(Collection m8) {
        m.f(m8, "m");
        for (Object obj : m8) {
            if (obj != null) {
                try {
                    if (!j((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f9356i == 0;
    }

    public final boolean j(Map.Entry entry) {
        m.f(entry, "entry");
        int iL = l(entry.getKey());
        if (iL < 0) {
            return false;
        }
        Object[] objArr = this.f9349b;
        m.c(objArr);
        return m.b(objArr[iL], entry.getValue());
    }

    public final void k(int i10) {
        Object[] objArrCopyOf;
        Object[] objArr = this.f9348a;
        int length = objArr.length;
        int i11 = this.f9353f;
        int i12 = length - i11;
        int i13 = i11 - this.f9356i;
        if (i12 < i10 && i12 + i13 >= i10 && i13 >= objArr.length / 4) {
            h(true);
            return;
        }
        int i14 = i11 + i10;
        if (i14 < 0) {
            throw new OutOfMemoryError();
        }
        if (i14 > objArr.length) {
            int length2 = objArr.length;
            int i15 = length2 + (length2 >> 1);
            if (i15 - i14 < 0) {
                i15 = i14;
            }
            if (i15 - 2147483639 > 0) {
                i15 = i14 > 2147483639 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : 2147483639;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i15);
            m.e(objArrCopyOf2, "copyOf(...)");
            this.f9348a = objArrCopyOf2;
            Object[] objArr2 = this.f9349b;
            if (objArr2 != null) {
                objArrCopyOf = Arrays.copyOf(objArr2, i15);
                m.e(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.f9349b = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.f9350c, i15);
            m.e(iArrCopyOf, "copyOf(...)");
            this.f9350c = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((i15 >= 1 ? i15 : 1) * 3);
            if (iHighestOneBit > this.f9351d.length) {
                p(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        f fVar = this.f9357j;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this, 1);
        this.f9357j = fVar2;
        return fVar2;
    }

    public final int l(Object obj) {
        int iO = o(obj);
        int i10 = this.f9352e;
        while (true) {
            int i11 = this.f9351d[iO];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (m.b(this.f9348a[i12], obj)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            iO = iO == 0 ? this.f9351d.length - 1 : iO - 1;
        }
    }

    public final int n(Object obj) {
        int i10 = this.f9353f;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f9350c[i10] >= 0) {
                Object[] objArr = this.f9349b;
                m.c(objArr);
                if (m.b(objArr[i10], obj)) {
                    return i10;
                }
            }
        }
    }

    public final int o(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f9354g;
    }

    public final void p(int i10) {
        int[] iArr;
        this.f9355h++;
        int i11 = 0;
        if (this.f9353f > this.f9356i) {
            h(false);
        }
        this.f9351d = new int[i10];
        this.f9354g = Integer.numberOfLeadingZeros(i10) + 1;
        while (i11 < this.f9353f) {
            int i12 = i11 + 1;
            int iO = o(this.f9348a[i11]);
            int i13 = this.f9352e;
            while (true) {
                iArr = this.f9351d;
                if (iArr[iO] == 0) {
                    break;
                }
                i13--;
                if (i13 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                iO = iO == 0 ? iArr.length - 1 : iO - 1;
            }
            iArr[iO] = i12;
            this.f9350c[i11] = iO;
            i11 = i12;
        }
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        g();
        int iA = a(obj);
        Object[] objArr = this.f9349b;
        if (objArr == null) {
            int length = this.f9348a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f9349b = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i10 = (-iA) - 1;
        Object obj3 = objArr[i10];
        objArr[i10] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        m.f(from, "from");
        g();
        Set<Map.Entry> setEntrySet = from.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        k(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.f9349b;
            if (objArr == null) {
                int length = this.f9348a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f9349b = objArr;
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i10 = (-iA) - 1;
                if (!m.b(entry.getValue(), objArr[i10])) {
                    objArr[i10] = entry.getValue();
                }
            }
        }
    }

    public final void q(int i10) {
        Object[] objArr = this.f9348a;
        m.f(objArr, "<this>");
        objArr[i10] = null;
        Object[] objArr2 = this.f9349b;
        if (objArr2 != null) {
            objArr2[i10] = null;
        }
        int length = this.f9350c[i10];
        int i11 = this.f9352e * 2;
        int length2 = this.f9351d.length / 2;
        if (i11 > length2) {
            i11 = length2;
        }
        int i12 = i11;
        int i13 = 0;
        int i14 = length;
        do {
            length = length == 0 ? this.f9351d.length - 1 : length - 1;
            i13++;
            if (i13 > this.f9352e) {
                this.f9351d[i14] = 0;
            } else {
                int[] iArr = this.f9351d;
                int i15 = iArr[length];
                if (i15 == 0) {
                    iArr[i14] = 0;
                } else {
                    if (i15 < 0) {
                        iArr[i14] = -1;
                    } else {
                        int i16 = i15 - 1;
                        int iO = o(this.f9348a[i16]) - length;
                        int[] iArr2 = this.f9351d;
                        if ((iO & (iArr2.length - 1)) >= i13) {
                            iArr2[i14] = i15;
                            this.f9350c[i16] = i14;
                        }
                        i12--;
                    }
                    i14 = length;
                    i13 = 0;
                    i12--;
                }
            }
            this.f9350c[i10] = -1;
            this.f9356i--;
            this.f9355h++;
        } while (i12 >= 0);
        this.f9351d[i14] = -1;
        this.f9350c[i10] = -1;
        this.f9356i--;
        this.f9355h++;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        g();
        int iL = l(obj);
        if (iL < 0) {
            return null;
        }
        Object[] objArr = this.f9349b;
        m.c(objArr);
        Object obj2 = objArr[iL];
        q(iL);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f9356i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f9356i * 3) + 2);
        sb.append("{");
        c cVar = new c(this, 0);
        int i10 = 0;
        while (cVar.hasNext()) {
            if (i10 > 0) {
                sb.append(", ");
            }
            int i11 = cVar.f7240a;
            e eVar = (e) cVar.f7243d;
            if (i11 >= eVar.f9353f) {
                throw new NoSuchElementException();
            }
            cVar.f7240a = i11 + 1;
            cVar.f7241b = i11;
            Object obj = eVar.f9348a[i11];
            if (obj == eVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = eVar.f9349b;
            m.c(objArr);
            Object obj2 = objArr[cVar.f7241b];
            if (obj2 == eVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            cVar.e();
            i10++;
        }
        sb.append("}");
        String string = sb.toString();
        m.e(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        g gVar = this.k;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this, 0);
        this.k = gVar2;
        return gVar2;
    }
}
