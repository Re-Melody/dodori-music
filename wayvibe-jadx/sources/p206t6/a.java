package p206t6;

import android.app.PendingIntent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f26863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f26864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PendingIntent f26865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PendingIntent f26866h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f26867i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f26868j = false;

    public a(String str, int i10, int i11, int i12, Integer num, int i13, long j10, long j11, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, HashMap map) {
        this.f26859a = str;
        this.f26860b = i10;
        this.f26861c = i11;
        this.f26862d = i12;
        this.f26863e = num;
        this.f26864f = i13;
        this.f26865g = pendingIntent;
        this.f26866h = pendingIntent2;
        this.f26867i = map;
    }

    public final Set a(l lVar) {
        HashMap map = this.f26867i;
        if (lVar.f26903a == 0) {
            Set set = (Set) map.get("nonblocking.intent");
            return set == null ? new HashSet() : set;
        }
        Set set2 = (Set) map.get("blocking.intent");
        return set2 == null ? new HashSet() : set2;
    }

    public final PendingIntent b(l lVar) {
        PendingIntent pendingIntent;
        int i10 = lVar.f26903a;
        if (i10 == 0) {
            PendingIntent pendingIntent2 = this.f26866h;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            return null;
        }
        if (i10 != 1 || (pendingIntent = this.f26865g) == null) {
            return null;
        }
        return pendingIntent;
    }
}
