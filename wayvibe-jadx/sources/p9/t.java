package p9;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p119k9.W;
import p119k9.X;

/* JADX INFO: loaded from: classes2.dex */
public class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f25342b = AtomicIntegerFieldUpdater.newUpdater(t.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public W[] f25343a;

    public final void a(W w10) {
        w10.c((X) this);
        W[] wArr = this.f25343a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f25342b;
        if (wArr == null) {
            wArr = new W[4];
            this.f25343a = wArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= wArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(wArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.m.e(objArrCopyOf, "copyOf(...)");
            wArr = (W[]) objArrCopyOf;
            this.f25343a = wArr;
        }
        int i10 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i10 + 1);
        wArr[i10] = w10;
        w10.f21707b = i10;
        c(i10);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x0075 A[LOOP:0: B:9:0x003a->B:21:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x007a A[EDGE_INSN: B:24:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a A[EDGE_INSN: B:25:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    public final W b(int i10) {
        int i11;
        int i12;
        Object[] objArr;
        int i13;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.f25343a;
        kotlin.jvm.internal.m.c(objArr2);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f25342b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i10 < atomicIntegerFieldUpdater.get(this)) {
            d(i10, atomicIntegerFieldUpdater.get(this));
            int i14 = (i10 - 1) / 2;
            if (i10 > 0) {
                W w10 = objArr2[i10];
                kotlin.jvm.internal.m.c(w10);
                Object obj2 = objArr2[i14];
                kotlin.jvm.internal.m.c(obj2);
                if (w10.compareTo(obj2) < 0) {
                    d(i10, i14);
                    c(i14);
                } else {
                    while (true) {
                        i11 = i10 * 2;
                        i12 = i11 + 1;
                        if (i12 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        objArr = this.f25343a;
                        kotlin.jvm.internal.m.c(objArr);
                        i13 = i11 + 2;
                        if (i13 < atomicIntegerFieldUpdater.get(this)) {
                            comparable3 = objArr[i13];
                            kotlin.jvm.internal.m.c(comparable3);
                            obj = objArr[i12];
                            kotlin.jvm.internal.m.c(obj);
                            if (comparable3.compareTo(obj) >= 0) {
                                i13 = i12;
                            }
                        } else {
                            i13 = i12;
                        }
                        comparable = objArr[i10];
                        kotlin.jvm.internal.m.c(comparable);
                        comparable2 = objArr[i13];
                        kotlin.jvm.internal.m.c(comparable2);
                        if (comparable.compareTo(comparable2) <= 0) {
                            break;
                        }
                        d(i10, i13);
                        i10 = i13;
                    }
                }
            } else {
                while (true) {
                    i11 = i10 * 2;
                    i12 = i11 + 1;
                    if (i12 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                        break;
                    }
                    objArr = this.f25343a;
                    kotlin.jvm.internal.m.c(objArr);
                    i13 = i11 + 2;
                    if (i13 < atomicIntegerFieldUpdater.get(this)) {
                        comparable3 = objArr[i13];
                        kotlin.jvm.internal.m.c(comparable3);
                        obj = objArr[i12];
                        kotlin.jvm.internal.m.c(obj);
                        if (comparable3.compareTo(obj) >= 0) {
                            i13 = i12;
                        }
                    } else {
                        i13 = i12;
                    }
                    comparable = objArr[i10];
                    kotlin.jvm.internal.m.c(comparable);
                    comparable2 = objArr[i13];
                    kotlin.jvm.internal.m.c(comparable2);
                    if (comparable.compareTo(comparable2) <= 0) {
                        break;
                        break;
                    }
                    d(i10, i13);
                    i10 = i13;
                }
            }
        }
        W w11 = objArr2[atomicIntegerFieldUpdater.get(this)];
        kotlin.jvm.internal.m.c(w11);
        w11.c(null);
        w11.f21707b = -1;
        objArr2[atomicIntegerFieldUpdater.get(this)] = null;
        return w11;
    }

    public final void c(int i10) {
        while (i10 > 0) {
            W[] wArr = this.f25343a;
            kotlin.jvm.internal.m.c(wArr);
            int i11 = (i10 - 1) / 2;
            W w10 = wArr[i11];
            kotlin.jvm.internal.m.c(w10);
            W w11 = wArr[i10];
            kotlin.jvm.internal.m.c(w11);
            if (w10.compareTo(w11) <= 0) {
                return;
            }
            d(i10, i11);
            i10 = i11;
        }
    }

    public final void d(int i10, int i11) {
        W[] wArr = this.f25343a;
        kotlin.jvm.internal.m.c(wArr);
        W w10 = wArr[i11];
        kotlin.jvm.internal.m.c(w10);
        W w11 = wArr[i10];
        kotlin.jvm.internal.m.c(w11);
        wArr[i10] = w10;
        wArr[i11] = w11;
        w10.f21707b = i10;
        w11.f21707b = i11;
    }
}
