package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1164f {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private volatile String zzA;
    private volatile Q5.a zzB;
    private H5.b zzC;
    private boolean zzD;
    private volatile M zzE;
    S zza;
    final Handler zzb;
    protected InterfaceC1162d zzc;
    protected AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final AbstractC1171m zzn;
    private final H5.f zzo;
    private final Object zzp;
    private final Object zzq;
    private InterfaceC1175q zzr;
    private IInterface zzs;
    private final ArrayList zzt;
    private J zzu;
    private int zzv;
    private final InterfaceC1160b zzw;
    private final InterfaceC1161c zzx;
    private final int zzy;
    private final String zzz;
    private static final H5.d[] zze = new H5.d[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    public AbstractC1164f(Context context, Looper looper, Q q5, int i10, C1177t c1177t, C1177t c1177t2, String str) {
        H5.e eVar = H5.e.f6041d;
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = new AtomicInteger(0);
        E.i(context, "Context must not be null");
        this.zzl = context;
        E.i(looper, "Looper must not be null");
        this.zzm = looper;
        E.i(q5, "Supervisor must not be null");
        this.zzn = q5;
        this.zzo = eVar;
        this.zzb = new H(this, looper);
        this.zzy = i10;
        this.zzw = c1177t;
        this.zzx = c1177t2;
        this.zzz = str;
    }

    public final void a(int i10, IInterface iInterface) {
        S s8;
        E.c((i10 == 4) == (iInterface != null));
        synchronized (this.zzp) {
            try {
                this.zzv = i10;
                this.zzs = iInterface;
                Bundle bundle = null;
                if (i10 == 1) {
                    J j10 = this.zzu;
                    if (j10 != null) {
                        AbstractC1171m abstractC1171m = this.zzn;
                        String str = this.zza.f18028a;
                        E.h(str);
                        String str2 = this.zza.f18029b;
                        zza();
                        abstractC1171m.b(str, str2, j10, this.zza.f18030c);
                        this.zzu = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    J j11 = this.zzu;
                    if (j11 != null && (s8 = this.zza) != null) {
                        String str3 = s8.f18028a;
                        String str4 = s8.f18029b;
                        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 70 + String.valueOf(str4).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str3);
                        sb.append(" on ");
                        sb.append(str4);
                        Log.e("GmsClient", sb.toString());
                        AbstractC1171m abstractC1171m2 = this.zzn;
                        String str5 = this.zza.f18028a;
                        E.h(str5);
                        String str6 = this.zza.f18029b;
                        zza();
                        abstractC1171m2.b(str5, str6, j11, this.zza.f18030c);
                        this.zzd.incrementAndGet();
                    }
                    J j12 = new J(this, this.zzd.get());
                    this.zzu = j12;
                    S s10 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new S(getStartServicePackage(), getStartServiceAction(), getUseDynamicLookup()) : new S(getContext().getPackageName(), getLocalStartServiceAction(), false);
                    this.zza = s10;
                    if (s10.f18030c && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.f18028a)));
                    }
                    AbstractC1171m abstractC1171m3 = this.zzn;
                    String str7 = this.zza.f18028a;
                    E.h(str7);
                    H5.b bVarA = abstractC1171m3.a(new N(str7, this.zza.f18029b, this.zza.f18030c), j12, zza(), getBindServiceExecutor());
                    if (!(bVarA.f6029b == 0)) {
                        S s11 = this.zza;
                        String str8 = s11.f18028a;
                        String str9 = s11.f18029b;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str8).length() + 34 + String.valueOf(str9).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str8);
                        sb2.append(" on ");
                        sb2.append(str9);
                        Log.w("GmsClient", sb2.toString());
                        int i11 = bVarA.f6029b;
                        if (i11 == -1) {
                            i11 = 16;
                        }
                        if (bVarA.f6030c != null) {
                            bundle = new Bundle();
                            bundle.putParcelable(KEY_PENDING_INTENT, bVarA.f6030c);
                        }
                        zzb(i11, bundle, this.zzd.get());
                    }
                } else if (i10 == 4) {
                    E.h(iInterface);
                    onConnectedLocked(iInterface);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int iC = this.zzo.c(this.zzl, getMinApkVersion());
        if (iC == 0) {
            connect(new C1177t(this));
        } else {
            a(1, null);
            triggerNotAvailable(new C1177t(this), iC, null);
        }
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(InterfaceC1162d interfaceC1162d) {
        E.i(interfaceC1162d, "Connection progress callbacks cannot be null.");
        this.zzc = interfaceC1162d;
        a(2, null);
    }

    public abstract IInterface createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        ArrayList arrayList = this.zzt;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    C c3 = (C) arrayList.get(i10);
                    synchronized (c3) {
                        c3.f17987a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        a(1, null);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i10;
        IInterface iInterface;
        InterfaceC1175q interfaceC1175q;
        synchronized (this.zzp) {
            i10 = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            interfaceC1175q = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i10 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i10 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i10 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i10 == 4) {
            printWriter.print("CONNECTED");
        } else if (i10 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (interfaceC1175q == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(interfaceC1175q.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j10 = this.zzh;
            String str2 = simpleDateFormat.format(new Date(j10));
            StringBuilder sb = new StringBuilder(String.valueOf(j10).length() + 1 + String.valueOf(str2).length());
            sb.append(j10);
            sb.append(StringUtils.SPACE);
            sb.append(str2);
            printWriterAppend.println(sb.toString());
        }
        if (this.zzg > r9) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i11 = this.zzf;
            if (i11 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i11 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i11 != 3) {
                printWriter.append((CharSequence) String.valueOf(i11));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j11 = this.zzg;
            String str3 = simpleDateFormat.format(new Date(j11));
            StringBuilder sb2 = new StringBuilder(String.valueOf(j11).length() + 1 + String.valueOf(str3).length());
            sb2.append(j11);
            sb2.append(StringUtils.SPACE);
            sb2.append(str3);
            printWriterAppend2.println(sb2.toString());
        }
        if (this.zzj > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) Z5.A.a(this.zzi));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j12 = this.zzj;
            String str4 = simpleDateFormat.format(new Date(j12));
            StringBuilder sb3 = new StringBuilder(String.valueOf(j12).length() + 1 + String.valueOf(str4).length());
            sb3.append(j12);
            sb3.append(StringUtils.SPACE);
            sb3.append(str4);
            printWriterAppend3.println(sb3.toString());
        }
    }

    public boolean enableLocalFallback() {
        return false;
    }

    public abstract Account getAccount();

    public H5.d[] getApiFeatures() {
        return zze;
    }

    public Q5.a getAttributionSourceWrapper() {
        return null;
    }

    public final H5.d[] getAvailableFeatures() {
        M m8 = this.zzE;
        if (m8 == null) {
            return null;
        }
        return m8.f18008b;
    }

    public abstract Executor getBindServiceExecutor();

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public String getEndpointPackageName() {
        S s8;
        if (!isConnected() || (s8 = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return s8.f18029b;
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    public String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    public abstract int getMinApkVersion();

    public void getRemoteService(InterfaceC1172n interfaceC1172n, Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String str = Build.VERSION.SDK_INT < 31 ? this.zzA : this.zzA;
        int i10 = this.zzy;
        int i11 = H5.f.f6042a;
        Scope[] scopeArr = C1169k.f18050o;
        Bundle bundle = new Bundle();
        H5.d[] dVarArr = C1169k.f18051p;
        C1169k c1169k = new C1169k(6, i10, i11, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        c1169k.f18055d = this.zzl.getPackageName();
        c1169k.f18058g = getServiceRequestExtraArgs;
        if (set != null) {
            c1169k.f18057f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            c1169k.f18059h = account;
            if (interfaceC1172n != null) {
                c1169k.f18056e = interfaceC1172n.asBinder();
            }
        } else if (requiresAccount()) {
            c1169k.f18059h = getAccount();
        }
        c1169k.f18060i = zze;
        c1169k.f18061j = getApiFeatures();
        if (usesClientTelemetry()) {
            c1169k.f18063m = true;
        }
        try {
            synchronized (this.zzq) {
                try {
                    InterfaceC1175q interfaceC1175q = this.zzr;
                    if (interfaceC1175q != null) {
                        ((D) interfaceC1175q).O(new I(this, this.zzd.get()), c1169k);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            triggerConnectionSuspended(3);
        } catch (RemoteException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (SecurityException e7) {
            throw e7;
        } catch (RuntimeException e10) {
            e = e10;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    public abstract Set getScopes();

    public final IInterface getService() {
        IInterface iInterface;
        synchronized (this.zzp) {
            try {
                if (this.zzv == 5) {
                    throw new DeadObjectException();
                }
                checkConnected();
                IInterface iInterface2 = this.zzs;
                E.i(iInterface2, "Client is connected but service is null");
                iInterface = iInterface2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            try {
                InterfaceC1175q interfaceC1175q = this.zzr;
                if (interfaceC1175q == null) {
                    return null;
                }
                return interfaceC1175q.asBinder();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public abstract String getStartServiceAction();

    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public C1168j getTelemetryConfiguration() {
        M m8 = this.zzE;
        if (m8 == null) {
            return null;
        }
        return m8.f18010d;
    }

    public boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzE != null;
    }

    public boolean isConnected() {
        boolean z10;
        synchronized (this.zzp) {
            z10 = this.zzv == 4;
        }
        return z10;
    }

    public boolean isConnecting() {
        boolean z10;
        synchronized (this.zzp) {
            int i10 = this.zzv;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    public void onConnectedLocked(IInterface iInterface) {
        this.zzh = System.currentTimeMillis();
    }

    public void onConnectionFailed(H5.b bVar) {
        this.zzi = bVar.f6029b;
        this.zzj = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i10) {
        this.zzf = i10;
        this.zzg = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i10, IBinder iBinder, Bundle bundle, int i11) {
        K k = new K(this, i10, iBinder, bundle);
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(1, i11, -1, k));
    }

    public void onUserSignOut(InterfaceC1163e interfaceC1163e) {
        Y5.h hVar = (Y5.h) interfaceC1163e;
        ((com.google.android.gms.common.api.internal.H) hVar.f13385b).f17871o.f17947n.post(new D8.O(hVar, 27));
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i10) {
        int i11 = this.zzd.get();
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(6, i11, i10));
    }

    public void triggerNotAvailable(InterfaceC1162d interfaceC1162d, int i10, PendingIntent pendingIntent) {
        E.i(interfaceC1162d, "Connection progress callbacks cannot be null.");
        this.zzc = interfaceC1162d;
        int i11 = this.zzd.get();
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(3, i11, i10, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    public final String zza() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    public final void zzb(int i10, Bundle bundle, int i11) {
        L l10 = new L(this, i10, bundle);
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(7, i11, -1, l10));
    }

    public final void zzc(M m8) {
        this.zzE = m8;
        if (usesClientTelemetry()) {
            C1168j c1168j = m8.f18010d;
            C1177t c1177tB = C1177t.b();
            C1178u c1178u = c1168j == null ? null : c1168j.f18044a;
            synchronized (c1177tB) {
                try {
                    if (c1178u == null) {
                        c1177tB.f18083a = C1177t.f18082c;
                        return;
                    }
                    C1178u c1178u2 = (C1178u) c1177tB.f18083a;
                    if (c1178u2 == null || c1178u2.f18084a < c1178u.f18084a) {
                        c1177tB.f18083a = c1178u;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final /* synthetic */ void zzd(int i10, IInterface iInterface) {
        a(i10, null);
    }

    public final /* synthetic */ boolean zze(int i10, int i11, IInterface iInterface) {
        synchronized (this.zzp) {
            try {
                if (this.zzv != i10) {
                    return false;
                }
                a(i11, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzf(int i10) {
        int i11;
        int i12;
        synchronized (this.zzp) {
            i11 = this.zzv;
        }
        if (i11 == 3) {
            this.zzD = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(i12, this.zzd.get(), 16));
    }

    public final /* synthetic */ boolean zzg() {
        if (this.zzD || TextUtils.isEmpty(getServiceDescriptor()) || TextUtils.isEmpty(getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final /* synthetic */ Object zzh() {
        return this.zzq;
    }

    public final /* synthetic */ void zzi(InterfaceC1175q interfaceC1175q) {
        this.zzr = interfaceC1175q;
    }

    public final /* synthetic */ ArrayList zzj() {
        return this.zzt;
    }

    public final /* synthetic */ InterfaceC1160b zzk() {
        return this.zzw;
    }

    public final /* synthetic */ InterfaceC1161c zzl() {
        return this.zzx;
    }

    public final /* synthetic */ H5.b zzm() {
        return this.zzC;
    }

    public final /* synthetic */ void zzn(H5.b bVar) {
        this.zzC = bVar;
    }

    public final /* synthetic */ boolean zzo() {
        return this.zzD;
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }

    public void setAttributionSourceWrapper(Q5.a aVar) {
    }
}
