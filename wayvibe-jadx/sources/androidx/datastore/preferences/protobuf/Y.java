package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Y {
    private static final /* synthetic */ Y[] $VALUES;
    public static final Y EDITIONS;
    public static final Y PROTO2;
    public static final Y PROTO3;

    static {
        Y y6 = new Y("PROTO2", 0);
        PROTO2 = y6;
        Y y10 = new Y("PROTO3", 1);
        PROTO3 = y10;
        Y y11 = new Y("EDITIONS", 2);
        EDITIONS = y11;
        $VALUES = new Y[]{y6, y10, y11};
    }

    public static Y valueOf(String str) {
        return (Y) Enum.valueOf(Y.class, str);
    }

    public static Y[] values() {
        return (Y[]) $VALUES.clone();
    }
}
