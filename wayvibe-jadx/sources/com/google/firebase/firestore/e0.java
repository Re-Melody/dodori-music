package com.google.firebase.firestore;

import p140m7.EnumC2063o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18595a;

    static {
        int[] iArr = new int[EnumC2063o.values().length];
        f18595a = iArr;
        try {
            iArr[EnumC2063o.NOT_EQUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18595a[EnumC2063o.ARRAY_CONTAINS_ANY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f18595a[EnumC2063o.IN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f18595a[EnumC2063o.NOT_IN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
