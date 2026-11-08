package p216u6;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;
import p248x6.d;
import p248x6.z;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27234b;

    public /* synthetic */ l(Object obj, int i10) {
        this.f27233a = i10;
        this.f27234b = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        switch (this.f27233a) {
            case 0:
                o oVar = (o) this.f27234b;
                oVar.f27241b.c("reportBinderDeath", new Object[0]);
                if (oVar.f27248i.get() != null) {
                    throw new ClassCastException();
                }
                oVar.f27241b.c("%s : Binder has died.", oVar.f27242c);
                for (k kVar : oVar.f27243d) {
                    RemoteException remoteException = new RemoteException(String.valueOf(oVar.f27242c).concat(" : Binder has died."));
                    TaskCompletionSource taskCompletionSource = kVar.f27232a;
                    if (taskCompletionSource != null) {
                        taskCompletionSource.trySetException(remoteException);
                    }
                }
                oVar.f27243d.clear();
                synchronized (oVar.f27245f) {
                    oVar.d();
                    break;
                }
                return;
            default:
                d dVar = (d) this.f27234b;
                dVar.f28608b.b("reportBinderDeath", new Object[0]);
                if (dVar.f28616j.get() != null) {
                    throw new ClassCastException();
                }
                dVar.f28608b.b("%s : Binder has died.", dVar.f28609c);
                Iterator it = dVar.f28610d.iterator();
                while (it.hasNext()) {
                    ((z) it.next()).a(new RemoteException(String.valueOf(dVar.f28609c).concat(" : Binder has died.")));
                }
                dVar.f28610d.clear();
                synchronized (dVar.f28612f) {
                    dVar.e();
                    break;
                }
                return;
        }
    }
}
