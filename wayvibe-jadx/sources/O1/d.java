package O1;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface d {
    boolean isAvailableOnDevice();

    void onClearCredential(a aVar, CancellationSignal cancellationSignal, Executor executor, c cVar);

    void onGetCredential(Context context, k kVar, CancellationSignal cancellationSignal, Executor executor, c cVar);
}
