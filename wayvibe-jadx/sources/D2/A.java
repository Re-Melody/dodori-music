package D2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class A implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f1827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f1828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f1829c;

    public A(h hVar) {
        hVar.getClass();
        this.f1827a = hVar;
        this.f1829c = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    @Override // D2.h
    public final void close() {
        this.f1827a.close();
    }

    @Override // D2.h
    public final long l(k kVar) {
        this.f1829c = kVar.f1865a;
        Map map = Collections.EMPTY_MAP;
        h hVar = this.f1827a;
        long jL = hVar.l(kVar);
        Uri uriS = hVar.s();
        uriS.getClass();
        this.f1829c = uriS;
        hVar.n();
        return jL;
    }

    @Override // D2.h
    public final Map n() {
        return this.f1827a.n();
    }

    @Override // D2.h
    public final void r(B b10) {
        b10.getClass();
        this.f1827a.r(b10);
    }

    @Override // p255y2.InterfaceC2333i
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = this.f1827a.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f1828b += (long) i12;
        }
        return i12;
    }

    @Override // D2.h
    public final Uri s() {
        return this.f1827a.s();
    }
}
