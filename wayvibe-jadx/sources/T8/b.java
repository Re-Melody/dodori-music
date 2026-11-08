package T8;

import B2.AbstractC0112b;
import N8.e;
import java.io.Serializable;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends e implements a, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Enum[] f11688a;

    public b(Enum[] entries) {
        m.f(entries, "entries");
        this.f11688a = entries;
    }

    @Override // N8.AbstractC0644a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum element = (Enum) obj;
        m.f(element, "element");
        return ((Enum) N8.m.u0(element.ordinal(), this.f11688a)) == element;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Enum[] enumArr = this.f11688a;
        int length = enumArr.length;
        if (i10 < 0 || i10 >= length) {
            throw new IndexOutOfBoundsException(AbstractC0112b.e("index: ", i10, length, ", size: "));
        }
        return enumArr[i10];
    }

    @Override // N8.e, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        m.f(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) N8.m.u0(iOrdinal, this.f11688a)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // N8.AbstractC0644a
    public final int k() {
        return this.f11688a.length;
    }

    @Override // N8.e, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        m.f(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) N8.m.u0(iOrdinal, this.f11688a)) == element) {
            return iOrdinal;
        }
        return -1;
    }
}
