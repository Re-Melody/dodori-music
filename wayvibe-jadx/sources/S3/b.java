package S3;

import V0.p;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11086b;

    public b(String str) {
        this.f11085a = str;
        this.f11086b = 0;
    }

    public final String a() {
        String str;
        int i10 = this.f11086b;
        if (i10 == 0) {
            return this.f11085a;
        }
        StringBuilder sb = new StringBuilder("Wrong data accessor type detected. ");
        if (i10 != 0) {
            str = i10 != 1 ? "Unknown" : "ArrayBuffer";
        } else {
            str = "String";
        }
        throw new IllegalStateException(p.r(sb, str, " expected, but got ", "String"));
    }

    public b(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f11085a = null;
        this.f11086b = 1;
    }
}
