package io.flutter.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class v {
    private static final /* synthetic */ v[] $VALUES;
    public static final v manual;
    public static final v resetInBackground;

    static {
        v vVar = new v("manual", 0);
        manual = vVar;
        v vVar2 = new v("resetInBackground", 1);
        resetInBackground = vVar2;
        $VALUES = new v[]{vVar, vVar2};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }
}
