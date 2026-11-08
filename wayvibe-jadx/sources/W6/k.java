package W6;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.E;
import java.util.Arrays;
import org.apache.tika.metadata.ClimateForcast;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f12878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f12879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f12880g;

    public k(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i10 = O5.c.f9238a;
        E.j("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f12875b = str;
        this.f12874a = str2;
        this.f12876c = str3;
        this.f12877d = str4;
        this.f12878e = str5;
        this.f12879f = str6;
        this.f12880g = str7;
    }

    public static k a(Context context) {
        W4.m mVar = new W4.m(context, 8);
        String strA = mVar.A("google_app_id");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new k(strA, mVar.A("google_api_key"), mVar.A("firebase_database_url"), mVar.A("ga_trackingId"), mVar.A("gcm_defaultSenderId"), mVar.A("google_storage_bucket"), mVar.A(ClimateForcast.PROJECT_ID));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return E.k(this.f12875b, kVar.f12875b) && E.k(this.f12874a, kVar.f12874a) && E.k(this.f12876c, kVar.f12876c) && E.k(this.f12877d, kVar.f12877d) && E.k(this.f12878e, kVar.f12878e) && E.k(this.f12879f, kVar.f12879f) && E.k(this.f12880g, kVar.f12880g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12875b, this.f12874a, this.f12876c, this.f12877d, this.f12878e, this.f12879f, this.f12880g});
    }

    public final String toString() {
        W9.j jVar = new W9.j(this);
        jVar.E(this.f12875b, "applicationId");
        jVar.E(this.f12874a, "apiKey");
        jVar.E(this.f12876c, "databaseUrl");
        jVar.E(this.f12878e, "gcmSenderId");
        jVar.E(this.f12879f, "storageBucket");
        jVar.E(this.f12880g, "projectId");
        return jVar.toString();
    }
}
