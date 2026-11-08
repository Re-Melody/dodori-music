package p260y9;

import kotlin.jvm.internal.m;
import p219u9.a;
import p240w9.e;
import p240w9.g;
import p251x9.c;
import p251x9.d;

/* JADX INFO: renamed from: y9.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2377m implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2377m f29304a = new C2377m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final V f29305b = new V("kotlin.Char", e.f28063d);

    @Override // p219u9.a
    public final Object deserialize(c decoder) {
        m.f(decoder, "decoder");
        return Character.valueOf(decoder.f());
    }

    @Override // p219u9.a
    public final g getDescriptor() {
        return f29305b;
    }

    @Override // p219u9.a
    public final void serialize(d encoder, Object obj) {
        char cCharValue = ((Character) obj).charValue();
        m.f(encoder, "encoder");
        encoder.q(cCharValue);
    }
}
