package p255y2;

import B2.AbstractC0111a;
import B2.C;
import android.util.SparseBooleanArray;

/* JADX INFO: renamed from: y2.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2337m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f28898a;

    public C2337m(SparseBooleanArray sparseBooleanArray) {
        this.f28898a = sparseBooleanArray;
    }

    public final int a(int i10) {
        SparseBooleanArray sparseBooleanArray = this.f28898a;
        AbstractC0111a.f(i10, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2337m)) {
            return false;
        }
        C2337m c2337m = (C2337m) obj;
        int i10 = C.f560a;
        SparseBooleanArray sparseBooleanArray = this.f28898a;
        if (i10 >= 24) {
            return sparseBooleanArray.equals(c2337m.f28898a);
        }
        if (sparseBooleanArray.size() != c2337m.f28898a.size()) {
            return false;
        }
        for (int i11 = 0; i11 < sparseBooleanArray.size(); i11++) {
            if (a(i11) != c2337m.a(i11)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i10 = C.f560a;
        SparseBooleanArray sparseBooleanArray = this.f28898a;
        if (i10 >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i11 = 0; i11 < sparseBooleanArray.size(); i11++) {
            size = (size * 31) + a(i11);
        }
        return size;
    }
}
