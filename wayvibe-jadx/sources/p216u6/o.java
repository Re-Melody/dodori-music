package p216u6;

import B8.V;
import G7.e;
import Z4.M;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final HashMap f27239n = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f27240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f27241b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f27246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f27247h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public M f27250l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h f27251m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f27243d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f27244e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f27245f = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f27249j = new l(this, 0);
    public final AtomicInteger k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f27242c = "AppUpdateService";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f27248i = new WeakReference(null);

    public o(Context context, e eVar, Intent intent) {
        this.f27240a = context;
        this.f27241b = eVar;
        this.f27247h = intent;
    }

    public static void b(o oVar, k kVar) {
        h hVar = oVar.f27251m;
        ArrayList<k> arrayList = oVar.f27243d;
        e eVar = oVar.f27241b;
        if (hVar != null || oVar.f27246g) {
            if (!oVar.f27246g) {
                kVar.run();
                return;
            } else {
                eVar.c("Waiting to bind to the service.", new Object[0]);
                arrayList.add(kVar);
                return;
            }
        }
        eVar.c("Initiate binding to the service.", new Object[0]);
        arrayList.add(kVar);
        M m8 = new M(oVar, 2);
        oVar.f27250l = m8;
        oVar.f27246g = true;
        if (oVar.f27240a.bindService(oVar.f27247h, m8, 1)) {
            return;
        }
        eVar.c("Failed to bind to the service.", new Object[0]);
        oVar.f27246g = false;
        for (k kVar2 : arrayList) {
            V v3 = new V("Failed to bind to the service.");
            TaskCompletionSource taskCompletionSource = kVar2.f27232a;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(v3);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f27239n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f27242c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f27242c, 10);
                    handlerThread.start();
                    map.put(this.f27242c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f27242c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f27245f) {
            this.f27244e.remove(taskCompletionSource);
        }
        a().post(new m(this, 0));
    }

    public final void d() {
        HashSet hashSet = this.f27244e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f27242c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
