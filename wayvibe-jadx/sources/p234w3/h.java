package p234w3;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f27859b;

    public h(long j10, byte[] bArr) {
        this.f27858a = j10;
        this.f27859b = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f27858a, ((h) obj).f27858a);
    }
}
