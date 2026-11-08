package p260y9;

import kotlin.jvm.internal.m;
import p219u9.a;
import p240w9.e;
import p240w9.g;
import p251x9.c;
import p251x9.d;

/* JADX INFO: renamed from: y9.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2381q implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2381q f29317a = new C2381q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final V f29318b = new V("kotlin.Double", e.f28064e);

    @Override // p219u9.a
    public final Object deserialize(c decoder) {
        m.f(decoder, "decoder");
        return Double.valueOf(decoder.E());
    }

    @Override // p219u9.a
    public final g getDescriptor() {
        return f29318b;
    }

    @Override // p219u9.a
    public final void serialize(d encoder, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        m.f(encoder, "encoder");
        encoder.g(dDoubleValue);
    }
}
