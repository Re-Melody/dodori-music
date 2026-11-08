package J8;

import B8.C0135w;
import java.net.SocketAddress;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f6689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6690b;

    public j(C0135w c0135w) {
        p229v9.a.k(c0135w, "eag");
        List list = c0135w.f890a;
        this.f6689a = new String[list.size()];
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            this.f6689a[i10] = ((SocketAddress) it.next()).toString();
            i10++;
        }
        Arrays.sort(this.f6689a);
        this.f6690b = Arrays.hashCode(this.f6689a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (jVar.f6690b == this.f6690b) {
            String[] strArr = jVar.f6689a;
            int length = strArr.length;
            String[] strArr2 = this.f6689a;
            if (length == strArr2.length) {
                return Arrays.equals(strArr, strArr2);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6690b;
    }

    public final String toString() {
        return Arrays.toString(this.f6689a);
    }
}
