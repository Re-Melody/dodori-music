package com.google.firebase.firestore;

import p140m7.EnumC2054f;

/* JADX INFO: renamed from: com.google.firebase.firestore.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1214j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18607a;

    static {
        int[] iArr = new int[EnumC2054f.values().length];
        f18607a = iArr;
        try {
            iArr[EnumC2054f.ADDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18607a[EnumC2054f.METADATA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f18607a[EnumC2054f.MODIFIED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f18607a[EnumC2054f.REMOVED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
