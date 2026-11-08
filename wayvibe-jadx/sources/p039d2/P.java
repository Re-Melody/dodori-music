package p039d2;

import Q5.b;
import R8.a;
import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicBoolean;
import p069g2.g;

/* JADX INFO: loaded from: classes.dex */
public class P implements InterfaceC1904a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f19129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f19130b = new AtomicBoolean(false);

    public P(File file) {
        this.f19129a = file;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [d2.P] */
    /* JADX WARN: Type inference failed for: r9v0, types: [d2.P, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [d2.P] */
    public static Object a(P p10, c cVar) throws IllegalAccessException, IOException, InvocationTargetException {
        O o10;
        Throwable th;
        Closeable closeable;
        FileInputStream fileInputStream;
        Throwable th2;
        if (cVar instanceof O) {
            o10 = (O) cVar;
            int i10 = o10.f19128e;
            if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                o10.f19128e = i10 - MediaPlayerException.ERROR_UNKNOWN;
            } else {
                o10 = new O(p10, cVar);
            }
        } else {
            o10 = new O(p10, cVar);
        }
        Object obj = o10.f19126c;
        a aVar = a.COROUTINE_SUSPENDED;
        ?? r10 = o10.f19128e;
        g gVar = g.f20059a;
        boolean z10 = true;
        try {
            if (r10 != 0) {
                if (r10 == 1) {
                    fileInputStream = o10.f19125b;
                    r10 = (P) o10.f19124a;
                    try {
                        b.T(obj);
                        b.n(fileInputStream, null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            throw th2;
                        } catch (Throwable th4) {
                            b.n(fileInputStream, th2);
                            throw th4;
                        }
                    }
                }
                if (r10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) o10.f19124a;
                try {
                    b.T(obj);
                    b.n(closeable, null);
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    try {
                        throw th;
                    } catch (Throwable th6) {
                        b.n(closeable, th);
                        throw th6;
                    }
                }
            }
            b.T(obj);
            if (p10.f19130b.get()) {
                throw new IllegalStateException("This scope has already been closed.");
            }
            try {
                FileInputStream fileInputStream2 = new FileInputStream(p10.f19129a);
                try {
                    o10.f19124a = p10;
                    o10.f19125b = fileInputStream2;
                    o10.f19128e = 1;
                    p069g2.b bVarA = gVar.a(fileInputStream2);
                    if (bVarA != aVar) {
                        fileInputStream = fileInputStream2;
                        obj = bVarA;
                        b.n(fileInputStream, null);
                        return obj;
                    }
                } catch (Throwable th7) {
                    r10 = p10;
                    fileInputStream = fileInputStream2;
                    th2 = th7;
                    throw th2;
                }
            } catch (FileNotFoundException unused) {
                if (!p10.f19129a.exists()) {
                    return new p069g2.b(z10);
                }
                FileInputStream fileInputStream3 = new FileInputStream(p10.f19129a);
                try {
                    o10.f19124a = fileInputStream3;
                    o10.f19125b = null;
                    o10.f19128e = 2;
                    p069g2.b bVarA2 = gVar.a(fileInputStream3);
                    if (bVarA2 != aVar) {
                        obj = bVarA2;
                        closeable = fileInputStream3;
                        b.n(closeable, null);
                        return obj;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    closeable = fileInputStream3;
                    throw th;
                }
            }
            return aVar;
        } catch (FileNotFoundException unused2) {
            p10 = r10;
        }
    }

    @Override // p039d2.InterfaceC1904a
    public final void close() {
        this.f19130b.set(true);
    }
}
