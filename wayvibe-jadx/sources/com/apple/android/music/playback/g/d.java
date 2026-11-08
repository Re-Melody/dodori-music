package com.apple.android.music.playback.g;

import android.util.Base64;
import android.util.JsonWriter;
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
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.apple.android.music.playback.c.d f17418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f17419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f17420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f17421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f17422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e f17423f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f17424g;

    public d(com.apple.android.music.playback.c.d dVar, String str, String str2, byte[] bArr, String str3, boolean z10) {
        this.f17418a = dVar;
        this.f17419b = str;
        this.f17420c = str2;
        this.f17421d = bArr;
        this.f17422e = str3;
        this.f17424g = z10;
    }

    public void a() {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("key-system").value("com.apple.fps");
            jsonWriter.name("isLibrary").value(false);
            jsonWriter.name("challenge").value(Base64.encodeToString(this.f17421d, 2));
            jsonWriter.name("adamId").value(this.f17419b);
            jsonWriter.name("uri").value(this.f17420c);
            jsonWriter.name("user-initiated").value(this.f17424g);
            jsonWriter.endObject();
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f17422e).openConnection();
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.addRequestProperty("Accept", "*/*");
            httpURLConnection.addRequestProperty("Accept-Encoding", "deflate, gzip");
            httpURLConnection.addRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
            httpURLConnection.addRequestProperty("Authorization", "Bearer " + this.f17418a.u());
            httpURLConnection.addRequestProperty("X-Apple-Music-User-Token", this.f17418a.t());
            httpURLConnection.addRequestProperty("Accept-Language", this.f17418a.j());
            httpURLConnection.addRequestProperty("User-Agent", this.f17418a.v());
            httpURLConnection.addRequestProperty("X-Apple-Store-Front", this.f17418a.w());
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream());
            outputStreamWriter.write(stringWriter.toString());
            jsonWriter.close();
            outputStreamWriter.close();
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() != 200) {
                this.f17423f = new e(null, -1, httpURLConnection.getResponseCode());
                return;
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            String contentEncoding = httpURLConnection.getContentEncoding();
            if (contentEncoding != null && contentEncoding.equals(HTTPClient.RC_FORMAT_ACCEPT_ENCODING)) {
                inputStream = new GZIPInputStream(inputStream);
            }
            this.f17423f = c.a(inputStream);
            inputStream.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public e b() {
        return this.f17423f;
    }
}
