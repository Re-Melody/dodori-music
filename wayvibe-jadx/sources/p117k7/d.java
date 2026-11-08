package p117k7;

import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f21661b = new d(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21662a;

    public d(String str) {
        this.f21662a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            String str = ((d) obj).f21662a;
            String str2 = this.f21662a;
            if (str2 != null) {
                return str2.equals(str);
            }
            if (str == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f21662a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return b.m(new StringBuilder("User(uid:"), this.f21662a, ")");
    }
}
