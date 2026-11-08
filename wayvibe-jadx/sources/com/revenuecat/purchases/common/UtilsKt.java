package com.revenuecat.purchases.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.models.ChecksumKt;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class UtilsKt {
    public static final Locale getLocale(Context context) {
        m.f(context, "<this>");
        return context.getResources().getConfiguration().getLocales().get(0);
    }

    public static final String getPlayServicesVersionName(Context context) {
        m.f(context, "<this>");
        return packageVersionName(context, "com.google.android.gms");
    }

    public static final String getPlayStoreVersionName(Context context) {
        m.f(context, "<this>");
        return packageVersionName(context, "com.android.vending");
    }

    public static final String getVersionName(Context context) {
        m.f(context, "<this>");
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
    }

    public static final boolean isDeviceProtectedStorageCompat(Context context) {
        m.f(context, "<this>");
        return context.isDeviceProtectedStorage();
    }

    public static final String md5Hex(byte[] bArr) {
        m.f(bArr, "<this>");
        byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(bArr);
        m.e(bArrDigest, "getInstance(\"MD5\")\n        .digest(this)");
        return ChecksumKt.toHexString(bArrDigest);
    }

    private static final String packageVersionName(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @InternalRevenueCatAPI
    public static final String sha1(String str) throws NoSuchAlgorithmException {
        m.f(str, "<this>");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        Charset charset = p097i9.a.f20563a;
        byte[] bytes = str.getBytes(charset);
        m.e(bytes, "getBytes(...)");
        byte[] bArrEncode = Base64.encode(messageDigest.digest(bytes), 2);
        m.e(bArrEncode, "encode(it, Base64.NO_WRAP)");
        return new String(bArrEncode, charset);
    }

    @InternalRevenueCatAPI
    public static final String sha256(String str) throws NoSuchAlgorithmException {
        m.f(str, "<this>");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Charset charset = p097i9.a.f20563a;
        byte[] bytes = str.getBytes(charset);
        m.e(bytes, "getBytes(...)");
        byte[] bArrEncode = Base64.encode(messageDigest.digest(bytes), 2);
        m.e(bArrEncode, "encode(it, Base64.NO_WRAP)");
        return new String(bArrEncode, charset);
    }
}
