package B8;

import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final BitSet f770d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f773c;

    static {
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c3 = '0'; c3 <= '9'; c3 = (char) (c3 + 1)) {
            bitSet.set(c3);
        }
        for (char c9 = 'a'; c9 <= 'z'; c9 = (char) (c9 + 1)) {
            bitSet.set(c9);
        }
        f770d = bitSet;
    }

    public b0(Object obj, String str, boolean z10) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        p229v9.a.k(lowerCase, "name");
        p229v9.a.g("token must have at least 1 tchar", !lowerCase.isEmpty());
        if (lowerCase.equals("connection")) {
            e0.f795c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
        }
        for (int i10 = 0; i10 < lowerCase.length(); i10++) {
            char cCharAt = lowerCase.charAt(i10);
            if ((!z10 || cCharAt != ':' || i10 != 0) && !f770d.get(cCharAt)) {
                throw new IllegalArgumentException(p234w3.c.c("Invalid character '%s' in key name '%s'", Character.valueOf(cCharAt), lowerCase));
            }
        }
        this.f771a = lowerCase;
        this.f772b = lowerCase.getBytes(p267z6.h.f29877a);
        this.f773c = obj;
    }

    public abstract Object a(byte[] bArr);

    public abstract byte[] b(Object obj);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f771a.equals(((b0) obj).f771a);
    }

    public final int hashCode() {
        return this.f771a.hashCode();
    }

    public final String toString() {
        return p134m1.b.m(new StringBuilder("Key{name='"), this.f771a, "'}");
    }
}
