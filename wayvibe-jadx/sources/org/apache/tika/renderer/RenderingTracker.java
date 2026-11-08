package org.apache.tika.renderer;

/* JADX INFO: loaded from: classes2.dex */
public class RenderingTracker {
    private int id = 0;

    public synchronized int getNextId() {
        int i10;
        i10 = this.id + 1;
        this.id = i10;
        return i10;
    }
}
