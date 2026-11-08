package Z7;

import android.media.session.MediaSession;
import android.view.Surface;
import android.view.SurfaceControl;
import com.ryanheise.audioservice.AudioService;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ MediaSession d(AudioService audioService) {
        return new MediaSession(audioService, "media-session", null);
    }

    public static /* synthetic */ Surface e(SurfaceControl surfaceControl) {
        return new Surface(surfaceControl);
    }

    public static /* synthetic */ SurfaceControl.Builder f() {
        return new SurfaceControl.Builder();
    }

    public static /* synthetic */ SurfaceControl.Transaction g() {
        return new SurfaceControl.Transaction();
    }

    public static /* bridge */ /* synthetic */ SurfaceControl.Transaction i(Object obj) {
        return (SurfaceControl.Transaction) obj;
    }

    public static /* synthetic */ void k() {
    }
}
