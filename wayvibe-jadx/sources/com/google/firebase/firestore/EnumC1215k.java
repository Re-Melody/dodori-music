package com.google.firebase.firestore;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.google.firebase.firestore.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1215k {
    private static final /* synthetic */ EnumC1215k[] $VALUES;
    public static final EnumC1215k ADDED;
    public static final EnumC1215k MODIFIED;
    public static final EnumC1215k REMOVED;

    static {
        EnumC1215k enumC1215k = new EnumC1215k("ADDED", 0);
        ADDED = enumC1215k;
        EnumC1215k enumC1215k2 = new EnumC1215k("MODIFIED", 1);
        MODIFIED = enumC1215k2;
        EnumC1215k enumC1215k3 = new EnumC1215k("REMOVED", 2);
        REMOVED = enumC1215k3;
        $VALUES = new EnumC1215k[]{enumC1215k, enumC1215k2, enumC1215k3};
    }

    public static EnumC1215k valueOf(String str) {
        return (EnumC1215k) Enum.valueOf(EnumC1215k.class, str);
    }

    public static EnumC1215k[] values() {
        return (EnumC1215k[]) $VALUES.clone();
    }
}
