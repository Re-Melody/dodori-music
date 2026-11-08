package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class F {
    public static InterfaceC1067z a(long j10, Object obj) {
        InterfaceC1067z interfaceC1067z = (InterfaceC1067z) p0.f15143c.h(j10, obj);
        if (((AbstractC1044b) interfaceC1067z).f15066a) {
            return interfaceC1067z;
        }
        a0 a0Var = (a0) interfaceC1067z;
        int i10 = a0Var.f15065c;
        a0 a0VarD = a0Var.d(i10 == 0 ? 10 : i10 * 2);
        p0.o(obj, j10, a0VarD);
        return a0VarD;
    }
}
