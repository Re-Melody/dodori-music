package V2;

import B2.C;
import com.revenuecat.purchases.common.networking.ETagPayloadStore;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12487d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12484a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12485b = ETagPayloadStore.CHUNK_CHARS;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12488e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a[] f12489f = new a[100];

    public final synchronized void a(int i10) {
        boolean z10 = i10 < this.f12486c;
        this.f12486c = i10;
        if (z10) {
            b();
        }
    }

    public final synchronized void b() {
        int iMax = Math.max(0, C.g(this.f12486c, this.f12485b) - this.f12487d);
        int i10 = this.f12488e;
        if (iMax >= i10) {
            return;
        }
        Arrays.fill(this.f12489f, iMax, i10, (Object) null);
        this.f12488e = iMax;
    }
}
