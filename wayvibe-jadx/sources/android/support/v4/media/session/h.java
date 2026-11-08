package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.RemoteException;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaController f14383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14384b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f14385c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f14386d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MediaSessionCompat$Token f14387e;

    public h(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f14387e = mediaSessionCompat$Token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) mediaSessionCompat$Token.f14353b);
        this.f14383a = mediaController;
        if (mediaSessionCompat$Token.g() == null) {
            MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = new MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(null);
            mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.f14347a = new WeakReference(this);
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
        }
    }

    public final void a() {
        MediaSessionCompat$Token mediaSessionCompat$Token = this.f14387e;
        if (mediaSessionCompat$Token.g() == null) {
            return;
        }
        ArrayList<U7.g> arrayList = this.f14385c;
        for (U7.g gVar : arrayList) {
            g gVar2 = new g(gVar);
            this.f14386d.put(gVar, gVar2);
            gVar.f12293c = gVar2;
            try {
                mediaSessionCompat$Token.g().b(gVar2);
                gVar.a(13, null, null);
            } catch (RemoteException e2) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e2);
            }
        }
        arrayList.clear();
    }

    public final void b(U7.g gVar) {
        this.f14383a.unregisterCallback(gVar.f12291a);
        synchronized (this.f14384b) {
            if (this.f14387e.g() != null) {
                try {
                    g gVar2 = (g) this.f14386d.remove(gVar);
                    if (gVar2 != null) {
                        gVar.f12293c = null;
                        this.f14387e.g().v(gVar2);
                    }
                } catch (RemoteException e2) {
                    Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e2);
                }
            } else {
                this.f14385c.remove(gVar);
            }
        }
    }
}
