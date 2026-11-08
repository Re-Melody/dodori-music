package io.grpc.okhttp.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class j {
    private static final /* synthetic */ j[] $VALUES;
    public static final j ALPN_AND_NPN;
    public static final j NONE;
    public static final j NPN;

    static {
        j jVar = new j("ALPN_AND_NPN", 0);
        ALPN_AND_NPN = jVar;
        j jVar2 = new j("NPN", 1);
        NPN = jVar2;
        j jVar3 = new j("NONE", 2);
        NONE = jVar3;
        $VALUES = new j[]{jVar, jVar2, jVar3};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
