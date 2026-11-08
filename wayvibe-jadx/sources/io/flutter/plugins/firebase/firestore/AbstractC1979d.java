package io.flutter.plugins.firebase.firestore;

import com.google.firebase.firestore.EnumC1215k;
import com.google.firebase.firestore.V;

/* JADX INFO: renamed from: io.flutter.plugins.firebase.firestore.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1979d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f20988b;

    static {
        int[] iArr = new int[V.values().length];
        f20988b = iArr;
        try {
            iArr[V.RUNNING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f20988b[V.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f20988b[V.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[EnumC1215k.values().length];
        f20987a = iArr2;
        try {
            iArr2[EnumC1215k.ADDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f20987a[EnumC1215k.MODIFIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f20987a[EnumC1215k.REMOVED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
