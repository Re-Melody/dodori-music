package K0;

import V0.p;
import android.content.res.Resources;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources.Theme f7224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7225b;

    public b(Resources.Theme theme, int i10) {
        this.f7224a = theme;
        this.f7225b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.b(this.f7224a, bVar.f7224a) && this.f7225b == bVar.f7225b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7225b) + (this.f7224a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(theme=");
        sb.append(this.f7224a);
        sb.append(", id=");
        return p.q(sb, this.f7225b, ')');
    }
}
