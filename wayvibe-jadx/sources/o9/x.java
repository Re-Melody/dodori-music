package o9;

import p151n9.I;
import p151n9.S;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends I implements S {
    @Override // p151n9.S
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.f23060h;
            kotlin.jvm.internal.m.c(objArr);
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.f23061i + ((long) ((int) ((m() + ((long) this.k)) - this.f23061i)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void u(int i10) {
        synchronized (this) {
            Object[] objArr = this.f23060h;
            kotlin.jvm.internal.m.c(objArr);
            o(Integer.valueOf(((Number) objArr[((int) ((this.f23061i + ((long) ((int) ((m() + ((long) this.k)) - this.f23061i)))) - 1)) & (objArr.length - 1)]).intValue() + i10));
        }
    }
}
