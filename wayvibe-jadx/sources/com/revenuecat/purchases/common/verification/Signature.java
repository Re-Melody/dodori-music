package com.revenuecat.purchases.common.verification;

import B2.AbstractC0112b;
import android.util.Base64;
import java.util.Arrays;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public final class Signature {
    public static final Companion Companion = new Companion(null);
    private final byte[] intermediateKey;
    private final byte[] intermediateKeyExpiration;
    private final byte[] intermediateKeySignature;
    private final byte[] payload;
    private final byte[] salt;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final Signature fromString$purchases_defaultsRelease(String signature) throws InvalidSignatureSizeException {
            m.f(signature, "signature");
            byte[] bArrDecode = Base64.decode(signature, 0);
            int totalSize = Component.Companion.getTotalSize();
            if (bArrDecode.length == totalSize) {
                return new Signature(SignatureKt.copyOf(bArrDecode, Component.INTERMEDIATE_KEY), SignatureKt.copyOf(bArrDecode, Component.INTERMEDIATE_KEY_EXPIRATION), SignatureKt.copyOf(bArrDecode, Component.INTERMEDIATE_KEY_SIGNATURE), SignatureKt.copyOf(bArrDecode, Component.SALT), SignatureKt.copyOf(bArrDecode, Component.PAYLOAD));
            }
            throw new InvalidSignatureSizeException(AbstractC0112b.i(b.p(totalSize, "Invalid signature size. Expected ", ", got "), bArrDecode.length, " bytes"));
        }

        private Companion() {
        }
    }

    public enum Component {
        INTERMEDIATE_KEY(32),
        INTERMEDIATE_KEY_EXPIRATION(4),
        INTERMEDIATE_KEY_SIGNATURE(64),
        SALT(16),
        PAYLOAD(64);

        public static final Companion Companion = new Companion(null);
        private final int size;

        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public final int getTotalSize() {
                int size = 0;
                for (Component component : Component.values()) {
                    size += component.getSize();
                }
                return size;
            }

            private Companion() {
            }
        }

        Component(int i10) {
            this.size = i10;
        }

        public final int getEndByte() {
            return getStartByte() + this.size;
        }

        public final int getSize() {
            return this.size;
        }

        public final int getStartByte() {
            int i10 = 0;
            for (Object obj : N8.m.o0(values(), 0, ordinal())) {
                i10 += ((Component) obj).size;
            }
            return i10;
        }
    }

    public Signature(byte[] intermediateKey, byte[] intermediateKeyExpiration, byte[] intermediateKeySignature, byte[] salt, byte[] payload) {
        m.f(intermediateKey, "intermediateKey");
        m.f(intermediateKeyExpiration, "intermediateKeyExpiration");
        m.f(intermediateKeySignature, "intermediateKeySignature");
        m.f(salt, "salt");
        m.f(payload, "payload");
        this.intermediateKey = intermediateKey;
        this.intermediateKeyExpiration = intermediateKeyExpiration;
        this.intermediateKeySignature = intermediateKeySignature;
        this.salt = salt;
        this.payload = payload;
    }

    public static /* synthetic */ Signature copy$default(Signature signature, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bArr = signature.intermediateKey;
        }
        if ((i10 & 2) != 0) {
            bArr2 = signature.intermediateKeyExpiration;
        }
        if ((i10 & 4) != 0) {
            bArr3 = signature.intermediateKeySignature;
        }
        if ((i10 & 8) != 0) {
            bArr4 = signature.salt;
        }
        if ((i10 & 16) != 0) {
            bArr5 = signature.payload;
        }
        byte[] bArr6 = bArr5;
        byte[] bArr7 = bArr3;
        return signature.copy(bArr, bArr2, bArr7, bArr4, bArr6);
    }

    public final byte[] component1() {
        return this.intermediateKey;
    }

    public final byte[] component2() {
        return this.intermediateKeyExpiration;
    }

    public final byte[] component3() {
        return this.intermediateKeySignature;
    }

    public final byte[] component4() {
        return this.salt;
    }

    public final byte[] component5() {
        return this.payload;
    }

    public final Signature copy(byte[] intermediateKey, byte[] intermediateKeyExpiration, byte[] intermediateKeySignature, byte[] salt, byte[] payload) {
        m.f(intermediateKey, "intermediateKey");
        m.f(intermediateKeyExpiration, "intermediateKeyExpiration");
        m.f(intermediateKeySignature, "intermediateKeySignature");
        m.f(salt, "salt");
        m.f(payload, "payload");
        return new Signature(intermediateKey, intermediateKeyExpiration, intermediateKeySignature, salt, payload);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Signature.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        m.d(obj, "null cannot be cast to non-null type com.revenuecat.purchases.common.verification.Signature");
        Signature signature = (Signature) obj;
        return Arrays.equals(this.intermediateKey, signature.intermediateKey) && Arrays.equals(this.intermediateKeyExpiration, signature.intermediateKeyExpiration) && Arrays.equals(this.intermediateKeySignature, signature.intermediateKeySignature) && Arrays.equals(this.salt, signature.salt) && Arrays.equals(this.payload, signature.payload);
    }

    public final byte[] getIntermediateKey() {
        return this.intermediateKey;
    }

    public final byte[] getIntermediateKeyExpiration() {
        return this.intermediateKeyExpiration;
    }

    public final byte[] getIntermediateKeySignature() {
        return this.intermediateKeySignature;
    }

    public final byte[] getPayload() {
        return this.payload;
    }

    public final byte[] getSalt() {
        return this.salt;
    }

    public int hashCode() {
        return Arrays.hashCode(this.payload) + ((Arrays.hashCode(this.salt) + ((Arrays.hashCode(this.intermediateKeySignature) + ((Arrays.hashCode(this.intermediateKeyExpiration) + (Arrays.hashCode(this.intermediateKey) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "Signature(intermediateKey=" + Arrays.toString(this.intermediateKey) + ", intermediateKeyExpiration=" + Arrays.toString(this.intermediateKeyExpiration) + ", intermediateKeySignature=" + Arrays.toString(this.intermediateKeySignature) + ", salt=" + Arrays.toString(this.salt) + ", payload=" + Arrays.toString(this.payload) + ')';
    }
}
