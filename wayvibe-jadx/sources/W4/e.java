package W4;

import B2.AbstractC0112b;
import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f12798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f12802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f12803f;

    public e(Uri uri, int i10) {
        this(uri, 0L, 0L, -1L, null, i10);
    }

    public final e a(long j10) {
        long j11 = this.f12801d;
        long j12 = j11 != -1 ? j11 - j10 : -1L;
        if (j10 == 0 && j11 == j12) {
            return this;
        }
        return new e(this.f12798a, this.f12799b + j10, this.f12800c + j10, j12, this.f12802e, this.f12803f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(this.f12798a);
        sb.append(", ");
        sb.append(Arrays.toString((byte[]) null));
        sb.append(", ");
        sb.append(this.f12799b);
        sb.append(", ");
        sb.append(this.f12800c);
        sb.append(", ");
        sb.append(this.f12801d);
        sb.append(", ");
        sb.append(this.f12802e);
        sb.append(", ");
        return AbstractC0112b.i(sb, this.f12803f, "]");
    }

    public e(Uri uri, long j10, long j11) {
        this(uri, j10, j10, j11, null, 0);
    }

    public e(Uri uri, long j10, long j11, long j12, String str, int i10) {
        X4.a.k(j10 >= 0);
        X4.a.k(j11 >= 0);
        X4.a.k(j12 > 0 || j12 == -1);
        this.f12798a = uri;
        this.f12799b = j10;
        this.f12800c = j11;
        this.f12801d = j12;
        this.f12802e = str;
        this.f12803f = i10;
    }
}
