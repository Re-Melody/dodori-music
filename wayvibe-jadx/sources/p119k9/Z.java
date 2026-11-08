package p119k9;

import N8.k;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Z extends AbstractC2040y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f21712f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f21713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k f21715e;

    public final void A(M m8) {
        k kVar = this.f21715e;
        if (kVar == null) {
            kVar = new k();
            this.f21715e = kVar;
        }
        kVar.addLast(m8);
    }

    public abstract Thread B();

    public final void C(boolean z10) {
        this.f21713c = (z10 ? 4294967296L : 1L) + this.f21713c;
        if (z10) {
            return;
        }
        this.f21714d = true;
    }

    public abstract long D();

    public final boolean E() throws IllegalAccessException, InvocationTargetException {
        k kVar = this.f21715e;
        if (kVar == null) {
            return false;
        }
        M m8 = (M) (kVar.isEmpty() ? null : kVar.removeFirst());
        if (m8 == null) {
            return false;
        }
        m8.run();
        return true;
    }

    public void F(long j10, W w10) {
        G.f21681j.K(j10, w10);
    }

    public abstract void shutdown();

    public final void z(boolean z10) {
        long j10 = this.f21713c - (z10 ? 4294967296L : 1L);
        this.f21713c = j10;
        if (j10 <= 0 && this.f21714d) {
            shutdown();
        }
    }
}
