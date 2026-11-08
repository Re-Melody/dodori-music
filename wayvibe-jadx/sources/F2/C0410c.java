package F2;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: renamed from: F2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0410c implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f4058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0411d f4059b;

    public C0410c(C0411d c0411d, Handler handler) {
        this.f4059b = c0411d;
        this.f4058a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        this.f4058a.post(new A1.l(this, i10, 1));
    }
}
