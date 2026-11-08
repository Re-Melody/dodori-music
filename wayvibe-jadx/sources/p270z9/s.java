package p270z9;

import A9.H;
import java.io.Serializable;
import kotlin.jvm.internal.m;
import p240w9.g;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f29946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f29947c;

    public s(Serializable body, boolean z10, g gVar) {
        m.f(body, "body");
        this.f29945a = z10;
        this.f29946b = gVar;
        this.f29947c = body.toString();
        if (gVar != null && !gVar.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @Override // p270z9.C
    public final String a() {
        return this.f29947c;
    }

    @Override // p270z9.C
    public final boolean c() {
        return this.f29945a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        return this.f29945a == sVar.f29945a && m.b(this.f29947c, sVar.f29947c);
    }

    public final int hashCode() {
        return this.f29947c.hashCode() + (Boolean.hashCode(this.f29945a) * 31);
    }

    @Override // p270z9.C
    public final String toString() {
        boolean z10 = this.f29945a;
        String str = this.f29947c;
        if (!z10) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        H.a(sb, str);
        String string = sb.toString();
        m.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
