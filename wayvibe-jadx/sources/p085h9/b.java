package p085h9;

import N8.w;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements h, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f20342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20343c;

    public b(h hVar, int i10, int i11) {
        this.f20341a = i11;
        switch (i11) {
            case 1:
                this.f20342b = hVar;
                this.f20343c = i10;
                if (i10 >= 0) {
                    return;
                }
                throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + com.amazon.a.a.o.c.a.b.f16463a).toString());
            default:
                this.f20342b = hVar;
                this.f20343c = i10;
                if (i10 >= 0) {
                    return;
                }
                throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + com.amazon.a.a.o.c.a.b.f16463a).toString());
        }
    }

    @Override // p085h9.c
    public final h a(int i10) {
        switch (this.f20341a) {
            case 0:
                int i11 = this.f20343c;
                int i12 = i11 + i10;
                return i12 < 0 ? new b(this, i10, 1) : new l(this.f20342b, i11, i12);
            default:
                return i10 >= this.f20343c ? this : new b(this.f20342b, i10, 1);
        }
    }

    @Override // p085h9.c
    public final h b(int i10) {
        switch (this.f20341a) {
            case 0:
                int i11 = this.f20343c + i10;
                return i11 < 0 ? new b(this, i10, 0) : new b(this.f20342b, i11, 0);
            default:
                int i12 = this.f20343c;
                return i10 >= i12 ? d.f20344a : new l(this.f20342b, i10, i12);
        }
    }

    @Override // p085h9.h
    public final Iterator iterator() {
        switch (this.f20341a) {
            case 0:
                return new w(this);
            default:
                return new w(this, (byte) 0);
        }
    }
}
