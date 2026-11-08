package com.apple.android.music.playback.f;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public class i {
    public static String a(com.apple.android.music.playback.c.d dVar) throws Throwable {
        HttpURLConnection httpURLConnection;
        if (dVar.x() != null) {
            return dVar.x();
        }
        InputStream inputStream = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL("https://api.music.apple.com/v1/me/storefront").openConnection();
            try {
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setReadTimeout(10000);
                httpURLConnection.setRequestProperty("Accept", "*/*");
                httpURLConnection.setRequestProperty("User-Agent", dVar.v());
                httpURLConnection.addRequestProperty("Authorization", "Bearer " + dVar.u());
                httpURLConnection.addRequestProperty("Music-User-Token", dVar.t());
                httpURLConnection.connect();
                inputStream = httpURLConnection.getInputStream();
                String strB = f.b(inputStream);
                dVar.c(strB);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                try {
                    httpURLConnection.disconnect();
                } catch (Exception unused2) {
                }
                return strB;
            } catch (Throwable th) {
                th = th;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                if (httpURLConnection == null) {
                    throw th;
                }
                try {
                    httpURLConnection.disconnect();
                    throw th;
                } catch (Exception unused4) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
        }
    }
}
