package p260y9;

import kotlin.jvm.internal.m;
import p219u9.a;
import p240w9.e;
import p240w9.g;
import p251x9.c;
import p251x9.d;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f29272a = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final V f29273b = new V("kotlin.String", e.f28069j);

    @Override // p219u9.a
    public final Object deserialize(c decoder) {
        m.f(decoder, "decoder");
        return decoder.p();
    }

    @Override // p219u9.a
    public final g getDescriptor() {
        return f29273b;
    }

    @Override // p219u9.a
    public final void serialize(d encoder, Object obj) {
        String value = (String) obj;
        m.f(encoder, "encoder");
        m.f(value, "value");
        encoder.F(value);
    }
}
