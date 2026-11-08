package H5;

import B2.AbstractC0112b;
import E9.z;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.app.u;
import androidx.core.app.v;
import androidx.core.app.w;
import androidx.fragment.app.AbstractC1083h0;
import androidx.fragment.app.C1068a;
import androidx.fragment.app.K;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.InterfaceC1147n;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.internal.y;

/* JADX INFO: loaded from: classes.dex */
public final class e extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f6040c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f6041d = new e();

    public static AlertDialog e(Activity activity, int i10, y yVar, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(x.b(activity, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i10 == 1) {
            string = resources.getString(app.nagakiba.wayvibe.R.string.common_google_play_services_install_button);
        } else if (i10 != 2) {
            string = i10 != 3 ? resources.getString(R.string.ok) : resources.getString(app.nagakiba.wayvibe.R.string.common_google_play_services_enable_button);
        } else {
            string = resources.getString(app.nagakiba.wayvibe.R.string.common_google_play_services_update_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, yVar);
        }
        String strC = x.c(activity, i10);
        if (strC != null) {
            builder.setTitle(strC);
        }
        Log.w("GoogleApiAvailability", p134m1.b.j(i10, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void f(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof K) {
                AbstractC1083h0 supportFragmentManager = ((K) activity).getSupportFragmentManager();
                k kVar = new k();
                E.i(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                kVar.f6051o = alertDialog;
                if (onCancelListener != null) {
                    kVar.f6052p = onCancelListener;
                }
                kVar.f15437l = false;
                kVar.f15438m = true;
                supportFragmentManager.getClass();
                C1068a c1068a = new C1068a(supportFragmentManager);
                c1068a.f15260o = true;
                c1068a.e(0, kVar, str);
                c1068a.d(false);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        E.i(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.f6033a = alertDialog;
        if (onCancelListener != null) {
            cVar.f6034b = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    @Override // H5.f
    public final int b(Context context) {
        return c(context, f.f6042a);
    }

    public final void d(GoogleApiActivity googleApiActivity, int i10, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogE = e(googleApiActivity, i10, new y(super.a(i10, googleApiActivity, com.apple.android.music.playback.reporting.d.f17633a), googleApiActivity, 0), googleApiActivity2);
        if (alertDialogE == null) {
            return;
        }
        f(googleApiActivity, alertDialogE, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void g(Context context, int i10, PendingIntent pendingIntent) {
        int i11;
        Log.w("GoogleApiAvailability", AbstractC0112b.d(i10, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i10 == 18) {
            new l(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = i10 == 6 ? x.e(context, "common_google_play_services_resolution_required_title") : x.c(context, i10);
        if (strE == null) {
            strE = context.getResources().getString(app.nagakiba.wayvibe.R.string.common_google_play_services_notification_ticker);
        }
        String strD = (i10 == 6 || i10 == 19) ? x.d(context, "common_google_play_services_resolution_required_text", x.a(context)) : x.b(context, i10);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        E.h(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        w wVar = new w(context, null);
        wVar.f14969m = true;
        wVar.c(16, true);
        wVar.f14962e = w.b(strE);
        v vVar = new v();
        vVar.f14957b = w.b(strD);
        wVar.e(vVar);
        PackageManager packageManager = context.getPackageManager();
        if (O5.a.f9230b == null) {
            O5.a.f9230b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (O5.a.f9230b.booleanValue()) {
            wVar.f14976u.icon = context.getApplicationInfo().icon;
            wVar.f14966i = 2;
            if (O5.a.g(context)) {
                wVar.f14959b.add(new u(2131230844, resources.getString(app.nagakiba.wayvibe.R.string.common_open_on_phone), pendingIntent));
            } else {
                wVar.f14964g = pendingIntent;
            }
        } else {
            wVar.f14976u.icon = R.drawable.stat_sys_warning;
            wVar.f14976u.tickerText = w.b(resources.getString(app.nagakiba.wayvibe.R.string.common_google_play_services_notification_ticker));
            wVar.f14976u.when = System.currentTimeMillis();
            wVar.f14964g = pendingIntent;
            wVar.f14963f = w.b(strD);
        }
        if (O5.a.f()) {
            if (!O5.a.f()) {
                throw new IllegalStateException();
            }
            synchronized (f6040c) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(app.nagakiba.wayvibe.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(z.d(string));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            wVar.r = "com.google.android.gms.availability";
        }
        Notification notificationA = wVar.a();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            i.f6044a.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, notificationA);
    }

    public final void h(Activity activity, InterfaceC1147n interfaceC1147n, int i10, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogE = e(activity, i10, new y(super.a(i10, activity, com.apple.android.music.playback.reporting.d.f17633a), interfaceC1147n, 1), onCancelListener);
        if (alertDialogE == null) {
            return;
        }
        f(activity, alertDialogE, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
