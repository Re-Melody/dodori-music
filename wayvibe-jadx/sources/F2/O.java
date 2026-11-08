package F2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f3984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3985c;

    public O(N n6) {
        this.f3983a = n6.f3980a;
        this.f3984b = n6.f3981b;
        this.f3985c = n6.f3982c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o10 = (O) obj;
        return this.f3983a == o10.f3983a && this.f3984b == o10.f3984b && this.f3985c == o10.f3985c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f3983a), Float.valueOf(this.f3984b), Long.valueOf(this.f3985c)});
    }
}
