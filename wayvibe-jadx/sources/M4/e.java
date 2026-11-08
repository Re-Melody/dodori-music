package M4;

import M2.o;
import X4.j;
import android.text.TextUtils;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p235w4.AbstractC2294b;
import p235w4.n;
import p235w4.r;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f8306a = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f8307b = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f8308c = Pattern.compile("CODECS=\"(.+?)\"");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f8309d = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f8310e = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f8311f = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f8312g = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f8313h = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f8314i = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f8315j = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern k = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f8316l = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f8317m = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f8318n = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES)");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f8319o = Pattern.compile("URI=\"(.+?)\"");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f8320p = Pattern.compile("IV=([^,.*]+)");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f8321q = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    public static final Pattern r = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f8322s = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f8323t = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Pattern f8324u = Pattern.compile("NAME=\"(.+?)\"");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Pattern f8325v = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Pattern f8326w = e("AUTOSELECT");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Pattern f8327x = e("DEFAULT");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Pattern f8328y = e("FORCED");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x0089  */
    public static b a(o oVar, String str) throws r {
        String str2;
        int i10;
        String str3;
        int i11;
        int i12;
        String str4;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        n nVar = null;
        List arrayList5 = null;
        boolean zContains = false;
        while (oVar.a()) {
            if (oVar.a()) {
                str2 = oVar.f8204c;
                oVar.f8204c = null;
            } else {
                str2 = null;
            }
            if (str2.startsWith("#EXT")) {
                arrayList4.add(str2);
            }
            if (str2.startsWith("#EXT-X-MEDIA")) {
                int i13 = (b(str2, f8328y) ? 2 : 0) | (b(str2, f8327x) ? 1 : 0) | (b(str2, f8326w) ? 4 : 0);
                String strF = f(str2, f8319o);
                String strG = g(str2, f8324u);
                String strF2 = f(str2, f8323t);
                String strG2 = g(str2, f8322s);
                strG2.getClass();
                switch (strG2) {
                    case "SUBTITLES":
                        arrayList3.add(new a(strF, new n(strG, "application/x-mpegURL", "text/vtt", null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i13, strF2, -1, Long.MAX_VALUE, null, null, null)));
                        break;
                    case "CLOSED-CAPTIONS":
                        String strG3 = g(str2, f8325v);
                        if (strG3.startsWith("CC")) {
                            i10 = Integer.parseInt(strG3.substring(2));
                            str3 = "application/cea-608";
                        } else {
                            i10 = Integer.parseInt(strG3.substring(7));
                            str3 = "application/cea-708";
                        }
                        int i14 = i10;
                        String str5 = str3;
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        arrayList5.add(new n(strG, null, str5, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i13, strF2, i14, Long.MAX_VALUE, null, null, null));
                        break;
                    case "AUDIO":
                        n nVar2 = new n(strG, "application/x-mpegURL", null, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i13, strF2, -1, Long.MAX_VALUE, null, null, null);
                        if (strF != null) {
                            arrayList2.add(new a(strF, nVar2));
                            break;
                        } else {
                            nVar = nVar2;
                            break;
                        }
                        break;
                }
            } else if (str2.startsWith("#EXT-X-STREAM-INF")) {
                zContains |= str2.contains("CLOSED-CAPTIONS=NONE");
                int i15 = Integer.parseInt(g(str2, f8307b));
                String strF3 = f(str2, f8306a);
                if (strF3 != null) {
                    i15 = Integer.parseInt(strF3);
                }
                String strF4 = f(str2, f8308c);
                String strF5 = f(str2, f8309d);
                if (strF5 != null) {
                    String[] strArrSplit = strF5.split("x");
                    int i16 = Integer.parseInt(strArrSplit[0]);
                    int i17 = Integer.parseInt(strArrSplit[1]);
                    if (i16 <= 0 || i17 <= 0) {
                        i17 = -1;
                        i16 = -1;
                    }
                    i12 = i17;
                    i11 = i16;
                } else {
                    i11 = -1;
                    i12 = -1;
                }
                String strF6 = f(str2, f8310e);
                float f10 = strF6 != null ? Float.parseFloat(strF6) : -1.0f;
                if (oVar.a()) {
                    str4 = oVar.f8204c;
                    oVar.f8204c = null;
                } else {
                    str4 = null;
                }
                if (hashSet.add(str4) && i15 <= 1356000) {
                    arrayList.add(new a(str4, new n(Integer.toString(arrayList.size()), "application/x-mpegURL", null, strF4, i15, -1, i11, i12, f10, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, null, null)));
                }
            }
        }
        if (zContains) {
            arrayList5 = Collections.EMPTY_LIST;
        }
        return new b(str, arrayList4, arrayList, arrayList2, arrayList3, nVar, arrayList5);
    }

    public static boolean b(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(1).equals("YES");
        }
        return false;
    }

    public static d d(o oVar, String str) throws r {
        int i10;
        String str2;
        ArrayList arrayList;
        long j10;
        p265z4.a aVar;
        String str3;
        String str4;
        int i11;
        String hexString;
        long j11;
        c cVar;
        oVar = oVar;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        long j12 = -9223372036854775807L;
        String str5 = null;
        long j13 = -9223372036854775807L;
        p265z4.b bVar = null;
        c cVar2 = null;
        String strG = null;
        String str6 = null;
        String strG2 = null;
        String str7 = null;
        long jB = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = -1;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1;
        int i15 = 0;
        boolean z11 = false;
        boolean z12 = false;
        int i16 = 0;
        int i17 = 0;
        boolean z13 = false;
        while (oVar.a()) {
            if (oVar.a()) {
                i10 = 0;
                str2 = oVar.f8204c;
                oVar.f8204c = str5;
            } else {
                i10 = 0;
                str2 = str5;
            }
            if (str2.startsWith("#EXT")) {
                arrayList3.add(str2);
            }
            if (str2.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String strG3 = g(str2, f8313h);
                if ("VOD".equals(strG3)) {
                    i15 = 1;
                } else if ("EVENT".equals(strG3)) {
                    i15 = 2;
                }
            } else if (str2.startsWith("#EXT-X-START")) {
                j12 = (long) (Double.parseDouble(g(str2, k)) * 1000000.0d);
            } else {
                boolean zStartsWith = str2.startsWith("#EXT-X-MAP");
                Pattern pattern = f8319o;
                if (zStartsWith) {
                    String strG4 = g(str2, pattern);
                    String strF = f(str2, f8317m);
                    if (strF != null) {
                        String[] strArrSplit = strF.split("@");
                        j17 = Long.parseLong(strArrSplit[i10]);
                        if (strArrSplit.length > 1) {
                            j14 = Long.parseLong(strArrSplit[1]);
                        }
                    }
                    c cVar3 = new c(strG4, 0L, -1, -9223372036854775807L, null, null, j14, j17);
                    oVar = oVar;
                    j14 = 0;
                    j17 = -1;
                    cVar2 = cVar3;
                } else {
                    if (str2.startsWith("#EXT-X-TARGETDURATION")) {
                        j13 = 1000000 * ((long) Integer.parseInt(g(str2, f8311f)));
                    } else if (str2.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                        i16 = Integer.parseInt(g(str2, f8314i));
                        oVar = oVar;
                        i13 = i16;
                    } else if (str2.startsWith("#EXT-X-VERSION")) {
                        i14 = Integer.parseInt(g(str2, f8312g));
                    } else if (str2.startsWith("#EXTINF")) {
                        oVar = oVar;
                        j15 = (long) (Double.parseDouble(g(str2, f8315j)) * 1000000.0d);
                    } else {
                        if (str2.startsWith("#EXT-X-KEY")) {
                            String strG5 = g(str2, f8318n);
                            Pattern pattern2 = f8321q;
                            arrayList = arrayList3;
                            String strF2 = f(str2, pattern2);
                            j10 = j12;
                            if ("NONE".equals(strG5)) {
                                strG = null;
                                str7 = null;
                            } else {
                                String strF3 = f(str2, f8320p);
                                if (!"identity".equals(strF2) && !"com.apple.streamingkeydelivery".equals(strF2) && strF2 != null) {
                                    if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(strF2)) {
                                        String strG6 = g(str2, pattern);
                                        aVar = new p265z4.a(AbstractC2294b.f27905c, "video/mp4", Base64.decode(strG6.substring(strG6.indexOf(44)), i10));
                                    } else if ("com.widevine".equals(strF2)) {
                                        try {
                                            aVar = new p265z4.a(AbstractC2294b.f27905c, "hls", str2.getBytes("UTF-8"));
                                        } catch (UnsupportedEncodingException e2) {
                                            throw new r(e2);
                                        }
                                    } else {
                                        aVar = null;
                                    }
                                    if (aVar != null) {
                                        bVar = new p265z4.b("SAMPLE-AES-CENC".equals(strG5) ? "cenc" : "cbcs", true, aVar);
                                    }
                                } else if ("AES-128".equals(strG5)) {
                                    strG = g(str2, pattern);
                                    str7 = strF3;
                                } else if ("SAMPLE-AES".equals(strG5)) {
                                    String strG7 = g(str2, pattern);
                                    String strG8 = g(str2, pattern2);
                                    strG = strG7;
                                    strG2 = g(str2, r);
                                    str6 = strG8;
                                    str7 = strF3;
                                    z13 = true;
                                }
                                str7 = strF3;
                                strG = null;
                            }
                        } else {
                            arrayList = arrayList3;
                            j10 = j12;
                            if (str2.startsWith("#EXT-X-BYTERANGE")) {
                                String[] strArrSplit2 = g(str2, f8316l).split("@");
                                j17 = Long.parseLong(strArrSplit2[0]);
                                if (strArrSplit2.length > 1) {
                                    j14 = Long.parseLong(strArrSplit2[1]);
                                }
                            } else if (str2.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                i12 = Integer.parseInt(str2.substring(str2.indexOf(58) + 1));
                                oVar = oVar;
                                arrayList3 = arrayList;
                                j12 = j10;
                                str5 = null;
                                z10 = true;
                            } else if (str2.equals("#EXT-X-DISCONTINUITY")) {
                                i17++;
                            } else {
                                if (str2.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                    if (jB == 0) {
                                        String strSubstring = str2.substring(str2.indexOf(58) + 1);
                                        Matcher matcher = j.f13236e.matcher(strSubstring);
                                        if (!matcher.matches()) {
                                            throw new r(p134m1.b.k("Invalid date/time format: ", strSubstring));
                                        }
                                        if (matcher.group(9) == null || matcher.group(9).equalsIgnoreCase("Z")) {
                                            i11 = 0;
                                        } else {
                                            i11 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
                                            if (matcher.group(11).equals("-")) {
                                                i11 *= -1;
                                            }
                                        }
                                        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
                                        gregorianCalendar.clear();
                                        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
                                        if (!TextUtils.isEmpty(matcher.group(8))) {
                                            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
                                        }
                                        long timeInMillis = gregorianCalendar.getTimeInMillis();
                                        if (i11 != 0) {
                                            timeInMillis -= (long) (i11 * 60000);
                                        }
                                        jB = AbstractC2294b.b(timeInMillis) - j16;
                                    } else {
                                        str3 = str6;
                                        str4 = strG2;
                                    }
                                } else if (str2.startsWith("#")) {
                                    String str8 = str2;
                                    str3 = str6;
                                    str4 = strG2;
                                    if (str8.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                        oVar = oVar;
                                        strG2 = str4;
                                        str6 = str3;
                                        arrayList3 = arrayList;
                                        j12 = j10;
                                        str5 = null;
                                        z11 = true;
                                    } else if (str8.equals("#EXT-X-ENDLIST")) {
                                        oVar = oVar;
                                        strG2 = str4;
                                        str6 = str3;
                                        arrayList3 = arrayList;
                                        j12 = j10;
                                        str5 = null;
                                        z12 = true;
                                    }
                                } else {
                                    if (strG == null) {
                                        hexString = null;
                                    } else {
                                        hexString = str7 != null ? str7 : Integer.toHexString(i16);
                                    }
                                    int i18 = i16 + 1;
                                    if (j17 == -1) {
                                        j14 = 0;
                                    }
                                    if (!z13 || str6 == null) {
                                        j11 = j14;
                                        cVar = new c(str2, j15, i17, j16, strG, hexString, j11, j17);
                                    } else {
                                        String str9 = strG;
                                        long j18 = j17;
                                        long j19 = j14;
                                        cVar = new c(str2, j15, i17, j16, (str2.endsWith(".mp4") || str2.startsWith(".m4", str2.length() - 4)) ? 3 : 2, str9, str6, strG2, j19, j18);
                                        strG = str9;
                                        j11 = j19;
                                        j17 = j18;
                                    }
                                    arrayList2.add(cVar);
                                    j16 += j15;
                                    j14 = j17 != -1 ? j11 + j17 : j11;
                                    i16 = i18;
                                    strG2 = strG2;
                                    str6 = str6;
                                    j15 = 0;
                                    j17 = -1;
                                    arrayList3 = arrayList;
                                    j12 = j10;
                                    str5 = null;
                                    oVar = oVar;
                                }
                                strG2 = str4;
                                str6 = str3;
                                arrayList3 = arrayList;
                                j12 = j10;
                            }
                        }
                        arrayList3 = arrayList;
                        j12 = j10;
                    }
                    oVar = oVar;
                }
            }
            str5 = null;
        }
        return new d(i15, str, arrayList3, j12, jB, z10, i12, i13, i14, j13, z11, z12, jB != 0, bVar, cVar2, arrayList2);
    }

    public static Pattern e(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static String f(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    public static String g(String str, Pattern pattern) throws r {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find() && matcher.groupCount() == 1) {
            return matcher.group(1);
        }
        throw new r("Couldn't match " + pattern.pattern() + " in " + str);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003d A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:3:0x000f, B:5:0x0017, B:7:0x001f, B:9:0x0027, B:34:0x006b, B:35:0x0072, B:12:0x002e, B:14:0x0034, B:18:0x003d, B:20:0x0045, B:23:0x0052, B:25:0x0058, B:29:0x005f, B:30:0x0064, B:38:0x0076, B:40:0x007c, B:43:0x0087, B:45:0x008f, B:48:0x00a3, B:50:0x00ab, B:52:0x00b3, B:54:0x00bb, B:56:0x00c3, B:58:0x00cb, B:60:0x00d3, B:62:0x00db, B:65:0x00e4, B:66:0x00e8), top: B:73:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0045 A[Catch: all -> 0x0073, LOOP:1: B:16:0x003a->B:20:0x0045, LOOP_END, TryCatch #0 {all -> 0x0073, blocks: (B:3:0x000f, B:5:0x0017, B:7:0x001f, B:9:0x0027, B:34:0x006b, B:35:0x0072, B:12:0x002e, B:14:0x0034, B:18:0x003d, B:20:0x0045, B:23:0x0052, B:25:0x0058, B:29:0x005f, B:30:0x0064, B:38:0x0076, B:40:0x007c, B:43:0x0087, B:45:0x008f, B:48:0x00a3, B:50:0x00ab, B:52:0x00b3, B:54:0x00bb, B:56:0x00c3, B:58:0x00cb, B:60:0x00d3, B:62:0x00db, B:65:0x00e4, B:66:0x00e8), top: B:73:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:78:0x006b A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:22:0x0050
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final G0.AbstractC0454b c(android.net.Uri r7, W4.d r8) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.e.c(android.net.Uri, W4.d):G0.b");
    }
}
