package M7;

import B2.AbstractC0112b;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class b implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Reader f8376a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f8384i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8385j;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f8386l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String[] f8388n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f8389o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8377b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final char[] f8378c = new char[1024];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8379d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8380e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8381f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8382g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8383h = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8387m = 1;

    static {
        a.f8375a = new a();
    }

    public b(Reader reader) {
        int[] iArr = new int[32];
        this.f8386l = iArr;
        iArr[0] = 6;
        this.f8388n = new String[32];
        this.f8389o = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f8376a = reader;
    }

    public boolean A() {
        int iG = this.f8383h;
        if (iG == 0) {
            iG = g();
        }
        return (iG == 2 || iG == 4 || iG == 17) ? false : true;
    }

    public final boolean B(char c3) throws e {
        if (c3 == '\t' || c3 == '\n' || c3 == '\f' || c3 == '\r' || c3 == ' ') {
            return false;
        }
        if (c3 != '#') {
            if (c3 == ',') {
                return false;
            }
            if (c3 != '/' && c3 != '=') {
                if (c3 == '{' || c3 == '}' || c3 == ':') {
                    return false;
                }
                if (c3 != ';') {
                    switch (c3) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        e();
        return false;
    }

    final String C() {
        StringBuilder sbP = AbstractC0112b.p(" at line ", this.f8381f + 1, " column ", (this.f8379d - this.f8382g) + 1, " path ");
        sbP.append(w());
        return sbP.toString();
    }

    public boolean D() {
        int iG = this.f8383h;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 5) {
            this.f8383h = 0;
            int[] iArr = this.f8389o;
            int i10 = this.f8387m - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iG != 6) {
            throw new IllegalStateException("Expected a boolean but was " + N() + C());
        }
        this.f8383h = 0;
        int[] iArr2 = this.f8389o;
        int i11 = this.f8387m - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return false;
    }

    public double E() throws e {
        int iG = this.f8383h;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 15) {
            this.f8383h = 0;
            int[] iArr = this.f8389o;
            int i10 = this.f8387m - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f8384i;
        }
        if (iG == 16) {
            this.k = new String(this.f8378c, this.f8379d, this.f8385j);
            this.f8379d += this.f8385j;
        } else if (iG == 8 || iG == 9) {
            this.k = K(iG == 8 ? '\'' : '\"');
        } else if (iG == 10) {
            this.k = M();
        } else if (iG != 11) {
            throw new IllegalStateException("Expected a double but was " + N() + C());
        }
        this.f8383h = 11;
        double d10 = Double.parseDouble(this.k);
        if (!this.f8377b && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new e("JSON forbids NaN and infinities: " + d10 + C());
        }
        this.k = null;
        this.f8383h = 0;
        int[] iArr2 = this.f8389o;
        int i11 = this.f8387m - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return d10;
    }

    public int F() {
        int iG = this.f8383h;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 15) {
            long j10 = this.f8384i;
            int i10 = (int) j10;
            if (j10 != i10) {
                throw new NumberFormatException("Expected an int but was " + this.f8384i + C());
            }
            this.f8383h = 0;
            int[] iArr = this.f8389o;
            int i11 = this.f8387m - 1;
            iArr[i11] = iArr[i11] + 1;
            return i10;
        }
        if (iG == 16) {
            this.k = new String(this.f8378c, this.f8379d, this.f8385j);
            this.f8379d += this.f8385j;
        } else {
            if (iG != 8 && iG != 9 && iG != 10) {
                throw new IllegalStateException("Expected an int but was " + N() + C());
            }
            if (iG == 10) {
                this.k = M();
            } else {
                this.k = K(iG == 8 ? '\'' : '\"');
            }
            try {
                int i12 = Integer.parseInt(this.k);
                this.f8383h = 0;
                int[] iArr2 = this.f8389o;
                int i13 = this.f8387m - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        }
        this.f8383h = 11;
        double d10 = Double.parseDouble(this.k);
        int i14 = (int) d10;
        if (i14 != d10) {
            throw new NumberFormatException("Expected an int but was " + this.k + C());
        }
        this.k = null;
        this.f8383h = 0;
        int[] iArr3 = this.f8389o;
        int i15 = this.f8387m - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }

    public long G() {
        int iG = this.f8383h;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 15) {
            this.f8383h = 0;
            int[] iArr = this.f8389o;
            int i10 = this.f8387m - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f8384i;
        }
        if (iG == 16) {
            this.k = new String(this.f8378c, this.f8379d, this.f8385j);
            this.f8379d += this.f8385j;
        } else {
            if (iG != 8 && iG != 9 && iG != 10) {
                throw new IllegalStateException("Expected a long but was " + N() + C());
            }
            if (iG == 10) {
                this.k = M();
            } else {
                this.k = K(iG == 8 ? '\'' : '\"');
            }
            try {
                long j10 = Long.parseLong(this.k);
                this.f8383h = 0;
                int[] iArr2 = this.f8389o;
                int i11 = this.f8387m - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        }
        this.f8383h = 11;
        double d10 = Double.parseDouble(this.k);
        long j11 = (long) d10;
        if (j11 != d10) {
            throw new NumberFormatException("Expected a long but was " + this.k + C());
        }
        this.k = null;
        this.f8383h = 0;
        int[] iArr3 = this.f8389o;
        int i12 = this.f8387m - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return j11;
    }

    public String H() throws e {
        String strK;
        int iG = this.f8383h;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 14) {
            strK = M();
        } else if (iG == 12) {
            strK = K('\'');
        } else {
            if (iG != 13) {
                throw new IllegalStateException("Expected a name but was " + N() + C());
            }
            strK = K('\"');
        }
        this.f8383h = 0;
        this.f8388n[this.f8387m - 1] = strK;
        return strK;
    }

    public final int I(boolean z10) throws IOException {
        int i10 = this.f8379d;
        int i11 = this.f8380e;
        while (true) {
            if (i10 == i11) {
                this.f8379d = i10;
                if (!v(1)) {
                    if (!z10) {
                        return -1;
                    }
                    throw new EOFException("End of input" + C());
                }
                i10 = this.f8379d;
                i11 = this.f8380e;
            }
            int i12 = i10 + 1;
            char[] cArr = this.f8378c;
            char c3 = cArr[i10];
            if (c3 == '\n') {
                this.f8381f++;
                this.f8382g = i12;
            } else if (c3 != ' ' && c3 != '\r' && c3 != '\t') {
                if (c3 == '/') {
                    this.f8379d = i12;
                    if (i12 == i11) {
                        this.f8379d = i10;
                        boolean zV = v(2);
                        this.f8379d++;
                        if (!zV) {
                        }
                        return c3;
                    }
                    e();
                    int i13 = this.f8379d;
                    char c9 = cArr[i13];
                    if (c9 == '*') {
                        this.f8379d = i13 + 1;
                        while (true) {
                            if (this.f8379d + 2 > this.f8380e && !v(2)) {
                                U("Unterminated comment");
                                throw null;
                            }
                            int i14 = this.f8379d;
                            if (cArr[i14] != '\n') {
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= 2) {
                                        i10 = this.f8379d + 2;
                                        i11 = this.f8380e;
                                        break;
                                    }
                                    if (cArr[this.f8379d + i15] != "*/".charAt(i15)) {
                                        break;
                                    }
                                    i15++;
                                }
                            } else {
                                this.f8381f++;
                                this.f8382g = i14 + 1;
                            }
                            this.f8379d++;
                        }
                    } else {
                        if (c9 != '/') {
                            return c3;
                        }
                        this.f8379d = i13 + 1;
                        R();
                        i10 = this.f8379d;
                        i11 = this.f8380e;
                    }
                } else {
                    if (c3 != '#') {
                        this.f8379d = i12;
                        return c3;
                    }
                    this.f8379d = i12;
                    e();
                    R();
                    i10 = this.f8379d;
                    i11 = this.f8380e;
                }
            }
            i10 = i12;
        }
    }

    public void J() {
        int iG = this.f8383h;
        if (iG == 0) {
            iG = g();
        }
        if (iG != 7) {
            throw new IllegalStateException("Expected null but was " + N() + C());
        }
        this.f8383h = 0;
        int[] iArr = this.f8389o;
        int i10 = this.f8387m - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    public final String K(char c3) throws e {
        int i10;
        char[] cArr;
        StringBuilder sb = null;
        do {
            int i11 = this.f8379d;
            int i12 = this.f8380e;
            while (true) {
                int i13 = i12;
                i10 = i11;
                while (true) {
                    cArr = this.f8378c;
                    if (i11 < i13) {
                        int i14 = i11 + 1;
                        char c9 = cArr[i11];
                        if (c9 == c3) {
                            this.f8379d = i14;
                            int i15 = (i14 - i10) - 1;
                            if (sb == null) {
                                return new String(cArr, i10, i15);
                            }
                            sb.append(cArr, i10, i15);
                            return sb.toString();
                        }
                        if (c9 == '\\') {
                            this.f8379d = i14;
                            int i16 = i14 - i10;
                            int i17 = i16 - 1;
                            if (sb == null) {
                                sb = new StringBuilder(Math.max(i16 * 2, 16));
                            }
                            sb.append(cArr, i10, i17);
                            sb.append(P());
                            i11 = this.f8379d;
                            i12 = this.f8380e;
                        } else {
                            if (c9 == '\n') {
                                this.f8381f++;
                                this.f8382g = i14;
                            }
                            i11 = i14;
                        }
                    }
                }
            }
            if (sb == null) {
                sb = new StringBuilder(Math.max((i11 - i10) * 2, 16));
            }
            sb.append(cArr, i10, i11 - i10);
            this.f8379d = i11;
        } while (v(1));
        U("Unterminated string");
        throw null;
    }

    public String L() throws e {
        String str;
        int iG = this.f8383h;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 10) {
            str = M();
        } else if (iG == 8) {
            str = K('\'');
        } else if (iG == 9) {
            str = K('\"');
        } else if (iG == 11) {
            str = this.k;
            this.k = null;
        } else if (iG == 15) {
            str = Long.toString(this.f8384i);
        } else {
            if (iG != 16) {
                throw new IllegalStateException("Expected a string but was " + N() + C());
            }
            str = new String(this.f8378c, this.f8379d, this.f8385j);
            this.f8379d += this.f8385j;
        }
        this.f8383h = 0;
        int[] iArr = this.f8389o;
        int i10 = this.f8387m - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    public final String M() throws e {
        String string;
        StringBuilder sb = null;
        int i10 = 0;
        while (true) {
            int i11 = 0;
            while (true) {
                int i12 = this.f8379d;
                int i13 = i12 + i11;
                int i14 = this.f8380e;
                char[] cArr = this.f8378c;
                if (i13 < i14) {
                    char c3 = cArr[i12 + i11];
                    if (c3 != '\t' && c3 != '\n' && c3 != '\f' && c3 != '\r' && c3 != ' ') {
                        if (c3 != '#') {
                            if (c3 != ',') {
                                if (c3 != '/' && c3 != '=') {
                                    if (c3 != '{' && c3 != '}' && c3 != ':') {
                                        if (c3 != ';') {
                                            switch (c3) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i11++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        e();
                    }
                    i10 = i11;
                } else if (i11 >= cArr.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i11, 16));
                    }
                    sb.append(cArr, this.f8379d, i11);
                    this.f8379d += i11;
                    if (!v(1)) {
                    }
                } else if (!v(i11 + 1)) {
                    i10 = i11;
                }
                if (sb == null) {
                    string = new String(cArr, this.f8379d, i10);
                } else {
                    sb.append(cArr, this.f8379d, i10);
                    string = sb.toString();
                }
                this.f8379d += i10;
                return string;
            }
        }
    }

    public c N() {
        int iG = this.f8383h;
        if (iG == 0) {
            iG = g();
        }
        switch (iG) {
            case 1:
                return c.BEGIN_OBJECT;
            case 2:
                return c.END_OBJECT;
            case 3:
                return c.BEGIN_ARRAY;
            case 4:
                return c.END_ARRAY;
            case 5:
            case 6:
                return c.BOOLEAN;
            case 7:
                return c.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return c.STRING;
            case 12:
            case 13:
            case 14:
                return c.NAME;
            case 15:
            case 16:
                return c.NUMBER;
            case 17:
                return c.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void O(int i10) {
        int i11 = this.f8387m;
        int[] iArr = this.f8386l;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f8386l = Arrays.copyOf(iArr, i12);
            this.f8389o = Arrays.copyOf(this.f8389o, i12);
            this.f8388n = (String[]) Arrays.copyOf(this.f8388n, i12);
        }
        int[] iArr2 = this.f8386l;
        int i13 = this.f8387m;
        this.f8387m = i13 + 1;
        iArr2[i13] = i10;
    }

    public final char P() throws e {
        int i10;
        if (this.f8379d == this.f8380e && !v(1)) {
            U("Unterminated escape sequence");
            throw null;
        }
        int i11 = this.f8379d;
        int i12 = i11 + 1;
        this.f8379d = i12;
        char[] cArr = this.f8378c;
        char c3 = cArr[i11];
        if (c3 == '\n') {
            this.f8381f++;
            this.f8382g = i12;
            return c3;
        }
        if (c3 == '\"' || c3 == '\'' || c3 == '/' || c3 == '\\') {
            return c3;
        }
        if (c3 == 'b') {
            return '\b';
        }
        if (c3 == 'f') {
            return '\f';
        }
        if (c3 == 'n') {
            return '\n';
        }
        if (c3 == 'r') {
            return '\r';
        }
        if (c3 == 't') {
            return '\t';
        }
        if (c3 != 'u') {
            U("Invalid escape sequence");
            throw null;
        }
        if (i11 + 5 > this.f8380e && !v(4)) {
            U("Unterminated escape sequence");
            throw null;
        }
        int i13 = this.f8379d;
        int i14 = i13 + 4;
        char c9 = 0;
        while (i13 < i14) {
            char c10 = cArr[i13];
            char c11 = (char) (c9 << 4);
            if (c10 >= '0' && c10 <= '9') {
                i10 = c10 - '0';
            } else if (c10 >= 'a' && c10 <= 'f') {
                i10 = c10 - 'W';
            } else {
                if (c10 < 'A' || c10 > 'F') {
                    throw new NumberFormatException("\\u".concat(new String(cArr, this.f8379d, 4)));
                }
                i10 = c10 - '7';
            }
            c9 = (char) (i10 + c11);
            i13++;
        }
        this.f8379d += 4;
        return c9;
    }

    public final void Q(char c3) throws e {
        do {
            int i10 = this.f8379d;
            int i11 = this.f8380e;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c9 = this.f8378c[i10];
                if (c9 == c3) {
                    this.f8379d = i12;
                    return;
                }
                if (c9 == '\\') {
                    this.f8379d = i12;
                    P();
                    i10 = this.f8379d;
                    i11 = this.f8380e;
                } else {
                    if (c9 == '\n') {
                        this.f8381f++;
                        this.f8382g = i12;
                    }
                    i10 = i12;
                }
            }
            this.f8379d = i10;
        } while (v(1));
        U("Unterminated string");
        throw null;
    }

    public final void R() {
        char c3;
        do {
            if (this.f8379d >= this.f8380e && !v(1)) {
                return;
            }
            int i10 = this.f8379d;
            int i11 = i10 + 1;
            this.f8379d = i11;
            c3 = this.f8378c[i10];
            if (c3 == '\n') {
                this.f8381f++;
                this.f8382g = i11;
                return;
            }
        } while (c3 != '\r');
    }

    public final void S() throws e {
        do {
            int i10 = 0;
            while (true) {
                int i11 = this.f8379d;
                if (i11 + i10 < this.f8380e) {
                    char c3 = this.f8378c[i11 + i10];
                    if (c3 != '\t' && c3 != '\n' && c3 != '\f' && c3 != '\r' && c3 != ' ') {
                        if (c3 != '#') {
                            if (c3 != ',') {
                                if (c3 != '/' && c3 != '=') {
                                    if (c3 != '{' && c3 != '}' && c3 != ':') {
                                        if (c3 != ';') {
                                            switch (c3) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i10++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        e();
                    }
                    this.f8379d += i10;
                    return;
                }
                this.f8379d = i11 + i10;
            }
        } while (v(1));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void T() throws e {
        int i10 = 0;
        do {
            int iG = this.f8383h;
            if (iG == 0) {
                iG = g();
            }
            switch (iG) {
                case 1:
                    O(3);
                    i10++;
                    this.f8383h = 0;
                    break;
                case 2:
                    if (i10 == 0) {
                        this.f8388n[this.f8387m - 1] = null;
                    }
                    this.f8387m--;
                    i10--;
                    this.f8383h = 0;
                    break;
                case 3:
                    O(1);
                    i10++;
                    this.f8383h = 0;
                    break;
                case 4:
                    this.f8387m--;
                    i10--;
                    this.f8383h = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f8383h = 0;
                    break;
                case 8:
                    Q('\'');
                    this.f8383h = 0;
                    break;
                case 9:
                    Q('\"');
                    this.f8383h = 0;
                    break;
                case 10:
                    S();
                    this.f8383h = 0;
                    break;
                case 12:
                    Q('\'');
                    if (i10 == 0) {
                        this.f8388n[this.f8387m - 1] = "<skipped>";
                    }
                    this.f8383h = 0;
                    break;
                case 13:
                    Q('\"');
                    if (i10 == 0) {
                        this.f8388n[this.f8387m - 1] = "<skipped>";
                    }
                    this.f8383h = 0;
                    break;
                case 14:
                    S();
                    if (i10 == 0) {
                        this.f8388n[this.f8387m - 1] = "<skipped>";
                    }
                    this.f8383h = 0;
                    break;
                case 16:
                    this.f8379d += this.f8385j;
                    this.f8383h = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i10 > 0);
        int[] iArr = this.f8389o;
        int i11 = this.f8387m - 1;
        iArr[i11] = iArr[i11] + 1;
    }

    public final void U(String str) throws e {
        StringBuilder sbO = AbstractC0112b.o(str);
        sbO.append(C());
        throw new e(sbO.toString());
    }

    public void b() {
        int iG = this.f8383h;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 3) {
            O(1);
            this.f8389o[this.f8387m - 1] = 0;
            this.f8383h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + N() + C());
        }
    }

    public void c() {
        int iG = this.f8383h;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 1) {
            O(3);
            this.f8383h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + N() + C());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f8383h = 0;
        this.f8386l[0] = 8;
        this.f8387m = 1;
        this.f8376a.close();
    }

    public final void e() throws e {
        if (this.f8377b) {
            return;
        }
        U("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0146  */
    /* JADX WARN: Code duplicated, block: B:108:0x0162  */
    /* JADX WARN: Code duplicated, block: B:110:0x016a  */
    /* JADX WARN: Code duplicated, block: B:115:0x017f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:116:0x0180  */
    /* JADX WARN: Code duplicated, block: B:119:0x0192  */
    /* JADX WARN: Code duplicated, block: B:122:0x0198  */
    /* JADX WARN: Code duplicated, block: B:125:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a9 A[PHI: r4 r15
  0x01a9: PHI (r4v10 int) = (r4v9 int), (r4v15 int) binds: [B:118:0x0190, B:125:0x01a3] A[DONT_GENERATE, DONT_INLINE]
  0x01a9: PHI (r15v3 int) = (r15v2 int), (r15v4 int) binds: [B:118:0x0190, B:125:0x01a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:128:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:130:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:168:0x0214  */
    /* JADX WARN: Code duplicated, block: B:169:0x0216  */
    /* JADX WARN: Code duplicated, block: B:181:0x0237 A[DONT_INVERT, PHI: r8
  0x0237: PHI (r8v19 int) = (r8v18 int), (r8v20 int) binds: [B:167:0x0212, B:173:0x021f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:182:0x0239  */
    /* JADX WARN: Code duplicated, block: B:195:0x0256  */
    /* JADX WARN: Code duplicated, block: B:197:0x0259  */
    /* JADX WARN: Code duplicated, block: B:200:0x025e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:204:0x0267 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:205:0x0268  */
    /* JADX WARN: Code duplicated, block: B:207:0x0272  */
    /* JADX WARN: Code duplicated, block: B:209:0x0278  */
    /* JADX WARN: Code duplicated, block: B:211:0x027e  */
    /* JADX WARN: Code duplicated, block: B:213:0x0281 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:214:0x0283  */
    /* JADX WARN: Code duplicated, block: B:216:0x0287  */
    /* JADX WARN: Code duplicated, block: B:226:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:228:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:269:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x01a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:92:0x012a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0136  */
    /* JADX WARN: Code duplicated, block: B:97:0x013d  */
    public final int g() {
        int I10;
        int i10;
        int I11;
        char c3;
        String str;
        String str2;
        int i11;
        int length;
        int i12;
        char c9;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10;
        char c10;
        int i17;
        int i18;
        int[] iArr = this.f8386l;
        int i19 = this.f8387m - 1;
        int i20 = iArr[i19];
        char[] cArr = this.f8378c;
        if (i20 == 1) {
            iArr[i19] = 2;
        } else if (i20 == 2) {
            int I12 = I(true);
            if (I12 != 44) {
                if (I12 != 59) {
                    if (I12 == 93) {
                        this.f8383h = 4;
                        return 4;
                    }
                    U("Unterminated array");
                    throw null;
                }
                e();
            }
        } else {
            if (i20 == 3 || i20 == 5) {
                iArr[i19] = 4;
                if (i20 == 5 && (I10 = I(true)) != 44) {
                    if (I10 != 59) {
                        if (I10 == 125) {
                            this.f8383h = 2;
                            return 2;
                        }
                        U("Unterminated object");
                        throw null;
                    }
                    e();
                }
                int I13 = I(true);
                if (I13 == 34) {
                    this.f8383h = 13;
                    return 13;
                }
                if (I13 == 39) {
                    e();
                    this.f8383h = 12;
                    return 12;
                }
                if (I13 == 125) {
                    if (i20 != 5) {
                        this.f8383h = 2;
                        return 2;
                    }
                    U("Expected name");
                    throw null;
                }
                e();
                this.f8379d--;
                if (B((char) I13)) {
                    this.f8383h = 14;
                    return 14;
                }
                U("Expected name");
                throw null;
            }
            if (i20 != 4) {
                if (i20 == 6) {
                    if (this.f8377b) {
                        I(true);
                        int i21 = this.f8379d;
                        this.f8379d = i21 - 1;
                        if (i21 + 4 <= this.f8380e || v(5)) {
                            int i22 = this.f8379d;
                            if (cArr[i22] == ')' && cArr[i22 + 1] == ']' && cArr[i22 + 2] == '}' && cArr[i22 + 3] == '\'' && cArr[i22 + 4] == '\n') {
                                this.f8379d = i22 + 5;
                            }
                        }
                    }
                    this.f8386l[this.f8387m - 1] = 7;
                } else if (i20 == 7) {
                    i10 = 0;
                    if (I(false) == -1) {
                        this.f8383h = 17;
                        return 17;
                    }
                    e();
                    this.f8379d--;
                } else {
                    i10 = 0;
                    if (i20 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                I11 = I(true);
                if (I11 != 34) {
                    this.f8383h = 9;
                    return 9;
                }
                if (I11 != 39) {
                    e();
                    this.f8383h = 8;
                    return 8;
                }
                if (I11 != 44 && I11 != 59) {
                    if (I11 != 91) {
                        this.f8383h = 3;
                        return 3;
                    }
                    if (I11 != 93) {
                        if (I11 != 123) {
                            this.f8383h = 1;
                            return 1;
                        }
                        int i23 = this.f8379d - 1;
                        this.f8379d = i23;
                        c3 = cArr[i23];
                        if (c3 != 't' || c3 == 'T') {
                            str = com.amazon.a.a.o.b.af;
                            str2 = "TRUE";
                            i11 = 5;
                        } else {
                            if (c3 != 'f' && c3 != 'F') {
                                if (c3 != 'n' && c3 != 'N') {
                                    i11 = i10;
                                    break;
                                }
                                str = "null";
                                str2 = "NULL";
                                i11 = 7;
                                if (i11 != 0) {
                                    return i11;
                                }
                                int i24 = this.f8379d;
                                i13 = this.f8380e;
                                i14 = i10;
                                i15 = i14;
                                int i25 = i15;
                                i16 = i24;
                                z10 = true;
                                long j10 = 0;
                                while (true) {
                                    if (i16 + i15 != i13) {
                                        c10 = cArr[i16 + i15];
                                        if (c10 != '+') {
                                            if (c10 != 'E' || c10 == 'e') {
                                                if (i14 != 2 || i14 == 4) {
                                                    i14 = 5;
                                                    i15++;
                                                }
                                            } else if (c10 == '-') {
                                                if (i14 == 0) {
                                                    i14 = 1;
                                                    i25 = 1;
                                                } else {
                                                    if (i14 != 5) {
                                                    }
                                                    i14 = 6;
                                                }
                                                i15++;
                                            } else if (c10 != '.') {
                                                if (c10 >= '0' && c10 <= '9') {
                                                    if (i14 == 1 || i14 == 0) {
                                                        j10 = -(c10 - '0');
                                                        i14 = 2;
                                                    } else if (i14 == 2) {
                                                        if (j10 != 0) {
                                                            long j11 = (10 * j10) - ((long) (c10 - '0'));
                                                            z10 &= j10 > -922337203685477580L || (j10 == -922337203685477580L && j11 < j10);
                                                            j10 = j11;
                                                        }
                                                    } else if (i14 == 3) {
                                                        i14 = 4;
                                                    } else if (i14 == 5 || i14 == 6) {
                                                        i14 = 7;
                                                    }
                                                    i15++;
                                                } else if (!B(c10)) {
                                                    i18 = 2;
                                                    if (i14 != 2) {
                                                        if (i14 != i18 || i14 == 4 || i14 == 7) {
                                                            this.f8385j = i15;
                                                            i17 = 16;
                                                            this.f8383h = 16;
                                                        }
                                                    } else if (z10 || ((j10 == Long.MIN_VALUE && i25 == 0) || (j10 == 0 && i25 != 0))) {
                                                        i18 = 2;
                                                        if (i14 != i18) {
                                                        }
                                                        this.f8385j = i15;
                                                        i17 = 16;
                                                        this.f8383h = 16;
                                                    } else {
                                                        if (i25 == 0) {
                                                            j10 = -j10;
                                                        }
                                                        this.f8384i = j10;
                                                        this.f8379d += i15;
                                                        i17 = 15;
                                                        this.f8383h = 15;
                                                    }
                                                }
                                            } else if (i14 == 2) {
                                                i14 = 3;
                                                i15++;
                                            }
                                            if (i17 != 0) {
                                                return i17;
                                            }
                                            if (B(cArr[this.f8379d])) {
                                                U("Expected value");
                                                throw null;
                                            }
                                            e();
                                            this.f8383h = 10;
                                            return 10;
                                        }
                                        if (i14 != 5) {
                                        }
                                        i14 = 6;
                                        i15++;
                                    } else if (i15 != cArr.length) {
                                        if (v(i15 + 1)) {
                                            i16 = this.f8379d;
                                            i13 = this.f8380e;
                                            c10 = cArr[i16 + i15];
                                            if (c10 != '+') {
                                                if (c10 != 'E') {
                                                    if (i14 != 2) {
                                                    }
                                                    i14 = 5;
                                                    i15++;
                                                } else {
                                                    if (i14 != 2) {
                                                    }
                                                    i14 = 5;
                                                    i15++;
                                                }
                                                if (i17 != 0) {
                                                    return i17;
                                                }
                                                if (B(cArr[this.f8379d])) {
                                                    U("Expected value");
                                                    throw null;
                                                }
                                                e();
                                                this.f8383h = 10;
                                                return 10;
                                            }
                                            if (i14 != 5) {
                                            }
                                            i14 = 6;
                                            i15++;
                                        }
                                        i18 = 2;
                                        if (i14 != 2) {
                                            if (i14 != i18) {
                                            }
                                            this.f8385j = i15;
                                            i17 = 16;
                                            this.f8383h = 16;
                                        } else {
                                            if (z10) {
                                            }
                                            i18 = 2;
                                            if (i14 != i18) {
                                            }
                                            this.f8385j = i15;
                                            i17 = 16;
                                            this.f8383h = 16;
                                        }
                                        if (i17 != 0) {
                                            return i17;
                                        }
                                        if (B(cArr[this.f8379d])) {
                                            U("Expected value");
                                            throw null;
                                        }
                                        e();
                                        this.f8383h = 10;
                                        return 10;
                                    }
                                    i17 = 0;
                                    if (i17 != 0) {
                                        return i17;
                                    }
                                    if (B(cArr[this.f8379d])) {
                                        U("Expected value");
                                        throw null;
                                    }
                                    e();
                                    this.f8383h = 10;
                                    return 10;
                                }
                            }
                            str = com.amazon.a.a.o.b.ag;
                            str2 = "FALSE";
                            i11 = 6;
                        }
                        length = str.length();
                        i12 = 1;
                        while (true) {
                            if (i12 >= length) {
                                if ((this.f8379d + length < this.f8380e && !v(length + 1)) || !B(cArr[this.f8379d + length])) {
                                    this.f8379d += length;
                                    this.f8383h = i11;
                                    break;
                                }
                                break;
                            }
                            if ((this.f8379d + i12 >= this.f8380e || v(i12 + 1)) && ((c9 = cArr[this.f8379d + i12]) == str.charAt(i12) || c9 == str2.charAt(i12))) {
                            }
                            i11 = i10;
                            break;
                        }
                        if (i11 != 0) {
                            return i11;
                        }
                        int i26 = this.f8379d;
                        i13 = this.f8380e;
                        i14 = i10;
                        i15 = i14;
                        int i27 = i15;
                        i16 = i26;
                        z10 = true;
                        long j12 = 0;
                        while (true) {
                            if (i16 + i15 != i13) {
                                c10 = cArr[i16 + i15];
                                if (c10 != '+') {
                                    if (c10 != 'E') {
                                        if (i14 != 2) {
                                        }
                                        i14 = 5;
                                        i15++;
                                    } else {
                                        if (i14 != 2) {
                                        }
                                        i14 = 5;
                                        i15++;
                                    }
                                    if (i17 != 0) {
                                        return i17;
                                    }
                                    if (B(cArr[this.f8379d])) {
                                        U("Expected value");
                                        throw null;
                                    }
                                    e();
                                    this.f8383h = 10;
                                    return 10;
                                }
                                if (i14 != 5) {
                                }
                                i14 = 6;
                                i15++;
                            } else if (i15 != cArr.length) {
                                if (v(i15 + 1)) {
                                    i16 = this.f8379d;
                                    i13 = this.f8380e;
                                    c10 = cArr[i16 + i15];
                                    if (c10 != '+') {
                                        if (c10 != 'E') {
                                            if (i14 != 2) {
                                            }
                                            i14 = 5;
                                            i15++;
                                        } else {
                                            if (i14 != 2) {
                                            }
                                            i14 = 5;
                                            i15++;
                                        }
                                        if (i17 != 0) {
                                            return i17;
                                        }
                                        if (B(cArr[this.f8379d])) {
                                            U("Expected value");
                                            throw null;
                                        }
                                        e();
                                        this.f8383h = 10;
                                        return 10;
                                    }
                                    if (i14 != 5) {
                                    }
                                    i14 = 6;
                                    i15++;
                                }
                                i18 = 2;
                                if (i14 != 2) {
                                    if (i14 != i18) {
                                    }
                                    this.f8385j = i15;
                                    i17 = 16;
                                    this.f8383h = 16;
                                } else {
                                    if (z10) {
                                    }
                                    i18 = 2;
                                    if (i14 != i18) {
                                    }
                                    this.f8385j = i15;
                                    i17 = 16;
                                    this.f8383h = 16;
                                }
                                if (i17 != 0) {
                                    return i17;
                                }
                                if (B(cArr[this.f8379d])) {
                                    U("Expected value");
                                    throw null;
                                }
                                e();
                                this.f8383h = 10;
                                return 10;
                            }
                            i17 = 0;
                            if (i17 != 0) {
                                return i17;
                            }
                            if (B(cArr[this.f8379d])) {
                                U("Expected value");
                                throw null;
                            }
                            e();
                            this.f8383h = 10;
                            return 10;
                        }
                    }
                    if (i20 == 1) {
                        this.f8383h = 4;
                        return 4;
                    }
                }
                if (i20 == 1 && i20 != 2) {
                    U("Unexpected value");
                    throw null;
                }
                e();
                this.f8379d--;
                this.f8383h = 7;
                return 7;
            }
            iArr[i19] = 5;
            int I14 = I(true);
            if (I14 != 58) {
                if (I14 != 61) {
                    U("Expected ':'");
                    throw null;
                }
                e();
                if (this.f8379d < this.f8380e || v(1)) {
                    int i28 = this.f8379d;
                    if (cArr[i28] == '>') {
                        this.f8379d = i28 + 1;
                    }
                }
            }
        }
        i10 = 0;
        I11 = I(true);
        if (I11 != 34) {
            this.f8383h = 9;
            return 9;
        }
        if (I11 != 39) {
            e();
            this.f8383h = 8;
            return 8;
        }
        if (I11 != 44) {
            if (I11 != 91) {
                this.f8383h = 3;
                return 3;
            }
            if (I11 != 93) {
                if (I11 != 123) {
                    this.f8383h = 1;
                    return 1;
                }
                int i29 = this.f8379d - 1;
                this.f8379d = i29;
                c3 = cArr[i29];
                if (c3 != 't') {
                    str = com.amazon.a.a.o.b.af;
                    str2 = "TRUE";
                    i11 = 5;
                    length = str.length();
                    i12 = 1;
                    while (true) {
                        if (i12 >= length) {
                            if (this.f8379d + length < this.f8380e) {
                            }
                            this.f8379d += length;
                            this.f8383h = i11;
                            break;
                        }
                        i12 = this.f8379d + i12 >= this.f8380e ? i12 + 1 : i12 + 1;
                    }
                    if (i11 != 0) {
                        return i11;
                    }
                    int i210 = this.f8379d;
                    i13 = this.f8380e;
                    i14 = i10;
                    i15 = i14;
                    int i211 = i15;
                    i16 = i210;
                    z10 = true;
                    long j13 = 0;
                    while (true) {
                        if (i16 + i15 != i13) {
                            c10 = cArr[i16 + i15];
                            if (c10 != '+') {
                                if (c10 != 'E') {
                                    if (i14 != 2) {
                                    }
                                    i14 = 5;
                                    i15++;
                                } else {
                                    if (i14 != 2) {
                                    }
                                    i14 = 5;
                                    i15++;
                                }
                                if (i17 != 0) {
                                    return i17;
                                }
                                if (B(cArr[this.f8379d])) {
                                    U("Expected value");
                                    throw null;
                                }
                                e();
                                this.f8383h = 10;
                                return 10;
                            }
                            if (i14 != 5) {
                            }
                            i14 = 6;
                            i15++;
                        } else if (i15 != cArr.length) {
                            if (v(i15 + 1)) {
                                i16 = this.f8379d;
                                i13 = this.f8380e;
                                c10 = cArr[i16 + i15];
                                if (c10 != '+') {
                                    if (c10 != 'E') {
                                        if (i14 != 2) {
                                        }
                                        i14 = 5;
                                        i15++;
                                    } else {
                                        if (i14 != 2) {
                                        }
                                        i14 = 5;
                                        i15++;
                                    }
                                    if (i17 != 0) {
                                        return i17;
                                    }
                                    if (B(cArr[this.f8379d])) {
                                        U("Expected value");
                                        throw null;
                                    }
                                    e();
                                    this.f8383h = 10;
                                    return 10;
                                }
                                if (i14 != 5) {
                                }
                                i14 = 6;
                                i15++;
                            }
                            i18 = 2;
                            if (i14 != 2) {
                                if (i14 != i18) {
                                }
                                this.f8385j = i15;
                                i17 = 16;
                                this.f8383h = 16;
                            } else {
                                if (z10) {
                                }
                                i18 = 2;
                                if (i14 != i18) {
                                }
                                this.f8385j = i15;
                                i17 = 16;
                                this.f8383h = 16;
                            }
                            if (i17 != 0) {
                                return i17;
                            }
                            if (B(cArr[this.f8379d])) {
                                U("Expected value");
                                throw null;
                            }
                            e();
                            this.f8383h = 10;
                            return 10;
                        }
                        i17 = 0;
                        if (i17 != 0) {
                            return i17;
                        }
                        if (B(cArr[this.f8379d])) {
                            U("Expected value");
                            throw null;
                        }
                        e();
                        this.f8383h = 10;
                        return 10;
                    }
                }
                str = com.amazon.a.a.o.b.af;
                str2 = "TRUE";
                i11 = 5;
                length = str.length();
                i12 = 1;
                while (true) {
                    if (i12 >= length) {
                        if (this.f8379d + length < this.f8380e) {
                        }
                        this.f8379d += length;
                        this.f8383h = i11;
                        break;
                    }
                    if (this.f8379d + i12 >= this.f8380e) {
                    }
                }
                if (i11 != 0) {
                    return i11;
                }
                int i212 = this.f8379d;
                i13 = this.f8380e;
                i14 = i10;
                i15 = i14;
                int i213 = i15;
                i16 = i212;
                z10 = true;
                long j14 = 0;
                while (true) {
                    if (i16 + i15 != i13) {
                        c10 = cArr[i16 + i15];
                        if (c10 != '+') {
                            if (c10 != 'E') {
                                if (i14 != 2) {
                                }
                                i14 = 5;
                                i15++;
                            } else {
                                if (i14 != 2) {
                                }
                                i14 = 5;
                                i15++;
                            }
                            if (i17 != 0) {
                                return i17;
                            }
                            if (B(cArr[this.f8379d])) {
                                U("Expected value");
                                throw null;
                            }
                            e();
                            this.f8383h = 10;
                            return 10;
                        }
                        if (i14 != 5) {
                        }
                        i14 = 6;
                        i15++;
                    } else if (i15 != cArr.length) {
                        if (v(i15 + 1)) {
                            i16 = this.f8379d;
                            i13 = this.f8380e;
                            c10 = cArr[i16 + i15];
                            if (c10 != '+') {
                                if (c10 != 'E') {
                                    if (i14 != 2) {
                                    }
                                    i14 = 5;
                                    i15++;
                                } else {
                                    if (i14 != 2) {
                                    }
                                    i14 = 5;
                                    i15++;
                                }
                                if (i17 != 0) {
                                    return i17;
                                }
                                if (B(cArr[this.f8379d])) {
                                    U("Expected value");
                                    throw null;
                                }
                                e();
                                this.f8383h = 10;
                                return 10;
                            }
                            if (i14 != 5) {
                            }
                            i14 = 6;
                            i15++;
                        }
                        i18 = 2;
                        if (i14 != 2) {
                            if (i14 != i18) {
                            }
                            this.f8385j = i15;
                            i17 = 16;
                            this.f8383h = 16;
                        } else {
                            if (z10) {
                            }
                            i18 = 2;
                            if (i14 != i18) {
                            }
                            this.f8385j = i15;
                            i17 = 16;
                            this.f8383h = 16;
                        }
                        if (i17 != 0) {
                            return i17;
                        }
                        if (B(cArr[this.f8379d])) {
                            U("Expected value");
                            throw null;
                        }
                        e();
                        this.f8383h = 10;
                        return 10;
                    }
                    i17 = 0;
                    if (i17 != 0) {
                        return i17;
                    }
                    if (B(cArr[this.f8379d])) {
                        U("Expected value");
                        throw null;
                    }
                    e();
                    this.f8383h = 10;
                    return 10;
                }
                i11 = i10;
                if (i11 != 0) {
                    return i11;
                }
                int i214 = this.f8379d;
                i13 = this.f8380e;
                i14 = i10;
                i15 = i14;
                int i215 = i15;
                i16 = i214;
                z10 = true;
                long j15 = 0;
                while (true) {
                    if (i16 + i15 != i13) {
                        c10 = cArr[i16 + i15];
                        if (c10 != '+') {
                            if (c10 != 'E') {
                                if (i14 != 2) {
                                }
                                i14 = 5;
                                i15++;
                            } else {
                                if (i14 != 2) {
                                }
                                i14 = 5;
                                i15++;
                            }
                            if (i17 != 0) {
                                return i17;
                            }
                            if (B(cArr[this.f8379d])) {
                                U("Expected value");
                                throw null;
                            }
                            e();
                            this.f8383h = 10;
                            return 10;
                        }
                        if (i14 != 5) {
                        }
                        i14 = 6;
                        i15++;
                    } else if (i15 != cArr.length) {
                        if (v(i15 + 1)) {
                            i16 = this.f8379d;
                            i13 = this.f8380e;
                            c10 = cArr[i16 + i15];
                            if (c10 != '+') {
                                if (c10 != 'E') {
                                    if (i14 != 2) {
                                    }
                                    i14 = 5;
                                    i15++;
                                } else {
                                    if (i14 != 2) {
                                    }
                                    i14 = 5;
                                    i15++;
                                }
                                if (i17 != 0) {
                                    return i17;
                                }
                                if (B(cArr[this.f8379d])) {
                                    U("Expected value");
                                    throw null;
                                }
                                e();
                                this.f8383h = 10;
                                return 10;
                            }
                            if (i14 != 5) {
                            }
                            i14 = 6;
                            i15++;
                        }
                        i18 = 2;
                        if (i14 != 2) {
                            if (i14 != i18) {
                            }
                            this.f8385j = i15;
                            i17 = 16;
                            this.f8383h = 16;
                        } else {
                            if (z10) {
                            }
                            i18 = 2;
                            if (i14 != i18) {
                            }
                            this.f8385j = i15;
                            i17 = 16;
                            this.f8383h = 16;
                        }
                        if (i17 != 0) {
                            return i17;
                        }
                        if (B(cArr[this.f8379d])) {
                            U("Expected value");
                            throw null;
                        }
                        e();
                        this.f8383h = 10;
                        return 10;
                    }
                    i17 = 0;
                    if (i17 != 0) {
                        return i17;
                    }
                    if (B(cArr[this.f8379d])) {
                        U("Expected value");
                        throw null;
                    }
                    e();
                    this.f8383h = 10;
                    return 10;
                }
            }
            if (i20 == 1) {
                this.f8383h = 4;
                return 4;
            }
        }
        if (i20 == 1) {
        }
        e();
        this.f8379d--;
        this.f8383h = 7;
        return 7;
    }

    public void l() {
        int iG = this.f8383h;
        if (iG == 0) {
            iG = g();
        }
        if (iG != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + N() + C());
        }
        int i10 = this.f8387m;
        this.f8387m = i10 - 1;
        int[] iArr = this.f8389o;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f8383h = 0;
    }

    public void q() {
        int iG = this.f8383h;
        if (iG == 0) {
            iG = g();
        }
        if (iG != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + N() + C());
        }
        int i10 = this.f8387m;
        int i11 = i10 - 1;
        this.f8387m = i11;
        this.f8388n[i11] = null;
        int[] iArr = this.f8389o;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f8383h = 0;
    }

    public String toString() {
        return getClass().getSimpleName() + C();
    }

    public final boolean v(int i10) throws IOException {
        int i11;
        int i12;
        int i13 = this.f8382g;
        int i14 = this.f8379d;
        this.f8382g = i13 - i14;
        int i15 = this.f8380e;
        char[] cArr = this.f8378c;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f8380e = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f8380e = 0;
        }
        this.f8379d = 0;
        do {
            int i17 = this.f8380e;
            int i18 = this.f8376a.read(cArr, i17, cArr.length - i17);
            if (i18 == -1) {
                return false;
            }
            i11 = this.f8380e + i18;
            this.f8380e = i11;
            if (this.f8381f == 0 && (i12 = this.f8382g) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f8379d++;
                this.f8382g = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    public String w() {
        return x(false);
    }

    public final String x(boolean z10) {
        StringBuilder sb = new StringBuilder("$");
        int i10 = 0;
        while (true) {
            int i11 = this.f8387m;
            if (i10 >= i11) {
                return sb.toString();
            }
            int i12 = this.f8386l[i10];
            if (i12 == 1 || i12 == 2) {
                int i13 = this.f8389o[i10];
                if (z10 && i13 > 0 && i10 == i11 - 1) {
                    i13--;
                }
                sb.append('[');
                sb.append(i13);
                sb.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb.append(com.amazon.a.a.o.c.a.b.f16463a);
                String str = this.f8388n[i10];
                if (str != null) {
                    sb.append(str);
                }
            }
            i10++;
        }
    }

    public String z() {
        return x(true);
    }
}
