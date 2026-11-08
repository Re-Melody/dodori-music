package android.support.v4.media;

import G0.AbstractC0454b;
import W9.j;
import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Process;
import android.support.v4.media.session.MediaSessionCompat$Token;
import p199t.C2230e;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaBrowser f14338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f14339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f14340d = new a(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2230e f14341e = new C2230e(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j f14342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Messenger f14343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MediaSessionCompat$Token f14344h;

    public c(Context context, ComponentName componentName, AbstractC0454b abstractC0454b) {
        this.f14337a = context;
        Bundle bundle = new Bundle();
        this.f14339c = bundle;
        bundle.putInt("extra_client_version", 1);
        bundle.putInt("extra_calling_pid", Process.myPid());
        abstractC0454b.f5186b = this;
        this.f14338b = new MediaBrowser(context, componentName, (b) abstractC0454b.f5185a, bundle);
    }
}
