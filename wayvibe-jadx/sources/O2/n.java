package O2;

import B2.AbstractC0111a;
import B2.AbstractC0112b;
import F2.C0414g;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import p255y2.C2332h;
import p255y2.C2339o;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f9073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f9075f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f9076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f9077h;

    public n(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12) {
        str.getClass();
        this.f9070a = str;
        this.f9071b = str2;
        this.f9072c = str3;
        this.f9073d = codecCapabilities;
        this.f9076g = z10;
        this.f9074e = z11;
        this.f9075f = z12;
        this.f9077h = p255y2.C.k(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(B2.C.g(i10, widthAlignment) * widthAlignment, B2.C.g(i11, heightAlignment) * heightAlignment);
        int i12 = point.x;
        int i13 = point.y;
        return (d10 == -1.0d || d10 < 1.0d) ? videoCapabilities.isSizeSupported(i12, i13) : videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    public static n h(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11) {
        boolean z12;
        if (codecCapabilities == null || !codecCapabilities.isFeatureSupported("adaptive-playback")) {
            z12 = false;
        } else {
            if (B2.C.f560a <= 22) {
                String str4 = B2.C.f563d;
                if (("ODROID-XU3".equals(str4) || "Nexus 10".equals(str4)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                    z12 = false;
                }
            }
            z12 = true;
        }
        if (codecCapabilities != null && B2.C.f560a >= 21) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        return new n(str, str2, str3, codecCapabilities, z10, z12, z11 || (codecCapabilities != null && B2.C.f560a >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
    }

    public final C0414g b(C2339o c2339o, C2339o c2339o2) {
        C2339o c2339o3;
        C2339o c2339o4;
        int i10 = !B2.C.a(c2339o.f28954m, c2339o2.f28954m) ? 8 : 0;
        if (this.f9077h) {
            if (c2339o.f28962v != c2339o2.f28962v) {
                i10 |= 1024;
            }
            if (!this.f9074e && (c2339o.f28959s != c2339o2.f28959s || c2339o.f28960t != c2339o2.f28960t)) {
                i10 |= 512;
            }
            C2332h c2332h = c2339o.f28966z;
            boolean zE = C2332h.e(c2332h);
            C2332h c2332h2 = c2339o2.f28966z;
            if ((!zE || !C2332h.e(c2332h2)) && !B2.C.a(c2332h, c2332h2)) {
                i10 |= 2048;
            }
            if (B2.C.f563d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f9070a) && !c2339o.b(c2339o2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new C0414g(this.f9070a, c2339o, c2339o2, c2339o.b(c2339o2) ? 3 : 2, 0);
            }
            c2339o3 = c2339o;
            c2339o4 = c2339o2;
        } else {
            c2339o3 = c2339o;
            c2339o4 = c2339o2;
            if (c2339o3.f28932A != c2339o4.f28932A) {
                i10 |= 4096;
            }
            if (c2339o3.f28933B != c2339o4.f28933B) {
                i10 |= 8192;
            }
            if (c2339o3.f28934C != c2339o4.f28934C) {
                i10 |= 16384;
            }
            String str = this.f9071b;
            if (i10 == 0 && "audio/mp4a-latm".equals(str)) {
                Pair pairD = C.d(c2339o3);
                Pair pairD2 = C.d(c2339o4);
                if (pairD != null && pairD2 != null) {
                    int iIntValue = ((Integer) pairD.first).intValue();
                    int iIntValue2 = ((Integer) pairD2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new C0414g(this.f9070a, c2339o3, c2339o4, 3, 0);
                    }
                }
            }
            if (!c2339o3.b(c2339o4)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(str)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new C0414g(this.f9070a, c2339o3, c2339o4, 1, 0);
            }
        }
        return new C0414g(this.f9070a, c2339o3, c2339o4, 0, i10);
    }

    public final boolean c(C2339o c2339o, boolean z10) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair pairD = C.d(c2339o);
        if (pairD != null) {
            int iIntValue = ((Integer) pairD.first).intValue();
            int iIntValue2 = ((Integer) pairD.second).intValue();
            boolean zEquals = "video/dolby-vision".equals(c2339o.f28954m);
            int i10 = 8;
            String str = this.f9071b;
            if (zEquals) {
                if ("video/avc".equals(str)) {
                    iIntValue2 = 0;
                    iIntValue = 8;
                } else if ("video/hevc".equals(str)) {
                    iIntValue2 = 0;
                    iIntValue = 2;
                }
            }
            if (this.f9077h || iIntValue == 42) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.f9073d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                if (B2.C.f560a <= 23 && "video/x-vnd.on2.vp9".equals(str) && codecProfileLevelArr.length == 0) {
                    int iIntValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
                    if (iIntValue3 >= 180000000) {
                        i10 = 1024;
                    } else if (iIntValue3 >= 120000000) {
                        i10 = 512;
                    } else if (iIntValue3 >= 60000000) {
                        i10 = 256;
                    } else if (iIntValue3 >= 30000000) {
                        i10 = ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD;
                    } else if (iIntValue3 >= 18000000) {
                        i10 = 64;
                    } else if (iIntValue3 >= 12000000) {
                        i10 = 32;
                    } else if (iIntValue3 >= 7200000) {
                        i10 = 16;
                    } else if (iIntValue3 < 3600000) {
                        i10 = iIntValue3 >= 1800000 ? 4 : iIntValue3 >= 800000 ? 2 : 1;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i10;
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                    if (codecProfileLevel2.profile == iIntValue && (codecProfileLevel2.level >= iIntValue2 || !z10)) {
                        if ("video/hevc".equals(str) && 2 == iIntValue) {
                            String str2 = B2.C.f561b;
                            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                            }
                        }
                    }
                }
                g("codec.profileLevel, " + c2339o.f28952j + ", " + this.f9072c);
                return false;
            }
        }
        return true;
    }

    public final boolean d(C2339o c2339o) {
        int i10;
        int i11;
        String str = c2339o.f28954m;
        String str2 = this.f9071b;
        if (!(str2.equals(str) || str2.equals(C.b(c2339o))) || !c(c2339o, true)) {
            return false;
        }
        if (this.f9077h) {
            int i12 = c2339o.f28959s;
            if (i12 > 0 && (i11 = c2339o.f28960t) > 0) {
                if (B2.C.f560a >= 21) {
                    return f(i12, i11, c2339o.f28961u);
                }
                boolean z10 = i12 * i11 <= C.j();
                if (!z10) {
                    g("legacyFrameSize, " + i12 + "x" + i11);
                }
                return z10;
            }
        } else {
            int i13 = B2.C.f560a;
            if (i13 >= 21) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.f9073d;
                int i14 = c2339o.f28933B;
                if (i14 != -1) {
                    if (codecCapabilities == null) {
                        g("sampleRate.caps");
                        return false;
                    }
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        g("sampleRate.aCaps");
                        return false;
                    }
                    if (!audioCapabilities.isSampleRateSupported(i14)) {
                        g("sampleRate.support, " + i14);
                        return false;
                    }
                }
                int i15 = c2339o.f28932A;
                if (i15 != -1) {
                    if (codecCapabilities == null) {
                        g("channelCount.caps");
                        return false;
                    }
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        g("channelCount.aCaps");
                        return false;
                    }
                    int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                    if (maxInputChannelCount <= 1 && ((i13 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                        if ("audio/ac3".equals(str2)) {
                            i10 = 6;
                        } else {
                            i10 = "audio/eac3".equals(str2) ? 16 : 30;
                        }
                        AbstractC0111a.x("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f9070a + ", [" + maxInputChannelCount + " to " + i10 + "]");
                        maxInputChannelCount = i10;
                    }
                    if (maxInputChannelCount < i15) {
                        g("channelCount.support, " + i15);
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean e(C2339o c2339o) {
        if (this.f9077h) {
            return this.f9074e;
        }
        Pair pairD = C.d(c2339o);
        return pairD != null && ((Integer) pairD.first).intValue() == 42;
    }

    public final boolean f(int i10, int i11, double d10) {
        Boolean bool;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f9073d;
        if (codecCapabilities == null) {
            g("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            g("sizeAndRate.vCaps");
            return false;
        }
        int i12 = B2.C.f560a;
        if (i12 >= 29) {
            int iA = (i12 < 29 || ((bool = p025b9.a.f15818a) != null && bool.booleanValue())) ? 0 : p.a(videoCapabilities, i10, i11, d10);
            if (iA == 2) {
                return true;
            }
            if (iA == 1) {
                StringBuilder sbP = AbstractC0112b.p("sizeAndRate.cover, ", i10, "x", i11, "@");
                sbP.append(d10);
                g(sbP.toString());
                return false;
            }
        }
        if (!a(videoCapabilities, i10, i11, d10)) {
            if (i10 < i11) {
                String str = this.f9070a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(B2.C.f561b)) && a(videoCapabilities, i11, i10, d10)) {
                    StringBuilder sbP2 = AbstractC0112b.p("sizeAndRate.rotated, ", i10, "x", i11, "@");
                    sbP2.append(d10);
                    StringBuilder sbQ = p134m1.b.q("AssumedSupport [", sbP2.toString(), "] [", str, ", ");
                    sbQ.append(this.f9071b);
                    sbQ.append("] [");
                    sbQ.append(B2.C.f564e);
                    sbQ.append("]");
                    AbstractC0111a.k("MediaCodecInfo", sbQ.toString());
                }
            }
            StringBuilder sbP3 = AbstractC0112b.p("sizeAndRate.support, ", i10, "x", i11, "@");
            sbP3.append(d10);
            g(sbP3.toString());
            return false;
        }
        return true;
    }

    public final void g(String str) {
        StringBuilder sbU = V0.p.u("NoSupport [", str, "] [");
        sbU.append(this.f9070a);
        sbU.append(", ");
        sbU.append(this.f9071b);
        sbU.append("] [");
        sbU.append(B2.C.f564e);
        sbU.append("]");
        AbstractC0111a.k("MediaCodecInfo", sbU.toString());
    }

    public final String toString() {
        return this.f9070a;
    }
}
