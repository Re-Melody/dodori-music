package p256y4;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f29067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f29068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29069c;

    public a(a aVar) {
        byte[] bArr = aVar.f29067a;
        this.f29067a = bArr != null ? (byte[]) bArr.clone() : null;
        byte[] bArr2 = aVar.f29068b;
        this.f29068b = bArr2 != null ? (byte[]) bArr2.clone() : null;
        this.f29069c = aVar.f29069c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Arrays.equals(this.f29067a, aVar.f29067a) && Arrays.equals(this.f29068b, aVar.f29068b) && this.f29069c == aVar.f29069c;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f29068b) + (Arrays.hashCode(this.f29067a) * 31)) * 31) + this.f29069c;
    }
}
