package org.bytedeco.javacpp;

import V0.p;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.javacpp.annotation.Name;

/* JADX INFO: loaded from: classes2.dex */
@Name({"bool"})
public class BoolPointer extends Pointer {
    public BoolPointer(long j10) {
        try {
            allocateArray(j10);
            if (j10 > 0 && this.address == 0) {
                throw new OutOfMemoryError("Native allocator returned address == 0");
            }
        } catch (OutOfMemoryError e2) {
            StringBuilder sbS = p.s("Cannot allocate new BoolPointer(", j10, "): totalBytes = ");
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

    public boolean get() {
        return get(0L);
    }

    @Cast({"bool"})
    public native boolean get(long j10);

    public native BoolPointer put(long j10, boolean z10);

    public BoolPointer put(boolean z10) {
        return put(0L, z10);
    }

    @Override // org.bytedeco.javacpp.Pointer
    public BoolPointer capacity(long j10) {
        return (BoolPointer) super.capacity(j10);
    }

    @Override // org.bytedeco.javacpp.Pointer
    public BoolPointer limit(long j10) {
        return (BoolPointer) super.limit(j10);
    }

    @Override // org.bytedeco.javacpp.Pointer
    public BoolPointer position(long j10) {
        return (BoolPointer) super.position(j10);
    }

    public BoolPointer() {
    }

    public BoolPointer(Pointer pointer) {
        super(pointer);
    }
}
