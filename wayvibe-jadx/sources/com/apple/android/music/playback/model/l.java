package com.apple.android.music.playback.model;

import android.util.JsonReader;
import android.util.JsonToken;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final DateFormat f17460a = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

    public static r a(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() != JsonToken.BEGIN_OBJECT) {
            return new r(0, null, Collections.EMPTY_LIST);
        }
        q qVar = new q();
        ArrayList<q> arrayList = new ArrayList();
        jsonReader.beginObject();
        int iB = 0;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (DiagnosticsEntry.ID_KEY.equals(strNextName)) {
                qVar.f17464a = e(jsonReader);
            } else if ("type".equals(strNextName)) {
                String strE = e(jsonReader);
                qVar.f17465b = a(strE);
                iB = b(strE);
            } else if ("attributes".equals(strNextName)) {
                a(jsonReader, qVar);
            } else if ("relationships".equals(strNextName)) {
                a(jsonReader, qVar, arrayList);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (iB == 0) {
            return new r(0, qVar.f17464a, Collections.singletonList(qVar));
        }
        if (iB == 1) {
            for (q qVar2 : arrayList) {
                qVar2.f17467d = qVar.f17464a;
                qVar2.f17469f = qVar.f17469f;
                qVar2.r = qVar.r;
                qVar2.f17471h = qVar.f17470g;
            }
        }
        return new r(iB, qVar.f17464a, arrayList);
    }

    private static void b(JsonReader jsonReader, q qVar) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if ("data".equals(jsonReader.nextName())) {
                c(jsonReader, qVar);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    private static void c(JsonReader jsonReader, q qVar) throws IOException {
        jsonReader.beginArray();
        String strE = null;
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (DiagnosticsEntry.ID_KEY.equals(jsonReader.nextName()) && strE == null) {
                    strE = e(jsonReader);
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
        }
        jsonReader.endArray();
        qVar.f17467d = strE;
    }

    private static void d(JsonReader jsonReader, q qVar) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if ("data".equals(jsonReader.nextName())) {
                e(jsonReader, qVar);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    private static void e(JsonReader jsonReader, q qVar) throws IOException {
        jsonReader.beginArray();
        String strE = null;
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (DiagnosticsEntry.ID_KEY.equals(jsonReader.nextName()) && strE == null) {
                    strE = e(jsonReader);
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
        }
        jsonReader.endArray();
        qVar.f17469f = strE;
    }

    private static void f(JsonReader jsonReader, q qVar) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (DiagnosticsEntry.ID_KEY.equals(jsonReader.nextName())) {
                qVar.f17476n = true;
                jsonReader.skipValue();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    private static void b(JsonReader jsonReader, List<q> list) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            q qVar = new q();
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (DiagnosticsEntry.ID_KEY.equals(strNextName)) {
                    qVar.f17464a = e(jsonReader);
                } else if ("type".equals(strNextName)) {
                    qVar.f17465b = a(e(jsonReader));
                } else if ("attributes".equals(strNextName)) {
                    a(jsonReader, qVar);
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            if (qVar.f17465b != 0) {
                list.add(qVar);
            }
        }
        jsonReader.endArray();
    }

    private static Date d(JsonReader jsonReader) throws IOException {
        String strE = e(jsonReader);
        if (strE != null && !strE.isEmpty()) {
            try {
                return f17460a.parse(strE);
            } catch (ParseException unused) {
            }
        }
        return null;
    }

    private static String c(JsonReader jsonReader) throws IOException {
        String strE = null;
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            if (strE != null && !strE.isEmpty()) {
                jsonReader.skipValue();
            } else {
                strE = e(jsonReader);
            }
        }
        jsonReader.endArray();
        return strE;
    }

    private static String e(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return jsonReader.nextString();
    }

    private static int b(String str) {
        if ("albums".equals(str)) {
            return 1;
        }
        return "playlists".equals(str) ? 2 : 0;
    }

    private static void a(JsonReader jsonReader, q qVar) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("artwork".equals(strNextName)) {
                qVar.f17473j = b(jsonReader);
            } else if ("artistName".equals(strNextName)) {
                qVar.f17470g = e(jsonReader);
            } else if ("url".equals(strNextName)) {
                qVar.f17472i = e(jsonReader);
            } else if ("discNumber".equals(strNextName)) {
                qVar.f17480s = jsonReader.nextInt();
            } else if ("genreNames".equals(strNextName)) {
                qVar.f17474l = c(jsonReader);
            } else if ("durationInMillis".equals(strNextName)) {
                qVar.f17477o = jsonReader.nextLong();
            } else if ("releaseDate".equals(strNextName)) {
                qVar.f17478p = d(jsonReader);
            } else if ("name".equals(strNextName)) {
                qVar.f17466c = e(jsonReader);
            } else if ("albumName".equals(strNextName)) {
                qVar.f17468e = e(jsonReader);
            } else if ("playParams".equals(strNextName)) {
                f(jsonReader, qVar);
            } else if ("trackNumber".equals(strNextName)) {
                qVar.f17479q = jsonReader.nextInt();
            } else if ("trackCount".equals(strNextName)) {
                qVar.r = jsonReader.nextInt();
            } else if ("composerName".equals(strNextName)) {
                qVar.f17475m = e(jsonReader);
            } else if ("contentRating".equals(strNextName)) {
                if ("explicit".equals(e(jsonReader))) {
                    qVar.f17482u = 500;
                } else {
                    qVar.f17482u = 100;
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    private static String b(JsonReader jsonReader) throws IOException {
        String strE = null;
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if ("url".equals(jsonReader.nextName())) {
                strE = e(jsonReader);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return strE;
    }

    private static void a(JsonReader jsonReader, q qVar, List<q> list) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("albums".equals(strNextName)) {
                b(jsonReader, qVar);
            } else if ("artists".equals(strNextName)) {
                d(jsonReader, qVar);
            } else if ("tracks".equals(strNextName)) {
                a(jsonReader, list);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    private static void a(JsonReader jsonReader, List<q> list) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if ("data".equals(jsonReader.nextName())) {
                b(jsonReader, list);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    private static int a(String str) {
        if ("songs".equals(str)) {
            return 1;
        }
        return "music-videos".equals(str) ? 2 : 0;
    }
}
