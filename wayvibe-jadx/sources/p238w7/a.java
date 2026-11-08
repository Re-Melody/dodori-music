package p238w7;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import p106j7.b;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f28048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f28049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f28050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f28051d;

    public a(Context context, String str, b bVar) {
        Context contextCreateDeviceProtectedStorageContext = p254y1.a.createDeviceProtectedStorageContext(context);
        this.f28048a = contextCreateDeviceProtectedStorageContext;
        SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f28049b = sharedPreferences;
        this.f28050c = bVar;
        this.f28051d = sharedPreferences.contains("firebase_data_collection_default_enabled") ? sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true) : a();
    }

    public final boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Context context = this.f28048a;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public final synchronized void b(boolean z10) {
        if (this.f28051d != z10) {
            this.f28051d = z10;
            this.f28050c.a(new p106j7.a(new W6.b(0)));
        }
    }
}
