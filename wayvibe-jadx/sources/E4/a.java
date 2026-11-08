package E4;

import X4.j;
import android.media.MediaCodecInfo;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f3094f;

    public a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11) {
        str.getClass();
        this.f3089a = str;
        this.f3093e = str2;
        this.f3094f = codecCapabilities;
        boolean z12 = false;
        this.f3090b = !z10 && codecCapabilities != null && j.f13232a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
        this.f3091c = codecCapabilities != null && j.f13232a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback");
        if (z11 || (codecCapabilities != null && j.f13232a >= 21 && codecCapabilities.isFeatureSupported("secure-playback"))) {
            z12 = true;
        }
        this.f3092d = z12;
    }

    public final boolean a(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f3094f;
        if (codecCapabilities == null) {
            int i12 = j.f13232a;
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            int i13 = j.f13232a;
            return false;
        }
        if ((d10 == -1.0d || d10 <= 0.0d) ? videoCapabilities.isSizeSupported(i10, i11) : videoCapabilities.areSizeAndRateSupported(i10, i11, d10)) {
            return true;
        }
        if (i10 < i11) {
            if ((d10 == -1.0d || d10 <= 0.0d) ? videoCapabilities.isSizeSupported(i11, i10) : videoCapabilities.areSizeAndRateSupported(i11, i10, d10)) {
                int i14 = j.f13232a;
                return true;
            }
        }
        int i15 = j.f13232a;
        return false;
    }
}
