package com.revenuecat.purchases.common.remoteconfig;

import android.util.Base64;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.jvm.internal.m;
import p097i9.j;

/* JADX INFO: loaded from: classes2.dex */
public final class RemoteConfigUtils {
    private static final int REF_HASH_BYTES = 24;
    private static final String SHA_256_ALGORITHM = "SHA-256";
    public static final RemoteConfigUtils INSTANCE = new RemoteConfigUtils();
    private static final j REF_REGEX = new j("^[A-Za-z0-9_-]{32}$");

    private RemoteConfigUtils() {
    }

    public final String contentAddressRef(byte[] bytes) {
        m.f(bytes, "bytes");
        byte[] digest = MessageDigest.getInstance(SHA_256_ALGORITHM).digest(bytes);
        m.e(digest, "digest");
        byte[] bArrCopyOf = Arrays.copyOf(digest, 24);
        m.e(bArrCopyOf, "copyOf(...)");
        String strEncodeToString = Base64.encodeToString(bArrCopyOf, 11);
        m.e(strEncodeToString, "encodeToString(truncated…ADDING or Base64.NO_WRAP)");
        return strEncodeToString;
    }

    public final boolean isValidRef(String ref) {
        m.f(ref, "ref");
        return REF_REGEX.e(ref);
    }
}
