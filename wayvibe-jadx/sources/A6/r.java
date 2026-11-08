package A6;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class r extends V implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p267z6.i f396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V f397b;

    public r(p267z6.i iVar, V v3) {
        iVar.getClass();
        this.f396a = iVar;
        this.f397b = v3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        p267z6.i iVar = this.f396a;
        return this.f397b.compare(iVar.apply(obj), iVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f396a.equals(rVar.f396a) && this.f397b.equals(rVar.f397b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f396a, this.f397b});
    }

    public final String toString() {
        return this.f397b + ".onResultOf(" + this.f396a + ")";
    }
}
