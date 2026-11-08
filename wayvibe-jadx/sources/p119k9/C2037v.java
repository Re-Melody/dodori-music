package p119k9;

import Z8.f;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: k9.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2037v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f21779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2022k f21780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f21781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f21782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f21783e;

    public C2037v(Object obj, InterfaceC2022k interfaceC2022k, f fVar, Object obj2, Throwable th) {
        this.f21779a = obj;
        this.f21780b = interfaceC2022k;
        this.f21781c = fVar;
        this.f21782d = obj2;
        this.f21783e = th;
    }

    public static C2037v a(C2037v c2037v, InterfaceC2022k interfaceC2022k, CancellationException cancellationException, int i10) {
        Object obj = c2037v.f21779a;
        if ((i10 & 2) != 0) {
            interfaceC2022k = c2037v.f21780b;
        }
        InterfaceC2022k interfaceC2022k2 = interfaceC2022k;
        f fVar = c2037v.f21781c;
        Object obj2 = c2037v.f21782d;
        Throwable th = cancellationException;
        if ((i10 & 16) != 0) {
            th = c2037v.f21783e;
        }
        c2037v.getClass();
        return new C2037v(obj, interfaceC2022k2, fVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2037v)) {
            return false;
        }
        C2037v c2037v = (C2037v) obj;
        return m.b(this.f21779a, c2037v.f21779a) && m.b(this.f21780b, c2037v.f21780b) && m.b(this.f21781c, c2037v.f21781c) && m.b(this.f21782d, c2037v.f21782d) && m.b(this.f21783e, c2037v.f21783e);
    }

    public final int hashCode() {
        Object obj = this.f21779a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC2022k interfaceC2022k = this.f21780b;
        int iHashCode2 = (iHashCode + (interfaceC2022k == null ? 0 : interfaceC2022k.hashCode())) * 31;
        f fVar = this.f21781c;
        int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        Object obj2 = this.f21782d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f21783e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f21779a + ", cancelHandler=" + this.f21780b + ", onCancellation=" + this.f21781c + ", idempotentResume=" + this.f21782d + ", cancelCause=" + this.f21783e + ')';
    }

    public /* synthetic */ C2037v(Object obj, InterfaceC2022k interfaceC2022k, f fVar, CancellationException cancellationException, int i10) {
        this(obj, (i10 & 2) != 0 ? null : interfaceC2022k, (i10 & 4) != 0 ? null : fVar, (Object) null, (i10 & 16) != 0 ? null : cancellationException);
    }
}
