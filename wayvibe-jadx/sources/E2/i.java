package E2;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.ads_identifier.zzi;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class i extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3038b;

    public /* synthetic */ i(Object obj, int i10) {
        this.f3037a = i10;
        this.f3038b = obj;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f3037a) {
            case 0:
                do {
                    try {
                    } catch (InterruptedException e2) {
                        throw new IllegalStateException(e2);
                    }
                    break;
                } while (((N2.b) this.f3038b).h());
                return;
            case 1:
                Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
                HashMap map = (HashMap) this.f3038b;
                for (String str : map.keySet()) {
                    builderBuildUpon.appendQueryParameter(str, (String) map.get(str));
                }
                String string = builderBuildUpon.build().toString();
                try {
                    try {
                        zzi.zzb(263);
                        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
                        try {
                            int responseCode = httpURLConnection.getResponseCode();
                            if (responseCode < 200 || responseCode >= 300) {
                                StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 65);
                                sb.append("Received non-success response code ");
                                sb.append(responseCode);
                                sb.append(" from pinging URL: ");
                                sb.append(string);
                                Log.w("HttpUrlPinger", sb.toString());
                                break;
                            }
                            httpURLConnection.disconnect();
                            zzi.zza();
                            return;
                        } catch (Throwable th) {
                            httpURLConnection.disconnect();
                            throw th;
                        }
                    } catch (IOException e4) {
                        e = e4;
                        String message = e.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 27 + String.valueOf(message).length());
                        sb2.append("Error while pinging URL: ");
                        sb2.append(string);
                        sb2.append(". ");
                        sb2.append(message);
                        Log.w("HttpUrlPinger", sb2.toString(), e);
                    } catch (IndexOutOfBoundsException e7) {
                        String message2 = e7.getMessage();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(string).length() + 32 + String.valueOf(message2).length());
                        sb3.append("Error while parsing ping URL: ");
                        sb3.append(string);
                        sb3.append(". ");
                        sb3.append(message2);
                        Log.w("HttpUrlPinger", sb3.toString(), e7);
                    } catch (RuntimeException e10) {
                        e = e10;
                        String message3 = e.getMessage();
                        StringBuilder sb4 = new StringBuilder(String.valueOf(string).length() + 27 + String.valueOf(message3).length());
                        sb4.append("Error while pinging URL: ");
                        sb4.append(string);
                        sb4.append(". ");
                        sb4.append(message3);
                        Log.w("HttpUrlPinger", sb4.toString(), e);
                    }
                } catch (Throwable th2) {
                    zzi.zza();
                    throw th2;
                }
                break;
            default:
                N4.b bVar = (N4.b) this.f3038b;
                bVar.getClass();
                do {
                    try {
                    } catch (InterruptedException e11) {
                        throw new IllegalStateException(e11);
                    }
                    break;
                } while (bVar.e());
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(N2.b bVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f3037a = 0;
        this.f3038b = bVar;
    }
}
