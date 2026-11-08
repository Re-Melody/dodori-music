package com.apple.android.music.playback.f;

import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p199t.C2230e;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2230e f17406a = new C2230e(0);

    public static g a(InputStream inputStream) throws IOException {
        g gVar = new g();
        try {
            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            xmlPullParserNewPullParser.setInput(inputStream, "UTF-8");
            String strNextText = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.next()) {
                if (eventType == 2) {
                    if ("key".equals(xmlPullParserNewPullParser.getName())) {
                        strNextText = xmlPullParserNewPullParser.nextText();
                    } else {
                        Object objA = a(xmlPullParserNewPullParser);
                        if (strNextText != null) {
                            gVar.f17406a.put(strNextText, objA);
                        }
                    }
                }
            }
            return gVar;
        } catch (XmlPullParserException e2) {
            throw new IOException(e2);
        }
    }

    public String b(String str) {
        return a(str, (String) null);
    }

    public byte[] c(String str) {
        return a(str, (byte[]) null);
    }

    private static Object a(XmlPullParser xmlPullParser) {
        String name = xmlPullParser.getName();
        try {
            if ("byte".equals(name)) {
                return Byte.valueOf(Byte.parseByte(xmlPullParser.nextText()));
            }
            if ("char".equals(name)) {
                return Character.valueOf(xmlPullParser.nextText().charAt(0));
            }
            if (com.amazon.a.a.o.b.ag.equals(name)) {
                return Boolean.FALSE;
            }
            if ("float".equals(name)) {
                return Float.valueOf(Float.parseFloat(xmlPullParser.nextText()));
            }
            if ("int".equals(name)) {
                return Integer.valueOf(Integer.parseInt(xmlPullParser.nextText()));
            }
            if ("long".equals(name)) {
                return Long.valueOf(Long.parseLong(xmlPullParser.nextText()));
            }
            if ("null".equals(name)) {
                return null;
            }
            if ("string".equals(name)) {
                return xmlPullParser.nextText();
            }
            if (com.amazon.a.a.o.b.af.equals(name)) {
                return Boolean.TRUE;
            }
            if ("array".equals(name) && "byte".equals(xmlPullParser.getAttributeValue(null, "type"))) {
                return Base64.decode(xmlPullParser.nextText(), 3);
            }
            return null;
        } catch (NullPointerException | NumberFormatException unused) {
        }
    }

    public Set<String> a() {
        return this.f17406a.keySet();
    }

    public int a(String str, int i10) {
        Object obj = this.f17406a.get(str);
        return (obj != null && (obj instanceof Integer)) ? ((Integer) obj).intValue() : i10;
    }

    public long a(String str) {
        return a(str, 0L);
    }

    public long a(String str, long j10) {
        Object obj = this.f17406a.get(str);
        return (obj != null && (obj instanceof Long)) ? ((Long) obj).longValue() : j10;
    }

    public String a(String str, String str2) {
        Object obj = this.f17406a.get(str);
        return (obj != null && (obj instanceof String)) ? (String) obj : str2;
    }

    public byte[] a(String str, byte[] bArr) {
        Object obj = this.f17406a.get(str);
        return (obj != null && (obj instanceof byte[])) ? (byte[]) obj : bArr;
    }
}
