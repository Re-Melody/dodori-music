package p138m5;

import java.util.Arrays;
import p104j5.b;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f22336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f22337b;

    public k(b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f22336a = bVar;
        this.f22337b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f22336a.equals(kVar.f22336a)) {
            return Arrays.equals(this.f22337b, kVar.f22337b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f22336a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f22337b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f22336a + ", bytes=[...]}";
    }
}
