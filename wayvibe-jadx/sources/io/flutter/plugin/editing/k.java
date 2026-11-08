package io.flutter.plugin.editing;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class k {
    private static final /* synthetic */ k[] $VALUES;
    public static final k FRAMEWORK_CLIENT;
    public static final k NO_TARGET;
    public static final k PHYSICAL_DISPLAY_PLATFORM_VIEW;
    public static final k VIRTUAL_DISPLAY_PLATFORM_VIEW;

    static {
        k kVar = new k("NO_TARGET", 0);
        NO_TARGET = kVar;
        k kVar2 = new k("FRAMEWORK_CLIENT", 1);
        FRAMEWORK_CLIENT = kVar2;
        k kVar3 = new k("VIRTUAL_DISPLAY_PLATFORM_VIEW", 2);
        VIRTUAL_DISPLAY_PLATFORM_VIEW = kVar3;
        k kVar4 = new k("PHYSICAL_DISPLAY_PLATFORM_VIEW", 3);
        PHYSICAL_DISPLAY_PLATFORM_VIEW = kVar4;
        $VALUES = new k[]{kVar, kVar2, kVar3, kVar4};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
