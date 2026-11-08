package com.apple.android.music.playback.g;

import D2.j;
import android.util.JsonWriter;
import android.util.Log;
import com.revenuecat.purchases.common.HTTPClient;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPInputStream;
import org.apache.tika.metadata.HttpHeaders;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f17428a = "salableAdamId";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.apple.android.music.playback.c.d f17429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f17430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g f17431d = new g(null, "NO INFO", "Response is not set yet.");

    public f(com.apple.android.music.playback.c.d dVar, long j10) {
        this.f17429b = dVar;
        this.f17430c = j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a() throws Throwable {
        InputStream inputStream;
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        j jVar = 0;
        InputStream inputStream2 = null;
        try {
            try {
                try {
                    jsonWriter.beginObject();
                    jsonWriter.name(f17428a).value(this.f17430c);
                    jsonWriter.endObject();
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://play.itunes.apple.com/WebObjects/MZPlay.woa/wa/webPlayback").openConnection();
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.addRequestProperty("Accept", "application/json");
                    httpURLConnection.addRequestProperty("Accept-Encoding", "deflate, gzip");
                    httpURLConnection.addRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
                    httpURLConnection.addRequestProperty("Authorization", "Bearer " + this.f17429b.u());
                    httpURLConnection.addRequestProperty("X-Apple-Music-User-Token", this.f17429b.t());
                    httpURLConnection.addRequestProperty("Accept-Language", this.f17429b.j());
                    httpURLConnection.addRequestProperty("User-Agent", this.f17429b.v());
                    httpURLConnection.addRequestProperty("X-Apple-Store-Front", this.f17429b.w());
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream());
                    outputStreamWriter.write(stringWriter.toString());
                    jsonWriter.close();
                    outputStreamWriter.close();
                    httpURLConnection.connect();
                    if (httpURLConnection.getResponseCode() == 200) {
                        inputStream = httpURLConnection.getInputStream();
                        try {
                            String contentEncoding = httpURLConnection.getContentEncoding();
                            if (contentEncoding != null && contentEncoding.equals(HTTPClient.RC_FORMAT_ACCEPT_ENCODING)) {
                                inputStream = new GZIPInputStream(inputStream);
                            }
                            this.f17431d = h.a(inputStream);
                            inputStream2 = inputStream;
                        } catch (Exception e2) {
                            e = e2;
                            Log.getStackTraceString(e);
                            this.f17431d = new g(null, "REQUEST EXCEPTION", e.getMessage());
                            if (inputStream != null) {
                                inputStream.close();
                                return;
                            }
                            return;
                        }
                    } else {
                        this.f17431d = new g(null, "HTTPE ERROR: " + httpURLConnection.getResponseCode(), "HTTP ERROR");
                    }
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                } catch (Exception e4) {
                    e = e4;
                    inputStream = null;
                } catch (Throwable th) {
                    th = th;
                    if (jVar != 0) {
                        try {
                            jVar.close();
                        } catch (IOException e7) {
                            Log.getStackTraceString(e7);
                        }
                    }
                    throw th;
                }
            } catch (IOException e10) {
                Log.getStackTraceString(e10);
            }
        } catch (Throwable th2) {
            th = th2;
            jVar = "application/json";
        }
    }

    public g b() {
        return this.f17431d;
    }
}
