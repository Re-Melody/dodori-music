package p248x6;

import Z4.M;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* JADX INFO: renamed from: x6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2324b extends z {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ IBinder f28602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ M f28603h;

    public C2324b(M m8, IBinder iBinder) {
        this.f28603h = m8;
        this.f28602g = iBinder;
    }

    @Override // p248x6.z
    public final void b() {
        d dVar = (d) this.f28603h.f13682b;
        dVar.f28619n = (IInterface) dVar.f28615i.a(this.f28602g);
        y yVar = dVar.f28608b;
        yVar.b("linkToDeath", new Object[0]);
        try {
            dVar.f28619n.asBinder().linkToDeath(dVar.k, 0);
        } catch (RemoteException e2) {
            yVar.a(e2, "linkToDeath failed", new Object[0]);
        }
        dVar.f28613g = false;
        Iterator it = dVar.f28610d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        dVar.f28610d.clear();
    }
}
