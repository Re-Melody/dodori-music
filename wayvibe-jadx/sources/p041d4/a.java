package p041d4;

import K1.z0;
import android.content.Context;
import android.view.WindowInsets;
import android.view.WindowManager;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f19281a = new a();

    public final z0 a(Context context) {
        m.f(context, "context");
        WindowInsets windowInsets = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getWindowInsets();
        m.e(windowInsets, "context.getSystemService…indowMetrics.windowInsets");
        return z0.g(null, windowInsets);
    }
}
