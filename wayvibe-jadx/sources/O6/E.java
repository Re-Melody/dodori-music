package O6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final V6.a f9249b = V6.a.a(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f9250a;

    public E(HashMap map) {
        this.f9250a = map;
    }

    public final Iterable a(byte[] bArr) {
        List list;
        HashMap map = this.f9250a;
        List list2 = (List) map.get(f9249b);
        if (bArr.length >= 5) {
            list = (List) map.get(new V6.a(bArr, 5 > bArr.length ? bArr.length : 5));
        } else {
            list = null;
        }
        if (list2 == null && list == null) {
            return new ArrayList();
        }
        if (list2 == null) {
            return list;
        }
        return list == null ? list2 : new C(list, list2);
    }
}
