package com.apple.android.music.playback.queue;

import java.util.BitSet;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
final class h implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f17543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Random f17544c = new Random();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final BitSet f17545d;

    public h(int i10, int i11) {
        this.f17542a = i10;
        this.f17543b = i11;
        this.f17545d = new BitSet(i11);
    }

    @Override // com.apple.android.music.playback.queue.c
    public int a() {
        int i10 = this.f17542a;
        if (i10 != -1 && !this.f17545d.get(i10)) {
            this.f17545d.set(this.f17542a);
            return this.f17542a;
        }
        int iCardinality = this.f17545d.cardinality();
        int i11 = this.f17543b;
        if (iCardinality == i11) {
            return -1;
        }
        int iNextInt = this.f17544c.nextInt(i11);
        while (this.f17545d.get(iNextInt)) {
            iNextInt = this.f17544c.nextInt(this.f17543b);
        }
        this.f17545d.set(iNextInt);
        return iNextInt;
    }
}
