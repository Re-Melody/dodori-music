package p260y9;

import kotlin.jvm.internal.m;
import p219u9.a;
import p240w9.g;
import p251x9.c;
import p251x9.d;

/* JADX INFO: loaded from: classes2.dex */
public final class N implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f29242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X f29243b;

    public N(a serializer) {
        m.f(serializer, "serializer");
        this.f29242a = serializer;
        this.f29243b = new X(serializer.getDescriptor());
    }

    @Override // p219u9.a
    public final Object deserialize(c decoder) {
        m.f(decoder, "decoder");
        if (decoder.u()) {
            return decoder.o(this.f29242a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && N.class == obj.getClass() && m.b(this.f29242a, ((N) obj).f29242a);
    }

    @Override // p219u9.a
    public final g getDescriptor() {
        return this.f29243b;
    }

    public final int hashCode() {
        return this.f29242a.hashCode();
    }

    @Override // p219u9.a
    public final void serialize(d encoder, Object obj) {
        m.f(encoder, "encoder");
        if (obj != null) {
            encoder.y(this.f29242a, obj);
        } else {
            encoder.e();
        }
    }
}
