package p223v2;

import Ja.a;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Handler.Callback, AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f27435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f27436b;

    public d(a aVar, Handler handler) {
        this.f27436b = aVar;
        this.f27435a = new Handler(handler.getLooper(), this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 2782386) {
            return false;
        }
        this.f27436b.onAudioFocusChange(message.arg1);
        return true;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        Handler handler = this.f27435a;
        handler.sendMessage(Message.obtain(handler, 2782386, i10, 0));
    }
}
