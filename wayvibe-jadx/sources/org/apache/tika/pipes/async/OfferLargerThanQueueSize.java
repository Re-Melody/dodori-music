package org.apache.tika.pipes.async;

import B2.AbstractC0112b;

/* JADX INFO: loaded from: classes2.dex */
public class OfferLargerThanQueueSize extends IllegalArgumentException {
    private final int queueSize;
    private final int sizeOffered;

    public OfferLargerThanQueueSize(int i10, int i11) {
        this.sizeOffered = i10;
        this.queueSize = i11;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return AbstractC0112b.f("sizeOffered (", this.sizeOffered, ") is greater than queue size (", this.queueSize, ")");
    }

    public int getQueueSize() {
        return this.queueSize;
    }

    public int getSizeOffered() {
        return this.sizeOffered;
    }
}
