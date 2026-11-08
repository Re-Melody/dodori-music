package E9;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H f3355a = new H(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f3356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f3357c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f3356b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference();
        }
        f3357c = atomicReferenceArr;
    }

    public static final void a(H segment) {
        kotlin.jvm.internal.m.f(segment, "segment");
        if (segment.f3353f != null || segment.f3354g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f3351d) {
            return;
        }
        AtomicReference atomicReference = f3357c[(int) (Thread.currentThread().getId() & (((long) f3356b) - 1))];
        H h10 = f3355a;
        H h11 = (H) atomicReference.getAndSet(h10);
        if (h11 == h10) {
            return;
        }
        int i10 = h11 != null ? h11.f3350c : 0;
        if (i10 >= 65536) {
            atomicReference.set(h11);
            return;
        }
        segment.f3353f = h11;
        segment.f3349b = 0;
        segment.f3350c = i10 + 8192;
        atomicReference.set(segment);
    }

    public static final H b() {
        AtomicReference atomicReference = f3357c[(int) (Thread.currentThread().getId() & (((long) f3356b) - 1))];
        H h10 = f3355a;
        H h11 = (H) atomicReference.getAndSet(h10);
        if (h11 == h10) {
            return new H();
        }
        if (h11 == null) {
            atomicReference.set(null);
            return new H();
        }
        atomicReference.set(h11.f3353f);
        h11.f3353f = null;
        h11.f3350c = 0;
        return h11;
    }
}
