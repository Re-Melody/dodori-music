package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1120o {
    private static final /* synthetic */ EnumC1120o[] $VALUES;
    public static final EnumC1120o CREATED;
    public static final EnumC1120o DESTROYED;
    public static final EnumC1120o INITIALIZED;
    public static final EnumC1120o RESUMED;
    public static final EnumC1120o STARTED;

    static {
        EnumC1120o enumC1120o = new EnumC1120o("DESTROYED", 0);
        DESTROYED = enumC1120o;
        EnumC1120o enumC1120o2 = new EnumC1120o("INITIALIZED", 1);
        INITIALIZED = enumC1120o2;
        EnumC1120o enumC1120o3 = new EnumC1120o("CREATED", 2);
        CREATED = enumC1120o3;
        EnumC1120o enumC1120o4 = new EnumC1120o("STARTED", 3);
        STARTED = enumC1120o4;
        EnumC1120o enumC1120o5 = new EnumC1120o("RESUMED", 4);
        RESUMED = enumC1120o5;
        $VALUES = new EnumC1120o[]{enumC1120o, enumC1120o2, enumC1120o3, enumC1120o4, enumC1120o5};
    }

    public static EnumC1120o valueOf(String str) {
        return (EnumC1120o) Enum.valueOf(EnumC1120o.class, str);
    }

    public static EnumC1120o[] values() {
        return (EnumC1120o[]) $VALUES.clone();
    }

    public final boolean a(EnumC1120o state) {
        kotlin.jvm.internal.m.f(state, "state");
        return compareTo(state) >= 0;
    }
}
