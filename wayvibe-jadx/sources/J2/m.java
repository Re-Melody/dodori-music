package J2;

import A6.E;
import B2.AbstractC0111a;
import B2.C;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p255y2.C2339o;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2339o f6521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E f6522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f6524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f6525e;

    public m(C2339o c2339o, E e2, s sVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        AbstractC0111a.d(!e2.isEmpty());
        this.f6521a = c2339o;
        this.f6522b = E.r(e2);
        this.f6524d = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
        this.f6525e = sVar.a(this);
        int i10 = C.f560a;
        this.f6523c = C.Q(sVar.f6541c, 1000000L, sVar.f6540b, RoundingMode.FLOOR);
    }

    public abstract String b();

    public abstract I2.j d();

    public abstract j f();
}
