package com.amazon.a.a.b;

import android.app.Application;
import com.amazon.a.a.c.f;
import com.amazon.a.a.k.d;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public class b implements a, d, Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f16036a = new com.amazon.a.a.o.c("CrashManagerImpl");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f16037b = "s-";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f16038c = ".amzst";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f16039d = 99999;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f16040e = 5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private f f16041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private Application f16042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f16043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<c, String> f16044i = new HashMap();

    private void b() {
        if (Thread.getDefaultUncaughtExceptionHandler() instanceof a) {
            return;
        }
        if (com.amazon.a.a.o.c.f16456a) {
            f16036a.a("Registering Crash Handler");
        }
        this.f16043h = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    private boolean c() {
        return this.f16044i.size() >= 5;
    }

    private String[] d() {
        return new File(this.f16042g.getFilesDir().getAbsolutePath() + "/").list(new FilenameFilter() { // from class: com.amazon.a.a.b.b.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.endsWith(b.f16038c) && !b.this.f16044i.containsValue(str);
            }
        });
    }

    @Override // com.amazon.a.a.k.d
    public void e() {
        com.amazon.a.a.o.a.a.a();
        b();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (com.amazon.a.a.o.c.f16456a) {
            f16036a.a("Crash detected", th);
        }
        try {
            a(th);
            this.f16041f.a(new com.amazon.a.a.b.a.a());
        } catch (Throwable th2) {
            if (com.amazon.a.a.o.c.f16456a) {
                f16036a.a("Error occured while handling exception", th2);
            }
        }
        if (com.amazon.a.a.o.c.f16456a) {
            f16036a.a("Calling previous handler");
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f16043h;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    private void a(Throwable th) {
        try {
            a(a(new c(this.f16042g, th)));
        } catch (Throwable th2) {
            if (com.amazon.a.a.o.c.f16457b) {
                f16036a.b("Could not handle uncaught exception", th2);
            }
        }
    }

    private String c(String str) throws Throwable {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(str));
            while (bufferedReader2.ready()) {
                try {
                    sb.append(bufferedReader2.readLine());
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    com.amazon.a.a.o.a.a(bufferedReader);
                    throw th;
                }
            }
            com.amazon.a.a.o.a.a(bufferedReader2);
            return sb.toString();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private String e(String str) {
        return this.f16042g.getFilesDir().getAbsolutePath() + "/" + str;
    }

    private void d(String str) {
        try {
            new File(str).delete();
        } catch (Exception e2) {
            if (com.amazon.a.a.o.c.f16457b) {
                f16036a.b("Cannot delete file: " + str, e2);
            }
        }
    }

    private c b(String str) {
        try {
            return (c) com.amazon.a.a.o.c.a.a(c(str));
        } catch (Exception unused) {
            if (!com.amazon.a.a.o.c.f16457b) {
                return null;
            }
            f16036a.b("Failed to load crash report: " + str);
            return null;
        }
    }

    private String a(c cVar) {
        return com.amazon.a.a.o.c.a.a(cVar);
    }

    private synchronized void a(String str) {
        FileOutputStream fileOutputStreamOpenFileOutput = null;
        try {
            try {
                fileOutputStreamOpenFileOutput = this.f16042g.openFileOutput(f16037b + new Random().nextInt(f16039d) + f16038c, 0);
                fileOutputStreamOpenFileOutput.write(str.getBytes());
            } catch (Exception e2) {
                if (com.amazon.a.a.o.c.f16457b) {
                    f16036a.b("Coud not save crash report to file", e2);
                }
            }
            com.amazon.a.a.o.a.a(fileOutputStreamOpenFileOutput);
        } catch (Throwable th) {
            com.amazon.a.a.o.a.a(fileOutputStreamOpenFileOutput);
            throw th;
        }
    }

    @Override // com.amazon.a.a.b.a
    public List<c> a() {
        if (c()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArrD = d();
        for (int i10 = 0; i10 < strArrD.length && !c(); i10++) {
            String strE = e(strArrD[i10]);
            c cVarB = b(strE);
            if (cVarB != null) {
                this.f16044i.put(cVarB, strE);
                arrayList.add(cVarB);
            } else {
                d(strE);
            }
        }
        return arrayList;
    }

    @Override // com.amazon.a.a.b.a
    public void a(List<c> list) {
        for (c cVar : list) {
            d(this.f16044i.get(cVar));
            this.f16044i.remove(cVar);
        }
    }
}
