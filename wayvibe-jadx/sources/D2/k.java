package D2;

import B2.AbstractC0111a;
import B2.AbstractC0112b;
import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
import p255y2.AbstractC2347x;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f1864i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f1865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f1867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f1868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f1869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f1870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f1871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1872h;

    static {
        AbstractC2347x.a("media3.datasource");
    }

    public k(Uri uri, int i10, byte[] bArr, Map map, long j10, long j11, String str, int i11) {
        AbstractC0111a.d(j10 >= 0);
        AbstractC0111a.d(j10 >= 0);
        AbstractC0111a.d(j11 > 0 || j11 == -1);
        uri.getClass();
        this.f1865a = uri;
        this.f1866b = i10;
        this.f1867c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f1868d = Collections.unmodifiableMap(new HashMap(map));
        this.f1869e = j10;
        this.f1870f = j11;
        this.f1871g = str;
        this.f1872h = i11;
    }

    public final k a(long j10) {
        long j11 = this.f1870f;
        long j12 = j11 != -1 ? j11 - j10 : -1L;
        if (j10 == 0 && j11 == j12) {
            return this;
        }
        return new k(this.f1865a, this.f1866b, this.f1867c, this.f1868d, this.f1869e + j10, j12, this.f1871g, this.f1872h);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i10 = this.f1866b;
        if (i10 == 1) {
            str = "GET";
        } else if (i10 == 2) {
            str = "POST";
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        sb.append(str);
        sb.append(StringUtils.SPACE);
        sb.append(this.f1865a);
        sb.append(", ");
        sb.append(this.f1869e);
        sb.append(", ");
        sb.append(this.f1870f);
        sb.append(", ");
        sb.append(this.f1871g);
        sb.append(", ");
        return AbstractC0112b.i(sb, this.f1872h, "]");
    }
}
