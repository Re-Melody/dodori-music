package E7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes.dex */
public final class j extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f3155b;

    public /* synthetic */ j(y yVar, int i10) {
        this.f3154a = i10;
        this.f3155b = yVar;
    }

    @Override // E7.y
    public final Object read(M7.b bVar) {
        switch (this.f3154a) {
            case 0:
                return new AtomicLong(((Number) this.f3155b.read(bVar)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                bVar.b();
                while (bVar.A()) {
                    arrayList.add(Long.valueOf(((Number) this.f3155b.read(bVar)).longValue()));
                }
                bVar.l();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
                }
                return atomicLongArray;
            default:
                if (bVar.N() != M7.c.NULL) {
                    return this.f3155b.read(bVar);
                }
                bVar.J();
                return null;
        }
    }

    @Override // E7.y
    public final void write(M7.d dVar, Object obj) throws IOException {
        switch (this.f3154a) {
            case 0:
                this.f3155b.write(dVar, Long.valueOf(((AtomicLong) obj).get()));
                break;
            case 1:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                dVar.c();
                int length = atomicLongArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    this.f3155b.write(dVar, Long.valueOf(atomicLongArray.get(i10)));
                }
                dVar.l();
                break;
            default:
                if (obj == null) {
                    dVar.x();
                } else {
                    this.f3155b.write(dVar, obj);
                }
                break;
        }
    }
}
