package com.revenuecat.purchases.utils;

import java.io.File;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class FileExtensionsKt {
    private static final double BYTE_UNIT_CONVERSION = 1024.0d;

    public static final long getSizeInBytes(File file) {
        m.f(file, "<this>");
        return file.length();
    }

    public static final double getSizeInKB(File file) {
        m.f(file, "<this>");
        return getSizeInBytes(file) / BYTE_UNIT_CONVERSION;
    }
}
