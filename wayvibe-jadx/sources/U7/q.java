package U7;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f12331d;

    public q(String str, String str2, long j10, o oVar) {
        this.f12328a = str;
        this.f12329b = str2;
        this.f12330c = j10;
        this.f12331d = oVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f12328a.equals(qVar.f12328a) && this.f12329b.equals(qVar.f12329b) && this.f12330c == qVar.f12330c && Objects.equals(this.f12331d, qVar.f12331d)) {
                return true;
            }
        }
        return false;
    }
}
