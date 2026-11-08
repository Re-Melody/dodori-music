package W6;

import D7.W;
import V0.p;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C1137d;
import com.google.android.gms.common.internal.E;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.N;
import com.google.firebase.provider.FirebaseInitProvider;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p134m1.b;
import p199t.C2229d;
import p199t.C2230e;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final Object k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C2230e f12863l = new C2230e(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f12866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p023b7.f f12867d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p023b7.m f12870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p227v7.b f12871h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f12868e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f12869f = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f12872i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f12873j = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public h(k kVar, Context context, String str) {
        ?? arrayList;
        this.f12864a = context;
        E.e(str);
        this.f12865b = str;
        this.f12866c = kVar;
        a aVar = FirebaseInitProvider.f18646a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        for (final String str3 : arrayList) {
            final int i10 = 0;
            arrayList2.add(new p227v7.b() { // from class: b7.c
                @Override // p227v7.b
                public final Object get() {
                    switch (i10) {
                        case 0:
                            String str4 = (String) str3;
                            try {
                                Class<?> cls = Class.forName(str4);
                                if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                                    return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                                }
                                throw new l("Class " + str4 + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                            } catch (ClassNotFoundException unused2) {
                                Log.w("ComponentDiscovery", "Class " + str4 + " is not an found.");
                                return null;
                            } catch (IllegalAccessException e2) {
                                throw new l(p.o("Could not instantiate ", str4, "."), e2);
                            } catch (InstantiationException e4) {
                                throw new l(p.o("Could not instantiate ", str4, "."), e4);
                            } catch (NoSuchMethodException e7) {
                                throw new l(b.k("Could not instantiate ", str4), e7);
                            } catch (InvocationTargetException e10) {
                                throw new l(b.k("Could not instantiate ", str4), e10);
                            }
                        default:
                            return (ComponentRegistrar) str3;
                    }
                }
            });
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        p033c7.j jVar = p033c7.j.INSTANCE;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        final FirebaseCommonRegistrar firebaseCommonRegistrar = new FirebaseCommonRegistrar();
        final int i11 = 1;
        arrayList3.add(new p227v7.b() { // from class: b7.c
            @Override // p227v7.b
            public final Object get() {
                switch (i11) {
                    case 0:
                        String str4 = (String) firebaseCommonRegistrar;
                        try {
                            Class<?> cls = Class.forName(str4);
                            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                                return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                            }
                            throw new l("Class " + str4 + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                        } catch (ClassNotFoundException unused2) {
                            Log.w("ComponentDiscovery", "Class " + str4 + " is not an found.");
                            return null;
                        } catch (IllegalAccessException e2) {
                            throw new l(p.o("Could not instantiate ", str4, "."), e2);
                        } catch (InstantiationException e4) {
                            throw new l(p.o("Could not instantiate ", str4, "."), e4);
                        } catch (NoSuchMethodException e7) {
                            throw new l(b.k("Could not instantiate ", str4), e7);
                        } catch (InvocationTargetException e10) {
                            throw new l(b.k("Could not instantiate ", str4), e10);
                        }
                    default:
                        return (ComponentRegistrar) firebaseCommonRegistrar;
                }
            }
        });
        final ExecutorsRegistrar executorsRegistrar = new ExecutorsRegistrar();
        final int i12 = 1;
        arrayList3.add(new p227v7.b() { // from class: b7.c
            @Override // p227v7.b
            public final Object get() {
                switch (i12) {
                    case 0:
                        String str4 = (String) executorsRegistrar;
                        try {
                            Class<?> cls = Class.forName(str4);
                            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                                return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                            }
                            throw new l("Class " + str4 + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                        } catch (ClassNotFoundException unused2) {
                            Log.w("ComponentDiscovery", "Class " + str4 + " is not an found.");
                            return null;
                        } catch (IllegalAccessException e2) {
                            throw new l(p.o("Could not instantiate ", str4, "."), e2);
                        } catch (InstantiationException e4) {
                            throw new l(p.o("Could not instantiate ", str4, "."), e4);
                        } catch (NoSuchMethodException e7) {
                            throw new l(b.k("Could not instantiate ", str4), e7);
                        } catch (InvocationTargetException e10) {
                            throw new l(b.k("Could not instantiate ", str4), e10);
                        }
                    default:
                        return (ComponentRegistrar) executorsRegistrar;
                }
            }
        });
        arrayList4.add(p023b7.a.b(context, Context.class, new Class[0]));
        arrayList4.add(p023b7.a.b(this, h.class, new Class[0]));
        arrayList4.add(p023b7.a.b(kVar, k.class, new Class[0]));
        p050e5.f fVar = new p050e5.f(1);
        if (W.Q(context) && FirebaseInitProvider.f18647b.get()) {
            arrayList4.add(p023b7.a.b(aVar, a.class, new Class[0]));
        }
        p023b7.f fVar2 = new p023b7.f(jVar, arrayList3, arrayList4, fVar);
        this.f12867d = fVar2;
        Trace.endSection();
        this.f12870g = new p023b7.m(new d(0, this, context));
        this.f12871h = fVar2.d(p217u7.c.class);
        e eVar = new e(this);
        a();
        if (this.f12868e.get()) {
            ComponentCallbacks2C1137d.f17918e.f17919a.get();
        }
        this.f12872i.add(eVar);
        Trace.endSection();
    }

    public static ArrayList c() {
        ArrayList arrayList = new ArrayList();
        synchronized (k) {
            try {
                for (h hVar : (C2229d) f12863l.values()) {
                    hVar.a();
                    arrayList.add(hVar.f12865b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static h d() {
        h hVar;
        synchronized (k) {
            try {
                hVar = (h) f12863l.get("[DEFAULT]");
                if (hVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + O5.a.d() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((p217u7.c) hVar.f12871h.get()).b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    public static h e(String str) {
        h hVar;
        String str2;
        synchronized (k) {
            try {
                hVar = (h) f12863l.get(str.trim());
                if (hVar == null) {
                    ArrayList arrayListC = c();
                    if (arrayListC.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", arrayListC);
                    }
                    throw new IllegalStateException("FirebaseApp with name " + str + " doesn't exist. " + str2);
                }
                ((p217u7.c) hVar.f12871h.get()).b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    public static h h(k kVar, Context context, String str) {
        h hVar;
        AtomicReference atomicReference = f.f12860a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = f.f12860a;
            if (atomicReference2.get() == null) {
                f fVar = new f();
                do {
                    if (atomicReference2.compareAndSet(null, fVar)) {
                        ComponentCallbacks2C1137d.b(application);
                        ComponentCallbacks2C1137d.f17918e.a(fVar);
                        break;
                    }
                } while (atomicReference2.get() == null);
            }
        }
        String strTrim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (k) {
            C2230e c2230e = f12863l;
            E.j("FirebaseApp name " + strTrim + " already exists!", !c2230e.containsKey(strTrim));
            E.i(context, "Application context cannot be null.");
            hVar = new h(kVar, context, strTrim);
            c2230e.put(strTrim, hVar);
        }
        hVar.g();
        return hVar;
    }

    public static h i(Context context) {
        synchronized (k) {
            try {
                if (f12863l.containsKey("[DEFAULT]")) {
                    return d();
                }
                k kVarA = k.a(context);
                if (kVarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return h(kVarA, context, "[DEFAULT]");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        E.j("FirebaseApp was deleted", !this.f12869f.get());
    }

    public final void b() {
        if (this.f12869f.compareAndSet(false, true)) {
            synchronized (k) {
                f12863l.remove(this.f12865b);
            }
            for (N n6 : this.f12873j) {
                synchronized (n6) {
                    for (Map.Entry entry : new ArrayList(n6.f18564a.entrySet())) {
                        ((FirebaseFirestore) entry.getValue()).j();
                        p242x0.c.z("terminate() should have removed its entry from `instances` for key: %s", !n6.f18564a.containsKey(entry.getKey()), entry.getKey());
                    }
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        hVar.a();
        return this.f12865b.equals(hVar.f12865b);
    }

    public final String f() {
        StringBuilder sb = new StringBuilder();
        a();
        sb.append(O5.a.c(this.f12865b.getBytes(Charset.defaultCharset())));
        sb.append("+");
        a();
        sb.append(O5.a.c(this.f12866c.f12875b.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public final void g() {
        HashMap map;
        if (!W.Q(this.f12864a)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.f12865b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f12864a;
            AtomicReference atomicReference = g.f12861b;
            if (atomicReference.get() == null) {
                g gVar = new g(context);
                while (!atomicReference.compareAndSet(null, gVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(gVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.f12865b);
        Log.i("FirebaseApp", sb2.toString());
        p023b7.f fVar = this.f12867d;
        a();
        boolean zEquals = "[DEFAULT]".equals(this.f12865b);
        AtomicReference atomicReference2 = fVar.f15786f;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (!atomicReference2.compareAndSet(null, boolValueOf)) {
            if (atomicReference2.get() != null) {
                ((p217u7.c) this.f12871h.get()).b();
            }
        }
        synchronized (fVar) {
            map = new HashMap(fVar.f15781a);
        }
        fVar.i(map, zEquals);
        ((p217u7.c) this.f12871h.get()).b();
    }

    public final int hashCode() {
        return this.f12865b.hashCode();
    }

    public final void j(boolean z10) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.f12872i.iterator();
        while (it.hasNext()) {
            h hVar = ((e) it.next()).f12859a;
            if (z10) {
                hVar.getClass();
            } else {
                ((p217u7.c) hVar.f12871h.get()).b();
            }
        }
    }

    public final void k(Boolean bool) {
        a();
        p238w7.a aVar = (p238w7.a) this.f12870g.get();
        synchronized (aVar) {
            try {
                if (bool == null) {
                    aVar.f28049b.edit().remove("firebase_data_collection_default_enabled").apply();
                    aVar.b(aVar.a());
                } else {
                    boolean zEquals = Boolean.TRUE.equals(bool);
                    aVar.f28049b.edit().putBoolean("firebase_data_collection_default_enabled", zEquals).apply();
                    aVar.b(zEquals);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        W9.j jVar = new W9.j(this);
        jVar.E(this.f12865b, "name");
        jVar.E(this.f12866c, "options");
        return jVar.toString();
    }
}
