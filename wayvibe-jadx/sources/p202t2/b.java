package p202t2;

import Z4.G;
import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
public final class b extends FutureTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f26695a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, G g3) {
        super(g3);
        this.f26695a = aVar;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        a aVar = this.f26695a;
        try {
            Object obj = get();
            if (aVar.f26693d.get()) {
                return;
            }
            aVar.a(obj);
        } catch (InterruptedException e2) {
            Log.w("AsyncTask", e2);
        } catch (CancellationException unused) {
            if (aVar.f26693d.get()) {
                return;
            }
            aVar.a(null);
        } catch (ExecutionException e4) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e4.getCause());
        } catch (Throwable th) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}
