package p064f9;

import java.util.Iterator;
import p013a9.a;
import p046da.b;

/* JADX INFO: loaded from: classes2.dex */
public class e implements Iterable, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19894c;

    public e(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f19892a = i10;
        this.f19893b = b.E(i10, i11, i12);
        this.f19894c = i12;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (isEmpty() && ((e) obj).isEmpty()) {
            return true;
        }
        e eVar = (e) obj;
        return this.f19892a == eVar.f19892a && this.f19893b == eVar.f19893b && this.f19894c == eVar.f19894c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f19892a * 31) + this.f19893b) * 31) + this.f19894c;
    }

    public boolean isEmpty() {
        int i10 = this.f19894c;
        int i11 = this.f19893b;
        int i12 = this.f19892a;
        if (i10 > 0) {
            return i12 > i11;
        }
        return i12 < i11;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new f(this.f19892a, this.f19893b, this.f19894c);
    }

    public String toString() {
        StringBuilder sb;
        int i10 = this.f19893b;
        int i11 = this.f19892a;
        int i12 = this.f19894c;
        if (i12 > 0) {
            sb = new StringBuilder();
            sb.append(i11);
            sb.append("..");
            sb.append(i10);
            sb.append(" step ");
            sb.append(i12);
        } else {
            sb = new StringBuilder();
            sb.append(i11);
            sb.append(" downTo ");
            sb.append(i10);
            sb.append(" step ");
            sb.append(-i12);
        }
        return sb.toString();
    }
}
