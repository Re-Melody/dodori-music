package p270z9;

import java.util.Map;
import kotlin.jvm.internal.m;
import p219u9.a;
import p240w9.g;
import p241x.AbstractC2315s;
import p251x9.c;
import p251x9.d;
import p260y9.c0;

/* JADX INFO: loaded from: classes2.dex */
public final class A implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A f29911a = new A();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f29912b = z.f29954b;

    @Override // p219u9.a
    public final Object deserialize(c decoder) {
        m.f(decoder, "decoder");
        AbstractC2315s.b(decoder);
        return new y((Map) p229v9.a.b(c0.f29272a, o.f29942a).deserialize(decoder));
    }

    @Override // p219u9.a
    public final g getDescriptor() {
        return f29912b;
    }

    @Override // p219u9.a
    public final void serialize(d encoder, Object obj) {
        y value = (y) obj;
        m.f(encoder, "encoder");
        m.f(value, "value");
        AbstractC2315s.a(encoder);
        p229v9.a.b(c0.f29272a, o.f29942a).serialize(encoder, value);
    }
}
