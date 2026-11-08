package p064f9;

import java.util.Iterator;
import p013a9.a;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements Iterable, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f19906c;

    public i(long j10, long j11) {
        this.f19904a = j10;
        if (j10 < j11) {
            long j12 = j11 % 1;
            long j13 = j10 % 1;
            long j14 = ((j12 < 0 ? j12 + 1 : j12) - (j13 < 0 ? j13 + 1 : j13)) % 1;
            j11 -= j14 < 0 ? j14 + 1 : j14;
        }
        this.f19905b = j11;
        this.f19906c = 1L;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (isEmpty() && ((i) obj).isEmpty()) {
            return true;
        }
        i iVar = (i) obj;
        if (this.f19904a == iVar.f19904a) {
            return this.f19905b == iVar.f19905b;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j10 = this.f19904a;
        long j11 = ((long) 31) * (j10 ^ (j10 >>> 32));
        long j12 = this.f19905b;
        return (int) (j11 + (j12 ^ (j12 >>> 32)));
    }

    public final boolean isEmpty() {
        return this.f19904a > this.f19905b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new h(this.f19904a, this.f19905b, this.f19906c);
    }

    public final String toString() {
        return this.f19904a + ".." + this.f19905b;
    }
}
