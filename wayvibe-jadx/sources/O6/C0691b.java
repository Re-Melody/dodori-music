package O6;

/* JADX INFO: renamed from: O6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0691b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f9285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f9286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f9287c;

    public C0691b(long[] jArr, long[] jArr2, long[] jArr3) {
        this.f9285a = jArr;
        this.f9286b = jArr2;
        this.f9287c = jArr3;
    }

    public void a(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }
}
