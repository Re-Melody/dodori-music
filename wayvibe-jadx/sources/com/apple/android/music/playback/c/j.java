package com.apple.android.music.playback.c;

import android.util.AtomicFile;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* JADX INFO: loaded from: classes.dex */
final class j {
    public static void a(d dVar, long j10, long j11) {
        FileOutputStream fileOutputStreamStartWrite;
        File fileH = dVar.h();
        if (fileH == null || !fileH.canWrite()) {
            return;
        }
        AtomicFile atomicFile = new AtomicFile(new File(fileH, DiagnosticsEntry.PROPERTIES_KEY));
        try {
            fileOutputStreamStartWrite = atomicFile.startWrite();
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStreamStartWrite);
                objectOutputStream.writeInt(1);
                String.format("saving: %d %d", Long.valueOf(j10), Long.valueOf(j11));
                objectOutputStream.writeLong(j10);
                objectOutputStream.writeLong(j11);
                objectOutputStream.writeLong(System.currentTimeMillis());
                objectOutputStream.flush();
                atomicFile.finishWrite(fileOutputStreamStartWrite);
            } catch (IOException unused) {
                atomicFile.failWrite(fileOutputStreamStartWrite);
            }
        } catch (IOException unused2) {
            fileOutputStreamStartWrite = null;
        }
    }

    public static long a(d dVar, long j10) throws Throwable {
        File fileH;
        ObjectInputStream objectInputStream;
        Throwable th;
        if (j10 != -1 && (fileH = dVar.h()) != null && fileH.canWrite()) {
            AtomicFile atomicFile = new AtomicFile(new File(fileH, DiagnosticsEntry.PROPERTIES_KEY));
            ObjectInputStream objectInputStream2 = null;
            try {
                objectInputStream = new ObjectInputStream(atomicFile.openRead());
                try {
                    if (objectInputStream.readInt() != 1) {
                        try {
                            objectInputStream.close();
                        } catch (IOException unused) {
                        }
                        return -1L;
                    }
                    long j11 = objectInputStream.readLong();
                    if (j11 != j10) {
                        String.format("invalid id: %d", Long.valueOf(j11));
                        try {
                            objectInputStream.close();
                        } catch (IOException unused2) {
                        }
                        return -1L;
                    }
                    long j12 = objectInputStream.readLong();
                    if (System.currentTimeMillis() - objectInputStream.readLong() > 43200000) {
                        try {
                            objectInputStream.close();
                        } catch (IOException unused3) {
                        }
                        return -1L;
                    }
                    try {
                        objectInputStream.close();
                    } catch (IOException unused4) {
                    }
                    return j12;
                } catch (IOException unused5) {
                    objectInputStream2 = objectInputStream;
                    if (objectInputStream2 != null) {
                        try {
                            objectInputStream2.close();
                        } catch (IOException unused6) {
                        }
                    }
                    return -1L;
                } catch (Throwable th2) {
                    th = th2;
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException unused7) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused8) {
            } catch (Throwable th3) {
                objectInputStream = null;
                th = th3;
            }
        }
        return -1L;
    }
}
