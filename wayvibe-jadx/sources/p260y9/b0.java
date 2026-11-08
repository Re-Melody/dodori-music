package p260y9;

import kotlin.jvm.internal.m;
import p219u9.a;
import p240w9.e;
import p240w9.g;
import p251x9.c;
import p251x9.d;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f29269a = new b0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final V f29270b = new V("kotlin.Short", e.f28068i);

    @Override // p219u9.a
    public final Object deserialize(c decoder) {
        m.f(decoder, "decoder");
        return Short.valueOf(decoder.A());
    }

    @Override // p219u9.a
    public final g getDescriptor() {
        return f29270b;
    }

    @Override // p219u9.a
    public final void serialize(d encoder, Object obj) {
        short sShortValue = ((Number) obj).shortValue();
        m.f(encoder, "encoder");
        encoder.h(sShortValue);
    }
}
