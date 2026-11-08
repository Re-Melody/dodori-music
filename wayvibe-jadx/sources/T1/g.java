package T1;

import O1.k;
import android.os.CancellationSignal;
import android.util.Log;
import java.util.Iterator;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static boolean a(CancellationSignal cancellationSignal) {
        if (cancellationSignal == null) {
            Log.i("PlayServicesImpl", "No cancellationSignal found");
            return false;
        }
        if (!cancellationSignal.isCanceled()) {
            return false;
        }
        Log.i("PlayServicesImpl", "the flow has been canceled");
        return true;
    }

    public static boolean b(k request) {
        m.f(request, "request");
        Iterator it = request.f9016a.iterator();
        while (it.hasNext()) {
            if (((O1.m) it.next()) instanceof p043d6.b) {
                return true;
            }
        }
        return false;
    }
}
