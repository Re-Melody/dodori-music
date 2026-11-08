package p244x2;

import G0.AbstractC0454b;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSession;
import android.os.Build;
import android.support.v4.media.c;
import android.support.v4.media.e;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.h;
import android.support.v4.media.session.i;
import android.view.KeyEvent;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC0454b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f28339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Intent f28340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BroadcastReceiver.PendingResult f28341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f28342f;

    public b(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        super(3);
        this.f28339c = context;
        this.f28340d = intent;
        this.f28341e = pendingResult;
    }

    @Override // G0.AbstractC0454b
    public final void k() {
        c cVar = this.f28342f.f14346a;
        if (cVar.f14344h == null) {
            MediaSession.Token sessionToken = cVar.f14338b.getSessionToken();
            cVar.f14344h = sessionToken != null ? new MediaSessionCompat$Token(sessionToken, null) : null;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = cVar.f14344h;
        if (mediaSessionCompat$Token == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        Collections.synchronizedSet(new HashSet());
        int i10 = Build.VERSION.SDK_INT;
        Context context = this.f28339c;
        h iVar = i10 >= 29 ? new i(context, mediaSessionCompat$Token) : new h(context, mediaSessionCompat$Token);
        KeyEvent keyEvent = (KeyEvent) this.f28340d.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null) {
            throw new IllegalArgumentException("KeyEvent may not be null");
        }
        iVar.f14383a.dispatchMediaButtonEvent(keyEvent);
        this.f28342f.a();
        this.f28341e.finish();
    }

    @Override // G0.AbstractC0454b
    public final void l() {
        this.f28342f.a();
        this.f28341e.finish();
    }

    @Override // G0.AbstractC0454b
    public final void m() {
        this.f28342f.a();
        this.f28341e.finish();
    }
}
