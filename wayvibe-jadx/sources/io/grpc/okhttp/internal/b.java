package io.grpc.okhttp.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String[] f21159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f21160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21161d;

    public b(boolean z10) {
        this.f21158a = z10;
    }

    public final void a(a... aVarArr) {
        if (!this.f21158a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        String[] strArr = new String[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            strArr[i10] = aVarArr[i10].javaName;
        }
        this.f21159b = strArr;
    }

    public final void b(m... mVarArr) {
        if (!this.f21158a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (mVarArr.length == 0) {
            throw new IllegalArgumentException("At least one TlsVersion is required");
        }
        String[] strArr = new String[mVarArr.length];
        for (int i10 = 0; i10 < mVarArr.length; i10++) {
            strArr[i10] = mVarArr[i10].javaName;
        }
        this.f21160c = strArr;
    }

    public b(c cVar) {
        this.f21158a = cVar.f21163a;
        this.f21159b = cVar.f21164b;
        this.f21160c = cVar.f21165c;
        this.f21161d = cVar.f21166d;
    }
}
