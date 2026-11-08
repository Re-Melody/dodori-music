package U4;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f12225a = Pattern.compile("^NOTE(( |\t).*)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f12226b = Pattern.compile("^\ufeff?WEBVTT(( |\t).*)?$");

    public static long a(String str) {
        String[] strArrSplit = str.split("\\.", 2);
        long j10 = 0;
        for (String str2 : strArrSplit[0].split(":")) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (strArrSplit.length == 2) {
            j11 += Long.parseLong(strArrSplit[1]);
        }
        return j11 * 1000;
    }

    public static void b(X4.f fVar) throws N4.f {
        String strT = fVar.t();
        if (strT == null || !f12226b.matcher(strT).matches()) {
            throw new N4.f(p134m1.b.k("Expected WEBVTT. Got ", strT));
        }
    }

    public static float c(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }
}
