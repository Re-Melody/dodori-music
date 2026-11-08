package U7;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f12276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f12278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f12279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f12280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f12282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f12283h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f12284i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12285j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12286l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12287m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f12288n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f12289o;

    public e(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("audio_service_preferences", 0);
        this.f12276a = sharedPreferences;
        this.f12277b = sharedPreferences.getBoolean("androidResumeOnClick", true);
        this.f12278c = sharedPreferences.getString("androidNotificationChannelId", null);
        this.f12279d = sharedPreferences.getString("androidNotificationChannelName", null);
        this.f12280e = sharedPreferences.getString("androidNotificationChannelDescription", null);
        this.f12281f = sharedPreferences.getInt("notificationColor", -1);
        this.f12282g = sharedPreferences.getString("androidNotificationIcon", "mipmap/ic_launcher");
        this.f12283h = sharedPreferences.getBoolean("androidShowNotificationBadge", false);
        this.f12284i = sharedPreferences.getBoolean("androidNotificationClickStartsActivity", true);
        this.f12285j = sharedPreferences.getBoolean("androidNotificationOngoing", false);
        this.k = sharedPreferences.getBoolean("androidStopForegroundOnPause", true);
        this.f12286l = sharedPreferences.getInt("artDownscaleWidth", -1);
        this.f12287m = sharedPreferences.getInt("artDownscaleHeight", -1);
        this.f12288n = sharedPreferences.getString("activityClassName", null);
        this.f12289o = sharedPreferences.getString("androidBrowsableRootExtras", null);
    }

    public final void a() {
        this.f12276a.edit().putBoolean("androidResumeOnClick", this.f12277b).putString("androidNotificationChannelId", this.f12278c).putString("androidNotificationChannelName", this.f12279d).putString("androidNotificationChannelDescription", this.f12280e).putInt("notificationColor", this.f12281f).putString("androidNotificationIcon", this.f12282g).putBoolean("androidShowNotificationBadge", this.f12283h).putBoolean("androidNotificationClickStartsActivity", this.f12284i).putBoolean("androidNotificationOngoing", this.f12285j).putBoolean("androidStopForegroundOnPause", this.k).putInt("artDownscaleWidth", this.f12286l).putInt("artDownscaleHeight", this.f12287m).putString("activityClassName", this.f12288n).putString("androidBrowsableRootExtras", this.f12289o).apply();
    }
}
