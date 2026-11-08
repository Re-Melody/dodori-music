package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public enum C {
    SCALAR(false),
    VECTOR(true),
    PACKED_VECTOR(true),
    MAP(false);

    private final boolean isList;

    C(boolean z10) {
        this.isList = z10;
    }
}
