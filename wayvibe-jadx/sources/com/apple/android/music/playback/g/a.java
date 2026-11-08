package com.apple.android.music.playback.g;

import android.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.apple.android.music.playback.c.d f17407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f17408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f17409c = null;

    public a(com.apple.android.music.playback.c.d dVar, String str) {
        this.f17407a = dVar;
        this.f17408b = str;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0087 A[Catch: IOException -> 0x0083, TRY_LEAVE, TryCatch #5 {IOException -> 0x0083, blocks: (B:44:0x007f, B:48:0x0087), top: B:53:0x007f }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.FileInputStream, java.io.InputStream] */
    private void c() throws Throwable {
        ?? fileInputStream = "fps-prod.crt";
        ?? file = new File(this.f17407a.b(), "fps-prod.crt");
        if (!file.exists()) {
            return;
        }
        this.f17409c = new byte[(int) file.length()];
        try {
            try {
                try {
                    fileInputStream = new FileInputStream((File) file);
                    try {
                        file = new BufferedInputStream(fileInputStream);
                        try {
                            byte[] bArr = this.f17409c;
                            file.read(bArr, 0, bArr.length);
                            fileInputStream.close();
                            file.close();
                        } catch (FileNotFoundException e2) {
                            e = e2;
                            Log.getStackTraceString(e);
                            this.f17409c = null;
                            if (fileInputStream != 0) {
                                fileInputStream.close();
                            }
                            if (file != 0) {
                                file.close();
                            }
                        } catch (IOException e4) {
                            e = e4;
                            Log.getStackTraceString(e);
                            this.f17409c = null;
                            if (fileInputStream != 0) {
                                fileInputStream.close();
                            }
                            if (file != 0) {
                                file.close();
                            }
                        }
                    } catch (FileNotFoundException e7) {
                        e = e7;
                        file = 0;
                    } catch (IOException e10) {
                        e = e10;
                        file = 0;
                    } catch (Throwable th) {
                        th = th;
                        file = 0;
                        if (fileInputStream != 0) {
                            try {
                                fileInputStream.close();
                                if (file != 0) {
                                    file.close();
                                }
                            } catch (IOException e11) {
                                Log.getStackTraceString(e11);
                                e11.printStackTrace();
                                throw th;
                            }
                        } else if (file != 0) {
                            file.close();
                        }
                        throw th;
                    }
                } catch (FileNotFoundException e12) {
                    e = e12;
                    file = 0;
                    fileInputStream = 0;
                } catch (IOException e13) {
                    e = e13;
                    file = 0;
                    fileInputStream = 0;
                } catch (Throwable th2) {
                    fileInputStream = 0;
                    th = th2;
                    file = 0;
                }
            } catch (IOException e14) {
                Log.getStackTraceString(e14);
                e14.printStackTrace();
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private void d() {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f17408b).openConnection();
            httpURLConnection.setRequestMethod("GET");
            int i10 = 0;
            httpURLConnection.setUseCaches(false);
            httpURLConnection.addRequestProperty("Accept", "*/*");
            httpURLConnection.addRequestProperty("Accept-Encoding", "deflate, gzip");
            httpURLConnection.addRequestProperty("Accept-Language", this.f17407a.j());
            httpURLConnection.addRequestProperty("User-Agent", this.f17407a.v());
            httpURLConnection.addRequestProperty("X-Apple-Store-Front", this.f17407a.w());
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                int contentLength = httpURLConnection.getContentLength();
                if (contentLength > 0) {
                    this.f17409c = new byte[contentLength];
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
                while (i10 < contentLength) {
                    i10 += bufferedInputStream.read(this.f17409c, i10, contentLength - i10);
                }
                bufferedInputStream.close();
            }
        } catch (MalformedURLException e2) {
            Log.getStackTraceString(e2);
            this.f17409c = null;
        } catch (ProtocolException e4) {
            Log.getStackTraceString(e4);
            this.f17409c = null;
        } catch (IOException e7) {
            Log.getStackTraceString(e7);
            this.f17409c = null;
        }
        if (this.f17409c != null) {
            f();
        }
    }

    private boolean e() {
        return this.f17409c != null;
    }

    private void f() {
        File file = new File(this.f17407a.b(), "fps-prod.crt");
        if (file.exists()) {
            file.delete();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, false);
            fileOutputStream.write(this.f17409c);
            fileOutputStream.close();
        } catch (FileNotFoundException e2) {
            Log.getStackTraceString(e2);
        } catch (IOException e4) {
            Log.getStackTraceString(e4);
        }
    }

    public void a() throws Throwable {
        if (e()) {
            return;
        }
        c();
        if (e()) {
            return;
        }
        d();
    }

    public byte[] b() {
        return this.f17409c;
    }
}
