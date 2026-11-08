package E4;

import O2.A;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: loaded from: classes.dex */
public final class h implements g, A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediaCodecInfo[] f3128b;

    public h(boolean z10) {
        this.f3127a = z10 ? 1 : 0;
    }

    @Override // E4.g
    public boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    @Override // E4.g
    public boolean b() {
        return true;
    }

    @Override // O2.A
    public boolean g(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // O2.A
    public boolean i(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // O2.A
    public int j() {
        if (this.f3128b == null) {
            this.f3128b = new MediaCodecList(this.f3127a).getCodecInfos();
        }
        return this.f3128b.length;
    }

    @Override // O2.A
    public boolean m() {
        return true;
    }

    @Override // E4.g
    public int a() {
        if (this.f3128b == null) {
            this.f3128b = new MediaCodecList(this.f3127a).getCodecInfos();
        }
        return this.f3128b.length;
    }

    @Override // O2.A
    public MediaCodecInfo b(int i10) {
        if (this.f3128b == null) {
            this.f3128b = new MediaCodecList(this.f3127a).getCodecInfos();
        }
        return this.f3128b[i10];
    }

    public h(boolean z10, boolean z11) {
        this.f3127a = (z10 || z11) ? 1 : 0;
    }

    @Override // E4.g
    public MediaCodecInfo a(int i10) {
        if (this.f3128b == null) {
            this.f3128b = new MediaCodecList(this.f3127a).getCodecInfos();
        }
        return this.f3128b[i10];
    }
}
