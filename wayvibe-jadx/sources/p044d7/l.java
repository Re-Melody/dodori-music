package p044d7;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19311b;

    public l(int i10) {
        int i11 = i10 + 1;
        int iFloor = (int) Math.floor(Math.log(i11) / Math.log(2.0d));
        this.f19311b = iFloor;
        this.f19310a = (((long) Math.pow(2.0d, iFloor)) - 1) & ((long) i11);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new a(this);
    }
}
