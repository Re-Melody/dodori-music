package p233w2;

import B2.s;
import D8.AbstractC0311s0;
import android.app.Notification;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat$Token;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC0311s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f27845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MediaSessionCompat$Token f27846c;

    @Override // D8.AbstractC0311s0
    public final void a(s sVar) {
        int i10 = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) sVar.f619b;
        if (i10 >= 34) {
            a.d(builder, a.b(b.a(a.a(), null, 0, null, Boolean.FALSE), this.f27845b, this.f27846c));
        } else {
            a.d(builder, a.b(a.a(), this.f27845b, this.f27846c));
        }
    }
}
