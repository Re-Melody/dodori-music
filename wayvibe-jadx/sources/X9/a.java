package X9;

import D8.C0314t0;
import Z9.r;
import Z9.s;
import Z9.x;
import Z9.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements p035ca.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f13282a;

    public a(char c3) {
        this.f13282a = c3;
    }

    @Override // p035ca.a
    public final char a() {
        return this.f13282a;
    }

    @Override // p035ca.a
    public final int b() {
        return 1;
    }

    @Override // p035ca.a
    public final int c(W9.c cVar, W9.c cVar2) {
        r fVar;
        if (cVar.f12947e || cVar2.f12946d) {
            int i10 = cVar2.f12945c;
            if (i10 % 3 != 0 && (cVar.f12945c + i10) % 3 == 0) {
                return 0;
            }
        }
        ArrayList arrayList = cVar.f12943a;
        int size = arrayList.size();
        ArrayList arrayList2 = cVar2.f12943a;
        char c3 = this.f13282a;
        int i11 = 2;
        if (size < 2 || arrayList2.size() < 2) {
            String.valueOf(c3);
            fVar = new Z9.f();
            i11 = 1;
        } else {
            String.valueOf(c3);
            fVar = new x();
        }
        C0314t0 c0314t0 = new C0314t0(3);
        c0314t0.b(cVar.b(i11));
        y yVar = (y) arrayList.get(arrayList.size() - 1);
        s sVar = new s(yVar.f14049e, (y) arrayList2.get(0));
        while (sVar.hasNext()) {
            r rVar = (r) sVar.next();
            fVar.a(rVar);
            c0314t0.a(rVar.b());
        }
        c0314t0.b(cVar2.a(i11));
        List list = c0314t0.f2787b;
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        fVar.d(list);
        yVar.getClass();
        fVar.f();
        r rVar2 = yVar.f14049e;
        fVar.f14049e = rVar2;
        if (rVar2 != null) {
            rVar2.f14048d = fVar;
        }
        fVar.f14048d = yVar;
        yVar.f14049e = fVar;
        r rVar3 = yVar.f14045a;
        fVar.f14045a = rVar3;
        if (fVar.f14049e == null) {
            rVar3.f14047c = fVar;
        }
        return i11;
    }

    @Override // p035ca.a
    public final char d() {
        return this.f13282a;
    }
}
