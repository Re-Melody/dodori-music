package p206t6;

import B2.r;
import G7.e;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f26878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IntentFilter f26879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f26880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f26881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r f26882e;

    public c(Context context) {
        e eVar = new e("AppUpdateListenerRegistry");
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
        this.f26881d = new HashSet();
        this.f26882e = null;
        this.f26878a = eVar;
        this.f26879b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.f26880c = applicationContext != null ? applicationContext : context;
    }

    public final void a() {
        r rVar;
        HashSet hashSet = this.f26881d;
        boolean zIsEmpty = hashSet.isEmpty();
        Context context = this.f26880c;
        if (!zIsEmpty && this.f26882e == null) {
            r rVar2 = new r(this, 3);
            this.f26882e = rVar2;
            int i10 = Build.VERSION.SDK_INT;
            IntentFilter intentFilter = this.f26879b;
            if (i10 >= 33) {
                context.registerReceiver(rVar2, intentFilter, 2);
            } else {
                context.registerReceiver(rVar2, intentFilter);
            }
        }
        if (!hashSet.isEmpty() || (rVar = this.f26882e) == null) {
            return;
        }
        context.unregisterReceiver(rVar);
        this.f26882e = null;
    }
}
