package O2;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: O2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0687a implements MediaCodec.OnFrameRenderedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X2.k f9025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f9026c;

    public /* synthetic */ C0687a(k kVar, X2.k kVar2, int i10) {
        this.f9024a = i10;
        this.f9026c = kVar;
        this.f9025b = kVar2;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        switch (this.f9024a) {
            case 0:
                ((C0688b) this.f9026c).getClass();
                X2.k kVar = this.f9025b;
                kVar.getClass();
                if (B2.C.f560a >= 30) {
                    kVar.a(j10);
                } else {
                    Handler handler = kVar.f13095a;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j10 >> 32), (int) j10));
                }
                break;
            default:
                ((android.support.v4.media.session.t) this.f9026c).getClass();
                X2.k kVar2 = this.f9025b;
                kVar2.getClass();
                if (B2.C.f560a >= 30) {
                    kVar2.a(j10);
                } else {
                    Handler handler2 = kVar2.f13095a;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j10 >> 32), (int) j10));
                }
                break;
        }
    }
}
