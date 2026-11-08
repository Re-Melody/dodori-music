package p068g1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class z {
    private static final /* synthetic */ z[] $VALUES;
    public static final z Inherit;
    public static final z SecureOff;
    public static final z SecureOn;

    static {
        z zVar = new z("Inherit", 0);
        Inherit = zVar;
        z zVar2 = new z("SecureOn", 1);
        SecureOn = zVar2;
        z zVar3 = new z("SecureOff", 2);
        SecureOff = zVar3;
        $VALUES = new z[]{zVar, zVar2, zVar3};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) $VALUES.clone();
    }
}
