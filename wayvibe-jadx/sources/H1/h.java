package H1;

import android.net.Uri;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f5755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f5759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5760f;

    public h(Uri uri, int i10, int i11, boolean z10, int i12) {
        uri.getClass();
        this.f5755a = uri;
        this.f5756b = i10;
        this.f5757c = i11;
        this.f5758d = z10;
        this.f5759e = null;
        this.f5760f = i12;
    }

    public h(String str, String str2) {
        this.f5755a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f5756b = 0;
        this.f5757c = RCHTTPStatusCodes.BAD_REQUEST;
        this.f5758d = false;
        this.f5759e = str2;
        this.f5760f = 0;
    }
}
