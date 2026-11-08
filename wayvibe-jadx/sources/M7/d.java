package M7;

import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class d implements Closeable, Flushable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f8390i = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f8391j = new String[ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD];
    public static final String[] k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Writer f8392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f8393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f8398g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8399h;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f8391j[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f8391j;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        k = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public d(Writer writer) {
        int[] iArr = new int[32];
        this.f8393b = iArr;
        this.f8394c = 0;
        if (iArr.length == 0) {
            this.f8393b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f8393b;
        int i10 = this.f8394c;
        this.f8394c = i10 + 1;
        iArr2[i10] = 6;
        this.f8395d = ":";
        this.f8399h = true;
        Objects.requireNonNull(writer, "out == null");
        this.f8392a = writer;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    public final void A(String str) throws IOException {
        String str2;
        String[] strArr = this.f8397f ? k : f8391j;
        Writer writer = this.f8392a;
        writer.write(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        writer.write(str, i10, i11 - i10);
                    }
                    writer.write(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    writer.write(str, i10, i11 - i10);
                }
                writer.write(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            writer.write(str, i10, length - i10);
        }
        writer.write(34);
    }

    public void B(double d10) throws IOException {
        H();
        if (this.f8396e || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            b();
            this.f8392a.append((CharSequence) Double.toString(d10));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
    }

    public void C(long j10) throws IOException {
        H();
        b();
        this.f8392a.write(Long.toString(j10));
    }

    public void D(Boolean bool) throws IOException {
        if (bool == null) {
            x();
            return;
        }
        H();
        b();
        this.f8392a.write(bool.booleanValue() ? com.amazon.a.a.o.b.af : com.amazon.a.a.o.b.ag);
    }

    public void E(Number number) throws IOException {
        if (number == null) {
            x();
            return;
        }
        H();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !f8390i.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        } else if (!this.f8396e) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
        }
        b();
        this.f8392a.append((CharSequence) string);
    }

    public void F(String str) throws IOException {
        if (str == null) {
            x();
            return;
        }
        H();
        b();
        A(str);
    }

    public void G(boolean z10) throws IOException {
        H();
        b();
        this.f8392a.write(z10 ? com.amazon.a.a.o.b.af : com.amazon.a.a.o.b.ag);
    }

    public final void H() throws IOException {
        if (this.f8398g != null) {
            int iZ = z();
            if (iZ == 5) {
                this.f8392a.write(44);
            } else if (iZ != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            w();
            this.f8393b[this.f8394c - 1] = 4;
            A(this.f8398g);
            this.f8398g = null;
        }
    }

    public final void b() throws IOException {
        int iZ = z();
        if (iZ == 1) {
            this.f8393b[this.f8394c - 1] = 2;
            w();
            return;
        }
        Writer writer = this.f8392a;
        if (iZ == 2) {
            writer.append(',');
            w();
        } else {
            if (iZ == 4) {
                writer.append((CharSequence) this.f8395d);
                this.f8393b[this.f8394c - 1] = 5;
                return;
            }
            if (iZ != 6) {
                if (iZ != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f8396e) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f8393b[this.f8394c - 1] = 7;
        }
    }

    public void c() throws IOException {
        H();
        b();
        int i10 = this.f8394c;
        int[] iArr = this.f8393b;
        if (i10 == iArr.length) {
            this.f8393b = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f8393b;
        int i11 = this.f8394c;
        this.f8394c = i11 + 1;
        iArr2[i11] = 1;
        this.f8392a.write(91);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f8392a.close();
        int i10 = this.f8394c;
        if (i10 > 1 || (i10 == 1 && this.f8393b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f8394c = 0;
    }

    public void e() throws IOException {
        H();
        b();
        int i10 = this.f8394c;
        int[] iArr = this.f8393b;
        if (i10 == iArr.length) {
            this.f8393b = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f8393b;
        int i11 = this.f8394c;
        this.f8394c = i11 + 1;
        iArr2[i11] = 3;
        this.f8392a.write(123);
    }

    public void flush() throws IOException {
        if (this.f8394c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f8392a.flush();
    }

    public final void g(char c3, int i10, int i11) throws IOException {
        int iZ = z();
        if (iZ != i11 && iZ != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f8398g != null) {
            throw new IllegalStateException("Dangling name: " + this.f8398g);
        }
        this.f8394c--;
        if (iZ == i11) {
            w();
        }
        this.f8392a.write(c3);
    }

    public void l() throws IOException {
        g(']', 1, 2);
    }

    public void q() throws IOException {
        g('}', 3, 5);
    }

    public void v(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f8398g != null) {
            throw new IllegalStateException();
        }
        if (this.f8394c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f8398g = str;
    }

    public d x() throws IOException {
        if (this.f8398g != null) {
            if (!this.f8399h) {
                this.f8398g = null;
                return this;
            }
            H();
        }
        b();
        this.f8392a.write("null");
        return this;
    }

    public final int z() {
        int i10 = this.f8394c;
        if (i10 != 0) {
            return this.f8393b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void w() {
    }
}
