package G9;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f5698a;

    static {
        char c3 = File.separatorChar;
        f5698a = new byte[0];
        System.lineSeparator();
        d.LF.getClass();
        d.CRLF.getClass();
        final int i10 = 0;
        final Supplier supplier = new Supplier() { // from class: G9.a
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i10) {
                    case 0:
                        return new byte[8192];
                    default:
                        return new char[8192];
                }
            }
        };
        final int i11 = 0;
        new ThreadLocal() { // from class: G9.b
            @Override // java.lang.ThreadLocal
            public final Object initialValue() {
                switch (i11) {
                    case 0:
                        ((a) supplier).getClass();
                        return new byte[8192];
                    default:
                        ((a) supplier).getClass();
                        return new char[8192];
                }
            }
        };
        final int i12 = 1;
        final Supplier supplier2 = new Supplier() { // from class: G9.a
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i12) {
                    case 0:
                        return new byte[8192];
                    default:
                        return new char[8192];
                }
            }
        };
        final int i13 = 1;
        new ThreadLocal() { // from class: G9.b
            @Override // java.lang.ThreadLocal
            public final Object initialValue() {
                switch (i13) {
                    case 0:
                        ((a) supplier2).getClass();
                        return new byte[8192];
                    default:
                        ((a) supplier2).getClass();
                        return new char[8192];
                }
            }
        };
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static int b(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        Objects.requireNonNull(inputStream, "inputStream");
        Objects.requireNonNull(outputStream, "outputStream");
        long j10 = 0;
        while (true) {
            int i10 = inputStream.read(bArr);
            if (-1 == i10) {
                break;
            }
            outputStream.write(bArr, 0, i10);
            j10 += (long) i10;
        }
        if (j10 > 2147483647L) {
            return -1;
        }
        return (int) j10;
    }
}
