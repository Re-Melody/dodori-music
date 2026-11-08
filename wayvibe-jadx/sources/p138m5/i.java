package p138m5;

import U.W0;
import android.util.Base64;
import java.util.Arrays;
import p104j5.c;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f22328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f22329c;

    public i(String str, byte[] bArr, c cVar) {
        this.f22327a = str;
        this.f22328b = bArr;
        this.f22329c = cVar;
    }

    public static W0 a() {
        W0 w10 = new W0(22, false);
        c cVar = c.DEFAULT;
        if (cVar == null) {
            throw new NullPointerException("Null priority");
        }
        w10.f11834d = cVar;
        return w10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f22327a.equals(iVar.f22327a) && Arrays.equals(this.f22328b, iVar.f22328b) && this.f22329c.equals(iVar.f22329c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f22327a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f22328b)) * 1000003) ^ this.f22329c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f22328b;
        return "TransportContext(" + this.f22327a + ", " + this.f22329c + ", " + (bArr == null ? "" : Base64.encodeToString(bArr, 2)) + ")";
    }
}
