package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class f extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f14380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U7.g f14381b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(U7.g gVar, Looper looper) {
        super(looper);
        this.f14381b = gVar;
        this.f14380a = false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f14380a) {
            int i10 = message.what;
            U7.g gVar = this.f14381b;
            switch (i10) {
                case 1:
                    t.Q(message.getData());
                    gVar.getClass();
                    break;
                case 2:
                    gVar.getClass();
                    break;
                case 3:
                    gVar.getClass();
                    break;
                case 4:
                    gVar.getClass();
                    break;
                case 5:
                    gVar.getClass();
                    break;
                case 6:
                    gVar.getClass();
                    break;
                case 7:
                    t.Q((Bundle) message.obj);
                    gVar.getClass();
                    break;
                case 8:
                    gVar.getClass();
                    break;
                case 9:
                    ((Integer) message.obj).getClass();
                    gVar.getClass();
                    break;
                case 11:
                    ((Boolean) message.obj).getClass();
                    gVar.getClass();
                    break;
                case 12:
                    ((Integer) message.obj).getClass();
                    gVar.getClass();
                    break;
                case 13:
                    gVar.getClass();
                    break;
            }
        }
    }
}
