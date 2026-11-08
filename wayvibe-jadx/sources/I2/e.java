package I2;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class e implements V2.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f6294a;

    public void a() {
        long j10;
        i iVar = this.f6294a;
        synchronized (W2.a.f12777b) {
            try {
                j10 = W2.a.f12778c ? W2.a.f12779d : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        iVar.f6317L = j10;
        iVar.x(true);
    }

    @Override // V2.o
    public void b() throws IOException {
        i iVar = this.f6294a;
        iVar.f6306A.b();
        a aVar = iVar.f6308C;
        if (aVar != null) {
            throw aVar;
        }
    }
}
