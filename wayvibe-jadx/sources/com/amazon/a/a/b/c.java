package com.amazon.a.a.b;

import android.app.ActivityManager;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.StatFs;
import com.amazon.a.a.o.e;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class c implements Serializable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final String f16049A = "deviceDisplay";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final String f16050B = "deviceBrand";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final String f16051C = "deviceBoard";

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final String f16052D = "androidVersion";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final String f16053E = "deviceModel";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final String f16054F = "packageFilePath";

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final String f16055G = "packageName";

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final String f16056H = "packageVersionName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f16057a = new com.amazon.a.a.o.c("CrashReport");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f16058b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f16059c = "([a-zA-Z0-9_.]+(Exception|Error))|(at\\s.*\\(.*\\))";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f16060d = "SHA1";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f16061e = "crashTime";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f16062f = "UTF-8";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f16063g = "crashId";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f16064h = "threadDump";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f16065i = "stackTrace";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f16066j = "threadAllocSize";
    private static final String k = "threadAllocCount";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f16067l = "nativeHeapFreeSize";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f16068m = "nativeHeapSize";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f16069n = "memLowThreshold";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f16070o = "memLowFlag";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f16071p = "availableInternalMemorySize";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f16072q = "totalInternalMemorySize";
    private static final String r = "deviceUser";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f16073s = "deviceType";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f16074t = "deviceTime";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f16075u = "deviceTags";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f16076v = "deviceProduct";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f16077w = "deviceManufacturer";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f16078x = "deviceId";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f16079y = "deviceHost";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f16080z = "deviceFingerPrint";

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final HashMap<String, String> f16081I = new LinkedHashMap();

    public c(Application application, Throwable th) {
        try {
            a(application, th);
        } catch (Throwable th2) {
            if (com.amazon.a.a.o.c.f16457b) {
                f16057a.b("Error collection crash report details", th2);
            }
        }
    }

    private void a(Application application, Throwable th) {
        b();
        a(application);
        c(application);
        a(th);
        e();
        f();
    }

    private void b() {
        this.f16081I.put(f16061e, new Date().toString());
    }

    private void c(Application application) {
        this.f16081I.put(f16053E, Build.MODEL);
        this.f16081I.put(f16052D, Build.VERSION.RELEASE);
        this.f16081I.put(f16051C, Build.BOARD);
        this.f16081I.put(f16050B, Build.BRAND);
        this.f16081I.put(f16049A, Build.DISPLAY);
        this.f16081I.put(f16080z, Build.FINGERPRINT);
        this.f16081I.put(f16079y, Build.HOST);
        this.f16081I.put(f16078x, Build.ID);
        this.f16081I.put(f16077w, Build.MANUFACTURER);
        this.f16081I.put(f16076v, Build.PRODUCT);
        this.f16081I.put(f16075u, Build.TAGS);
        this.f16081I.put(f16074t, Long.toString(Build.TIME));
        this.f16081I.put(f16073s, Build.TYPE);
        this.f16081I.put(r, Build.USER);
        this.f16081I.put(f16072q, Long.toString(d()));
        this.f16081I.put(f16071p, Long.toString(c()));
        ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
        if (activityManager != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            this.f16081I.put(f16070o, Boolean.toString(memoryInfo.lowMemory));
            this.f16081I.put(f16069n, Long.toString(memoryInfo.threshold));
        }
        this.f16081I.put(f16068m, Long.toString(Debug.getNativeHeapSize()));
        this.f16081I.put(f16067l, Long.toString(Debug.getNativeHeapAllocatedSize()));
        this.f16081I.put(k, Long.toString(Debug.getThreadAllocCount()));
        this.f16081I.put(f16066j, Long.toString(Debug.getThreadAllocSize()));
    }

    private long d() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
    }

    private void e() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            Thread key = entry.getKey();
            StackTraceElement[] value = entry.getValue();
            sb.append("Thread : " + key.getId());
            if (!e.a(key.getName())) {
                sb.append("/" + key.getName());
            }
            sb.append("\n");
            sb.append("isAlive : " + key.isAlive() + "\n");
            sb.append("isInterrupted : " + key.isInterrupted() + "\n");
            sb.append("isDaemon : " + key.isDaemon() + "\n");
            for (StackTraceElement stackTraceElement : value) {
                sb.append("\tat " + stackTraceElement + "\n");
            }
            sb.append("\n\n");
        }
        this.f16081I.put(f16064h, sb.toString());
    }

    private void f() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f16081I.get(f16055G));
            sb.append(this.f16081I.get(f16056H));
            sb.append(this.f16081I.get(f16052D));
            String str = this.f16081I.get(f16065i);
            if (str != null) {
                Matcher matcher = Pattern.compile(f16059c).matcher(str);
                while (matcher.find()) {
                    sb.append(matcher.group());
                }
            }
            this.f16081I.put(f16063g, new BigInteger(MessageDigest.getInstance(f16060d).digest(sb.toString().getBytes(f16062f))).abs().toString(16));
        } catch (Exception e2) {
            if (com.amazon.a.a.o.c.f16457b) {
                f16057a.b("Error capturing crash id", e2);
            }
        }
    }

    private PackageInfo b(Application application) {
        try {
            return application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e2) {
            if (!com.amazon.a.a.o.c.f16457b) {
                return null;
            }
            f16057a.b("Unable to fetch package info", e2);
            return null;
        }
    }

    private void a(Application application) {
        PackageInfo packageInfoB = b(application);
        if (packageInfoB == null) {
            return;
        }
        this.f16081I.put(f16056H, packageInfoB.versionName);
        this.f16081I.put(f16055G, packageInfoB.packageName);
        this.f16081I.put(f16054F, application.getFilesDir().getAbsolutePath());
    }

    private void a(Throwable th) {
        StringBuilder sb = new StringBuilder();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        sb.append(stringWriter.toString());
        sb.append("\n");
        Throwable cause = th.getCause();
        while (cause != null) {
            cause.printStackTrace(printWriter);
            sb.append(stringWriter.toString());
            cause = cause.getCause();
            sb.append("\n\n");
        }
        printWriter.close();
        this.f16081I.put(f16065i, sb.toString());
    }

    public Map<String, String> a() {
        return this.f16081I;
    }

    private long c() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }
}
