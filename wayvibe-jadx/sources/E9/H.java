package E9;

/* JADX INFO: loaded from: classes2.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f3348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public H f3353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public H f3354g;

    public H() {
        this.f3348a = new byte[8192];
        this.f3352e = true;
        this.f3351d = false;
    }

    public final H a() {
        H h10 = this.f3353f;
        if (h10 == this) {
            h10 = null;
        }
        H h11 = this.f3354g;
        kotlin.jvm.internal.m.c(h11);
        h11.f3353f = this.f3353f;
        H h12 = this.f3353f;
        kotlin.jvm.internal.m.c(h12);
        h12.f3354g = this.f3354g;
        this.f3353f = null;
        this.f3354g = null;
        return h10;
    }

    public final void b(H segment) {
        kotlin.jvm.internal.m.f(segment, "segment");
        segment.f3354g = this;
        segment.f3353f = this.f3353f;
        H h10 = this.f3353f;
        kotlin.jvm.internal.m.c(h10);
        h10.f3354g = segment;
        this.f3353f = segment;
    }

    public final H c() {
        this.f3351d = true;
        return new H(this.f3348a, this.f3349b, this.f3350c, true, false);
    }

    public final void d(H sink, int i10) {
        kotlin.jvm.internal.m.f(sink, "sink");
        if (!sink.f3352e) {
            throw new IllegalStateException("only owner can write");
        }
        int i11 = sink.f3350c;
        int i12 = i11 + i10;
        byte[] bArr = sink.f3348a;
        if (i12 > 8192) {
            if (sink.f3351d) {
                throw new IllegalArgumentException();
            }
            int i13 = sink.f3349b;
            if (i12 - i13 > 8192) {
                throw new IllegalArgumentException();
            }
            N8.m.i0(0, bArr, i13, bArr, i11);
            sink.f3350c -= sink.f3349b;
            sink.f3349b = 0;
        }
        int i14 = sink.f3350c;
        int i15 = this.f3349b;
        N8.m.i0(i14, this.f3348a, i15, bArr, i15 + i10);
        sink.f3350c += i10;
        this.f3349b += i10;
    }

    public H(byte[] data, int i10, int i11, boolean z10, boolean z11) {
        kotlin.jvm.internal.m.f(data, "data");
        this.f3348a = data;
        this.f3349b = i10;
        this.f3350c = i11;
        this.f3351d = z10;
        this.f3352e = z11;
    }
}
