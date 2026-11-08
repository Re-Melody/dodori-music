package G7;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class m extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final F9.n f5674i = new F9.n(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator f5675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f5677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f5680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k f5681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k f5682h;

    public m(boolean z10) {
        F9.n nVar = f5674i;
        this.f5678d = 0;
        this.f5679e = 0;
        this.f5675a = nVar;
        this.f5676b = z10;
        this.f5680f = new l(z10);
    }

    public final l a(Object obj, boolean z10) {
        int iCompareTo;
        l lVar;
        l lVar2 = this.f5677c;
        F9.n nVar = f5674i;
        Comparator comparator = this.f5675a;
        if (lVar2 != null) {
            Comparable comparable = comparator == nVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = lVar2.f5670f;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return lVar2;
                }
                l lVar3 = iCompareTo < 0 ? lVar2.f5666b : lVar2.f5667c;
                if (lVar3 == null) {
                    break;
                }
                lVar2 = lVar3;
            }
        } else {
            iCompareTo = 0;
        }
        l lVar4 = lVar2;
        if (!z10) {
            return null;
        }
        l lVar5 = this.f5680f;
        if (lVar4 != null) {
            lVar = new l(this.f5676b, lVar4, obj, lVar5, lVar5.f5669e);
            if (iCompareTo < 0) {
                lVar4.f5666b = lVar;
            } else {
                lVar4.f5667c = lVar;
            }
            b(lVar4, true);
        } else {
            if (comparator == nVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            lVar = new l(this.f5676b, lVar4, obj, lVar5, lVar5.f5669e);
            this.f5677c = lVar;
        }
        this.f5678d++;
        this.f5679e++;
        return lVar;
    }

    public final void b(l lVar, boolean z10) {
        while (lVar != null) {
            l lVar2 = lVar.f5666b;
            l lVar3 = lVar.f5667c;
            int i10 = lVar2 != null ? lVar2.f5673i : 0;
            int i11 = lVar3 != null ? lVar3.f5673i : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                l lVar4 = lVar3.f5666b;
                l lVar5 = lVar3.f5667c;
                int i13 = (lVar4 != null ? lVar4.f5673i : 0) - (lVar5 != null ? lVar5.f5673i : 0);
                if (i13 == -1 || (i13 == 0 && !z10)) {
                    g(lVar);
                } else {
                    h(lVar3);
                    g(lVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                l lVar6 = lVar2.f5666b;
                l lVar7 = lVar2.f5667c;
                int i14 = (lVar6 != null ? lVar6.f5673i : 0) - (lVar7 != null ? lVar7.f5673i : 0);
                if (i14 == 1 || (i14 == 0 && !z10)) {
                    h(lVar);
                } else {
                    g(lVar2);
                    h(lVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                lVar.f5673i = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                lVar.f5673i = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            lVar = lVar.f5665a;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f5677c = null;
        this.f5678d = 0;
        this.f5679e++;
        l lVar = this.f5680f;
        lVar.f5669e = lVar;
        lVar.f5668d = lVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        l lVarA = null;
        if (obj != null) {
            try {
                lVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return lVarA != null;
    }

    public final void d(l lVar, boolean z10) {
        l lVar2;
        l lVar3;
        int i10;
        if (z10) {
            l lVar4 = lVar.f5669e;
            lVar4.f5668d = lVar.f5668d;
            lVar.f5668d.f5669e = lVar4;
        }
        l lVar5 = lVar.f5666b;
        l lVar6 = lVar.f5667c;
        l lVar7 = lVar.f5665a;
        int i11 = 0;
        if (lVar5 == null || lVar6 == null) {
            if (lVar5 != null) {
                e(lVar, lVar5);
                lVar.f5666b = null;
            } else if (lVar6 != null) {
                e(lVar, lVar6);
                lVar.f5667c = null;
            } else {
                e(lVar, null);
            }
            b(lVar7, false);
            this.f5678d--;
            this.f5679e++;
            return;
        }
        if (lVar5.f5673i > lVar6.f5673i) {
            l lVar8 = lVar5.f5667c;
            while (true) {
                l lVar9 = lVar8;
                lVar3 = lVar5;
                lVar5 = lVar9;
                if (lVar5 == null) {
                    break;
                } else {
                    lVar8 = lVar5.f5667c;
                }
            }
        } else {
            l lVar10 = lVar6.f5666b;
            while (true) {
                lVar2 = lVar6;
                lVar6 = lVar10;
                if (lVar6 == null) {
                    break;
                } else {
                    lVar10 = lVar6.f5666b;
                }
            }
            lVar3 = lVar2;
        }
        d(lVar3, false);
        l lVar11 = lVar.f5666b;
        if (lVar11 != null) {
            i10 = lVar11.f5673i;
            lVar3.f5666b = lVar11;
            lVar11.f5665a = lVar3;
            lVar.f5666b = null;
        } else {
            i10 = 0;
        }
        l lVar12 = lVar.f5667c;
        if (lVar12 != null) {
            i11 = lVar12.f5673i;
            lVar3.f5667c = lVar12;
            lVar12.f5665a = lVar3;
            lVar.f5667c = null;
        }
        lVar3.f5673i = Math.max(i10, i11) + 1;
        e(lVar, lVar3);
    }

    public final void e(l lVar, l lVar2) {
        l lVar3 = lVar.f5665a;
        lVar.f5665a = null;
        if (lVar2 != null) {
            lVar2.f5665a = lVar3;
        }
        if (lVar3 == null) {
            this.f5677c = lVar2;
        } else if (lVar3.f5666b == lVar) {
            lVar3.f5666b = lVar2;
        } else {
            lVar3.f5667c = lVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        k kVar = this.f5681g;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this, 0);
        this.f5681g = kVar2;
        return kVar2;
    }

    public final void g(l lVar) {
        l lVar2 = lVar.f5666b;
        l lVar3 = lVar.f5667c;
        l lVar4 = lVar3.f5666b;
        l lVar5 = lVar3.f5667c;
        lVar.f5667c = lVar4;
        if (lVar4 != null) {
            lVar4.f5665a = lVar;
        }
        e(lVar, lVar3);
        lVar3.f5666b = lVar;
        lVar.f5665a = lVar3;
        int iMax = Math.max(lVar2 != null ? lVar2.f5673i : 0, lVar4 != null ? lVar4.f5673i : 0) + 1;
        lVar.f5673i = iMax;
        lVar3.f5673i = Math.max(iMax, lVar5 != null ? lVar5.f5673i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        l lVarA;
        if (obj != null) {
            try {
                lVarA = a(obj, false);
            } catch (ClassCastException unused) {
                lVarA = null;
            }
        } else {
            lVarA = null;
        }
        if (lVarA != null) {
            return lVarA.f5672h;
        }
        return null;
    }

    public final void h(l lVar) {
        l lVar2 = lVar.f5666b;
        l lVar3 = lVar.f5667c;
        l lVar4 = lVar2.f5666b;
        l lVar5 = lVar2.f5667c;
        lVar.f5666b = lVar5;
        if (lVar5 != null) {
            lVar5.f5665a = lVar;
        }
        e(lVar, lVar2);
        lVar2.f5667c = lVar;
        lVar.f5665a = lVar2;
        int iMax = Math.max(lVar3 != null ? lVar3.f5673i : 0, lVar5 != null ? lVar5.f5673i : 0) + 1;
        lVar.f5673i = iMax;
        lVar2.f5673i = Math.max(iMax, lVar4 != null ? lVar4.f5673i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        k kVar = this.f5682h;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this, 1);
        this.f5682h = kVar2;
        return kVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f5676b) {
            throw new NullPointerException("value == null");
        }
        l lVarA = a(obj, true);
        Object obj3 = lVarA.f5672h;
        lVarA.f5672h = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        l lVarA;
        if (obj != null) {
            try {
                lVarA = a(obj, false);
            } catch (ClassCastException unused) {
                lVarA = null;
            }
        } else {
            lVarA = null;
        }
        if (lVarA != null) {
            d(lVarA, true);
        }
        if (lVarA != null) {
            return lVarA.f5672h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f5678d;
    }
}
