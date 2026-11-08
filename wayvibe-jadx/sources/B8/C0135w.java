package B8;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: B8.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0135w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0114a f889d = new C0114a("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0115b f891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f892c;

    public C0135w(SocketAddress socketAddress) {
        C0115b c0115b = C0115b.f768b;
        List listSingletonList = Collections.singletonList(socketAddress);
        p229v9.a.g("addrs is empty", !listSingletonList.isEmpty());
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(listSingletonList));
        this.f890a = listUnmodifiableList;
        p229v9.a.k(c0115b, "attrs");
        this.f891b = c0115b;
        this.f892c = listUnmodifiableList.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0135w)) {
            return false;
        }
        C0135w c0135w = (C0135w) obj;
        List list = this.f890a;
        if (list.size() != c0135w.f890a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!((SocketAddress) list.get(i10)).equals(c0135w.f890a.get(i10))) {
                return false;
            }
        }
        return this.f891b.equals(c0135w.f891b);
    }

    public final int hashCode() {
        return this.f892c;
    }

    public final String toString() {
        return "[" + this.f890a + "/" + this.f891b + "]";
    }
}
