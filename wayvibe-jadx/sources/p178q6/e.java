package p178q6;

import android.os.Handler;
import android.os.Looper;
import p198s9.b;

/* JADX INFO: loaded from: classes.dex */
public final class e implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static e f25679b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f25680a;

    public e() {
        this.f25680a = new Object();
        new Handler(Looper.getMainLooper(), new d(this));
    }

    public e(Object obj) {
        this.f25680a = obj;
    }
}
