package H5;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class l extends zau {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f6055b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f6055b = eVar;
        this.f6054a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        int i11 = f.f6042a;
        e eVar = this.f6055b;
        Context context = this.f6054a;
        int iC = eVar.c(context, i11);
        AtomicBoolean atomicBoolean = i.f6044a;
        if (iC == 1 || iC == 2 || iC == 3 || iC == 9) {
            Intent intentA = eVar.a(iC, context, "n");
            eVar.g(context, iC, intentA == null ? null : PendingIntent.getActivity(context, 0, intentA, 201326592));
        }
    }
}
