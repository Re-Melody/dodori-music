package A6;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Map, Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b0 f342g = new b0(null, new Object[0], 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Y f343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient Z f344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient a0 f345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object f346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f348f;

    public b0(Object obj, Object[] objArr, int i10) {
        this.f346d = obj;
        this.f347e = objArr;
        this.f348f = i10;
    }

    public static b0 a(Map map) {
        if ((map instanceof b0) && !(map instanceof SortedMap)) {
            b0 b0Var = (b0) map;
            b0Var.getClass();
            return b0Var;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        boolean z10 = setEntrySet instanceof Collection;
        G g3 = new G(z10 ? setEntrySet.size() : 4, 0);
        if (z10) {
            int size = setEntrySet.size() * 2;
            Object[] objArr = (Object[]) g3.f304b;
            if (size > objArr.length) {
                g3.f304b = Arrays.copyOf(objArr, AbstractC0099y.d(objArr.length, size));
            }
        }
        for (Map.Entry entry : setEntrySet) {
            g3.r(entry.getKey(), entry.getValue());
        }
        return g3.h();
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        a0 a0Var = this.f345c;
        if (a0Var == null) {
            a0Var = new a0(this.f347e, 1, this.f348f);
            this.f345c = a0Var;
        }
        return a0Var.contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return AbstractC0093s.d(obj, this);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final I entrySet() {
        Y y6 = this.f343a;
        if (y6 != null) {
            return y6;
        }
        Y y10 = new Y(this, this.f347e, this.f348f);
        this.f343a = y10;
        return y10;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.f347e;
            if (this.f348f == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.f346d;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iM = AbstractC0093s.m(obj.hashCode());
                    while (true) {
                        int i10 = iM & length;
                        int i11 = bArr[i10] & ForkServer.ERROR;
                        if (i11 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i11])) {
                            obj2 = objArr[i11 ^ 1];
                        } else {
                            iM = i10 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iM2 = AbstractC0093s.m(obj.hashCode());
                    while (true) {
                        int i12 = iM2 & length2;
                        int i13 = sArr[i12] & 65535;
                        if (i13 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[i13])) {
                            obj2 = objArr[i13 ^ 1];
                        } else {
                            iM2 = i12 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iM3 = AbstractC0093s.m(obj.hashCode());
                    while (true) {
                        int i14 = iM3 & length3;
                        int i15 = iArr[i14];
                        if (i15 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i15])) {
                            obj2 = objArr[i15 ^ 1];
                        } else {
                            iM3 = i14 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC0093s.i(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        Z z10 = this.f344b;
        if (z10 != null) {
            return z10;
        }
        Z z11 = new Z(this, new a0(this.f347e, 0, this.f348f));
        this.f344b = z11;
        return z11;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f348f;
    }

    public final String toString() {
        int i10 = this.f348f;
        AbstractC0093s.c(i10, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) i10) * 8, 1073741824L));
        sb.append('{');
        k0 it = ((Y) entrySet()).iterator();
        boolean z10 = true;
        while (true) {
            C c3 = (C) it;
            if (!c3.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            Map.Entry entry = (Map.Entry) c3.next();
            if (!z10) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z10 = false;
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        a0 a0Var = this.f345c;
        if (a0Var != null) {
            return a0Var;
        }
        a0 a0Var2 = new a0(this.f347e, 1, this.f348f);
        this.f345c = a0Var2;
        return a0Var2;
    }
}
