package com.apple.android.music.playback.c.b;

import V0.p;
import W4.e;
import W4.h;
import W4.o;
import android.net.Uri;
import com.apple.android.music.playback.model.m;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.metadata.HttpHeaders;

/* JADX INFO: loaded from: classes.dex */
final class d implements W4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f17102a = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicReference<byte[]> f17103b = new AtomicReference<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f17104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f17105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.apple.android.music.playback.c.d f17106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CookieManager f17107f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final UUID f17108g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final o f17109h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private e f17110i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private HttpURLConnection f17111j;
    private InputStream k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f17112l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f17113m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f17114n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f17115o;

    public d(int i10, String str, com.apple.android.music.playback.c.d dVar, CookieManager cookieManager, UUID uuid, o oVar) {
        this.f17104c = i10;
        this.f17105d = str;
        this.f17106e = dVar;
        this.f17107f = cookieManager;
        this.f17108g = uuid;
        this.f17109h = oVar;
    }

    private static boolean a(int i10) {
        return i10 == 4;
    }

    private void c() {
        HttpURLConnection httpURLConnection = this.f17111j;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception unused) {
            }
            this.f17111j = null;
        }
    }

    private void d() throws IOException {
        if (this.f17115o == this.f17113m) {
            return;
        }
        byte[] andSet = f17103b.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[4096];
        }
        while (true) {
            long j10 = this.f17115o;
            long j11 = this.f17113m;
            if (j10 == j11) {
                f17103b.set(andSet);
                return;
            }
            int i10 = this.k.read(andSet, 0, (int) Math.min(j11 - j10, andSet.length));
            if (Thread.interrupted()) {
                throw new InterruptedIOException();
            }
            if (i10 == -1) {
                throw new EOFException();
            }
            this.f17115o += (long) i10;
            o oVar = this.f17109h;
            if (oVar != null) {
                oVar.a(this, i10);
            }
        }
    }

    private static String e() {
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        String country = locale.getCountry();
        return country.isEmpty() ? language : p.B(language, "-", country);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    @Override // W4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b() {
        /*
            r4 = this;
            java.io.InputStream r0 = r4.k
            if (r0 == 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            r2 = 0
            if (r0 == 0) goto L26
            r0.close()     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            goto L26
        Le:
            r0 = move-exception
            goto L17
        L10:
            r0 = move-exception
            I2.a r3 = new I2.a     // Catch: java.lang.Throwable -> Le
            r3.<init>(r0)     // Catch: java.lang.Throwable -> Le
            throw r3     // Catch: java.lang.Throwable -> Le
        L17:
            r4.k = r2
            r4.c()
            if (r1 == 0) goto L25
            W4.o r1 = r4.f17109h
            if (r1 == 0) goto L25
            r1.a(r4)
        L25:
            throw r0
        L26:
            r4.k = r2
            r4.c()
            if (r1 == 0) goto L34
            W4.o r0 = r4.f17109h
            if (r0 == 0) goto L34
            r0.a(r4)
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apple.android.music.playback.c.b.d.b():void");
    }

    @Override // W4.c
    public long a(e eVar) throws IOException {
        if (!this.f17106e.i()) {
            throw new m("Network unreachable with current settings");
        }
        Uri uri = eVar.f12798a;
        if (uri == null || uri.toString().isEmpty()) {
            throw new IOException("ERROR invalid dataSpec Uri");
        }
        CookieHandler.setDefault(this.f17107f);
        this.f17110i = eVar;
        this.f17112l = 0L;
        this.f17113m = 0L;
        this.f17114n = 0L;
        this.f17115o = 0L;
        try {
            HttpURLConnection httpURLConnectionB = b(eVar);
            this.f17111j = httpURLConnectionB;
            int responseCode = httpURLConnectionB.getResponseCode();
            if (responseCode < 200 || responseCode > 299) {
                this.f17111j.getHeaderFields();
                c();
                throw new h(responseCode);
            }
            if (responseCode == 200) {
                long j10 = eVar.f12800c;
                if (j10 != 0) {
                    this.f17113m = j10;
                }
            }
            try {
                this.k = this.f17111j.getInputStream();
                boolean z10 = (eVar.f12803f & 1) == 1;
                long j11 = eVar.f12801d;
                if (!z10 && j11 == -1) {
                    long jA = a(this.f17111j);
                    this.f17112l = jA;
                    if (jA != -1) {
                        this.f17112l = jA - this.f17113m;
                    }
                } else {
                    this.f17112l = j11;
                }
                o oVar = this.f17109h;
                if (oVar != null) {
                    oVar.a(this, eVar);
                }
                return this.f17112l;
            } catch (IOException e2) {
                c();
                throw new I2.a(e2);
            }
        } catch (IOException e4) {
            c();
            throw new I2.a("Error connecting to " + eVar.f12798a.toString(), e4);
        }
    }

    private void c(e eVar) {
        CookieStore cookieStore = this.f17107f.getCookieStore();
        URI uriCreate = URI.create(eVar.f12798a.toString());
        for (HttpCookie httpCookie : cookieStore.get(uriCreate)) {
            if (httpCookie.getVersion() > 0) {
                httpCookie.setVersion(0);
                cookieStore.add(uriCreate, httpCookie);
            }
        }
    }

    private HttpURLConnection b(e eVar) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(eVar.f12798a.toString()).openConnection();
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setUseCaches(a(this.f17104c));
        httpURLConnection.setRequestProperty("Accept", "*/*");
        httpURLConnection.setRequestProperty("Accept-Language", e());
        httpURLConnection.setRequestProperty("User-Agent", this.f17105d);
        httpURLConnection.setRequestProperty("X-Playback-Session-Id", this.f17108g.toString());
        c(eVar);
        httpURLConnection.setInstanceFollowRedirects(true);
        if ((eVar.f12803f & 1) != 1) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        long j10 = eVar.f12800c;
        long j11 = eVar.f12801d;
        if (j10 != 0 || j11 != -1) {
            StringBuilder sb = new StringBuilder("bytes=");
            sb.append(j10);
            sb.append('-');
            if (j11 != -1) {
                sb.append(j11 + j10);
            }
            httpURLConnection.setRequestProperty("Range", sb.toString());
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    @Override // W4.c
    public int a(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        d();
        long j10 = this.f17112l;
        if (j10 != -1) {
            long j11 = j10 - this.f17114n;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        try {
            int i12 = this.k.read(bArr, i10, i11);
            if (i12 == -1) {
                return -1;
            }
            this.f17114n += (long) i12;
            o oVar = this.f17109h;
            if (oVar == null) {
                return i12;
            }
            oVar.a(this, i12);
            return i12;
        } catch (IOException e2) {
            throw new I2.a(e2);
        }
    }

    @Override // W4.c
    public Uri a() {
        HttpURLConnection httpURLConnection = this.f17111j;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        return null;
    }

    private static long a(HttpURLConnection httpURLConnection) {
        long j10;
        String headerField = httpURLConnection.getHeaderField(HttpHeaders.CONTENT_LENGTH);
        if (headerField == null || headerField.isEmpty()) {
            j10 = -1;
        } else {
            try {
                j10 = Long.parseLong(headerField);
            } catch (NumberFormatException unused) {
                j10 = -1;
            }
        }
        String headerField2 = httpURLConnection.getHeaderField("Content-Range");
        if (headerField2 == null || headerField2.isEmpty()) {
            return j10;
        }
        Matcher matcher = f17102a.matcher(headerField2);
        if (!matcher.find()) {
            return j10;
        }
        try {
            long j11 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
            return j10 < 0 ? j11 : Math.max(j10, j11);
        } catch (NumberFormatException unused2) {
            return j10;
        }
    }
}
