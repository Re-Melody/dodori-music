package com.apple.android.music.playback.g;

import android.util.JsonReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static e a(InputStream inputStream) throws IOException {
        JsonReader jsonReader = new JsonReader(new BufferedReader(new InputStreamReader(inputStream)));
        try {
            String strNextString = "";
            jsonReader.beginObject();
            int iNextInt = -1;
            int iNextInt2 = -1;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (strNextName.equals("license")) {
                    strNextString = jsonReader.nextString();
                } else if (strNextName.equals("renew-after")) {
                    iNextInt = jsonReader.nextInt();
                } else if (strNextName.equals("status")) {
                    iNextInt2 = jsonReader.nextInt();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            return new e(strNextString, iNextInt, iNextInt2);
        } finally {
            jsonReader.close();
        }
    }
}
