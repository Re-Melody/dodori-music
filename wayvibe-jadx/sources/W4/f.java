package W4;

import com.revenuecat.purchases.common.networking.ETagPayloadStore;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class f implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12808e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12804a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12805b = ETagPayloadStore.CHUNK_CHARS;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12809f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a[] f12810g = new a[100];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a[] f12806c = new a[1];

    public final synchronized void a(int i10) {
        boolean z10 = i10 < this.f12807d;
        this.f12807d = i10;
        if (z10) {
            c();
        }
    }

    public final synchronized void b(a[] aVarArr) {
        try {
            int i10 = this.f12809f;
            int length = aVarArr.length + i10;
            a[] aVarArr2 = this.f12810g;
            if (length >= aVarArr2.length) {
                this.f12810g = (a[]) Arrays.copyOf(aVarArr2, Math.max(aVarArr2.length * 2, i10 + aVarArr.length));
            }
            for (a aVar : aVarArr) {
                byte[] bArr = aVar.f12790a;
                X4.a.k(bArr == null || bArr.length == this.f12805b);
                a[] aVarArr3 = this.f12810g;
                int i11 = this.f12809f;
                this.f12809f = i11 + 1;
                aVarArr3[i11] = aVar;
            }
            this.f12808e -= aVarArr.length;
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        int iMax = Math.max(0, X4.j.a(this.f12807d, this.f12805b) - this.f12808e);
        int i10 = this.f12809f;
        if (iMax >= i10) {
            return;
        }
        Arrays.fill(this.f12810g, iMax, i10, (Object) null);
        this.f12809f = iMax;
    }
}
