package V9;

import D8.C0314t0;
import W9.c;
import Z9.r;
import Z9.s;
import Z9.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements p035ca.a {
    @Override // p035ca.a
    public final char a() {
        return '~';
    }

    @Override // p035ca.a
    public final int b() {
        return 1;
    }

    @Override // p035ca.a
    public final int c(c cVar, c cVar2) {
        ArrayList arrayList = cVar.f12943a;
        int size = arrayList.size();
        ArrayList arrayList2 = cVar2.f12943a;
        if (size != arrayList2.size() || arrayList.size() > 2) {
            return 0;
        }
        y yVar = (y) b.i(1, arrayList);
        U9.a aVar = new U9.a();
        C0314t0 c0314t0 = new C0314t0(3);
        c0314t0.b(cVar.b(arrayList.size()));
        s sVar = new s(yVar.f14049e, (y) arrayList2.get(0));
        while (sVar.hasNext()) {
            r rVar = (r) sVar.next();
            aVar.a(rVar);
            c0314t0.a(rVar.b());
        }
        c0314t0.b(cVar2.a(arrayList2.size()));
        List list = c0314t0.f2787b;
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        aVar.d(list);
        yVar.getClass();
        aVar.f();
        r rVar2 = yVar.f14049e;
        aVar.f14049e = rVar2;
        if (rVar2 != null) {
            rVar2.f14048d = aVar;
        }
        aVar.f14048d = yVar;
        yVar.f14049e = aVar;
        r rVar3 = yVar.f14045a;
        aVar.f14045a = rVar3;
        if (aVar.f14049e == null) {
            rVar3.f14047c = aVar;
        }
        return arrayList.size();
    }

    @Override // p035ca.a
    public final char d() {
        return '~';
    }
}
