package p260y9;

import kotlin.jvm.internal.m;
import p219u9.a;
import p240w9.e;
import p240w9.g;
import p251x9.c;
import p251x9.d;

/* JADX INFO: renamed from: y9.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2388y implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2388y f29340a = new C2388y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final V f29341b = new V("kotlin.Float", e.f28065f);

    @Override // p219u9.a
    public final Object deserialize(c decoder) {
        m.f(decoder, "decoder");
        return Float.valueOf(decoder.B());
    }

    @Override // p219u9.a
    public final g getDescriptor() {
        return f29341b;
    }

    @Override // p219u9.a
    public final void serialize(d encoder, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        m.f(encoder, "encoder");
        encoder.n(fFloatValue);
    }
}
