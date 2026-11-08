package Ea;

import D8.W;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.helpers.f;
import org.slf4j.helpers.g;
import org.slf4j.helpers.h;
import org.slf4j.helpers.i;
import p098j.u;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile int f3432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final org.slf4j.helpers.c f3433b = new org.slf4j.helpers.c(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final org.slf4j.helpers.c f3434c = new org.slf4j.helpers.c(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f3435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile org.slf4j.helpers.c f3436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f3437f;

    static {
        String property;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            property = null;
        }
        f3435d = property == null ? false : property.equalsIgnoreCase(com.amazon.a.a.o.b.af);
        f3437f = new String[]{com.amazon.a.a.o.b.ah};
    }

    public static ArrayList a() {
        ArrayList arrayList = new ArrayList();
        final ClassLoader classLoader = d.class.getClassLoader();
        String property = System.getProperty("slf4j.provider");
        org.slf4j.helpers.c cVar = null;
        if (property != null && !property.isEmpty()) {
            try {
                String str = "Attempting to load provider \"" + property + "\" specified via \"slf4j.provider\" system property";
                if (f.c(org.slf4j.helpers.d.INFO)) {
                    f.b().println("SLF4J(I): " + str);
                }
                cVar = (org.slf4j.helpers.c) classLoader.loadClass(property).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassCastException e2) {
                f.a("Specified SLF4JServiceProvider (" + property + ") does not implement SLF4JServiceProvider interface", e2);
            } catch (ClassNotFoundException e4) {
                e = e4;
                f.a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (IllegalAccessException e7) {
                e = e7;
                f.a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InstantiationException e10) {
                e = e10;
                f.a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (NoSuchMethodException e11) {
                e = e11;
                f.a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InvocationTargetException e12) {
                e = e12;
                f.a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            }
        }
        if (cVar != null) {
            arrayList.add(cVar);
            return arrayList;
        }
        Iterator it = (System.getSecurityManager() == null ? ServiceLoader.load(org.slf4j.helpers.c.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: Ea.c
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ServiceLoader.load(org.slf4j.helpers.c.class, classLoader);
            }
        })).iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((org.slf4j.helpers.c) it.next());
            } catch (ServiceConfigurationError e13) {
                String str2 = "A service provider failed to instantiate:\n" + e13.getMessage();
                f.b().println("SLF4J(E): " + str2);
            }
        }
        return arrayList;
    }

    public static b b(Class cls) {
        int i10;
        b bVarC = c(cls.getName());
        if (f3435d) {
            h hVar = i.f25133a;
            Class cls2 = null;
            if (hVar == null) {
                if (i.f25134b) {
                    hVar = null;
                } else {
                    try {
                        hVar = new h();
                    } catch (SecurityException unused) {
                        hVar = null;
                    }
                    i.f25133a = hVar;
                    i.f25134b = true;
                }
            }
            if (hVar != null) {
                Class[] classContext = hVar.getClassContext();
                String name = i.class.getName();
                int i11 = 0;
                while (i11 < classContext.length && !name.equals(classContext[i11].getName())) {
                    i11++;
                }
                if (i11 >= classContext.length || (i10 = i11 + 2) >= classContext.length) {
                    throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                }
                cls2 = classContext[i10];
            }
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                f.d("Detected logger name mismatch. Given name: \"" + bVarC.getName() + "\"; computed name: \"" + cls2.getName() + "\".");
                f.d("See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return bVarC;
    }

    public static b c(String str) {
        org.slf4j.helpers.c cVar;
        a aVar;
        if (f3432a == 0) {
            synchronized (d.class) {
                try {
                    if (f3432a == 0) {
                        f3432a = 1;
                        d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int i10 = f3432a;
        if (i10 == 1) {
            cVar = f3433b;
        } else {
            if (i10 == 2) {
                throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
            }
            if (i10 == 3) {
                cVar = f3436e;
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException("Unreachable code");
                }
                cVar = f3434c;
            }
        }
        switch (cVar.f25122a) {
            case 0:
                aVar = (u) cVar.f25123b;
                break;
            default:
                aVar = (W) cVar.f25123b;
                break;
        }
        return aVar.a(str);
    }

    public static final void d() {
        try {
            ArrayList arrayListA = a();
            h(arrayListA);
            if (arrayListA.isEmpty()) {
                f3432a = 4;
                f.d("No SLF4J providers were found.");
                f.d("Defaulting to no-operation (NOP) logger implementation");
                f.d("See https://www.slf4j.org/codes.html#noProviders for further details.");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = d.class.getClassLoader();
                    Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    while (systemResources.hasMoreElements()) {
                        linkedHashSet.add(systemResources.nextElement());
                    }
                } catch (IOException e2) {
                    f.a("Error getting resources from path", e2);
                }
                g(linkedHashSet);
            } else {
                f3436e = (org.slf4j.helpers.c) arrayListA.get(0);
                f3436e.getClass();
                f3436e.getClass();
                f3432a = 3;
                f(arrayListA);
            }
            e();
            if (f3432a == 3) {
                try {
                    switch (f3436e.f25122a) {
                        case 0:
                            boolean z10 = false;
                            for (String str : f3437f) {
                                if ("2.0.99".startsWith(str)) {
                                    z10 = true;
                                }
                            }
                            if (z10) {
                                return;
                            }
                            f.d("The requested version 2.0.99 by your slf4j provider is not compatible with " + Arrays.asList(f3437f).toString());
                            f.d("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                            return;
                        default:
                            throw new UnsupportedOperationException();
                    }
                } catch (Throwable th) {
                    f.a("Unexpected problem occurred during version sanity check", th);
                }
            }
        } catch (Exception e4) {
            f3432a = 2;
            f.a("Failed to instantiate SLF4J LoggerFactory", e4);
            throw new IllegalStateException("Unexpected initialization failure", e4);
        }
    }

    public static void e() {
        org.slf4j.helpers.c cVar = f3433b;
        synchronized (cVar) {
            try {
                ((W) cVar.f25123b).f2397a = true;
                W w10 = (W) cVar.f25123b;
                w10.getClass();
                for (g gVar : new ArrayList(((ConcurrentHashMap) w10.f2398b).values())) {
                    gVar.f25127b = c(gVar.f25126a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) ((W) f3433b.f25123b).f2399c;
        int size = linkedBlockingQueue.size();
        ArrayList<Fa.c> arrayList = new ArrayList(ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);
        int i10 = 0;
        while (linkedBlockingQueue.drainTo(arrayList, ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD) != 0) {
            for (Fa.c cVar2 : arrayList) {
                if (cVar2 != null) {
                    g gVar2 = cVar2.f4679b;
                    String str = gVar2.f25126a;
                    if (gVar2.f25127b == null) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!(gVar2.f25127b instanceof org.slf4j.helpers.b)) {
                        if (!gVar2.b()) {
                            f.d(str);
                        } else if (gVar2.B(cVar2.f4678a) && gVar2.b()) {
                            try {
                                gVar2.f25129d.invoke(gVar2.f25127b, cVar2);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i11 = i10 + 1;
                if (i10 == 0) {
                    if (cVar2.f4679b.b()) {
                        f.d("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        f.d("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        f.d("See also https://www.slf4j.org/codes.html#replay");
                    } else if (!(cVar2.f4679b.f25127b instanceof org.slf4j.helpers.b)) {
                        f.d("The following set of substitute loggers may have been accessed");
                        f.d("during the initialization phase. Logging calls during this");
                        f.d("phase were not honored. However, subsequent logging calls to these");
                        f.d("loggers will work as normally expected.");
                        f.d("See also https://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i10 = i11;
            }
            arrayList.clear();
        }
        W w11 = (W) f3433b.f25123b;
        ((ConcurrentHashMap) w11.f2398b).clear();
        ((LinkedBlockingQueue) w11.f2399c).clear();
    }

    public static void f(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No providers were found which is impossible after successful initialization.");
        }
        if (arrayList.size() > 1) {
            String str = "Actual provider is of type [" + arrayList.get(0) + "]";
            if (f.c(org.slf4j.helpers.d.INFO)) {
                f.b().println("SLF4J(I): " + str);
                return;
            }
            return;
        }
        String str2 = "Connected with provider of type [" + ((org.slf4j.helpers.c) arrayList.get(0)).getClass().getName() + "]";
        if (f.c(org.slf4j.helpers.d.DEBUG)) {
            f.b().println("SLF4J(D): " + str2);
        }
    }

    public static void g(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        f.d("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            f.d("Ignoring binding found at [" + ((URL) it.next()) + "]");
        }
        f.d("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    public static void h(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            f.d("Class path contains multiple SLF4J providers.");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f.d("Found provider [" + ((org.slf4j.helpers.c) it.next()) + "]");
            }
            f.d("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}
