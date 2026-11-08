package p207t7;

import B8.r0;
import B8.s0;
import com.google.firebase.firestore.J;
import com.google.firebase.firestore.K;
import com.google.protobuf.AbstractC1252l;
import com.google.protobuf.C1250k;
import com.google.protobuf.V;
import io.flutter.plugins.firebase.firestore.s;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Comparator;
import java.util.Iterator;
import org.apache.tika.fork.ForkServer;
import p240w9.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f26949a;

    static {
        new SecureRandom();
        f26949a = new s(21);
    }

    public static Object a(Iterator it) {
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static int b(byte[] bArr, byte[] bArr2) {
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i10 = 0; i10 < iMin; i10++) {
            int i11 = bArr[i10] & ForkServer.ERROR;
            int i12 = bArr2[i10] & ForkServer.ERROR;
            if (i11 < i12) {
                return -1;
            }
            if (i11 > i12) {
                return 1;
            }
        }
        return d(bArr.length, bArr2.length);
    }

    public static int c(AbstractC1252l abstractC1252l, AbstractC1252l abstractC1252l2) {
        int iMin = Math.min(abstractC1252l.size(), abstractC1252l2.size());
        for (int i10 = 0; i10 < iMin; i10++) {
            int i11 = abstractC1252l.i(i10) & ForkServer.ERROR;
            int i12 = abstractC1252l2.i(i10) & ForkServer.ERROR;
            if (i11 < i12) {
                return -1;
            }
            if (i11 > i12) {
                return 1;
            }
        }
        return d(abstractC1252l.size(), abstractC1252l2.size());
    }

    public static int d(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }

    public static int e(double d10, long j10) {
        if (Double.isNaN(d10) || d10 < -9.223372036854776E18d) {
            return -1;
        }
        if (d10 >= 9.223372036854776E18d) {
            return 1;
        }
        int iCompare = Long.compare((long) d10, j10);
        return iCompare != 0 ? iCompare : l.b(d10, j10);
    }

    public static int f(String str, String str2) {
        int iCharCount = 0;
        while (iCharCount < str.length() && iCharCount < str2.length()) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt != iCodePointAt2) {
                if (iCodePointAt < 128 && iCodePointAt2 < 128) {
                    return Integer.compare(iCodePointAt, iCodePointAt2);
                }
                String strSubstring = str.substring(iCharCount, Character.charCount(str.codePointAt(iCharCount)) + iCharCount);
                C1250k c1250k = AbstractC1252l.f18752b;
                Charset charset = V.f18703a;
                int iC = c(new C1250k(strSubstring.getBytes(charset)), new C1250k(str2.substring(iCharCount, Character.charCount(str2.codePointAt(iCharCount)) + iCharCount).getBytes(charset)));
                return iC != 0 ? iC : Integer.compare(iCodePointAt, iCodePointAt2);
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return Integer.compare(str.length(), str2.length());
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0023  */
    public static void g(Iterator it, Iterator it2, Comparator comparator, i iVar, i iVar2) {
        Object objA = a(it);
        Object objA2 = a(it2);
        while (true) {
            if (objA == null && objA2 == null) {
                return;
            }
            boolean z10 = false;
            boolean z11 = true;
            if (objA != null && objA2 != null) {
                int iCompare = comparator.compare(objA, objA2);
                if (iCompare >= 0) {
                    if (iCompare > 0) {
                        z11 = false;
                        z10 = true;
                    } else {
                        z11 = false;
                    }
                }
            } else if (objA == null) {
                z11 = false;
                z10 = true;
            }
            if (z10) {
                iVar.accept(objA2);
                objA2 = a(it2);
            } else if (z11) {
                iVar2.accept(objA);
                objA = a(it);
            } else {
                objA = a(it);
                objA2 = a(it2);
            }
        }
    }

    public static K h(r0 r0Var) {
        r0Var.getClass();
        s0 s0Var = new s0(r0Var);
        return new K(s0Var.getMessage(), J.e(r0Var.f859a.g()), s0Var);
    }

    public static StringBuilder i(CharSequence charSequence, String str, int i10) {
        StringBuilder sb = new StringBuilder();
        if (i10 != 0) {
            sb.append(charSequence);
            for (int i11 = 1; i11 < i10; i11++) {
                sb.append((CharSequence) str);
                sb.append(charSequence);
            }
        }
        return sb;
    }

    public static String j(AbstractC1252l abstractC1252l) {
        int size = abstractC1252l.size();
        StringBuilder sb = new StringBuilder(size * 2);
        for (int i10 = 0; i10 < size; i10++) {
            byte bI = abstractC1252l.i(i10);
            sb.append(Character.forDigit((bI & ForkServer.ERROR) >>> 4, 16));
            sb.append(Character.forDigit(bI & 15, 16));
        }
        return sb.toString();
    }
}
