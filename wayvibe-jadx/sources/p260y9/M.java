package p260y9;

import kotlin.jvm.internal.m;
import p219u9.a;
import p219u9.e;
import p240w9.g;
import p251x9.c;
import p251x9.d;

/* JADX INFO: loaded from: classes2.dex */
public final class M implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M f29240a = new M();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L f29241b = L.f29239a;

    @Override // p219u9.a
    public final Object deserialize(c decoder) {
        m.f(decoder, "decoder");
        throw new e("'kotlin.Nothing' does not have instances");
    }

    @Override // p219u9.a
    public final g getDescriptor() {
        return f29241b;
    }

    @Override // p219u9.a
    public final void serialize(d encoder, Object obj) {
        Void value = (Void) obj;
        m.f(encoder, "encoder");
        m.f(value, "value");
        throw new e("'kotlin.Nothing' cannot be serialized");
    }
}
