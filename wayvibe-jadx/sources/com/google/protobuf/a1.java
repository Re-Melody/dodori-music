package com.google.protobuf;

import B2.AbstractC0112b;

/* JADX INFO: loaded from: classes.dex */
public final class a1 extends IllegalArgumentException {
    public a1(int i10, int i11) {
        super(AbstractC0112b.e("Unpaired surrogate at index ", i10, i11, " of "));
    }
}
