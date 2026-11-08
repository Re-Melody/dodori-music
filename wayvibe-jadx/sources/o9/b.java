package o9;

import M8.D;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d[] f23843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x f23846d;

    public final d b() {
        d dVarC;
        x xVar;
        synchronized (this) {
            try {
                d[] dVarArrD = this.f23843a;
                if (dVarArrD == null) {
                    dVarArrD = d();
                    this.f23843a = dVarArrD;
                } else if (this.f23844b >= dVarArrD.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(dVarArrD, dVarArrD.length * 2);
                    kotlin.jvm.internal.m.e(objArrCopyOf, "copyOf(...)");
                    this.f23843a = (d[]) objArrCopyOf;
                    dVarArrD = (d[]) objArrCopyOf;
                }
                int i10 = this.f23845c;
                do {
                    dVarC = dVarArrD[i10];
                    if (dVarC == null) {
                        dVarC = c();
                        dVarArrD[i10] = dVarC;
                    }
                    i10++;
                    if (i10 >= dVarArrD.length) {
                        i10 = 0;
                    }
                } while (!dVarC.a(this));
                this.f23845c = i10;
                this.f23844b++;
                xVar = this.f23846d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (xVar != null) {
            xVar.u(1);
        }
        return dVarC;
    }

    public abstract d c();

    public abstract d[] d();

    public final void e(d dVar) {
        x xVar;
        int i10;
        Q8.d[] dVarArrB;
        synchronized (this) {
            try {
                int i11 = this.f23844b - 1;
                this.f23844b = i11;
                xVar = this.f23846d;
                if (i11 == 0) {
                    this.f23845c = 0;
                }
                kotlin.jvm.internal.m.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                dVarArrB = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Q8.d dVar2 : dVarArrB) {
            if (dVar2 != null) {
                dVar2.resumeWith(D.f8402a);
            }
        }
        if (xVar != null) {
            xVar.u(-1);
        }
    }

    public final x f() {
        x xVar;
        synchronized (this) {
            xVar = this.f23846d;
            if (xVar == null) {
                int i10 = this.f23844b;
                xVar = new x(1, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, p141m9.a.DROP_OLDEST);
                xVar.o(Integer.valueOf(i10));
                this.f23846d = xVar;
            }
        }
        return xVar;
    }
}
