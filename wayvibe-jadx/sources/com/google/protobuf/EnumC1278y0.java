package com.google.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.google.protobuf.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1278y0 {
    private static final /* synthetic */ EnumC1278y0[] $VALUES;
    public static final EnumC1278y0 EDITIONS;
    public static final EnumC1278y0 PROTO2;
    public static final EnumC1278y0 PROTO3;

    static {
        EnumC1278y0 enumC1278y0 = new EnumC1278y0("PROTO2", 0);
        PROTO2 = enumC1278y0;
        EnumC1278y0 enumC1278y1 = new EnumC1278y0("PROTO3", 1);
        PROTO3 = enumC1278y1;
        EnumC1278y0 enumC1278y2 = new EnumC1278y0("EDITIONS", 2);
        EDITIONS = enumC1278y2;
        $VALUES = new EnumC1278y0[]{enumC1278y0, enumC1278y1, enumC1278y2};
    }

    public static EnumC1278y0 valueOf(String str) {
        return (EnumC1278y0) Enum.valueOf(EnumC1278y0.class, str);
    }

    public static EnumC1278y0[] values() {
        return (EnumC1278y0[]) $VALUES.clone();
    }
}
