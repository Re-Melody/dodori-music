package O8;

import K1.H;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends H implements Iterator, p013a9.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9343e;

    public c(e map, int i10) {
        this.f9343e = i10;
        m.f(map, "map");
        this.f7243d = map;
        this.f7241b = -1;
        this.f7242c = map.f9355h;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f9343e) {
            case 0:
                b();
                int i10 = this.f7240a;
                e eVar = (e) this.f7243d;
                if (i10 >= eVar.f9353f) {
                    throw new NoSuchElementException();
                }
                this.f7240a = i10 + 1;
                this.f7241b = i10;
                d dVar = new d(eVar, i10);
                e();
                return dVar;
            case 1:
                b();
                int i11 = this.f7240a;
                e eVar2 = (e) this.f7243d;
                if (i11 >= eVar2.f9353f) {
                    throw new NoSuchElementException();
                }
                this.f7240a = i11 + 1;
                this.f7241b = i11;
                Object obj = eVar2.f9348a[i11];
                e();
                return obj;
            default:
                b();
                int i12 = this.f7240a;
                e eVar3 = (e) this.f7243d;
                if (i12 >= eVar3.f9353f) {
                    throw new NoSuchElementException();
                }
                this.f7240a = i12 + 1;
                this.f7241b = i12;
                Object[] objArr = eVar3.f9349b;
                m.c(objArr);
                Object obj2 = objArr[this.f7241b];
                e();
                return obj2;
        }
    }
}
