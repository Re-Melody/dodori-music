package com.apple.android.music.playback.g;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class h {
    public static g a(InputStream inputStream) throws IOException {
        JsonReader jsonReader = new JsonReader(new BufferedReader(new InputStreamReader(inputStream)));
        try {
            jsonReader.beginObject();
            List<b> listA = null;
            String strA = "";
            String strA2 = strA;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (strNextName.equals("songList")) {
                    listA = a(jsonReader);
                } else if (strNextName.equals("failureType")) {
                    strA = a(jsonReader, "");
                } else if (strNextName.equals("customerMessage")) {
                    strA2 = a(jsonReader, "");
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            return new g(listA, strA, strA2);
        } finally {
            jsonReader.close();
        }
    }

    private static List<b> b(JsonReader jsonReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            b bVarC = c(jsonReader);
            if (bVarC != null) {
                arrayList.add(bVarC);
            }
        }
        jsonReader.endArray();
        return arrayList;
    }

    private static b c(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strA = "";
        String strA2 = strA;
        long jA = 0;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("flavor")) {
                strA = a(jsonReader, "");
            } else if (strNextName.equals("URL")) {
                strA2 = a(jsonReader, "");
            } else if (strNextName.equals("file-size")) {
                jA = a(jsonReader, 0L);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (strA.contains("cbcp")) {
            return new b(strA, strA2, "", "", jA);
        }
        return null;
    }

    private static List<b> a(JsonReader jsonReader) throws IOException {
        jsonReader.beginArray();
        jsonReader.beginObject();
        List<b> listB = null;
        String strA = "";
        String strA2 = strA;
        int iA = 0;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("hls-key-cert-url")) {
                strA = a(jsonReader, "");
            } else if (strNextName.equals("hls-key-server-url")) {
                strA2 = a(jsonReader, "");
            } else if (strNextName.equals("songId")) {
                iA = a(jsonReader, 0);
            } else if (strNextName.equals("assets")) {
                listB = b(jsonReader);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.endArray();
        if (listB != null) {
            for (b bVar : listB) {
                bVar.a(strA);
                bVar.b(strA2);
                bVar.a(iA);
            }
        }
        return listB;
    }

    private static String a(JsonReader jsonReader, String str) throws IOException {
        if (jsonReader.peek() != JsonToken.NULL) {
            return jsonReader.nextString();
        }
        jsonReader.skipValue();
        return str;
    }

    private static int a(JsonReader jsonReader, int i10) throws IOException {
        if (jsonReader.peek() != JsonToken.NULL) {
            return jsonReader.nextInt();
        }
        jsonReader.skipValue();
        return i10;
    }

    private static long a(JsonReader jsonReader, long j10) throws IOException {
        if (jsonReader.peek() != JsonToken.NULL) {
            return jsonReader.nextLong();
        }
        jsonReader.skipValue();
        return j10;
    }
}
