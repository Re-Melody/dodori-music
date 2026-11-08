package p263z2;

import B2.C;
import V0.p;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f29804e = new b(-1, -1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f29808d;

    public b(int i10, int i11, int i12) {
        this.f29805a = i10;
        this.f29806b = i11;
        this.f29807c = i12;
        this.f29808d = C.E(i12) ? C.z(i12, i11) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f29805a == bVar.f29805a && this.f29806b == bVar.f29806b && this.f29807c == bVar.f29807c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f29805a), Integer.valueOf(this.f29806b), Integer.valueOf(this.f29807c)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
        sb.append(this.f29805a);
        sb.append(", channelCount=");
        sb.append(this.f29806b);
        sb.append(", encoding=");
        return p.q(sb, this.f29807c, ']');
    }
}
