package U;

import B2.AbstractC0112b;

/* JADX INFO: renamed from: U.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0878c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11845a;

    public C0878c(int i10) {
        this.f11845a = i10;
    }

    public final boolean a() {
        return this.f11845a != Integer.MIN_VALUE;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{ location = ");
        return AbstractC0112b.i(sb, this.f11845a, " }");
    }
}
