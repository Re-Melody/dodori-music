package A9;

import B2.AbstractC0112b;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class A implements G7.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f415b;

    public void a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f415b);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public String toString() {
        switch (this.f414a) {
            case 3:
                return AbstractC0112b.j(new StringBuilder("<"), this.f415b, '>');
            default:
                return super.toString();
        }
    }

    @Override // G7.o
    public Object y() {
        switch (this.f414a) {
            case 1:
                throw new E7.n(this.f415b);
            default:
                throw new E7.n(this.f415b);
        }
    }

    public /* synthetic */ A(String str, int i10) {
        this.f414a = i10;
        this.f415b = str;
    }

    public A(String str) {
        this.f414a = 4;
        str.getClass();
        this.f415b = str;
    }
}
