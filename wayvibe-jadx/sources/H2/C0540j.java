package H2;

import B2.AbstractC0112b;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import p255y2.C2329e;

/* JADX INFO: renamed from: H2.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0540j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A8.b f5909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f5910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0538h f5911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final B2.r f5912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0539i f5913f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0536f f5914g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0541k f5915h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C2329e f5916i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f5917j;

    public C0540j(Context context, A8.b bVar, C2329e c2329e, C0541k c0541k) {
        Context applicationContext = context.getApplicationContext();
        this.f5908a = applicationContext;
        this.f5909b = bVar;
        this.f5916i = c2329e;
        this.f5915h = c0541k;
        int i10 = B2.C.f560a;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.f5910c = handler;
        int i11 = B2.C.f560a;
        this.f5911d = i11 >= 23 ? new C0538h(this, 0) : null;
        this.f5912e = i11 >= 21 ? new B2.r(this, 1) : null;
        C0536f c0536f = C0536f.f5898c;
        String str = B2.C.f562c;
        Uri uriFor = ("Amazon".equals(str) || "Xiaomi".equals(str)) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f5913f = uriFor != null ? new C0539i(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final void a(C0536f c0536f) {
        U2.p pVar;
        if (!this.f5917j || c0536f.equals(this.f5914g)) {
            return;
        }
        this.f5914g = c0536f;
        K k = (K) this.f5909b.f412b;
        k.getClass();
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = k.f5838i0;
        if (looper != looperMyLooper) {
            throw new IllegalStateException(AbstractC0112b.h("Current looper (", looperMyLooper == null ? "null" : looperMyLooper.getThread().getName(), ") is not the playback looper (", looper == null ? "null" : looper.getThread().getName(), ")"));
        }
        if (c0536f.equals(k.f5854x)) {
            return;
        }
        k.f5854x = c0536f;
        A.n nVar = k.f5849s;
        if (nVar != null) {
            N n6 = (N) nVar.f85a;
            synchronized (n6.f4098a) {
                pVar = n6.f4113q;
            }
            if (pVar != null) {
                synchronized (pVar.f12154c) {
                    pVar.f12158g.getClass();
                }
            }
        }
    }

    public final void b(AudioDeviceInfo audioDeviceInfo) {
        C0541k c0541k = this.f5915h;
        if (B2.C.a(audioDeviceInfo, c0541k == null ? null : c0541k.f5918a)) {
            return;
        }
        C0541k c0541k2 = audioDeviceInfo != null ? new C0541k(audioDeviceInfo) : null;
        this.f5915h = c0541k2;
        a(C0536f.c(this.f5908a, this.f5916i, c0541k2));
    }
}
