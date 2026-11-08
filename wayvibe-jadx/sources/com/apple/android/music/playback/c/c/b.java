package com.apple.android.music.playback.c.c;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.apple.android.music.playback.model.PlayerMediaItem;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.ArrayList;
import java.util.Map;
import p199t.C2230e;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f17116a = {"LWHQ", "LW", "SLW"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f17117b = {"LW", "SLW"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f17118c = {"720p", "hdmv", "480p", "sdmv"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f17119d = {"480p", "sdmv"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map<String, Integer> f17120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.apple.android.music.playback.c.d f17121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i f17122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ConnectivityManager f17123h;

    static {
        C2230e c2230e = new C2230e(4);
        f17120e = c2230e;
        c2230e.put("HQ", 320);
        c2230e.put("LWHQ", 320);
        c2230e.put("LW", Integer.valueOf(ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD));
        c2230e.put("SLW", 64);
        c2230e.put("720p", 5000);
        c2230e.put("hdmv", 5000);
        c2230e.put("480p", 3000);
        c2230e.put("sdmv", 3000);
    }

    public b(com.apple.android.music.playback.c.d dVar, i iVar) {
        this.f17121f = dVar;
        this.f17122g = iVar;
        this.f17123h = (ConnectivityManager) dVar.f().getSystemService("connectivity");
    }

    private String[] b(String[] strArr) {
        long jA = this.f17122g.a();
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            Integer num = f17120e.get(str);
            if (this.f17121f.b(str) && (jA == -1 || num == null || num.intValue() <= jA)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add("480p");
            arrayList.add("sdmv");
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public String[] a(PlayerMediaItem playerMediaItem) {
        switch (playerMediaItem.getType()) {
            case 1:
            case 5:
                return a();
            case 2:
            case 3:
            case 4:
            case 6:
                return b();
            default:
                return null;
        }
    }

    private String[] a() {
        NetworkInfo activeNetworkInfo = this.f17123h.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
            if (activeNetworkInfo.getType() != 1) {
                if (this.f17121f.k()) {
                    return a(f17116a);
                }
                return a(f17117b);
            }
            return a(f17116a);
        }
        return f17116a;
    }

    private String[] a(String[] strArr) {
        long jA = this.f17122g.a();
        if (jA == -1) {
            return strArr;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            Integer num = f17120e.get(str);
            if (num == null || num.intValue() <= jA) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add("SLW");
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private String[] b() {
        NetworkInfo activeNetworkInfo = this.f17123h.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
            if (activeNetworkInfo.getType() != 1) {
                if (this.f17121f.k()) {
                    return b(f17118c);
                }
                return b(f17119d);
            }
            return b(f17118c);
        }
        return f17118c;
    }
}
