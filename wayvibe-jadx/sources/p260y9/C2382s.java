package p260y9;

import A9.m;
import p240w9.g;

/* JADX INFO: renamed from: y9.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2382s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long[] f29323e = new long[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f29324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f29325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f29326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f29327d;

    public C2382s(g descriptor, m mVar) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        this.f29324a = descriptor;
        this.f29325b = mVar;
        int iF = descriptor.f();
        if (iF <= 64) {
            this.f29326c = iF != 64 ? (-1) << iF : 0L;
            this.f29327d = f29323e;
            return;
        }
        this.f29326c = 0L;
        int i10 = (iF - 1) >>> 6;
        long[] jArr = new long[i10];
        if ((iF & 63) != 0) {
            jArr[i10 - 1] = (-1) << iF;
        }
        this.f29327d = jArr;
    }
}
