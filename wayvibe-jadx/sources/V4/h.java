package V4;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g[] f12591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12592c;

    public h(g... gVarArr) {
        this.f12591b = gVarArr;
        this.f12590a = gVarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f12591b, ((h) obj).f12591b);
    }

    public final int hashCode() {
        if (this.f12592c == 0) {
            this.f12592c = 527 + Arrays.hashCode(this.f12591b);
        }
        return this.f12592c;
    }
}
