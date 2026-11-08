package org.slf4j.helpers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class e {
    private static final /* synthetic */ e[] $VALUES;
    public static final e Stderr;
    public static final e Stdout;

    static {
        e eVar = new e("Stderr", 0);
        Stderr = eVar;
        e eVar2 = new e("Stdout", 1);
        Stdout = eVar2;
        $VALUES = new e[]{eVar, eVar2};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
