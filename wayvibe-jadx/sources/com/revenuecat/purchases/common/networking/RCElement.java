package com.revenuecat.purchases.common.networking;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class RCElement {
    private static final Companion Companion = new Companion(null);
    private static final String SHA_256_ALGORITHM = "SHA-256";
    private final byte[] checksum;
    private final int codec;
    private final ByteBuffer data;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    public RCElement(byte[] checksum, ByteBuffer data, int i10) {
        m.f(checksum, "checksum");
        m.f(data, "data");
        this.checksum = checksum;
        this.data = data;
        this.codec = i10;
    }

    private final boolean matchesChecksum(byte[] bArr) {
        byte[] computed = MessageDigest.getInstance(SHA_256_ALGORITHM).digest(bArr);
        m.e(computed, "computed");
        byte[] bArrCopyOf = Arrays.copyOf(computed, this.checksum.length);
        m.e(bArrCopyOf, "copyOf(...)");
        return Arrays.equals(bArrCopyOf, this.checksum);
    }

    public final String checksumBase64() {
        String strEncodeToString = Base64.encodeToString(this.checksum, 11);
        m.e(strEncodeToString, "encodeToString(checksum,…ADDING or Base64.NO_WRAP)");
        return strEncodeToString;
    }

    public final byte[] decode() {
        byte[] bArrDecode = RCContentEncoding.Companion.decode(this.data, this.codec);
        if (matchesChecksum(bArrDecode)) {
            return bArrDecode;
        }
        throw new RCContainerFormatException("RC element checksum verification failed.", null, 2, null);
    }

    public final byte[] getChecksum() {
        return this.checksum;
    }

    public final int getCodec() {
        return this.codec;
    }

    public final ByteBuffer getData() {
        return this.data;
    }

    public /* synthetic */ RCElement(byte[] bArr, ByteBuffer byteBuffer, int i10, int i11, f fVar) {
        this(bArr, byteBuffer, (i11 & 4) != 0 ? RCContentEncoding.NONE.getId() : i10);
    }
}
