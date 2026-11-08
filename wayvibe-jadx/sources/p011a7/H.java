package p011a7;

import Z6.C1004i;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class H implements OnSuccessListener, OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f14193b;

    public /* synthetic */ H(int i10, TaskCompletionSource taskCompletionSource) {
        this.f14192a = i10;
        this.f14193b = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("q", "Failed to get reCAPTCHA token with error [" + exc.getMessage() + "]- calling backend without app verification");
        boolean z10 = exc instanceof C1004i;
        TaskCompletionSource taskCompletionSource = this.f14193b;
        if (z10 && ((C1004i) exc).f13983a.endsWith("UNAUTHORIZED_DOMAIN")) {
            taskCompletionSource.setException(exc);
        } else {
            taskCompletionSource.setResult(new J(null, null, null));
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.f14192a) {
            case 0:
                this.f14193b.setResult(new J(null, null, (String) obj));
                break;
            default:
                this.f14193b.setResult(new J((String) obj, null, null));
                break;
        }
    }
}
