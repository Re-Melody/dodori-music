package Z9;

import B2.AbstractC0112b;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14058c;

    public w(int i10, int i11, int i12) {
        this.f14056a = i10;
        this.f14057b = i11;
        this.f14058c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            if (this.f14056a == wVar.f14056a && this.f14057b == wVar.f14057b && this.f14058c == wVar.f14058c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f14056a), Integer.valueOf(this.f14057b), Integer.valueOf(this.f14058c));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SourceSpan{line=");
        sb.append(this.f14056a);
        sb.append(", column=");
        sb.append(this.f14057b);
        sb.append(", length=");
        return AbstractC0112b.i(sb, this.f14058c, "}");
    }
}
