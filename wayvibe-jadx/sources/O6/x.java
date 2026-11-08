package O6;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final V6.a f9330a = V6.a.a(new byte[0]);

    public static final V6.a a(int i10) {
        return V6.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(i10).array());
    }

    public static final V6.a b(int i10) {
        return V6.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(i10).array());
    }
}
