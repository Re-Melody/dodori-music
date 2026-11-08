package p069g2;

import V0.p;
import Z8.c;
import java.util.Map;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class a extends n implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f20051a = new a(1);

    @Override // Z8.c
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        m.f(entry, "entry");
        Object value = entry.getValue();
        return p.r(new StringBuilder("  "), ((d) entry.getKey()).f20057a, " = ", value instanceof byte[] ? N8.m.x0((byte[]) value, ", ", null, 56) : String.valueOf(entry.getValue()));
    }
}
