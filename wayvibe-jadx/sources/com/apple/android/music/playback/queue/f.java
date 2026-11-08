package com.apple.android.music.playback.queue;

import android.util.AtomicFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* JADX INFO: loaded from: classes.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.apple.android.music.playback.c.d f17538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f17539b;

    public f(com.apple.android.music.playback.c.d dVar, b bVar) {
        this.f17538a = dVar;
        this.f17539b = bVar;
    }

    public void a() throws Throwable {
        File fileG = this.f17538a.g();
        if (fileG == null || !fileG.canRead()) {
            new FileNotFoundException("Invalid directory for playback queue storage");
            this.f17539b.o();
            return;
        }
        try {
            a(fileG);
            b(fileG);
            this.f17539b.o();
        } catch (IOException e2) {
            this.f17539b.a(e2);
        } catch (ClassNotFoundException e4) {
            this.f17539b.a(e4);
        }
    }

    public void b() {
        FileOutputStream fileOutputStreamStartWrite;
        File fileG = this.f17538a.g();
        if (fileG == null || !fileG.canWrite()) {
            return;
        }
        AtomicFile atomicFile = new AtomicFile(new File(fileG, "queue_properties"));
        try {
            fileOutputStreamStartWrite = atomicFile.startWrite();
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStreamStartWrite);
                objectOutputStream.writeInt(1);
                this.f17539b.a(objectOutputStream);
                objectOutputStream.flush();
                atomicFile.finishWrite(fileOutputStreamStartWrite);
            } catch (IOException unused) {
                atomicFile.failWrite(fileOutputStreamStartWrite);
            }
        } catch (IOException unused2) {
            fileOutputStreamStartWrite = null;
        }
    }

    public void c() {
        FileOutputStream fileOutputStreamStartWrite;
        File fileG = this.f17538a.g();
        if (fileG == null || !fileG.canWrite()) {
            return;
        }
        AtomicFile atomicFile = new AtomicFile(new File(fileG, "queue_items"));
        try {
            fileOutputStreamStartWrite = atomicFile.startWrite();
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStreamStartWrite);
                objectOutputStream.writeInt(1);
                this.f17539b.b(objectOutputStream);
                objectOutputStream.flush();
                atomicFile.finishWrite(fileOutputStreamStartWrite);
            } catch (IOException unused) {
                atomicFile.failWrite(fileOutputStreamStartWrite);
            }
        } catch (IOException unused2) {
            fileOutputStreamStartWrite = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.ObjectInputStream] */
    private void a(File file) throws Throwable {
        Throwable th;
        ?? file2 = new File(file, "queue_items");
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(new AtomicFile(file2).openRead());
                try {
                    if (objectInputStream.readInt() != 1) {
                        this.f17539b.a(new IllegalStateException());
                    } else {
                        this.f17539b.b(objectInputStream);
                    }
                    try {
                        objectInputStream.close();
                    } catch (IOException unused) {
                    }
                } catch (IOException e2) {
                } catch (ClassNotFoundException e4) {
                }
            } catch (IOException e7) {
                throw e7;
            } catch (ClassNotFoundException e10) {
                throw e10;
            } catch (Throwable th2) {
                file2 = 0;
                th = th2;
                if (file2 != 0) {
                    try {
                        file2.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            if (file2 != 0) {
                file2.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.ObjectInputStream] */
    private void b(File file) throws Throwable {
        Throwable th;
        ?? file2 = new File(file, "queue_properties");
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(new AtomicFile(file2).openRead());
                try {
                    if (objectInputStream.readInt() != 1) {
                        this.f17539b.a(new IllegalStateException());
                    } else {
                        this.f17539b.a(objectInputStream);
                    }
                    try {
                        objectInputStream.close();
                    } catch (IOException unused) {
                    }
                } catch (IOException e2) {
                }
            } catch (IOException e4) {
                throw e4;
            } catch (Throwable th2) {
                file2 = 0;
                th = th2;
                if (file2 != 0) {
                    try {
                        file2.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            if (file2 != 0) {
                file2.close();
            }
            throw th;
        }
    }
}
