package p241x;

import M8.o;
import Q5.b;
import android.util.Log;
import androidx.compose.foundation.BorderModifierNodeElement;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import p067g0.r;
import p133m0.a;
import p143n0.c0;
import p143n0.e0;
import p250x8.e;
import p251x9.c;
import p251x9.d;
import p270z9.i;
import p270z9.q;

/* JADX INFO: renamed from: x.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2315s {
    public static final void a(d dVar) {
        m.f(dVar, "<this>");
        if ((dVar instanceof q ? (q) dVar : null) != null) {
            return;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + z.a(dVar.getClass()));
    }

    public static final i b(c cVar) {
        m.f(cVar, "<this>");
        i iVar = cVar instanceof i ? (i) cVar : null;
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + z.a(cVar.getClass()));
    }

    public static final r c(r rVar, float f10, long j10, c0 c0Var) {
        return rVar.then(new BorderModifierNodeElement(f10, new e0(j10), c0Var));
    }

    public static final void d(Z8.c cVar, e eVar) {
        cVar.invoke(new o(b.r(eVar)));
    }

    public static final void e(Z8.c callback, Object obj) {
        m.f(callback, "callback");
        callback.invoke(new o(obj));
    }

    public static final long f(float f10, long j10) {
        return p206t6.b.a(Math.max(0.0f, a.b(j10) - f10), Math.max(0.0f, a.c(j10) - f10));
    }

    public static ArrayList g(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }
}
