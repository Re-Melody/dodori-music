package Z2;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f13603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A f13604b;

    public y(A a10, A a11) {
        this.f13603a = a10;
        this.f13604b = a11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y.class == obj.getClass()) {
            y yVar = (y) obj;
            if (this.f13603a.equals(yVar.f13603a) && this.f13604b.equals(yVar.f13604b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f13604b.hashCode() + (this.f13603a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        A a10 = this.f13603a;
        sb.append(a10);
        A a11 = this.f13604b;
        if (a10.equals(a11)) {
            str = "";
        } else {
            str = ", " + a11;
        }
        return p134m1.b.m(sb, str, "]");
    }
}
