package p063f8;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import p161o8.e;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlutterJNI f19868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f19870c = new AtomicBoolean(false);

    public g(FlutterJNI flutterJNI, int i10) {
        this.f19868a = flutterJNI;
        this.f19869b = i10;
    }

    @Override // p161o8.e
    public final void a(ByteBuffer byteBuffer) {
        if (this.f19870c.getAndSet(true)) {
            throw new IllegalStateException("Reply already submitted");
        }
        int i10 = this.f19869b;
        FlutterJNI flutterJNI = this.f19868a;
        if (byteBuffer == null) {
            flutterJNI.invokePlatformMessageEmptyResponseCallback(i10);
        } else {
            flutterJNI.invokePlatformMessageResponseCallback(i10, byteBuffer, byteBuffer.position());
        }
    }
}
