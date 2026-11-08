package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1272v0 implements Q {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    public static final int NULL_VALUE_VALUE = 0;
    private static final S internalValueMap = new C1246i(2);
    private final int value;

    EnumC1272v0(int i10) {
        this.value = i10;
    }

    @Override // com.google.protobuf.Q
    public final int f() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
