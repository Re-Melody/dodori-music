package p134m1;

import B2.C;
import F0.C0390h;
import U.C0906q;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p028c1.e;
import p143n0.C2096x;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static float a(float f10, float f11, float f12, float f13) {
        return ((f10 - f11) * f12) + f13;
    }

    public static int b(float f10, int i10, int i11) {
        return (Float.hashCode(f10) + i10) * i11;
    }

    public static int c(int i10, int i11, int i12) {
        return (Integer.hashCode(i10) + i11) * i12;
    }

    public static int d(int i10, int i11, List list) {
        return (list.hashCode() + i10) * i11;
    }

    public static int e(int i10, int i11, Map map) {
        return (map.hashCode() + i10) * i11;
    }

    public static int f(int i10, int i11, boolean z10) {
        return (Boolean.hashCode(z10) + i10) * i11;
    }

    public static int g(long j10, int i10, int i11) {
        return (Long.hashCode(j10) + i10) * i11;
    }

    public static long h(long j10, long j11, long j12, long j13) {
        return (j10 * j11) + j12 + j13;
    }

    public static Object i(int i10, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i10);
    }

    public static String j(int i10, String str) {
        return str + i10;
    }

    public static String k(String str, String str2) {
        return str + str2;
    }

    public static String l(StringBuilder sb, float f10, char c3) {
        sb.append(f10);
        sb.append(c3);
        return sb.toString();
    }

    public static String m(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String n(StringBuilder sb, Map map, char c3) {
        sb.append(map);
        sb.append(c3);
        return sb.toString();
    }

    public static String o(StringBuilder sb, boolean z10, char c3) {
        sb.append(z10);
        sb.append(c3);
        return sb.toString();
    }

    public static StringBuilder p(int i10, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i10);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder q(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static void r(float f10, String str, StringBuilder sb) {
        sb.append((Object) e.b(f10));
        sb.append(str);
    }

    public static void s(int i10, int i11, int i12, int i13, int i14) {
        p240w9.b.a(i10);
        p240w9.b.a(i11);
        p240w9.b.a(i12);
        p240w9.b.a(i13);
        p240w9.b.a(i14);
    }

    public static void t(int i10, C0906q c0906q, int i11, C0390h c0390h) {
        c0906q.d0(Integer.valueOf(i10));
        c0906q.b(Integer.valueOf(i11), c0390h);
    }

    public static void u(long j10, String str, StringBuilder sb) {
        sb.append((Object) C2096x.i(j10));
        sb.append(str);
    }

    public static void v(String str, String str2, String str3, PrintWriter printWriter) {
        printWriter.println(str + str2 + str3);
    }

    public static void w(StringBuilder sb, int i10, String str, PrintWriter printWriter) {
        sb.append(i10);
        sb.append(str);
        printWriter.println(sb.toString());
    }

    public static void x(StringBuilder sb, String str, String str2, PrintWriter printWriter) {
        sb.append(str);
        sb.append(str2);
        printWriter.println(sb.toString());
    }

    public static void y(int i10, int i11, int i12, int i13, int i14) {
        C.D(i10);
        C.D(i11);
        C.D(i12);
        C.D(i13);
        C.D(i14);
    }
}
