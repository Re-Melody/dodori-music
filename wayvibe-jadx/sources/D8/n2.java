package D8;

/* JADX INFO: loaded from: classes2.dex */
public final class n2 extends r2 {
    @Override // D8.r2
    public final boolean r(o2 o2Var) {
        synchronized (o2Var) {
            try {
                if (o2Var.f2734c != 0) {
                    return false;
                }
                o2Var.f2734c = -1;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D8.r2
    public final void s(o2 o2Var) {
        synchronized (o2Var) {
            o2Var.f2734c = 0;
        }
    }
}
