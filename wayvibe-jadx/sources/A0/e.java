package A0;

import A1.k;
import B2.AbstractC0112b;
import B8.V;
import L3.B;
import L3.s;
import V0.p;
import W7.g;
import W7.h;
import android.os.HandlerThread;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import org.apache.tika.pipes.pipesiterator.PipesIterator;

/* JADX INFO: loaded from: classes.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f91a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f92b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Serializable f93c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f94d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f95e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f96f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f97g;

    public e(int i10, int i11) {
        this.f94d = new LinkedList();
        this.f95e = new HashSet();
        this.f96f = new HashSet();
        this.f97g = new HashMap();
        this.f93c = "Sqflite";
        this.f91a = i10;
        this.f92b = i11;
    }

    public void a(float f10, long j10) {
        int i10 = (this.f92b + 1) % 20;
        this.f92b = i10;
        a[] aVarArr = (a[]) this.f94d;
        a aVar = aVarArr[i10];
        if (aVar != null) {
            aVar.f86a = j10;
            aVar.f87b = f10;
        } else {
            a aVar2 = new a();
            aVar2.f86a = j10;
            aVar2.f87b = f10;
            aVarArr[i10] = aVar2;
        }
    }

    @Override // W7.h
    public synchronized void c() {
        try {
            for (g gVar : (HashSet) this.f95e) {
                synchronized (gVar) {
                    HandlerThread handlerThread = gVar.f12908c;
                    if (handlerThread != null) {
                        handlerThread.quit();
                        gVar.f12908c = null;
                        gVar.f12909d = null;
                    }
                }
            }
            for (g gVar2 : (HashSet) this.f96f) {
                synchronized (gVar2) {
                    HandlerThread handlerThread2 = gVar2.f12908c;
                    if (handlerThread2 != null) {
                        handlerThread2.quit();
                        gVar2.f12908c = null;
                        gVar2.f12909d = null;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public float d(float f10) {
        c cVar;
        float[] fArr;
        float[] fArr2;
        float f11;
        int i10;
        float fSignum;
        float f12 = f10;
        float f13 = 0.0f;
        if (f12 <= 0.0f) {
            p206t6.b.g0("maximumVelocity should be a positive value. You specified=" + f12);
            throw null;
        }
        int i11 = this.f92b;
        a[] aVarArr = (a[]) this.f94d;
        a aVar = aVarArr[i11];
        if (aVar == null) {
            f11 = 0.0f;
        } else {
            int i12 = 0;
            a aVar2 = aVar;
            while (true) {
                a aVar3 = aVarArr[i11];
                cVar = (c) this.f93c;
                fArr = (float[]) this.f95e;
                fArr2 = (float[]) this.f96f;
                if (aVar3 == null) {
                    f11 = f13;
                    i10 = 1;
                    break;
                }
                long j10 = aVar.f86a;
                f11 = f13;
                int i13 = i11;
                long j11 = aVar3.f86a;
                float f14 = j10 - j11;
                i10 = 1;
                float fAbs = Math.abs(j11 - aVar2.f86a);
                if (cVar != c.Lsq2) {
                    cVar = cVar;
                    aVar2 = aVar;
                } else {
                    cVar = cVar;
                    aVar2 = aVar3;
                }
                if (f14 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i12] = aVar3.f87b;
                fArr2[i12] = -f14;
                i11 = (i13 == 0 ? 20 : i13) - 1;
                i12++;
                if (i12 >= 20) {
                    break;
                }
                f13 = f11;
            }
            if (i12 >= this.f91a) {
                int i14 = d.f90a[cVar.ordinal()];
                if (i14 == i10) {
                    int i15 = i12 - i10;
                    float f15 = fArr2[i15];
                    int i16 = i15;
                    float fAbs2 = f11;
                    while (i16 > 0) {
                        int i17 = i16 - 1;
                        float f16 = fArr2[i17];
                        if (f15 != f16) {
                            float f17 = (fArr[i16] - fArr[i17]) / (f15 - f16);
                            fAbs2 += Math.abs(f17) * (f17 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2))));
                            if (i16 == i15) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i16--;
                        f15 = f16;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2));
                } else {
                    if (i14 != 2) {
                        throw new V();
                    }
                    try {
                        float[] fArr3 = (float[]) this.f97g;
                        R3.a.X(fArr2, fArr, i12, fArr3);
                        fSignum = fArr3[i10];
                    } catch (IllegalArgumentException unused) {
                        fSignum = f11;
                    }
                }
                f13 = fSignum * PipesIterator.DEFAULT_QUEUE_SIZE;
            } else {
                f13 = f11;
            }
        }
        if (f13 == f11 || Float.isNaN(f13)) {
            return f11;
        }
        if (f13 <= f11) {
            f12 = -f12;
            if (f13 >= f12) {
                return f13;
            }
        } else if (f13 <= f12) {
            f12 = f13;
        }
        return f12;
    }

    @Override // W7.h
    public synchronized void e(W7.f fVar) {
        ((LinkedList) this.f94d).add(fVar);
        Iterator it = new HashSet((HashSet) this.f95e).iterator();
        while (it.hasNext()) {
            h((g) it.next());
        }
    }

    public synchronized W7.f f(g gVar) {
        W7.f fVar;
        g gVar2;
        try {
            ListIterator listIterator = ((LinkedList) this.f94d).listIterator();
            do {
                if (!listIterator.hasNext()) {
                    return null;
                }
                fVar = (W7.f) listIterator.next();
                gVar2 = fVar.a() != null ? (g) ((HashMap) this.f97g).get(fVar.a()) : null;
                if (gVar2 == null) {
                    break;
                }
            } while (gVar2 != gVar);
            listIterator.remove();
            return fVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void g(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.f97g;
        if (i10 < 0 || i10 >= recyclerView.f15666o0.a()) {
            StringBuilder sbP = AbstractC0112b.p("Invalid item position ", i10, "(", i10, "). Item count:");
            sbP.append(recyclerView.f15666o0.a());
            sbP.append(recyclerView.j());
            throw new IndexOutOfBoundsException(sbP.toString());
        }
        B b10 = recyclerView.f15666o0;
        boolean z10 = b10.f7669c;
        ArrayList arrayList = (ArrayList) this.f93c;
        if (arrayList.size() > 0) {
            throw p.f(0, arrayList);
        }
        ArrayList arrayList2 = (ArrayList) recyclerView.f15652d.f14413d;
        if (arrayList2.size() > 0) {
            RecyclerView.l((View) arrayList2.get(0));
            throw null;
        }
        ArrayList arrayList3 = (ArrayList) this.f94d;
        if (arrayList3.size() > 0) {
            throw p.f(0, arrayList3);
        }
        int iS = recyclerView.f15651c.S(i10, 0);
        if (iS >= 0) {
            throw null;
        }
        StringBuilder sbP2 = AbstractC0112b.p("Inconsistency detected. Invalid item position ", i10, "(offset:", iS, ").state:");
        sbP2.append(b10.a());
        sbP2.append(recyclerView.j());
        throw new IndexOutOfBoundsException(sbP2.toString());
    }

    public synchronized void h(g gVar) {
        try {
            W7.f fVarF = f(gVar);
            if (fVarF != null) {
                ((HashSet) this.f96f).add(gVar);
                ((HashSet) this.f95e).remove(gVar);
                if (fVarF.a() != null) {
                    ((HashMap) this.f97g).put(fVarF.a(), gVar);
                }
                gVar.f12909d.post(new k(23, gVar, fVarF));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void i() {
        s sVar = ((RecyclerView) this.f97g).f15657i;
        this.f92b = this.f91a;
        ArrayList arrayList = (ArrayList) this.f94d;
        int size = arrayList.size() - 1;
        if (size < 0 || arrayList.size() <= this.f92b) {
            return;
        }
        if (arrayList.get(size) != null) {
            throw new ClassCastException();
        }
        int[] iArr = RecyclerView.f15630y0;
        throw null;
    }

    @Override // W7.h
    public synchronized void start() {
        for (int i10 = 0; i10 < this.f91a; i10++) {
            g gVar = new g(((String) this.f93c) + i10, this.f92b);
            gVar.a(new k(24, this, gVar));
            ((HashSet) this.f95e).add(gVar);
        }
    }

    public e(c cVar) {
        this.f93c = cVar;
        int i10 = d.f90a[cVar.ordinal()];
        int i11 = 2;
        if (i10 != 1) {
            if (i10 != 2) {
                throw new V();
            }
            i11 = 3;
        }
        this.f91a = i11;
        this.f94d = new a[20];
        this.f95e = new float[20];
        this.f96f = new float[20];
        this.f97g = new float[3];
    }

    public e(RecyclerView recyclerView) {
        this.f97g = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f93c = arrayList;
        this.f94d = new ArrayList();
        this.f95e = Collections.unmodifiableList(arrayList);
        this.f91a = 2;
        this.f92b = 2;
    }
}
