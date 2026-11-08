package com.revenuecat.purchases.models;

import B2.AbstractC0112b;
import D7.W;
import M8.InterfaceC0641c;
import M8.h;
import M8.j;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.common.verification.SigningManager;
import java.lang.annotation.Annotation;
import java.security.MessageDigest;
import java.util.Locale;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p219u9.a;
import p240w9.g;
import p251x9.b;
import p260y9.O;
import p260y9.Y;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class Checksum {
    private final Algorithm algorithm;
    private final String value;
    public static final Companion Companion = new Companion(null);
    private static final a[] $childSerializers = {Algorithm.Companion.serializer(), null};

    public enum Algorithm {
        SHA256("SHA-256"),
        SHA384("SHA-384"),
        SHA512("SHA-512"),
        MD5("MD5");

        private final String algorithmName;
        public static final Companion Companion = new Companion(null);
        private static final h $cachedSerializer$delegate = W.R(j.PUBLICATION, Companion.AnonymousClass1.INSTANCE);

        public static final class Companion {

            /* JADX INFO: renamed from: com.revenuecat.purchases.models.Checksum$Algorithm$Companion$1, reason: invalid class name */
            public static final class AnonymousClass1 extends n implements Z8.a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override // Z8.a
                public final a invoke() {
                    return O.d("com.revenuecat.purchases.models.Checksum.Algorithm", Algorithm.values(), new String[]{SigningManager.POST_PARAMS_ALGORITHM, "sha384", "sha512", "md5"}, new Annotation[][]{null, null, null, null});
                }
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }

            private final /* synthetic */ a get$cachedSerializer() {
                return (a) Algorithm.$cachedSerializer$delegate.getValue();
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            public final Algorithm fromString(String value) {
                m.f(value, "value");
                String lowerCase = value.toLowerCase(Locale.ROOT);
                m.e(lowerCase, "toLowerCase(...)");
                switch (lowerCase.hashCode()) {
                    case -903629273:
                        if (lowerCase.equals(SigningManager.POST_PARAMS_ALGORITHM)) {
                            return Algorithm.SHA256;
                        }
                        return null;
                    case -903628221:
                        if (lowerCase.equals("sha384")) {
                            return Algorithm.SHA384;
                        }
                        return null;
                    case -903626518:
                        if (lowerCase.equals("sha512")) {
                            return Algorithm.SHA512;
                        }
                        return null;
                    case 107902:
                        if (lowerCase.equals("md5")) {
                            return Algorithm.MD5;
                        }
                        return null;
                    default:
                        return null;
                }
            }

            public final a serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }

        Algorithm(String str) {
            this.algorithmName = str;
        }

        public final String getAlgorithmName() {
            return this.algorithmName;
        }
    }

    public static final class ChecksumValidationException extends Exception {
    }

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final Checksum generate(byte[] data, Algorithm algorithm) {
            m.f(data, "data");
            m.f(algorithm, "algorithm");
            byte[] hash = MessageDigest.getInstance(algorithm.getAlgorithmName()).digest(data);
            m.e(hash, "hash");
            return new Checksum(algorithm, ChecksumKt.toHexString(hash));
        }

        public final a serializer() {
            return Checksum$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InterfaceC0641c
    public /* synthetic */ Checksum(int i10, Algorithm algorithm, String str, Y y6) {
        if (3 != (i10 & 3)) {
            O.g(i10, 3, Checksum$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.algorithm = algorithm;
        this.value = str;
    }

    public static /* synthetic */ Checksum copy$default(Checksum checksum, Algorithm algorithm, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            algorithm = checksum.algorithm;
        }
        if ((i10 & 2) != 0) {
            str = checksum.value;
        }
        return checksum.copy(algorithm, str);
    }

    public static /* synthetic */ void getAlgorithm$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(Checksum checksum, b bVar, g gVar) {
        bVar.m(gVar, 0, $childSerializers[0], checksum.algorithm);
        bVar.u(gVar, 1, checksum.value);
    }

    public final Algorithm component1() {
        return this.algorithm;
    }

    public final String component2() {
        return this.value;
    }

    public final Checksum copy(Algorithm algorithm, String value) {
        m.f(algorithm, "algorithm");
        m.f(value, "value");
        return new Checksum(algorithm, value);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Checksum)) {
            return false;
        }
        String str = this.value;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        m.e(lowerCase, "toLowerCase(...)");
        Checksum checksum = (Checksum) obj;
        String lowerCase2 = checksum.value.toLowerCase(locale);
        m.e(lowerCase2, "toLowerCase(...)");
        return lowerCase.equals(lowerCase2) && this.algorithm == checksum.algorithm;
    }

    public final Algorithm getAlgorithm() {
        return this.algorithm;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.algorithm.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Checksum(algorithm=");
        sb.append(this.algorithm);
        sb.append(", value=");
        return AbstractC0112b.j(sb, this.value, ')');
    }

    public Checksum(Algorithm algorithm, String value) {
        m.f(algorithm, "algorithm");
        m.f(value, "value");
        this.algorithm = algorithm;
        this.value = value;
    }
}
