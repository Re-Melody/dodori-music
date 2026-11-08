package com.apple.android.music.playback.f;

import android.util.JsonReader;
import com.apple.android.music.playback.model.l;
import com.apple.android.music.playback.model.r;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Map;
import p199t.C2230e;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static Map<String, r> a(InputStream inputStream) throws IOException {
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, "UTF-8"));
        Map<String, r> mapA = Collections.EMPTY_MAP;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if ("data".equals(jsonReader.nextName())) {
                mapA = a(jsonReader);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return mapA;
    }

    public static String b(InputStream inputStream) throws IOException {
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, "UTF-8"));
        jsonReader.beginObject();
        String strB = null;
        while (jsonReader.hasNext()) {
            if ("data".equals(jsonReader.nextName())) {
                strB = b(jsonReader);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return strB;
    }

    private static String c(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        while (jsonReader.hasNext()) {
            if (DiagnosticsEntry.ID_KEY.equals(jsonReader.nextName())) {
                strNextString = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return strNextString;
    }

    private static String b(JsonReader jsonReader) throws IOException {
        jsonReader.beginArray();
        String strC = null;
        while (jsonReader.hasNext()) {
            if (strC == null) {
                strC = c(jsonReader);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endArray();
        return strC;
    }

    private static Map<String, r> a(JsonReader jsonReader) throws IOException {
        C2230e c2230e = new C2230e(0);
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            r rVarA = l.a(jsonReader);
            c2230e.put(rVarA.b(), rVarA);
        }
        jsonReader.endArray();
        return c2230e;
    }
}
