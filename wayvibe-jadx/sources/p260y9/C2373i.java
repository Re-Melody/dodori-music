package p260y9;

import kotlin.jvm.internal.m;
import p219u9.a;
import p240w9.e;
import p240w9.g;
import p251x9.c;
import p251x9.d;

/* JADX INFO: renamed from: y9.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2373i implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2373i f29293a = new C2373i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final V f29294b = new V("kotlin.Byte", e.f28062c);

    @Override // p219u9.a
    public final Object deserialize(c decoder) {
        m.f(decoder, "decoder");
        return Byte.valueOf(decoder.z());
    }

    @Override // p219u9.a
    public final g getDescriptor() {
        return f29294b;
    }

    @Override // p219u9.a
    public final void serialize(d encoder, Object obj) {
        byte bByteValue = ((Number) obj).byteValue();
        m.f(encoder, "encoder");
        encoder.j(bByteValue);
    }
}
