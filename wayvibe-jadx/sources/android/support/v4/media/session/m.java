package android.support.v4.media.session;

import O2.HandlerC0689c;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14391c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HandlerC0689c f14393e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14389a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f14390b = new l(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference f14392d = new WeakReference(null);

    public final void a(o oVar, Handler handler) {
        if (this.f14391c) {
            this.f14391c = false;
            handler.removeMessages(1);
            PlaybackStateCompat playbackStateCompatD = oVar.d();
            long j10 = playbackStateCompatD == null ? 0L : playbackStateCompatD.f14365e;
            boolean z10 = playbackStateCompatD != null && playbackStateCompatD.f14361a == 3;
            boolean z11 = (516 & j10) != 0;
            boolean z12 = (j10 & 514) != 0;
            if (z10 && z12) {
                g();
            } else {
                if (z10 || !z11) {
                    return;
                }
                h();
            }
        }
    }

    public boolean f(Intent intent) {
        o oVar;
        HandlerC0689c handlerC0689c;
        KeyEvent keyEvent;
        if (Build.VERSION.SDK_INT < 27) {
            synchronized (this.f14389a) {
                oVar = (o) this.f14392d.get();
                handlerC0689c = this.f14393e;
            }
            if (oVar != null && handlerC0689c != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                p223v2.u uVarC = oVar.c();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79 && keyCode != 85) {
                    a(oVar, handlerC0689c);
                    return false;
                }
                if (keyEvent.getRepeatCount() != 0) {
                    a(oVar, handlerC0689c);
                    return true;
                }
                if (!this.f14391c) {
                    this.f14391c = true;
                    handlerC0689c.sendMessageDelayed(handlerC0689c.obtainMessage(1, uVarC), ViewConfiguration.getDoubleTapTimeout());
                    return true;
                }
                handlerC0689c.removeMessages(1);
                this.f14391c = false;
                PlaybackStateCompat playbackStateCompatD = oVar.d();
                if (((playbackStateCompatD == null ? 0L : playbackStateCompatD.f14365e) & 32) != 0) {
                    y();
                }
                return true;
            }
        }
        return false;
    }

    public void B() {
    }

    public void e() {
    }

    public void g() {
    }

    public void h() {
    }

    public void l() {
    }

    public void q() {
    }

    public void y() {
    }

    public void z() {
    }

    public void A(long j10) {
    }

    public void b(MediaDescriptionCompat mediaDescriptionCompat) {
    }

    public void p(MediaDescriptionCompat mediaDescriptionCompat) {
    }

    public void r(long j10) {
    }

    public void s(boolean z10) {
    }

    public void t(float f10) {
    }

    public void u(RatingCompat ratingCompat) {
    }

    public void w(int i10) {
    }

    public void x(int i10) {
    }

    public void c(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
    }

    public void d(String str, Bundle bundle) {
    }

    public void i(String str, Bundle bundle) {
    }

    public void j(String str, Bundle bundle) {
    }

    public void k(Uri uri, Bundle bundle) {
    }

    public void m(String str, Bundle bundle) {
    }

    public void n(String str, Bundle bundle) {
    }

    public void o(Uri uri, Bundle bundle) {
    }

    public void v(RatingCompat ratingCompat, Bundle bundle) {
    }
}
