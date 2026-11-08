package com.apple.android.music.playback.reporting;

import android.util.Base64;
import android.util.JsonWriter;
import com.revenuecat.purchases.common.HTTPClient;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import org.apache.tika.metadata.HttpHeaders;
import org.apache.tika.pipes.pipesiterator.PipesIterator;

/* JADX INFO: loaded from: classes.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.apple.android.music.playback.c.d f17634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f17635b;

    public e(com.apple.android.music.playback.c.d dVar) {
        this.f17634a = dVar;
        this.f17635b = new d(dVar);
    }

    public long a() {
        return 90000L;
    }

    public void b(a aVar) {
        if (aVar == null) {
            return;
        }
        new StringBuilder("Recording play activity event: ").append(aVar);
        this.f17635b.a(aVar);
    }

    public void c() {
        this.f17635b.close();
    }

    private static void c(JsonWriter jsonWriter, a aVar) throws IOException {
        Map<?, ?> map = aVar.f17562H;
        jsonWriter.beginObject();
        for (Object obj : map.keySet()) {
            jsonWriter.name(obj.toString());
            Object obj2 = map.get(obj);
            if (obj2 == null) {
                jsonWriter.nullValue();
            } else if (obj2 instanceof String) {
                jsonWriter.value((String) obj2);
            } else if (obj2 instanceof Number) {
                jsonWriter.value((Number) obj2);
            } else if (obj2 instanceof Boolean) {
                jsonWriter.value(((Boolean) obj2).booleanValue());
            } else {
                jsonWriter.nullValue();
            }
        }
        jsonWriter.endObject();
    }

    public boolean a(a aVar) {
        int i10 = aVar.r;
        if (i10 == 1) {
            return true;
        }
        return i10 == 0 && aVar.f17579s == 3;
    }

    public void b() throws Throwable {
        HttpURLConnection httpURLConnection;
        List<a> listA = this.f17635b.a();
        if (listA == null || listA.isEmpty()) {
            return;
        }
        String.format("Sending %d play activity events", Integer.valueOf(listA.size()));
        OutputStream outputStream = null;
        try {
            byte[] bArrA = a(listA, this.f17634a);
            httpURLConnection = (HttpURLConnection) new URL("https://universal-activity-service.itunes.apple.com/play").openConnection();
            try {
                try {
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(10000);
                    httpURLConnection.setRequestProperty("User-Agent", this.f17634a.v());
                    httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
                    httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_ENCODING, HTTPClient.RC_FORMAT_ACCEPT_ENCODING);
                    httpURLConnection.addRequestProperty("Authorization", "Bearer " + this.f17634a.u());
                    httpURLConnection.addRequestProperty("X-Apple-Music-User-Token", this.f17634a.t());
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setDoInput(false);
                    httpURLConnection.setFixedLengthStreamingMode(bArrA.length);
                    outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(bArrA);
                    outputStream.close();
                    if (httpURLConnection.getResponseCode() == 200) {
                        try {
                            this.f17635b.b();
                        } catch (Exception unused) {
                        }
                    }
                    try {
                        outputStream.close();
                    } catch (IOException unused2) {
                    }
                } catch (Exception unused3) {
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    if (httpURLConnection == null) {
                        return;
                    }
                }
                try {
                    httpURLConnection.disconnect();
                } catch (Exception unused5) {
                }
            } catch (Throwable th) {
                th = th;
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException unused6) {
                    }
                }
                if (httpURLConnection != null) {
                    try {
                        httpURLConnection.disconnect();
                        throw th;
                    } catch (Exception unused7) {
                        throw th;
                    }
                }
                throw th;
            }
        } catch (Exception unused8) {
            httpURLConnection = null;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
        }
    }

    private static byte[] a(List<a> list, com.apple.android.music.playback.c.d dVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        JsonWriter jsonWriter = new JsonWriter(new OutputStreamWriter(new BufferedOutputStream(gZIPOutputStream), "UTF-8"));
        jsonWriter.beginObject();
        jsonWriter.name("client_id").value("ANDROID");
        jsonWriter.name("event_type").value("SDK_PLAY");
        jsonWriter.name("data");
        jsonWriter.beginArray();
        Iterator<a> it = list.iterator();
        while (it.hasNext()) {
            a(jsonWriter, it.next(), dVar);
        }
        jsonWriter.endArray();
        jsonWriter.endObject();
        jsonWriter.flush();
        gZIPOutputStream.finish();
        jsonWriter.close();
        return byteArrayOutputStream.toByteArray();
    }

    private static void a(JsonWriter jsonWriter, a aVar, com.apple.android.music.playback.c.d dVar) throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name("event-type").value(aVar.r);
        jsonWriter.name("ids");
        a(jsonWriter, aVar);
        if (aVar.f17563a != 0) {
            jsonWriter.name("container-ids");
            b(jsonWriter, aVar);
        }
        if (aVar.r == 1) {
            jsonWriter.name("event-reason-hint-type").value(aVar.f17580t);
        }
        jsonWriter.name("container-type").value(aVar.f17563a);
        jsonWriter.name("device-name").value("");
        if (aVar.f17576o > 0) {
            jsonWriter.name("media-duration-in-milliseconds").value(aVar.f17576o);
        }
        if (aVar.r != 1) {
            jsonWriter.name("end-position-in-milliseconds").value(aVar.f17578q);
            jsonWriter.name("end-reason-type").value(aVar.f17579s);
        }
        jsonWriter.name("feature-name").value(aVar.f17583w);
        jsonWriter.name("media-type").value(aVar.f17572j);
        jsonWriter.name("milliseconds-since-play").value(System.currentTimeMillis() - aVar.f17555A);
        jsonWriter.name("offline").value(aVar.f17581u);
        jsonWriter.name("source-type").value(0L);
        jsonWriter.name("start-position-in-milliseconds").value(aVar.f17577p);
        jsonWriter.name("type").value(aVar.f17571i);
        jsonWriter.name("utc-offset-in-seconds").value(aVar.f17556B / PipesIterator.DEFAULT_QUEUE_SIZE);
        jsonWriter.name("sb-enabled").value(true);
        jsonWriter.name("persistent-id").value(aVar.f17586z.toString());
        if (aVar.f17558D != null) {
            jsonWriter.name("reco-data").value(aVar.f17558D);
        }
        Map<?, ?> map = aVar.f17562H;
        if (map != null && !map.isEmpty()) {
            jsonWriter.name("track-info");
            c(jsonWriter, aVar);
        }
        if (aVar.f17559E != null) {
            jsonWriter.name("timed-metadata").value(Base64.encodeToString(aVar.f17559E, 0));
        }
        jsonWriter.name("build-version").value(dVar.v());
        jsonWriter.name("private-enabled").value(aVar.f17557C);
        jsonWriter.name("bundle-id").value(aVar.f17560F);
        jsonWriter.name("bundle-version").value(aVar.f17561G);
        jsonWriter.name("developer-token").value(dVar.u());
        jsonWriter.name("user-token").value(dVar.t());
        jsonWriter.endObject();
    }

    private static void b(JsonWriter jsonWriter, a aVar) throws IOException {
        jsonWriter.beginObject();
        int i10 = aVar.f17563a;
        if (i10 == 1) {
            jsonWriter.name("station-id").value(aVar.f17569g);
            if (aVar.f17570h != null) {
                jsonWriter.name("station-hash").value(aVar.f17570h);
            }
        } else if (i10 == 2) {
            if (aVar.f17566d != 0) {
                jsonWriter.name("cloud-playlist-id").value(aVar.f17566d);
            } else {
                jsonWriter.name("global-playlist-id").value(aVar.f17567e);
            }
            String str = aVar.f17568f;
            if (str != null && !str.isEmpty()) {
                jsonWriter.name("playlist-version-hash").value(aVar.f17568f);
            }
        } else if (i10 == 3) {
            if (aVar.f17564b != 0) {
                jsonWriter.name("album-adam-id").value(aVar.f17564b);
            }
            if (aVar.f17565c != null) {
                jsonWriter.name("cloud-album-id").value(aVar.f17565c);
            }
        } else if (i10 == 4) {
            jsonWriter.name("artist-adam-id").value(aVar.f17564b);
        } else if (i10 == 5) {
            jsonWriter.name("season-id").value(aVar.f17564b);
        }
        jsonWriter.endObject();
    }

    private static void a(JsonWriter jsonWriter, a aVar) throws IOException {
        long j10 = aVar.f17574m;
        Long lValueOf = Long.valueOf(j10);
        long j11 = aVar.k;
        Long lValueOf2 = Long.valueOf(j11);
        jsonWriter.beginObject();
        if (aVar.f17563a == 1) {
            jsonWriter.name("radio-adam-id").value(lValueOf);
        } else {
            int i10 = aVar.f17571i;
            if (i10 == 8) {
                jsonWriter.name("auc-adam-id").value(lValueOf);
            } else {
                if (i10 == 11) {
                    jsonWriter.name("show-adam-id").value(lValueOf);
                }
                if (aVar.f17573l != 0) {
                    jsonWriter.name("purchased-adam-id").value(aVar.f17573l);
                }
                if (j10 != 0) {
                    jsonWriter.name("subscription-adam-id").value(lValueOf);
                }
                if (j11 != 0) {
                    jsonWriter.name("cloud-id").value(lValueOf2);
                }
            }
        }
        jsonWriter.endObject();
    }
}
