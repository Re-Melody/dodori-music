package org.bytedeco.javacpp;

import V0.p;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.javacpp.annotation.Name;

/* JADX INFO: loaded from: classes2.dex */
@Name({"size_t"})
public class SizeTPointer extends Pointer {
    public SizeTPointer(long j10) {
        try {
            allocateArray(j10);
            if (j10 > 0 && this.address == 0) {
                throw new OutOfMemoryError("Native allocator returned address == 0");
            }
        } catch (OutOfMemoryError e2) {
            StringBuilder sbS = p.s("Cannot allocate new SizeTPointer(", j10, "): totalBytes = ");
            sbS.append(Pointer.formatBytes(Pointer.totalBytes()));
            sbS.append(", physicalBytes = ");
            sbS.append(Pointer.formatBytes(Pointer.physicalBytes()));
            OutOfMemoryError outOfMemoryError = new OutOfMemoryError(sbS.toString());
            outOfMemoryError.initCause(e2);
            throw outOfMemoryError;
        } catch (UnsatisfiedLinkError e4) {
            throw new RuntimeException("No native JavaCPP library in memory. (Has Loader.load() been called?)", e4);
        }
    }

    private native void allocateArray(long j10);

    public long get() {
        return get(0L);
    }

    @Cast({"size_t"})
    public native long get(long j10);

    public SizeTPointer put(long j10) {
        return put(0L, j10);
    }

    public native SizeTPointer put(long j10, long j11);

    @Override // org.bytedeco.javacpp.Pointer
    public SizeTPointer capacity(long j10) {
        return (SizeTPointer) super.capacity(j10);
    }

    @Override // org.bytedeco.javacpp.Pointer
    public SizeTPointer limit(long j10) {
        return (SizeTPointer) super.limit(j10);
    }

    @Override // org.bytedeco.javacpp.Pointer
    public SizeTPointer position(long j10) {
        return (SizeTPointer) super.position(j10);
    }

    public SizeTPointer() {
    }

    public SizeTPointer(Pointer pointer) {
        super(pointer);
    }
}
