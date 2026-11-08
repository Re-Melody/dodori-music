package p260y9;

import Z8.a;
import java.util.ArrayList;
import kotlin.jvm.internal.n;
import p240w9.g;

/* JADX INFO: loaded from: classes2.dex */
public final class P extends n implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q f29247b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P(Q q5, int i10) {
        super(0);
        this.f29246a = i10;
        this.f29247b = q5;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [M8.h, java.lang.Object] */
    @Override // Z8.a
    public final Object invoke() {
        p219u9.a[] aVarArrChildSerializers;
        ArrayList arrayList;
        p219u9.a[] aVarArrTypeParametersSerializers;
        switch (this.f29246a) {
            case 0:
                Q q5 = this.f29247b;
                return Integer.valueOf(O.f(q5, (g[]) q5.f29257j.getValue()));
            case 1:
                InterfaceC2389z interfaceC2389z = this.f29247b.f29249b;
                return (interfaceC2389z == null || (aVarArrChildSerializers = interfaceC2389z.childSerializers()) == null) ? O.f29245b : aVarArrChildSerializers;
            default:
                InterfaceC2389z interfaceC2389z2 = this.f29247b.f29249b;
                if (interfaceC2389z2 == null || (aVarArrTypeParametersSerializers = interfaceC2389z2.typeParametersSerializers()) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(aVarArrTypeParametersSerializers.length);
                    for (p219u9.a aVar : aVarArrTypeParametersSerializers) {
                        arrayList.add(aVar.getDescriptor());
                    }
                }
                return O.c(arrayList);
        }
    }
}
