package D8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: D8.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0312s1 extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2778a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2779b;

    public C0312s1(FileOutputStream fileOutputStream) {
        this.f2779b = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.f2778a) {
            case 1:
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        switch (this.f2778a) {
            case 1:
                ((FileOutputStream) this.f2779b).flush();
                break;
            default:
                super.flush();
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        switch (this.f2778a) {
            case 0:
                write(new byte[]{(byte) i10}, 0, 1);
                break;
            default:
                ((FileOutputStream) this.f2779b).write(i10);
                break;
        }
    }

    public C0312s1(C0315t1 c0315t1) {
        this.f2779b = c0315t1;
    }

    @Override // java.io.OutputStream
    public void write(byte[] b10) throws IOException {
        switch (this.f2778a) {
            case 1:
                kotlin.jvm.internal.m.f(b10, "b");
                ((FileOutputStream) this.f2779b).write(b10);
                break;
            default:
                super.write(b10);
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bytes, int i10, int i11) {
        switch (this.f2778a) {
            case 0:
                ((C0315t1) this.f2779b).h(bytes, i10, i11);
                break;
            default:
                kotlin.jvm.internal.m.f(bytes, "bytes");
                ((FileOutputStream) this.f2779b).write(bytes, i10, i11);
                break;
        }
    }

    private final void b() {
    }
}
