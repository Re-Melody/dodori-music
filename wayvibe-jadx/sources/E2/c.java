package E2;

import B2.C;
import M.s;
import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f3018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f3019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f3021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f3022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f3026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s f3027j;

    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f3026i = cryptoInfo;
        this.f3027j = C.f560a >= 24 ? new s(cryptoInfo) : null;
    }
}
