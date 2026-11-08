package com.google.protobuf;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public enum h1 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(AbstractC1252l.f18752b),
    ENUM(null),
    MESSAGE(null);

    private final Object defaultDefault;

    h1(Serializable serializable) {
        this.defaultDefault = serializable;
    }
}
