package org.bytedeco.javacpp;

import V0.p;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.javacpp.annotation.Name;

/* JADX INFO: loaded from: classes2.dex */
@Name({"long"})
public class CLongPointer extends Pointer {
    public CLongPointer(long j10) {
        try {
            allocateArray(j10);
            if (j10 > 0 && this.address == 0) {
                throw new OutOfMemoryError("Native allocator returned address == 0");
            }
        } catch (OutOfMemoryError e2) {
            StringBuilder sbS = p.s("Cannot allocate new CLongPointer(", j10, "): totalBytes = ");
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

    @Cast({"long"})
    public native long get(long j10);

    public CLongPointer put(long j10) {
        return put(0L, j10);
    }

    public native CLongPointer put(long j10, long j11);

    @Override // org.bytedeco.javacpp.Pointer
    public CLongPointer capacity(long j10) {
        return (CLongPointer) super.capacity(j10);
    }

    @Override // org.bytedeco.javacpp.Pointer
    public CLongPointer limit(long j10) {
        return (CLongPointer) super.limit(j10);
    }

    @Override // org.bytedeco.javacpp.Pointer
    public CLongPointer position(long j10) {
        return (CLongPointer) super.position(j10);
    }

    public CLongPointer() {
    }

    public CLongPointer(Pointer pointer) {
        super(pointer);
    }
}
