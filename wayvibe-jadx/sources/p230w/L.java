package p230w;

import kotlin.jvm.internal.m;
import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f27579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public A f27580b;

    public L(Float f10, A a10) {
        this.f27579a = f10;
        this.f27580b = a10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l10 = (L) obj;
        return l10.f27579a.equals(this.f27579a) && m.b(l10.f27580b, this.f27580b);
    }

    public final int hashCode() {
        return this.f27580b.hashCode() + b.c(0, this.f27579a.hashCode() * 31, 31);
    }
}
