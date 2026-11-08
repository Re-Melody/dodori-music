package U7;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.support.v4.media.session.e f12291a = new android.support.v4.media.session.e(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public android.support.v4.media.session.f f12292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public android.support.v4.media.session.g f12293c;

    public final void a(int i10, Object obj, Bundle bundle) {
        android.support.v4.media.session.f fVar = this.f12292b;
        if (fVar != null) {
            Message messageObtainMessage = fVar.obtainMessage(i10, obj);
            messageObtainMessage.setData(bundle);
            messageObtainMessage.sendToTarget();
        }
    }

    public final void b(Handler handler) {
        if (handler != null) {
            android.support.v4.media.session.f fVar = new android.support.v4.media.session.f(this, handler.getLooper());
            this.f12292b = fVar;
            fVar.f14380a = true;
        } else {
            android.support.v4.media.session.f fVar2 = this.f12292b;
            if (fVar2 != null) {
                fVar2.f14380a = false;
                fVar2.removeCallbacksAndMessages(null);
                this.f12292b = null;
            }
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        a(8, null, null);
    }
}
