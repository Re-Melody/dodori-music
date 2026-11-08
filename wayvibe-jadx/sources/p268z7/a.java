package p268z7;

import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29894b;

    public a(String str, String str2) {
        this.f29893a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f29894b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f29893a.equals(aVar.f29893a) && this.f29894b.equals(aVar.f29894b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f29893a.hashCode() ^ 1000003) * 1000003) ^ this.f29894b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f29893a);
        sb.append(", version=");
        return b.m(sb, this.f29894b, "}");
    }
}
