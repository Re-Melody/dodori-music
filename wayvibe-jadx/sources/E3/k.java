package E3;

import B2.C;
import B2.u;
import java.util.regex.Pattern;
import p255y2.D;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f3088a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(u uVar) {
        uVar.getClass();
        String strH = uVar.h(p267z6.h.f29879c);
        return strH != null && strH.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        int i10 = C.f560a;
        String[] strArrSplit = str.split("\\.", 2);
        long j10 = 0;
        for (String str2 : strArrSplit[0].split(":", -1)) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (strArrSplit.length == 2) {
            j11 += Long.parseLong(strArrSplit[1]);
        }
        return j11 * 1000;
    }

    public static void d(u uVar) throws D {
        int i10 = uVar.f631b;
        if (a(uVar)) {
            return;
        }
        uVar.F(i10);
        throw D.a(null, "Expected WEBVTT. Got " + uVar.h(p267z6.h.f29879c));
    }
}
