package O5;

import V0.p;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.util.Base64;
import com.amazon.a.a.o.b.f;
import com.google.android.gms.common.internal.E;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f9229a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f9230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f9231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f9232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Boolean f9233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f9234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f9235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Boolean f9236h;

    public static String a(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i10 = 0; i10 < length; i10++) {
            char[] cArr = f9229a;
            sb.append(cArr[(bArr[i10] & 240) >>> 4]);
            sb.append(cArr[bArr[i10] & 15]);
        }
        return sb.toString();
    }

    public static byte[] b(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    public static String c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }

    public static String d() throws Throwable {
        BufferedReader bufferedReader;
        if (f9234f == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f9234f = Application.getProcessName();
            } else {
                int iMyPid = f9235g;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    f9235g = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                strTrim = null;
                try {
                    if (iMyPid > 0) {
                        try {
                            StringBuilder sb = new StringBuilder(String.valueOf(iMyPid).length() + 14);
                            sb.append("/proc/");
                            sb.append(iMyPid);
                            sb.append("/cmdline");
                            String string = sb.toString();
                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            try {
                                bufferedReader = new BufferedReader(new FileReader(string));
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                try {
                                    String line = bufferedReader.readLine();
                                    E.h(line);
                                    strTrim = line.trim();
                                    bufferedReader.close();
                                } catch (IOException unused) {
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                    f9234f = strTrim;
                                    return f9234f;
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedReader2 = bufferedReader;
                                    if (bufferedReader2 != null) {
                                        try {
                                            bufferedReader2.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                throw th2;
                            }
                        } catch (IOException unused3) {
                            bufferedReader = null;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                } catch (IOException unused4) {
                }
                f9234f = strTrim;
            }
        }
        return f9234f;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002d  */
    public static byte[] e(Context context, String str) throws PackageManager.NameNotFoundException {
        MessageDigest messageDigest;
        PackageInfo packageInfo = Q5.c.a(context).f9063a.getPackageManager().getPackageInfo(str, 64);
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            for (int i10 = 0; i10 < 2; i10++) {
                try {
                    messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        if (messageDigest != null) {
                            return messageDigest.digest(packageInfo.signatures[0].toByteArray());
                        }
                    }
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            messageDigest = null;
            if (messageDigest != null) {
                return messageDigest.digest(packageInfo.signatures[0].toByteArray());
            }
        }
        return null;
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean g(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f9230b == null) {
            f9230b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f9230b.booleanValue();
        if (f9231c == null) {
            f9231c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (f9231c.booleanValue()) {
            return !f() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }

    public static void h(StringBuilder sb, HashMap map) {
        sb.append("{");
        boolean z10 = true;
        for (String str : map.keySet()) {
            if (!z10) {
                sb.append(f.f16451a);
            }
            String str2 = (String) map.get(str);
            p.x(sb, "\"", str, "\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                p.x(sb, "\"", str2, "\"");
            }
            z10 = false;
        }
        sb.append("}");
    }
}
