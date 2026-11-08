package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public enum y0 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(C1049g.f15092c),
    ENUM(null),
    MESSAGE(null);

    private final Object defaultDefault;

    y0(Serializable serializable) {
        this.defaultDefault = serializable;
    }
}
