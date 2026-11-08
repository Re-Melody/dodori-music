package U1;

import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.ResultReceiver;
import com.revenuecat.purchases.common.networking.ETagPayloadStore;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f12053a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f12054b = R3.a.c0(7, 20);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f12055c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f12056d = 0;

    public static void a(ResultReceiver resultReceiver, Intent intent, String str) {
        m.f(resultReceiver, "resultReceiver");
        intent.putExtra("TYPE", str);
        intent.putExtra("ACTIVITY_REQUEST_CODE", f12055c);
        Parcel parcelObtain = Parcel.obtain();
        m.e(parcelObtain, "obtain(...)");
        resultReceiver.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        intent.putExtra("RESULT_RECEIVER", resultReceiver2);
        intent.setFlags(ETagPayloadStore.CHUNK_CHARS);
    }

    public static boolean b(Bundle bundle, Z8.e eVar, Executor executor, O1.c cVar, CancellationSignal cancellationSignal) {
        if (!bundle.getBoolean("FAILURE_RESPONSE")) {
            return false;
        }
        Q5.b.k(cancellationSignal, new b(executor, cVar, eVar.invoke(bundle.getString("EXCEPTION_TYPE"), bundle.getString("EXCEPTION_MESSAGE")), 0));
        return true;
    }
}
