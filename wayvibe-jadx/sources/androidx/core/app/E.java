package androidx.core.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tika.pipes.pipesiterator.PipesIterator;

/* JADX INFO: loaded from: classes.dex */
public final class E implements Handler.Callback, ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f14897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f14898c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashSet f14899d = new HashSet();

    public E(Context context) {
        this.f14896a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f14897b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(D d10) {
        boolean z10;
        ArrayDeque arrayDeque;
        boolean zIsLoggable = Log.isLoggable("NotifManCompat", 3);
        ComponentName componentName = d10.f14891a;
        if (zIsLoggable) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + d10.f14894d.size() + " queued tasks");
        }
        if (d10.f14894d.isEmpty()) {
            return;
        }
        if (d10.f14892b) {
            z10 = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f14896a;
            boolean zBindService = context.bindService(component, this, 33);
            d10.f14892b = zBindService;
            if (zBindService) {
                d10.f14895e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z10 = d10.f14892b;
        }
        if (!z10 || d10.f14893c == null) {
            b(d10);
            return;
        }
        while (true) {
            arrayDeque = d10.f14894d;
            B b10 = (B) arrayDeque.peek();
            if (b10 == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + b10);
                }
                b10.a(d10.f14893c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Remote service has died: " + componentName);
                }
            } catch (RemoteException e2) {
                Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e2);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(d10);
    }

    public final void b(D d10) {
        Handler handler = this.f14897b;
        ComponentName componentName = d10.f14891a;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i10 = d10.f14895e;
        int i11 = i10 + 1;
        d10.f14895e = i11;
        if (i11 <= 6) {
            int i12 = (1 << i10) * PipesIterator.DEFAULT_QUEUE_SIZE;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i12 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i12);
            return;
        }
        StringBuilder sb = new StringBuilder("Giving up on delivering ");
        ArrayDeque arrayDeque = d10.f14894d;
        sb.append(arrayDeque.size());
        sb.append(" tasks to ");
        sb.append(componentName);
        sb.append(" after ");
        sb.append(d10.f14895e);
        sb.append(" retries");
        Log.w("NotifManCompat", sb.toString());
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i10 = message.what;
        p015b.c cVar = null;
        if (i10 == 0) {
            B b10 = (B) message.obj;
            String string = Settings.Secure.getString(this.f14896a.getContentResolver(), "enabled_notification_listeners");
            synchronized (F.f14900c) {
                if (string != null) {
                    try {
                        if (!string.equals(F.f14901d)) {
                            String[] strArrSplit = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(strArrSplit.length);
                            for (String str : strArrSplit) {
                                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                                if (componentNameUnflattenFromString != null) {
                                    hashSet2.add(componentNameUnflattenFromString.getPackageName());
                                }
                            }
                            F.f14902e = hashSet2;
                            F.f14901d = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = F.f14902e;
            }
            if (!hashSet.equals(this.f14899d)) {
                this.f14899d = hashSet;
                List<ResolveInfo> listQueryIntentServices = this.f14896a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet3) {
                    if (!this.f14898c.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f14898c.put(componentName2, new D(componentName2));
                    }
                }
                Iterator it = this.f14898c.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        D d10 = (D) entry.getValue();
                        if (d10.f14892b) {
                            this.f14896a.unbindService(this);
                            d10.f14892b = false;
                        }
                        d10.f14893c = null;
                        it.remove();
                    }
                }
            }
            for (D d11 : this.f14898c.values()) {
                d11.f14894d.add(b10);
                a(d11);
            }
        } else if (i10 == 1) {
            C c3 = (C) message.obj;
            ComponentName componentName3 = c3.f14889a;
            IBinder iBinder = c3.f14890b;
            D d12 = (D) this.f14898c.get(componentName3);
            if (d12 != null) {
                int i11 = p015b.b.f15712a;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(p015b.c.k);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof p015b.c)) {
                        p015b.a aVar = new p015b.a();
                        aVar.f15711a = iBinder;
                        cVar = aVar;
                    } else {
                        cVar = (p015b.c) iInterfaceQueryLocalInterface;
                    }
                }
                d12.f14893c = cVar;
                d12.f14895e = 0;
                a(d12);
                return true;
            }
        } else if (i10 == 2) {
            D d13 = (D) this.f14898c.get((ComponentName) message.obj);
            if (d13 != null) {
                if (d13.f14892b) {
                    this.f14896a.unbindService(this);
                    d13.f14892b = false;
                }
                d13.f14893c = null;
                return true;
            }
        } else {
            if (i10 != 3) {
                return false;
            }
            D d14 = (D) this.f14898c.get((ComponentName) message.obj);
            if (d14 != null) {
                a(d14);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f14897b.obtainMessage(1, new C(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f14897b.obtainMessage(2, componentName).sendToTarget();
    }
}
