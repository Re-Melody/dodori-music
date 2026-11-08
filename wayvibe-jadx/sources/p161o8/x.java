package p161o8;

import X8.a;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public final class x implements t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f23838b = new x(w.f23835a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f23839a;

    public x(w wVar) {
        this.f23839a = wVar;
    }

    @Override // p161o8.t
    public final o a(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        w wVar = this.f23839a;
        Object objE = wVar.e(byteBuffer);
        Object objE2 = wVar.e(byteBuffer);
        if (!(objE instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new o((String) objE, objE2);
    }

    @Override // p161o8.t
    public final ByteBuffer b(Object obj) throws IOException {
        a aVar = new a();
        aVar.write(0);
        this.f23839a.k(aVar, obj);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(aVar.size());
        byteBufferAllocateDirect.put(aVar.b(), 0, aVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // p161o8.t
    public final ByteBuffer c(String str, String str2) throws IOException {
        a aVar = new a();
        aVar.write(1);
        w wVar = this.f23839a;
        wVar.k(aVar, "error");
        wVar.k(aVar, str);
        wVar.k(aVar, null);
        wVar.k(aVar, str2);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(aVar.size());
        byteBufferAllocateDirect.put(aVar.b(), 0, aVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // p161o8.t
    public final ByteBuffer d(o oVar) {
        a aVar = new a();
        w wVar = this.f23839a;
        wVar.k(aVar, oVar.f23827a);
        wVar.k(aVar, oVar.f23828b);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(aVar.size());
        byteBufferAllocateDirect.put(aVar.b(), 0, aVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // p161o8.t
    public final ByteBuffer e(Object obj, String str, String str2) throws IOException {
        a aVar = new a();
        aVar.write(1);
        w wVar = this.f23839a;
        wVar.k(aVar, str);
        wVar.k(aVar, str2);
        if (obj instanceof Throwable) {
            wVar.k(aVar, Log.getStackTraceString((Throwable) obj));
        } else {
            wVar.k(aVar, obj);
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(aVar.size());
        byteBufferAllocateDirect.put(aVar.b(), 0, aVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // p161o8.t
    public final Object f(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        byte b10 = byteBuffer.get();
        w wVar = this.f23839a;
        if (b10 != 0) {
            if (b10 == 1) {
            }
            throw new IllegalArgumentException("Envelope corrupted");
        }
        Object objE = wVar.e(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return objE;
        }
        Object objE2 = wVar.e(byteBuffer);
        Object objE3 = wVar.e(byteBuffer);
        Object objE4 = wVar.e(byteBuffer);
        if ((objE2 instanceof String) && ((objE3 == null || (objE3 instanceof String)) && !byteBuffer.hasRemaining())) {
            throw new k(objE4, (String) objE2, (String) objE3);
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }
}
