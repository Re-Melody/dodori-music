package V0;

import D7.W;
import U.C0906q;
import android.util.Log;
import com.google.android.gms.internal.play_billing.zzfc;
import com.google.android.recaptcha.internal.zzln;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyList;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyListKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class p {
    public static int A(int i10, int i11, int i12, int i13) {
        return (i10 * i11) + i12 + i13;
    }

    public static String B(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static int C(int i10, int i11, int i12, int i13) {
        return zzfc.zzy(i10) + i11 + i12 + i13;
    }

    public static int a(int i10, int i11, int i12) {
        return zzfc.zzy(i10) + i11 + i12;
    }

    public static int b(int i10, int i11, int i12, int i13) {
        return ((i10 * i11) / i12) + i13;
    }

    public static int c(int i10, int i11, int i12, int i13, int i14) {
        return Math.max(((i10 * i11) / i12) + i13, i14);
    }

    public static long d(long j10, long j11, long j12, long j13) {
        return ((j10 * j11) + j12) * j13;
    }

    public static NonEmptyList e(Result[] resultArr) {
        return NonEmptyListKt.toNonEmptyListOrNull(ResultKt.collectErrors(W.U(resultArr)));
    }

    public static ClassCastException f(int i10, ArrayList arrayList) {
        arrayList.get(i10).getClass();
        return new ClassCastException();
    }

    public static ClassCastException g(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static Object h(C0906q c0906q, boolean z10, int i10) {
        c0906q.q(z10);
        c0906q.T(i10);
        return c0906q.I();
    }

    public static String i(int i10, int i11, String str) {
        return str.substring(i11, str.length() - i10);
    }

    public static String j(long j10, String str) {
        return str + j10;
    }

    public static String k(long j10, String str, StringBuilder sb) {
        sb.append(j10);
        sb.append(str);
        return sb.toString();
    }

    public static String l(LogLevel logLevel, StringBuilder sb) {
        sb.append(logLevel.name());
        return sb.toString();
    }

    public static String m(String str, androidx.fragment.app.F f10, String str2) {
        return str + f10 + str2;
    }

    public static String n(String str, String str2) {
        return str + str2;
    }

    public static String o(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String p(String str, String str2, String str3, Throwable th) {
        return str + th + str2 + str3;
    }

    public static String q(StringBuilder sb, int i10, char c3) {
        sb.append(i10);
        sb.append(c3);
        return sb.toString();
    }

    public static String r(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static StringBuilder s(String str, long j10, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j10);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder t(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder u(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static void v(int i10, String str, String str2) {
        Log.e(str2, str + i10);
    }

    public static void w(LogLevel logLevel, StringBuilder sb, LogHandler logHandler, String str) {
        sb.append(logLevel.name());
        logHandler.d(sb.toString(), str);
    }

    public static void x(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void y(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static int z(int i10, int i11, int i12) {
        return zzln.zzA(i10) + i11 + i12;
    }
}
