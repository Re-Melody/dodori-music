package A6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class I extends AbstractC0100z implements Set {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f307c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient E f308b;

    public static int p(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            p229v9.a.g("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static I q(int i10, Object... objArr) {
        if (i10 == 0) {
            return c0.f355j;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new i0(obj);
        }
        int iP = p(i10);
        Object[] objArr2 = new Object[iP];
        int i11 = iP - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            if (obj2 == null) {
                throw new NullPointerException(p134m1.b.j(i14, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iM = AbstractC0093s.m(iHashCode);
            while (true) {
                int i15 = iM & i11;
                Object obj3 = objArr2[i15];
                if (obj3 == null) {
                    objArr[i13] = obj2;
                    objArr2[i15] = obj2;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iM++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new i0(obj4);
        }
        if (p(i13) < iP / 2) {
            return q(i13, objArr);
        }
        int length = objArr.length;
        if (i13 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new c0(objArr, i12, objArr2, i11, i13);
    }

    public static I r(Collection collection) {
        if ((collection instanceof I) && !(collection instanceof SortedSet)) {
            I i10 = (I) collection;
            if (!i10.o()) {
                return i10;
            }
        }
        Object[] array = collection.toArray();
        return q(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof I) && (this instanceof c0)) {
            I i10 = (I) obj;
            i10.getClass();
            if ((i10 instanceof c0) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return AbstractC0093s.e(this, obj);
    }

    @Override // A6.AbstractC0100z
    public E f() {
        E e2 = this.f308b;
        if (e2 != null) {
            return e2;
        }
        E eS = s();
        this.f308b = eS;
        return eS;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC0093s.i(this);
    }

    public E s() {
        Object[] array = toArray(AbstractC0100z.f407a);
        C c3 = E.f299b;
        return E.p(array.length, array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public abstract k0 iterator();
}
