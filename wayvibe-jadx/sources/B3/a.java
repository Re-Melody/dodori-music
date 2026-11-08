package B3;

import A2.b;
import A6.E;
import B2.AbstractC0111a;
import B2.e;
import B2.u;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.apple.android.music.playback.model.MediaPlayerException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p234w3.l;
import p234w3.m;
import p267z6.h;

/* JADX INFO: loaded from: classes.dex */
public final class a implements m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f645d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f646e = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f647a = new StringBuilder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f648b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f649c = new u();

    public static b a(Spanned spanned, String str) {
        byte b10;
        int i10;
        byte b11;
        int i11;
        float f10;
        if (str == null) {
            return new b(spanned, null, null, null, -3.4028235E38f, MediaPlayerException.ERROR_UNKNOWN, MediaPlayerException.ERROR_UNKNOWN, -3.4028235E38f, MediaPlayerException.ERROR_UNKNOWN, MediaPlayerException.ERROR_UNKNOWN, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, MediaPlayerException.ERROR_UNKNOWN, 0.0f);
        }
        switch (str) {
            case "{\an1}":
                b10 = 0;
                break;
            case "{\an2}":
                b10 = 6;
                break;
            case "{\an3}":
                b10 = 3;
                break;
            case "{\an4}":
                b10 = 1;
                break;
            case "{\an5}":
                b10 = 7;
                break;
            case "{\an6}":
                b10 = 4;
                break;
            case "{\an7}":
                b10 = 2;
                break;
            case "{\an8}":
                b10 = 8;
                break;
            case "{\an9}":
                b10 = 5;
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 0 || b10 == 1 || b10 == 2) {
            i10 = 0;
        } else {
            i10 = (b10 == 3 || b10 == 4 || b10 == 5) ? 2 : 1;
        }
        switch (str) {
            case "{\an1}":
                b11 = 0;
                break;
            case "{\an2}":
                b11 = 1;
                break;
            case "{\an3}":
                b11 = 2;
                break;
            case "{\an4}":
                b11 = 6;
                break;
            case "{\an5}":
                b11 = 7;
                break;
            case "{\an6}":
                b11 = 8;
                break;
            case "{\an7}":
                b11 = 3;
                break;
            case "{\an8}":
                b11 = 4;
                break;
            case "{\an9}":
                b11 = 5;
                break;
            default:
                b11 = -1;
                break;
        }
        if (b11 == 0 || b11 == 1 || b11 == 2) {
            i11 = 2;
        } else {
            i11 = (b11 == 3 || b11 == 4 || b11 == 5) ? 0 : 1;
        }
        float f11 = 0.92f;
        if (i10 == 0) {
            f10 = 0.08f;
        } else if (i10 == 1) {
            f10 = 0.5f;
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException();
            }
            f10 = 0.92f;
        }
        if (i11 == 0) {
            f11 = 0.08f;
        } else if (i11 == 1) {
            f11 = 0.5f;
        } else if (i11 != 2) {
            throw new IllegalArgumentException();
        }
        return new b(spanned, null, null, null, f11, 0, i11, f10, i10, MediaPlayerException.ERROR_UNKNOWN, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, MediaPlayerException.ERROR_UNKNOWN, 0.0f);
    }

    public static long b(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10 + 1);
        long j10 = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i10 + 2);
        strGroup2.getClass();
        long j11 = (Long.parseLong(strGroup2) * 60000) + j10;
        String strGroup3 = matcher.group(i10 + 3);
        strGroup3.getClass();
        long j12 = (Long.parseLong(strGroup3) * 1000) + j11;
        String strGroup4 = matcher.group(i10 + 4);
        if (strGroup4 != null) {
            j12 += Long.parseLong(strGroup4);
        }
        return j12 * 1000;
    }

    @Override // p234w3.m
    public final void t(byte[] bArr, int i10, int i11, l lVar, e eVar) {
        String str;
        a aVar = this;
        u uVar = aVar.f649c;
        uVar.D(bArr, i10 + i11);
        uVar.F(i10);
        Charset charsetB = uVar.B();
        if (charsetB == null) {
            charsetB = h.f29879c;
        }
        long j10 = lVar.f27873a;
        long j11 = -9223372036854775807L;
        ArrayList arrayList = (j10 == -9223372036854775807L || !lVar.f27874b) ? null : new ArrayList();
        while (true) {
            String strH = uVar.h(charsetB);
            if (strH == null) {
                break;
            }
            if (strH.length() != 0) {
                try {
                    Integer.parseInt(strH);
                    String strH2 = uVar.h(charsetB);
                    if (strH2 == null) {
                        AbstractC0111a.x("SubripParser", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f645d.matcher(strH2);
                    if (matcher.matches()) {
                        long jB = b(matcher, 1);
                        long jB2 = b(matcher, 6);
                        StringBuilder sb = aVar.f647a;
                        sb.setLength(0);
                        long j12 = j11;
                        ArrayList arrayList2 = aVar.f648b;
                        arrayList2.clear();
                        String strH3 = uVar.h(charsetB);
                        while (!TextUtils.isEmpty(strH3)) {
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            String strTrim = strH3.trim();
                            StringBuilder sb2 = new StringBuilder(strTrim);
                            Matcher matcher2 = f646e.matcher(strTrim);
                            int i12 = 0;
                            while (matcher2.find()) {
                                String strGroup = matcher2.group();
                                arrayList2.add(strGroup);
                                int iStart = matcher2.start() - i12;
                                int length = strGroup.length();
                                sb2.replace(iStart, iStart + length, "");
                                i12 += length;
                                j10 = j10;
                            }
                            sb.append(sb2.toString());
                            strH3 = uVar.h(charsetB);
                            j10 = j10;
                        }
                        long j13 = j10;
                        Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                        int i13 = 0;
                        while (true) {
                            if (i13 >= arrayList2.size()) {
                                str = null;
                                break;
                            }
                            str = (String) arrayList2.get(i13);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                        if (j13 == j12 || jB >= j13) {
                            eVar.accept(new p234w3.a(E.x(a(spannedFromHtml, str)), jB, jB2 - jB));
                        } else if (arrayList != null) {
                            arrayList.add(new p234w3.a(E.x(a(spannedFromHtml, str)), jB, jB2 - jB));
                        }
                        aVar = this;
                        j11 = j12;
                        j10 = j13;
                    } else {
                        AbstractC0111a.x("SubripParser", "Skipping invalid timing: ".concat(strH2));
                        aVar = this;
                    }
                } catch (NumberFormatException unused) {
                    AbstractC0111a.x("SubripParser", "Skipping invalid index: ".concat(strH));
                }
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                eVar.accept((p234w3.a) it.next());
            }
        }
    }

    @Override // p234w3.m
    public final int v() {
        return 1;
    }
}
