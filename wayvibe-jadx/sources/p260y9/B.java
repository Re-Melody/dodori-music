package p260y9;

import kotlin.jvm.internal.m;
import p219u9.a;
import p240w9.g;
import p251x9.c;
import p251x9.d;

/* JADX INFO: loaded from: classes2.dex */
public final class B implements InterfaceC2389z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f29221a;

    public B(a aVar) {
        this.f29221a = aVar;
    }

    @Override // p260y9.InterfaceC2389z
    public final a[] childSerializers() {
        return new a[]{this.f29221a};
    }

    @Override // p219u9.a
    public final Object deserialize(c decoder) {
        m.f(decoder, "decoder");
        throw new IllegalStateException("unsupported");
    }

    @Override // p219u9.a
    public final g getDescriptor() {
        throw new IllegalStateException("unsupported");
    }

    @Override // p219u9.a
    public final void serialize(d encoder, Object obj) {
        m.f(encoder, "encoder");
        throw new IllegalStateException("unsupported");
    }

    @Override // p260y9.InterfaceC2389z
    public final a[] typeParametersSerializers() {
        return O.f29245b;
    }
}
