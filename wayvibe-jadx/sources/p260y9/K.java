package p260y9;

import kotlin.jvm.internal.m;
import p219u9.a;
import p240w9.e;
import p240w9.g;
import p251x9.c;
import p251x9.d;

/* JADX INFO: loaded from: classes2.dex */
public final class K implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K f29237a = new K();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final V f29238b = new V("kotlin.Long", e.f28067h);

    @Override // p219u9.a
    public final Object deserialize(c decoder) {
        m.f(decoder, "decoder");
        return Long.valueOf(decoder.t());
    }

    @Override // p219u9.a
    public final g getDescriptor() {
        return f29238b;
    }

    @Override // p219u9.a
    public final void serialize(d encoder, Object obj) {
        long jLongValue = ((Number) obj).longValue();
        m.f(encoder, "encoder");
        encoder.D(jLongValue);
    }
}
