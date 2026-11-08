package V0;

import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public class o extends n {
    @Override // V0.n, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        M.A a10 = this.f12444b;
        if (a10 != null) {
            return a10.commitContent(inputContentInfo, i10, bundle);
        }
        return false;
    }
}
