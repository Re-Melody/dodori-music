package p263z2;

import A6.W;
import B2.AbstractC0111a;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W f29800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f29801b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f29802c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f29803d;

    public a(W w10) {
        this.f29800a = w10;
        b bVar = b.f29804e;
        this.f29803d = false;
    }

    public final b a(b bVar) {
        if (bVar.equals(b.f29804e)) {
            throw new c(bVar);
        }
        int i10 = 0;
        while (true) {
            W w10 = this.f29800a;
            if (i10 >= w10.f331d) {
                return bVar;
            }
            d dVar = (d) w10.get(i10);
            b bVarC = dVar.c(bVar);
            if (dVar.isActive()) {
                AbstractC0111a.h(!bVarC.equals(b.f29804e));
                bVar = bVarC;
            }
            i10++;
        }
    }

    public final void b() {
        ArrayList arrayList = this.f29801b;
        arrayList.clear();
        this.f29803d = false;
        int i10 = 0;
        while (true) {
            W w10 = this.f29800a;
            if (i10 >= w10.f331d) {
                break;
            }
            d dVar = (d) w10.get(i10);
            dVar.flush();
            if (dVar.isActive()) {
                arrayList.add(dVar);
            }
            i10++;
        }
        this.f29802c = new ByteBuffer[arrayList.size()];
        for (int i11 = 0; i11 <= c(); i11++) {
            this.f29802c[i11] = ((d) arrayList.get(i11)).a();
        }
    }

    public final int c() {
        return this.f29802c.length - 1;
    }

    public final boolean d() {
        return this.f29803d && ((d) this.f29801b.get(c())).e() && !this.f29802c[c()].hasRemaining();
    }

    public final boolean e() {
        return !this.f29801b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            W w10 = this.f29800a;
            if (w10.f331d == aVar.f29800a.f331d) {
                for (int i10 = 0; i10 < w10.f331d; i10++) {
                    if (w10.get(i10) == aVar.f29800a.get(i10)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(ByteBuffer byteBuffer) {
        boolean z10;
        for (boolean z11 = true; z11; z11 = z10) {
            z10 = false;
            for (int i10 = 0; i10 <= c(); i10++) {
                if (!this.f29802c[i10].hasRemaining()) {
                    ArrayList arrayList = this.f29801b;
                    d dVar = (d) arrayList.get(i10);
                    if (!dVar.e()) {
                        ByteBuffer byteBuffer2 = i10 > 0 ? this.f29802c[i10 - 1] : byteBuffer.hasRemaining() ? byteBuffer : d.f29809a;
                        long jRemaining = byteBuffer2.remaining();
                        dVar.b(byteBuffer2);
                        this.f29802c[i10] = dVar.a();
                        z10 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f29802c[i10].hasRemaining();
                    } else if (!this.f29802c[i10].hasRemaining() && i10 < c()) {
                        ((d) arrayList.get(i10 + 1)).d();
                    }
                }
            }
        }
    }

    public final int hashCode() {
        return this.f29800a.hashCode();
    }
}
