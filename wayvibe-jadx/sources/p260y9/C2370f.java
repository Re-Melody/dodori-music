package p260y9;

import kotlin.jvm.internal.m;
import p219u9.a;
import p240w9.e;
import p240w9.g;
import p251x9.c;
import p251x9.d;

/* JADX INFO: renamed from: y9.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2370f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2370f f29283a = new C2370f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final V f29284b = new V("kotlin.Boolean", e.f28061b);

    @Override // p219u9.a
    public final Object deserialize(c decoder) {
        m.f(decoder, "decoder");
        return Boolean.valueOf(decoder.e());
    }

    @Override // p219u9.a
    public final g getDescriptor() {
        return f29284b;
    }

    @Override // p219u9.a
    public final void serialize(d encoder, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m.f(encoder, "encoder");
        encoder.k(zBooleanValue);
    }
}
