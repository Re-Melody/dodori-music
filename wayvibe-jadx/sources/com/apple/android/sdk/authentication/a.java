package com.apple.android.sdk.authentication;

import B2.AbstractC0112b;
import V0.p;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.a.a.o.b.f;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f17678a = "a";

    public static void a(Activity activity, String str, String str2, HashMap map) {
        Intent intent = new Intent(activity, (Class<?>) SDKUriHandlerActivity.class);
        intent.putExtra("developer_token", str);
        intent.putExtra("contextual_upsell_id", str2);
        intent.putExtra("custom_params", map);
        activity.startActivityForResult(intent, 2021);
    }

    public static void b(Activity activity, String str, String str2, HashMap map) {
        String strG = AbstractC0112b.g("appPackage=", activity.getPackageName(), "&devToken=", str);
        if (!TextUtils.isEmpty(str2)) {
            strG = p.B(strG, "&contextualId=", str2);
        }
        if (map != null && !map.isEmpty()) {
            String strConcat = "";
            for (Map.Entry entry : map.entrySet()) {
                strConcat = strConcat.concat("&").concat((String) entry.getKey()).concat(f.f16452b).concat((String) entry.getValue());
            }
            strG = strG.concat(strConcat);
        }
        b(activity, strG);
    }

    public static void a(Activity activity, String str) {
        Log.d("AuthUtils", "sendMarketIntent : uri = " + str);
        activity.getPackageName();
        String strK = p134m1.b.k("market://details?id=com.apple.android.music&", "referrer=" + Uri.encode(str));
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(strK));
        Log.d("AuthUtils", "sendMarketIntent: uri = " + Uri.parse(strK));
        activity.startActivityForResult(intent, 2024);
    }

    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.apple.android.music", 0).versionCode < 680 ? 1 : 0;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return 2;
        }
    }

    private static void b(Activity activity, String str) {
        String strK = p134m1.b.k("musicsdk://applemusic/authenticate-v1?", str);
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(strK));
            Log.d("AuthUtils", "deeplinkAppleMusic: uri = " + Uri.parse(strK));
            Log.d(f17678a, "deeplinkAppleMusic: isAppleMusicInstalled(activity) = " + a(activity));
            if (a(activity) != 0) {
                Log.d("AuthUtils", "deeplinkAppleMusic: activityNotFound!");
                a(activity, strK);
            } else {
                activity.startActivityForResult(intent, 2022);
            }
        } catch (ActivityNotFoundException unused) {
            Log.e(f17678a, "deeplinkAppleMusic: activity still not found?!!?");
        }
    }
}
