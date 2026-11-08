package p085h9;

import B2.AbstractC0112b;
import java.util.Iterator;
import p004a0.c;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements h, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f20360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20362c;

    public l(h hVar, int i10, int i11) {
        this.f20360a = hVar;
        this.f20361b = i10;
        this.f20362c = i11;
        if (i10 < 0) {
            throw new IllegalArgumentException(b.j(i10, "startIndex should be non-negative, but is ").toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(b.j(i11, "endIndex should be non-negative, but is ").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(AbstractC0112b.e("endIndex should be not less than startIndex, but was ", i11, i10, " < ").toString());
        }
    }

    @Override // p085h9.c
    public final h a(int i10) {
        int i11 = this.f20362c;
        int i12 = this.f20361b;
        if (i10 >= i11 - i12) {
            return this;
        }
        return new l(this.f20360a, i12, i10 + i12);
    }

    @Override // p085h9.c
    public final h b(int i10) {
        int i11 = this.f20362c;
        int i12 = this.f20361b;
        if (i10 >= i11 - i12) {
            return d.f20344a;
        }
        return new l(this.f20360a, i12 + i10, i11);
    }

    @Override // p085h9.h
    public final Iterator iterator() {
        return new c(this);
    }
}
