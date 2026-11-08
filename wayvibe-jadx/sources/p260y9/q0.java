package p260y9;

import M8.D;
import kotlin.jvm.internal.m;
import p219u9.a;
import p240w9.g;
import p251x9.c;
import p251x9.d;

/* JADX INFO: loaded from: classes2.dex */
public final class q0 implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f29319b = new q0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2385v f29320a = new C2385v("kotlin.Unit", D.f8402a);

    @Override // p219u9.a
    public final Object deserialize(c decoder) {
        m.f(decoder, "decoder");
        this.f29320a.deserialize(decoder);
        return D.f8402a;
    }

    @Override // p219u9.a
    public final g getDescriptor() {
        return this.f29320a.getDescriptor();
    }

    @Override // p219u9.a
    public final void serialize(d encoder, Object obj) {
        D value = (D) obj;
        m.f(encoder, "encoder");
        m.f(value, "value");
        this.f29320a.serialize(encoder, value);
    }
}
