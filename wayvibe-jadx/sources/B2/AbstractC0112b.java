package B2;

import U.C0880d;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: B2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0112b {
    public static void A(StringBuilder sb, int i10, String str, String str2, String str3) {
        sb.append(i10);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        C0880d.U(sb.toString());
        throw null;
    }

    public static int a(int i10, int i11, String str) {
        return (str.hashCode() + i10) * i11;
    }

    public static E7.y b(E7.l lVar, Class cls) {
        lVar.getClass();
        return lVar.c(new L7.a(cls));
    }

    public static String c(char c3, String str, String str2) {
        return str + str2 + c3;
    }

    public static String d(int i10, String str, String str2) {
        return str + i10 + str2;
    }

    public static String e(String str, int i10, int i11, String str2) {
        return str + i10 + str2 + i11;
    }

    public static String f(String str, int i10, String str2, int i11, String str3) {
        return str + i10 + str2 + i11 + str3;
    }

    public static String g(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String h(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String i(StringBuilder sb, int i10, String str) {
        sb.append(i10);
        sb.append(str);
        return sb.toString();
    }

    public static String j(StringBuilder sb, String str, char c3) {
        sb.append(str);
        sb.append(c3);
        return sb.toString();
    }

    public static String k(StringBuilder sb, String str, int i10) {
        sb.append(str);
        sb.append(i10);
        return sb.toString();
    }

    public static String l(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static String m(StringBuilder sb, List list, char c3) {
        sb.append(list);
        sb.append(c3);
        return sb.toString();
    }

    public static String n(Object[] objArr, int i10, String str, StringBuilder sb) {
        sb.append(String.format(str, Arrays.copyOf(objArr, i10)));
        return sb.toString();
    }

    public static StringBuilder o(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder p(String str, int i10, String str2, int i11, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i10);
        sb.append(str2);
        sb.append(i11);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder q(String str, String str2) {
        kotlin.jvm.internal.m.e(str, str2);
        return new StringBuilder();
    }

    public static void r(int i10, String str, String str2) {
        AbstractC0111a.x(str2, str + i10);
    }

    public static void s(int i10, HashMap map, String str, int i11, String str2) {
        map.put(str, Integer.valueOf(i10));
        map.put(str2, Integer.valueOf(i11));
    }

    public static /* synthetic */ void t(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void u(String str, String str2, String str3) {
        AbstractC0111a.x(str3, str + str2);
    }

    public static void v(String str, za.g gVar, LinkedList linkedList) {
        linkedList.add(new Aa.a(str, gVar));
    }

    public static void w(StringBuilder sb, int i10, String str, String str2, String str3) {
        sb.append(i10);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void x(HashMap map, String str, Integer num, int i10, String str2) {
        map.put(str, num);
        map.put(str2, Integer.valueOf(i10));
    }

    public static String y(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static void z(String str, za.g gVar, LinkedList linkedList) {
        linkedList.add(new Aa.b(str, gVar));
    }
}
