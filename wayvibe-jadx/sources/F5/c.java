package F5;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1157y;
import com.google.android.gms.common.internal.E;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.tika.metadata.HttpHeaders;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final K5.a f4527c = new K5.a("RevokeAccessOperation", new String[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1157y f4529b;

    public c(String str) {
        E.e(str);
        this.f4528a = str;
        this.f4529b = new C1157y(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        K5.a aVar = f4527c;
        Status status = Status.f17831g;
        try {
            String str = this.f4528a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
            sb.append("https://accounts.google.com/o/oauth2/revoke?token=");
            sb.append(str);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(sb.toString()).openConnection();
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f17829e;
            } else {
                aVar.c("Unable to revoke access!", new Object[0]);
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(responseCode).length() + 15);
            sb2.append("Response Code: ");
            sb2.append(responseCode);
            aVar.a(sb2.toString(), new Object[0]);
        } catch (IOException e2) {
            aVar.c("IOException when revoking access: ".concat(String.valueOf(e2.toString())), new Object[0]);
        } catch (Exception e4) {
            aVar.c("Exception when revoking access: ".concat(String.valueOf(e4.toString())), new Object[0]);
        }
        this.f4529b.setResult(status);
    }
}
