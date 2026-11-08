package io.flutter.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class q {
    private static final /* synthetic */ q[] $VALUES;
    public static final q LOCALE;
    public static final q SPELLOUT;

    static {
        q qVar = new q("SPELLOUT", 0);
        SPELLOUT = qVar;
        q qVar2 = new q("LOCALE", 1);
        LOCALE = qVar2;
        $VALUES = new q[]{qVar, qVar2};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }
}
