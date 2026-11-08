package android.support.v4.media.session;

import O2.HandlerC0689c;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaMetadataCompat;
import com.ryanheise.audioservice.AudioService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaSession f14396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f14397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaSessionCompat$Token f14398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f14399d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RemoteCallbackList f14400e = new RemoteCallbackList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PlaybackStateCompat f14401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f14402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MediaMetadataCompat f14403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f14404i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14405j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public m f14406l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p223v2.u f14407m;

    public o(AudioService audioService) {
        MediaSession mediaSessionA = a(audioService);
        this.f14396a = mediaSessionA;
        n nVar = new n(this);
        this.f14397b = nVar;
        this.f14398c = new MediaSessionCompat$Token(mediaSessionA.getSessionToken(), nVar);
        mediaSessionA.setFlags(3);
    }

    public MediaSession a(AudioService audioService) {
        return new MediaSession(audioService, "media-session");
    }

    public final m b() {
        m mVar;
        synchronized (this.f14399d) {
            mVar = this.f14406l;
        }
        return mVar;
    }

    public p223v2.u c() {
        p223v2.u uVar;
        synchronized (this.f14399d) {
            uVar = this.f14407m;
        }
        return uVar;
    }

    public final PlaybackStateCompat d() {
        return this.f14401f;
    }

    public final void e(m mVar, Handler handler) {
        synchronized (this.f14399d) {
            this.f14406l = mVar;
            this.f14396a.setCallback(mVar == null ? null : mVar.f14390b, handler);
            if (mVar != null) {
                synchronized (mVar.f14389a) {
                    try {
                        mVar.f14392d = new WeakReference(this);
                        HandlerC0689c handlerC0689c = mVar.f14393e;
                        HandlerC0689c handlerC0689c2 = null;
                        if (handlerC0689c != null) {
                            handlerC0689c.removeCallbacksAndMessages(null);
                        }
                        if (handler != null) {
                            handlerC0689c2 = new HandlerC0689c(mVar, handler.getLooper(), 1);
                        }
                        mVar.f14393e = handlerC0689c2;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public void f(p223v2.u uVar) {
        synchronized (this.f14399d) {
            this.f14407m = uVar;
        }
    }
}
