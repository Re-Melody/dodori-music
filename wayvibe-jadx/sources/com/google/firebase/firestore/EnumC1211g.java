package com.google.firebase.firestore;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.google.firebase.firestore.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1211g {
    private static final /* synthetic */ EnumC1211g[] $VALUES;
    public static final EnumC1211g SERVER;

    static {
        EnumC1211g enumC1211g = new EnumC1211g("SERVER", 0);
        SERVER = enumC1211g;
        $VALUES = new EnumC1211g[]{enumC1211g};
    }

    public static EnumC1211g valueOf(String str) {
        return (EnumC1211g) Enum.valueOf(EnumC1211g.class, str);
    }

    public static EnumC1211g[] values() {
        return (EnumC1211g[]) $VALUES.clone();
    }
}
