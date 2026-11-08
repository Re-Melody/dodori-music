package p178q6;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f25678a;

    public d(e eVar) {
        this.f25678a = eVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        e eVar = this.f25678a;
        if (message.obj != null) {
            throw new ClassCastException();
        }
        synchronized (eVar.f25680a) {
            throw null;
        }
    }
}
