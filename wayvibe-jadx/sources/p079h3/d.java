package p079h3;

import A6.B;
import A6.C;
import A6.E;
import A6.W;
import B2.AbstractC0111a;
import D8.C0272f;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p255y2.D;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f20240a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f20241b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f20242c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static C0272f a(String str) throws XmlPullParserException, IOException {
        long j10;
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!AbstractC0111a.r(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw D.a(null, "Couldn't find xmp metadata");
        }
        C c3 = E.f299b;
        W wB = W.f329e;
        long j11 = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (AbstractC0111a.r(xmlPullParserNewPullParser, "rdf:Description")) {
                String[] strArr = f20240a;
                int i10 = 0;
                for (int i11 = 0; i11 < 4; i11++) {
                    String strN = AbstractC0111a.n(xmlPullParserNewPullParser, strArr[i11]);
                    if (strN != null) {
                        if (Integer.parseInt(strN) != 1) {
                            break loop0;
                        }
                        String[] strArr2 = f20241b;
                        int i12 = 0;
                        while (true) {
                            if (i12 < 4) {
                                String strN2 = AbstractC0111a.n(xmlPullParserNewPullParser, strArr2[i12]);
                                if (strN2 != null) {
                                    j10 = Long.parseLong(strN2);
                                    if (j10 != -1) {
                                        break;
                                    }
                                    break;
                                }
                                i12++;
                            }
                            j10 = -9223372036854775807L;
                            break;
                        }
                        String[] strArr3 = f20242c;
                        while (true) {
                            if (i10 >= 2) {
                                C c9 = E.f299b;
                                wB = W.f329e;
                                break;
                            }
                            String strN3 = AbstractC0111a.n(xmlPullParserNewPullParser, strArr3[i10]);
                            if (strN3 != null) {
                                wB = E.y(new b("image/jpeg", 0L, 0L), new b("video/mp4", Long.parseLong(strN3), 0L));
                                break;
                            }
                            i10++;
                        }
                        j11 = j10;
                    }
                }
                return null;
            }
            if (AbstractC0111a.r(xmlPullParserNewPullParser, "Container:Directory")) {
                wB = b(xmlPullParserNewPullParser, "Container", "Item");
            } else if (AbstractC0111a.r(xmlPullParserNewPullParser, "GContainer:Directory")) {
                wB = b(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!AbstractC0111a.q(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (wB.isEmpty()) {
            break loop0;
        }
        return new C0272f(j11, wB, 4);
        return null;
    }

    public static W b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        B bQ = E.q();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (AbstractC0111a.r(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strN = AbstractC0111a.n(xmlPullParser, strConcat3);
                String strN2 = AbstractC0111a.n(xmlPullParser, strConcat4);
                String strN3 = AbstractC0111a.n(xmlPullParser, strConcat5);
                String strN4 = AbstractC0111a.n(xmlPullParser, strConcat6);
                if (strN == null || strN2 == null) {
                    return W.f329e;
                }
                bQ.a(new b(strN, strN3 != null ? Long.parseLong(strN3) : 0L, strN4 != null ? Long.parseLong(strN4) : 0L));
            }
        } while (!AbstractC0111a.q(xmlPullParser, strConcat2));
        return bQ.f();
    }
}
