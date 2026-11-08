package A6;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: A6.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0098x extends V implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator[] f403a;

    public C0098x(r rVar, r rVar2) {
        this.f403a = new Comparator[]{rVar, rVar2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f403a;
            if (i10 >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i10].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i10++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0098x) {
            return Arrays.equals(this.f403a, ((C0098x) obj).f403a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f403a);
    }

    public final String toString() {
        return p134m1.b.m(new StringBuilder("Ordering.compound("), Arrays.toString(this.f403a), ")");
    }
}
