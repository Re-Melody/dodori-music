package p207t7;

import V0.p;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static q f26946a = q.WARN;

    public static void a(String str, String str2, Object... objArr) {
        b(q.DEBUG, str, str2, objArr);
    }

    public static void b(q qVar, String str, String str2, Object... objArr) {
        if (qVar.ordinal() >= f26946a.ordinal()) {
            String strConcat = p.o("(25.1.4) [", str, "]: ").concat(String.format(str2, objArr));
            int i10 = p.f26945a[qVar.ordinal()];
            if (i10 == 1) {
                Log.i("Firestore", strConcat);
            } else if (i10 == 2) {
                Log.w("Firestore", strConcat);
            } else if (i10 == 3) {
                throw new IllegalStateException("Trying to log something on level NONE");
            }
        }
    }

    public static boolean c() {
        return f26946a.ordinal() >= q.DEBUG.ordinal();
    }

    public static void d(String str, String str2, Object... objArr) {
        b(q.WARN, str, str2, objArr);
    }
}
