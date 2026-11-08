package O2;

import p255y2.C2339o;

/* JADX INFO: loaded from: classes.dex */
public final class s extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f9080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9081d;

    public s(C2339o c2339o, z zVar, boolean z10, int i10) {
        this("Decoder init failed: [" + i10 + "], " + c2339o, zVar, c2339o.f28954m, z10, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10));
    }

    public s(String str, Throwable th, String str2, boolean z10, n nVar, String str3) {
        super(str, th);
        this.f9078a = str2;
        this.f9079b = z10;
        this.f9080c = nVar;
        this.f9081d = str3;
    }
}
