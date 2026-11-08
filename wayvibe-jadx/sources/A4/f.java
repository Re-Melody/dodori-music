package A4;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f282d;

    public f(int i10, byte[] bArr, int i11, int i12) {
        this.f279a = i10;
        this.f280b = bArr;
        this.f281c = i11;
        this.f282d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.f279a == fVar.f279a && this.f281c == fVar.f281c && this.f282d == fVar.f282d && Arrays.equals(this.f280b, fVar.f280b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f280b) + (this.f279a * 31)) * 31) + this.f281c) * 31) + this.f282d;
    }
}
