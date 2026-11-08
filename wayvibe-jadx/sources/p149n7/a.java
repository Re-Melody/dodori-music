package p149n7;

import java.util.Arrays;
import p170p7.h;
import p207t7.u;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f22966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f22967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f22968d;

    public a(int i10, h hVar, byte[] bArr, byte[] bArr2) {
        this.f22965a = i10;
        if (hVar == null) {
            throw new NullPointerException("Null documentKey");
        }
        this.f22966b = hVar;
        if (bArr == null) {
            throw new NullPointerException("Null arrayValue");
        }
        this.f22967c = bArr;
        if (bArr2 == null) {
            throw new NullPointerException("Null directionalValue");
        }
        this.f22968d = bArr2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a aVar = (a) obj;
        int iCompare = Integer.compare(this.f22965a, aVar.f22965a);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompareTo = this.f22966b.compareTo(aVar.f22966b);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iB = u.b(this.f22967c, aVar.f22967c);
        return iB != 0 ? iB : u.b(this.f22968d, aVar.f22968d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f22965a == aVar.f22965a && this.f22966b.equals(aVar.f22966b) && Arrays.equals(this.f22967c, aVar.f22967c) && Arrays.equals(this.f22968d, aVar.f22968d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f22965a ^ 1000003) * 1000003) ^ this.f22966b.f25264a.hashCode()) * 1000003) ^ Arrays.hashCode(this.f22967c)) * 1000003) ^ Arrays.hashCode(this.f22968d);
    }

    public final String toString() {
        return "IndexEntry{indexId=" + this.f22965a + ", documentKey=" + this.f22966b + ", arrayValue=" + Arrays.toString(this.f22967c) + ", directionalValue=" + Arrays.toString(this.f22968d) + "}";
    }
}
