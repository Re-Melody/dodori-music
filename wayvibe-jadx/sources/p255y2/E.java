package p255y2;

import B2.C;
import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class E extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f28759b;

    static {
        b.y(0, 1, 2, 3, 4);
        C.D(5);
    }

    public E(String str, Throwable th, int i10, long j10) {
        super(str, th);
        this.f28758a = i10;
        this.f28759b = j10;
    }
}
