package B8;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: B8.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0134v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final A9.A f881c = new A9.A(String.valueOf(','));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0134v f882d = new C0134v(C0125l.f832b, false, new C0134v(new C0125l(2), true, new C0134v()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f884b;

    public C0134v(InterfaceC0126m interfaceC0126m, boolean z10, C0134v c0134v) {
        String strD = interfaceC0126m.d();
        p229v9.a.g("Comma is currently not allowed in message encoding", !strD.contains(com.amazon.a.a.o.b.f.f16451a));
        int size = c0134v.f883a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(c0134v.f883a.containsKey(interfaceC0126m.d()) ? size : size + 1);
        for (C0133u c0133u : c0134v.f883a.values()) {
            String strD2 = c0133u.f875a.d();
            if (!strD2.equals(strD)) {
                linkedHashMap.put(strD2, new C0133u(c0133u.f875a, c0133u.f876b));
            }
        }
        linkedHashMap.put(strD, new C0133u(interfaceC0126m, z10));
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        this.f883a = mapUnmodifiableMap;
        HashSet hashSet = new HashSet(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            if (((C0133u) entry.getValue()).f876b) {
                hashSet.add((String) entry.getKey());
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        A9.A a10 = f881c;
        a10.getClass();
        Iterator it = setUnmodifiableSet.iterator();
        StringBuilder sb = new StringBuilder();
        a10.a(sb, it);
        this.f884b = sb.toString().getBytes(Charset.forName("US-ASCII"));
    }

    public C0134v() {
        this.f883a = new LinkedHashMap(0);
        this.f884b = new byte[0];
    }
}
