package p206t6;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import p226v6.a;

/* JADX INFO: loaded from: classes.dex */
public final class h extends g {
    @Override // p206t6.g, p216u6.i
    public final void P(Bundle bundle) {
        super.P(bundle);
        int i10 = bundle.getInt("error.code", -2);
        TaskCompletionSource taskCompletionSource = this.f26892b;
        if (i10 != 0) {
            taskCompletionSource.trySetException(new a(bundle.getInt("error.code", -2)));
        } else {
            taskCompletionSource.trySetResult(null);
        }
    }
}
