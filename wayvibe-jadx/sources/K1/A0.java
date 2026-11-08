package K1;

import android.view.View;
import android.view.Window;
import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: loaded from: classes.dex */
public class A0 extends D7.W {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Window f7229g;

    public A0(Window window) {
        this.f7229g = window;
    }

    @Override // D7.W
    public final void g0(boolean z10) {
        Window window = this.f7229g;
        if (!z10) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(MediaPlayerException.ERROR_UNKNOWN);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }
}
