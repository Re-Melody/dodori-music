package p260y9;

import kotlin.jvm.internal.m;
import p219u9.a;
import p240w9.e;
import p240w9.g;
import p251x9.c;
import p251x9.d;

/* JADX INFO: loaded from: classes2.dex */
public final class E implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E f29225a = new E();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final V f29226b = new V("kotlin.Int", e.f28066g);

    @Override // p219u9.a
    public final Object deserialize(c decoder) {
        m.f(decoder, "decoder");
        return Integer.valueOf(decoder.n());
    }

    @Override // p219u9.a
    public final g getDescriptor() {
        return f29226b;
    }

    @Override // p219u9.a
    public final void serialize(d encoder, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        m.f(encoder, "encoder");
        encoder.z(iIntValue);
    }
}
