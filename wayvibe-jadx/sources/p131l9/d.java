package p131l9;

import C8.a;
import Q8.i;
import U1.e;
import V0.p;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import p119k9.AbstractC2040y;
import p119k9.C2028n;
import p119k9.C2041z;
import p119k9.I0;
import p119k9.InterfaceC2019i0;
import p119k9.K;
import p119k9.O;
import p119k9.Q;
import p119k9.z0;
import p9.m;
import r9.f;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends AbstractC2040y implements K {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f22111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f22113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f22114f;

    public d(Handler handler, String str, boolean z10) {
        this.f22111c = handler;
        this.f22112d = str;
        this.f22113e = z10;
        this.f22114f = z10 ? this : new d(handler, str, true);
    }

    @Override // p119k9.K
    public final Q b(long j10, final I0 i10, i iVar) {
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.f22111c.postDelayed(i10, j10)) {
            return new Q() { // from class: l9.c
                @Override // p119k9.Q
                public final void dispose() {
                    this.f22109a.f22111c.removeCallbacks(i10);
                }
            };
        }
        z(iVar, i10);
        return z0.f21794a;
    }

    @Override // p119k9.K
    public final void c(long j10, C2028n c2028n) {
        a aVar = new a(21, (Object) c2028n, (Object) this, false);
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.f22111c.postDelayed(aVar, j10)) {
            c2028n.u(new e(5, this, aVar));
        } else {
            z(c2028n.f21756e, aVar);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f22111c == this.f22111c && dVar.f22113e == this.f22113e;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f22111c) ^ (this.f22113e ? 1231 : 1237);
    }

    @Override // p119k9.AbstractC2040y
    public final void l(i iVar, Runnable runnable) {
        if (this.f22111c.post(runnable)) {
            return;
        }
        z(iVar, runnable);
    }

    @Override // p119k9.AbstractC2040y
    public final String toString() {
        d dVar;
        String str;
        f fVar = O.f21697a;
        d dVar2 = m.f25335a;
        if (this == dVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = dVar2.f22114f;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            str = this == dVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f22112d;
        if (string == null) {
            string = this.f22111c.toString();
        }
        return this.f22113e ? p.n(string, ".immediate") : string;
    }

    @Override // p119k9.AbstractC2040y
    public final boolean w(i iVar) {
        return (this.f22113e && kotlin.jvm.internal.m.b(Looper.myLooper(), this.f22111c.getLooper())) ? false : true;
    }

    public final void z(i iVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        InterfaceC2019i0 interfaceC2019i0 = (InterfaceC2019i0) iVar.get(C2041z.f21793b);
        if (interfaceC2019i0 != null) {
            interfaceC2019i0.cancel(cancellationException);
        }
        f fVar = O.f21697a;
        r9.e.f26007c.l(iVar, runnable);
    }

    public d(Handler handler) {
        this(handler, null, false);
    }
}
