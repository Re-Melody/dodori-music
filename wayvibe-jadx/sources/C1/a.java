package C1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.location.Location;
import android.os.Handler;
import android.view.MenuItem;
import android.view.ViewConfiguration;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static Icon a(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static float b(Location location) {
        return location.getBearingAccuracyDegrees();
    }

    public static float c(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float d(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static float e(Location location) {
        return location.getSpeedAccuracyMetersPerSecond();
    }

    public static float f(Location location) {
        return location.getVerticalAccuracyMeters();
    }

    public static boolean g(Location location) {
        return location.hasBearingAccuracy();
    }

    public static boolean h(Location location) {
        return location.hasSpeedAccuracy();
    }

    public static boolean i(Location location) {
        return location.hasVerticalAccuracy();
    }

    public static boolean j(File file, File file2) {
        try {
            Files.move(file.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static Intent k(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
        return ((i10 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i10 & 1) : context.registerReceiver(broadcastReceiver, intentFilter, p254y1.a.obtainAndCheckReceiverPermission(context), handler);
    }

    public static Intent l(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i10);
    }

    public static void m(MenuItem menuItem, char c3, int i10) {
        menuItem.setAlphabeticShortcut(c3, i10);
    }

    public static void n(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void o(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void p(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void q(MenuItem menuItem, char c3, int i10) {
        menuItem.setNumericShortcut(c3, i10);
    }

    public static void r(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }

    public static void s(Context context, Intent intent) {
        context.startForegroundService(intent);
    }
}
