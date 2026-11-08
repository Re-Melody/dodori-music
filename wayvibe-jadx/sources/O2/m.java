package O2;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
public class m extends E2.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9069a;

    public m(IllegalStateException illegalStateException, n nVar) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        String diagnosticInfo = null;
        sb.append(nVar == null ? null : nVar.f9070a);
        super(sb.toString(), illegalStateException);
        int i10 = B2.C.f560a;
        if (i10 >= 21 && (illegalStateException instanceof MediaCodec.CodecException)) {
            diagnosticInfo = ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.f9069a = i10 >= 23 ? illegalStateException instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0 : B2.C.v(diagnosticInfo);
    }
}
