package org.slf4j.helpers;

import com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge;
import java.io.PrintStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f25124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f25125b;

    static {
        e eVar;
        d dVar;
        String[] strArr = {"System.out", "stdout", "sysout"};
        String property = System.getProperty("slf4j.internal.report.stream");
        if (property != null && !property.isEmpty()) {
            int i10 = 0;
            while (true) {
                if (i10 >= 3) {
                    eVar = e.Stderr;
                    break;
                } else {
                    if (strArr[i10].equalsIgnoreCase(property)) {
                        eVar = e.Stdout;
                        break;
                    }
                    i10++;
                }
            }
        } else {
            eVar = e.Stderr;
        }
        f25124a = eVar;
        String property2 = System.getProperty("slf4j.internal.verbosity");
        if (property2 == null || property2.isEmpty()) {
            dVar = d.INFO;
        } else if (property2.equalsIgnoreCase("DEBUG")) {
            dVar = d.DEBUG;
        } else if (property2.equalsIgnoreCase(HybridPurchaseLogicBridge.RESULT_ERROR)) {
            dVar = d.ERROR;
        } else {
            dVar = property2.equalsIgnoreCase("WARN") ? d.WARN : d.INFO;
        }
        f25125b = dVar;
    }

    public static final void a(String str, Throwable th) {
        b().println("SLF4J(E): " + str);
        b().println("SLF4J(E): Reported exception:");
        th.printStackTrace(b());
    }

    public static PrintStream b() {
        return f25124a.ordinal() != 1 ? System.err : System.out;
    }

    public static boolean c(d dVar) {
        return dVar.levelInt >= f25125b.levelInt;
    }

    public static final void d(String str) {
        if (c(d.WARN)) {
            b().println("SLF4J(W): " + str);
        }
    }
}
