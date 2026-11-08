package J4;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f6650d = new q(new p[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p[] f6652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6653c;

    public q(p... pVarArr) {
        this.f6652b = pVarArr;
        this.f6651a = pVarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f6651a == qVar.f6651a && Arrays.equals(this.f6652b, qVar.f6652b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f6653c == 0) {
            this.f6653c = Arrays.hashCode(this.f6652b);
        }
        return this.f6653c;
    }
}
