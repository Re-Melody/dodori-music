package p270z9;

import A9.H;
import M8.D;
import Z8.c;
import java.util.Map;
import kotlin.jvm.internal.m;
import p240w9.a;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends kotlin.jvm.internal.n implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f29939b = new n(1, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f29940c = new n(1, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29941a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i10, int i11) {
        super(i10);
        this.f29941a = i11;
    }

    @Override // Z8.c
    public final Object invoke(Object obj) {
        switch (this.f29941a) {
            case 0:
                a buildSerialDescriptor = (a) obj;
                m.f(buildSerialDescriptor, "$this$buildSerialDescriptor");
                buildSerialDescriptor.a("JsonPrimitive", new p(m.f29932b));
                buildSerialDescriptor.a("JsonNull", new p(m.f29933c));
                buildSerialDescriptor.a("JsonLiteral", new p(m.f29934d));
                buildSerialDescriptor.a("JsonObject", new p(m.f29935e));
                buildSerialDescriptor.a("JsonArray", new p(m.f29936f));
                return D.f8402a;
            default:
                Map.Entry entry = (Map.Entry) obj;
                m.f(entry, "<name for destructuring parameter 0>");
                String str = (String) entry.getKey();
                k kVar = (k) entry.getValue();
                StringBuilder sb = new StringBuilder();
                H.a(sb, str);
                sb.append(':');
                sb.append(kVar);
                String string = sb.toString();
                m.e(string, "StringBuilder().apply(builderAction).toString()");
                return string;
        }
    }
}
