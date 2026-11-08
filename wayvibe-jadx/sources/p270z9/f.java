package p270z9;

import java.util.List;
import kotlin.jvm.internal.m;
import p219u9.a;
import p240w9.g;
import p241x.AbstractC2315s;
import p251x9.c;
import p251x9.d;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f29923a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f29924b = e.f29920b;

    @Override // p219u9.a
    public final Object deserialize(c decoder) {
        m.f(decoder, "decoder");
        AbstractC2315s.b(decoder);
        return new C2451d((List) p229v9.a.a(o.f29942a).deserialize(decoder));
    }

    @Override // p219u9.a
    public final g getDescriptor() {
        return f29924b;
    }

    @Override // p219u9.a
    public final void serialize(d encoder, Object obj) {
        C2451d value = (C2451d) obj;
        m.f(encoder, "encoder");
        m.f(value, "value");
        AbstractC2315s.a(encoder);
        p229v9.a.a(o.f29942a).serialize(encoder, value);
    }
}
