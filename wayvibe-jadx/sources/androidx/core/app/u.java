package androidx.core.app;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f14950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f14951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CharSequence f14955f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PendingIntent f14956g;

    public u(int i10, String str, PendingIntent pendingIntent) {
        IconCompat iconCompatD = i10 != 0 ? IconCompat.d(null, "", i10) : null;
        Bundle bundle = new Bundle();
        this.f14953d = true;
        this.f14951b = iconCompatD;
        if (iconCompatD != null) {
            int iIntValue = iconCompatD.f14979a;
            if (iIntValue == -1) {
                int i11 = Build.VERSION.SDK_INT;
                Object obj = iconCompatD.f14980b;
                if (i11 >= 28) {
                    iIntValue = C1.b.n(obj);
                } else {
                    try {
                        iIntValue = ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
                    } catch (IllegalAccessException e2) {
                        Log.e("IconCompat", "Unable to get icon type " + obj, e2);
                        iIntValue = -1;
                    } catch (NoSuchMethodException e4) {
                        Log.e("IconCompat", "Unable to get icon type " + obj, e4);
                        iIntValue = -1;
                    } catch (InvocationTargetException e7) {
                        Log.e("IconCompat", "Unable to get icon type " + obj, e7);
                        iIntValue = -1;
                    }
                }
            }
            if (iIntValue == 2) {
                this.f14954e = iconCompatD.e();
            }
        }
        this.f14955f = w.b(str);
        this.f14956g = pendingIntent;
        this.f14950a = bundle;
        this.f14952c = true;
        this.f14953d = true;
    }
}
