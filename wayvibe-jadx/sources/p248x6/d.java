package p248x6;

import Z4.M;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import p216u6.l;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final HashMap f28606o = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f28607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f28608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28609c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f28613g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f28614h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final B f28615i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public M f28618m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public IInterface f28619n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f28610d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f28611e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f28612f = new Object();
    public final l k = new l(this, 1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicInteger f28617l = new AtomicInteger(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final WeakReference f28616j = new WeakReference(null);

    public d(Context context, y yVar, String str, Intent intent, B b10) {
        this.f28607a = context;
        this.f28608b = yVar;
        this.f28609c = str;
        this.f28614h = intent;
        this.f28615i = b10;
    }

    public static void b(d dVar, z zVar) {
        IInterface iInterface = dVar.f28619n;
        ArrayList arrayList = dVar.f28610d;
        y yVar = dVar.f28608b;
        if (iInterface != null || dVar.f28613g) {
            if (!dVar.f28613g) {
                zVar.run();
                return;
            } else {
                yVar.b("Waiting to bind to the service.", new Object[0]);
                arrayList.add(zVar);
                return;
            }
        }
        yVar.b("Initiate binding to the service.", new Object[0]);
        arrayList.add(zVar);
        M m8 = new M(dVar, 3);
        dVar.f28618m = m8;
        dVar.f28613g = true;
        if (dVar.f28607a.bindService(dVar.f28614h, m8, 1)) {
            return;
        }
        yVar.b("Failed to bind to the service.", new Object[0]);
        dVar.f28613g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((z) it.next()).a(new e("Failed to bind to the service."));
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f28606o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f28609c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f28609c, 10);
                    handlerThread.start();
                    map.put(this.f28609c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f28609c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(z zVar, TaskCompletionSource taskCompletionSource) {
        a().post(new A(this, zVar.c(), taskCompletionSource, zVar));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f28612f) {
            this.f28611e.remove(taskCompletionSource);
        }
        a().post(new c(this, 1));
    }

    public final void e() {
        HashSet hashSet = this.f28611e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f28609c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
