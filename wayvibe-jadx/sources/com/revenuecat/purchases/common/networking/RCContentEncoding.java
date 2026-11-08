package com.revenuecat.purchases.common.networking;

import B8.V;
import D7.W;
import Q5.b;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public enum RCContentEncoding {
    NONE(0),
    GZIP(1),
    BROTLI(2),
    ZSTD(3);

    public static final Companion Companion = new Companion(null);
    private final int id;

    public static final class Companion {

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RCContentEncoding.values().length];
                try {
                    iArr[RCContentEncoding.NONE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RCContentEncoding.GZIP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[RCContentEncoding.BROTLI.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[RCContentEncoding.ZSTD.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private final byte[] gunzip(ByteBuffer byteBuffer) throws IllegalAccessException, InvocationTargetException {
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(toByteArray(byteBuffer)));
                try {
                    byte[] bArrC0 = W.c0(gZIPInputStream);
                    gZIPInputStream.close();
                    return bArrC0;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        b.n(gZIPInputStream, th);
                        throw th2;
                    }
                }
            } catch (IOException e2) {
                throw new RCContainerFormatException("Failed to gzip-decode element.", e2);
            }
        }

        private final byte[] toByteArray(ByteBuffer byteBuffer) {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.rewind();
            byte[] bArr = new byte[byteBufferDuplicate.remaining()];
            byteBufferDuplicate.get(bArr);
            return bArr;
        }

        public final byte[] decode(ByteBuffer source, int i10) {
            m.f(source, "source");
            RCContentEncoding rCContentEncodingFromId = fromId(i10);
            int i11 = rCContentEncodingFromId == null ? -1 : WhenMappings.$EnumSwitchMapping$0[rCContentEncodingFromId.ordinal()];
            if (i11 != -1) {
                if (i11 == 1) {
                    return toByteArray(source);
                }
                if (i11 == 2) {
                    return gunzip(source);
                }
                if (i11 != 3 && i11 != 4) {
                    throw new V();
                }
            }
            throw new RCContainerFormatException("Unsupported content encoding id " + i10 + com.amazon.a.a.o.c.a.b.f16463a, null, 2, null);
        }

        public final RCContentEncoding fromId(int i10) {
            for (RCContentEncoding rCContentEncoding : RCContentEncoding.values()) {
                if (rCContentEncoding.getId() == i10) {
                    return rCContentEncoding;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    RCContentEncoding(int i10) {
        this.id = i10;
    }

    public final int getId() {
        return this.id;
    }
}
