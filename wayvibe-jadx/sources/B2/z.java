package B2;

import android.util.Base64;
import com.google.protobuf.AbstractC1252l;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.BreakIterator;
import java.util.Arrays;
import java.util.Locale;
import s7.C2224e;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f644e;

    public z(CharSequence charSequence, int i10, Locale locale) {
        this.f640a = 1;
        this.f643d = charSequence;
        if (charSequence.length() < 0) {
            throw new IllegalArgumentException("input start index is outside the CharSequence");
        }
        if (i10 < 0 || i10 > charSequence.length()) {
            throw new IllegalArgumentException("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f644e = wordInstance;
        this.f641b = Math.max(0, -50);
        this.f642c = Math.min(charSequence.length(), i10 + 50);
        wordInstance.setText(new P0.l(charSequence, i10));
    }

    public static z d(AbstractC1252l abstractC1252l, int i10, int i11) throws C2224e {
        if (i10 < 0 || i10 >= 8) {
            throw new C2224e(p134m1.b.j(i10, "Invalid padding: "));
        }
        if (i11 < 0) {
            throw new C2224e(p134m1.b.j(i11, "Invalid hash count: "));
        }
        if (abstractC1252l.size() > 0 && i11 == 0) {
            throw new C2224e(p134m1.b.j(i11, "Invalid hash count: "));
        }
        if (abstractC1252l.size() != 0 || i10 == 0) {
            return new z(abstractC1252l, i10, i11);
        }
        throw new C2224e(p134m1.b.j(i10, "Expected padding of 0 when bitmap length is 0, but got "));
    }

    public static long g(byte[] bArr, int i10) {
        long j10 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            j10 |= (((long) bArr[i10 + i11]) & 255) << (i11 * 8);
        }
        return j10;
    }

    public synchronized void a(long j10, Object obj) {
        int i10 = this.f642c;
        if (i10 > 0) {
            if (j10 <= ((long[]) this.f643d)[((this.f641b + i10) - 1) % ((Object[]) this.f644e).length]) {
                c();
            }
        }
        e();
        int i11 = this.f641b;
        int i12 = this.f642c;
        Object[] objArr = (Object[]) this.f644e;
        int length = (i11 + i12) % objArr.length;
        ((long[]) this.f643d)[length] = j10;
        objArr[length] = obj;
        this.f642c = i12 + 1;
    }

    public void b(int i10) {
        int i11 = this.f641b;
        int i12 = this.f642c;
        if (i10 > i12 || i11 > i10) {
            throw new IllegalArgumentException(V0.p.q(AbstractC0112b.p("Invalid offset: ", i10, ". Valid range is [", i11, " , "), i12, ']').toString());
        }
    }

    public synchronized void c() {
        this.f641b = 0;
        this.f642c = 0;
        Arrays.fill((Object[]) this.f644e, (Object) null);
    }

    public void e() {
        int length = ((Object[]) this.f644e).length;
        if (this.f642c < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        Object[] objArr = new Object[i10];
        int i11 = this.f641b;
        int i12 = length - i11;
        System.arraycopy((long[]) this.f643d, i11, jArr, 0, i12);
        System.arraycopy((Object[]) this.f644e, this.f641b, objArr, 0, i12);
        int i13 = this.f641b;
        if (i13 > 0) {
            System.arraycopy((long[]) this.f643d, 0, jArr, i12, i13);
            System.arraycopy((Object[]) this.f644e, 0, objArr, i12, this.f641b);
        }
        this.f643d = jArr;
        this.f644e = objArr;
        this.f641b = 0;
    }

    public int f() {
        n nVar = (n) this.f644e;
        if (nVar == null) {
            return ((String) this.f643d).length();
        }
        return (nVar.f610b - nVar.c()) + (((String) this.f643d).length() - (this.f642c - this.f641b));
    }

    public boolean h(int i10) {
        return i10 <= this.f642c && this.f641b + 1 <= i10 && Character.isLetterOrDigit(Character.codePointBefore((CharSequence) this.f643d, i10));
    }

    public boolean i(int i10) {
        int i11 = this.f641b + 1;
        if (i10 > this.f642c || i11 > i10) {
            return false;
        }
        return S9.b.X(Character.codePointBefore((CharSequence) this.f643d, i10));
    }

    public boolean j(int i10) {
        return i10 < this.f642c && this.f641b <= i10 && Character.isLetterOrDigit(Character.codePointAt((CharSequence) this.f643d, i10));
    }

    public boolean k(int i10) {
        if (i10 >= this.f642c || this.f641b > i10) {
            return false;
        }
        return S9.b.X(Character.codePointAt((CharSequence) this.f643d, i10));
    }

    public synchronized Object l() {
        return this.f642c == 0 ? null : n();
    }

    public synchronized Object m(long j10) {
        Object objN;
        objN = null;
        while (this.f642c > 0 && j10 - ((long[]) this.f643d)[this.f641b] >= 0) {
            objN = n();
        }
        return objN;
    }

    public Object n() {
        AbstractC0111a.h(this.f642c > 0);
        Object[] objArr = (Object[]) this.f644e;
        int i10 = this.f641b;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f641b = (i10 + 1) % objArr.length;
        this.f642c--;
        return obj;
    }

    public void o(int i10, int i11, String str) {
        if (i10 > i11) {
            throw new IllegalArgumentException(AbstractC0112b.e("start index must be less than or equal to end index: ", i10, i11, " > ").toString());
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(p134m1.b.j(i10, "start must be non-negative, but was ").toString());
        }
        n nVar = (n) this.f644e;
        if (nVar == null) {
            int iMax = Math.max(ColorExtractionConstants.COLOR_COMPONENT_MASK, str.length() + ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i10, 64);
            int iMin2 = Math.min(((String) this.f643d).length() - i11, 64);
            String str2 = (String) this.f643d;
            int i12 = i10 - iMin;
            kotlin.jvm.internal.m.d(str2, "null cannot be cast to non-null type java.lang.String");
            str2.getChars(i12, i10, cArr, 0);
            String str3 = (String) this.f643d;
            int i13 = iMax - iMin2;
            int i14 = iMin2 + i11;
            kotlin.jvm.internal.m.d(str3, "null cannot be cast to non-null type java.lang.String");
            str3.getChars(i11, i14, cArr, i13);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            n nVar2 = new n(4);
            nVar2.f610b = iMax;
            nVar2.f613e = cArr;
            nVar2.f611c = length;
            nVar2.f612d = i13;
            this.f644e = nVar2;
            this.f641b = i12;
            this.f642c = i14;
            return;
        }
        int i15 = this.f641b;
        int i16 = i10 - i15;
        int i17 = i11 - i15;
        if (i16 < 0 || i17 > nVar.f610b - nVar.c()) {
            this.f643d = toString();
            this.f644e = null;
            this.f641b = -1;
            this.f642c = -1;
            o(i10, i11, str);
            return;
        }
        int length2 = str.length() - (i17 - i16);
        if (length2 > nVar.c()) {
            int iC = length2 - nVar.c();
            int i18 = nVar.f610b;
            do {
                i18 *= 2;
            } while (i18 - nVar.f610b < iC);
            char[] cArr2 = new char[i18];
            N8.m.j0((char[]) nVar.f613e, cArr2, 0, 0, nVar.f611c);
            int i19 = nVar.f610b;
            int i20 = nVar.f612d;
            int i21 = i19 - i20;
            int i22 = i18 - i21;
            N8.m.j0((char[]) nVar.f613e, cArr2, i22, i20, i21 + i20);
            nVar.f613e = cArr2;
            nVar.f610b = i18;
            nVar.f612d = i22;
        }
        int i23 = nVar.f611c;
        if (i16 < i23 && i17 <= i23) {
            int i24 = i23 - i17;
            char[] cArr3 = (char[]) nVar.f613e;
            N8.m.j0(cArr3, cArr3, nVar.f612d - i24, i17, i23);
            nVar.f611c = i16;
            nVar.f612d -= i24;
        } else if (i16 >= i23 || i17 < i23) {
            int iC2 = nVar.c() + i16;
            int iC3 = nVar.c() + i17;
            int i25 = nVar.f612d;
            char[] cArr4 = (char[]) nVar.f613e;
            N8.m.j0(cArr4, cArr4, nVar.f611c, i25, iC2);
            nVar.f611c += iC2 - i25;
            nVar.f612d = iC3;
        } else {
            nVar.f612d = nVar.c() + i17;
            nVar.f611c = i16;
        }
        str.getChars(0, str.length(), (char[]) nVar.f613e, nVar.f611c);
        nVar.f611c = str.length() + nVar.f611c;
    }

    public synchronized int p() {
        return this.f642c;
    }

    public String toString() {
        switch (this.f640a) {
            case 2:
                n nVar = (n) this.f644e;
                if (nVar == null) {
                    return (String) this.f643d;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) this.f643d, 0, this.f641b);
                sb.append((char[]) nVar.f613e, 0, nVar.f611c);
                char[] cArr = (char[]) nVar.f613e;
                int i10 = nVar.f612d;
                sb.append(cArr, i10, nVar.f610b - i10);
                String str = (String) this.f643d;
                sb.append((CharSequence) str, this.f642c, str.length());
                return sb.toString();
            case 3:
                return "BloomFilter{hashCount=" + this.f642c + ", size=" + this.f641b + ", bitmap=\"" + Base64.encodeToString(((AbstractC1252l) this.f643d).y(), 2) + "\"}";
            default:
                return super.toString();
        }
    }

    public z(int i10, byte b10) {
        this.f640a = i10;
        switch (i10) {
            case 2:
                break;
            default:
                this.f643d = new long[10];
                this.f644e = new Object[10];
                break;
        }
    }

    public z(AbstractC1252l abstractC1252l, int i10, int i11) {
        this.f640a = 3;
        if (i10 < 0 || i10 >= 8) {
            throw new IllegalArgumentException(p134m1.b.j(i10, "Invalid padding: "));
        }
        if (i11 >= 0) {
            if (abstractC1252l.size() > 0 && i11 == 0) {
                throw new IllegalArgumentException(p134m1.b.j(i11, "Invalid hash count: "));
            }
            if (abstractC1252l.size() == 0 && i10 != 0) {
                throw new IllegalArgumentException(p134m1.b.j(i10, "Expected padding of 0 when bitmap length is 0, but got "));
            }
            this.f643d = abstractC1252l;
            this.f642c = i11;
            this.f641b = (abstractC1252l.size() * 8) - i10;
            try {
                this.f644e = MessageDigest.getInstance("MD5");
                return;
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException("Missing MD5 MessageDigest provider: ", e2);
            }
        }
        throw new IllegalArgumentException(p134m1.b.j(i11, "Invalid hash count: "));
    }

    public z(int i10) {
        this.f640a = 4;
        this.f643d = new p203t3.p[i10];
        this.f642c = 0;
    }
}
