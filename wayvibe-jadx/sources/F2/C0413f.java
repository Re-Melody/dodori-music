package F2;

import B2.AbstractC0112b;
import java.util.Locale;

/* JADX INFO: renamed from: F2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0413f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4120g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4121h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4122i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4123j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4124l;

    public final String toString() {
        int i10 = this.f4114a;
        int i11 = this.f4115b;
        int i12 = this.f4116c;
        int i13 = this.f4117d;
        int i14 = this.f4118e;
        int i15 = this.f4119f;
        int i16 = this.f4120g;
        int i17 = this.f4121h;
        int i18 = this.f4122i;
        int i19 = this.f4123j;
        long j10 = this.k;
        int i20 = this.f4124l;
        int i21 = B2.C.f560a;
        Locale locale = Locale.US;
        StringBuilder sbP = AbstractC0112b.p("DecoderCounters {\n decoderInits=", i10, ",\n decoderReleases=", i11, "\n queuedInputBuffers=");
        sbP.append(i12);
        sbP.append("\n skippedInputBuffers=");
        sbP.append(i13);
        sbP.append("\n renderedOutputBuffers=");
        sbP.append(i14);
        sbP.append("\n skippedOutputBuffers=");
        sbP.append(i15);
        sbP.append("\n droppedBuffers=");
        sbP.append(i16);
        sbP.append("\n droppedInputBuffers=");
        sbP.append(i17);
        sbP.append("\n maxConsecutiveDroppedBuffers=");
        sbP.append(i18);
        sbP.append("\n droppedToKeyframeEvents=");
        sbP.append(i19);
        sbP.append("\n totalVideoFrameProcessingOffsetUs=");
        sbP.append(j10);
        sbP.append("\n videoFrameProcessingOffsetCount=");
        sbP.append(i20);
        sbP.append("\n}");
        return sbP.toString();
    }
}
