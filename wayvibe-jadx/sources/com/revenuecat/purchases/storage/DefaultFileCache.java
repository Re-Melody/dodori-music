package com.revenuecat.purchases.storage;

import D7.W;
import M8.h;
import Q5.b;
import X8.l;
import android.content.Context;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.networking.ETagPayloadStore;
import com.revenuecat.purchases.models.Checksum;
import com.revenuecat.purchases.models.ChecksumKt;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p097i9.a;
import p097i9.k;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultFileCache implements LocalFileCache {
    private static final int BUFFER_SIZE = 262144;
    public static final Companion Companion = new Companion(null);
    public static final String DEFAULT_SUBDIR = "rc_files";
    private final h cacheDir$delegate;
    private final Context context;
    private final String subDir;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    public DefaultFileCache(Context context, String subDir) {
        m.f(context, "context");
        m.f(subDir, "subDir");
        this.context = context;
        this.subDir = subDir;
        this.cacheDir$delegate = W.S(new DefaultFileCache$cacheDir$2(this));
    }

    private final File getCacheDir() {
        return (File) this.cacheDir$delegate.getValue();
    }

    private final boolean isFalse(boolean z10) {
        return !z10;
    }

    private final void streamToFile(InputStream inputStream, File file) throws IllegalAccessException, IOException, InvocationTargetException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            W.s(inputStream, fileOutputStream, 262144);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                b.n(fileOutputStream, th);
                throw th2;
            }
        }
    }

    private final boolean streamToFileAndCompareChecksum(InputStream inputStream, File file, Checksum checksum) throws IllegalAccessException, NoSuchAlgorithmException, IOException, InvocationTargetException {
        MessageDigest messageDigest = MessageDigest.getInstance(checksum.getAlgorithm().getAlgorithmName());
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            byte[] bArr = new byte[262144];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    byte[] hash = messageDigest.digest();
                    Checksum.Algorithm algorithm = checksum.getAlgorithm();
                    m.e(hash, "hash");
                    return checksum.equals(new Checksum(algorithm, ChecksumKt.toHexString(hash)));
                }
                messageDigest.update(bArr, 0, i10);
                fileOutputStream.write(bArr, 0, i10);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                b.n(fileOutputStream, th);
                throw th2;
            }
        }
    }

    @Override // com.revenuecat.purchases.storage.LocalFileCache
    public boolean cachedContentExists(URI uri) {
        m.f(uri, "uri");
        return new File(uri).exists();
    }

    @Override // com.revenuecat.purchases.storage.LocalFileCache
    public URI generateLocalFilesystemURI(URL remoteURL, Checksum checksum) {
        String value;
        m.f(remoteURL, "remoteURL");
        String string = remoteURL.toString();
        m.e(string, "remoteURL.toString()");
        byte[] bytes = string.getBytes(a.f20563a);
        m.e(bytes, "getBytes(...)");
        String strMd5Hex = UtilsKt.md5Hex(bytes);
        StringBuilder sb = new StringBuilder();
        sb.append(new File(strMd5Hex).getName());
        if (checksum == null || (value = checksum.getValue()) == null) {
            value = "";
        }
        sb.append(value);
        String string2 = sb.toString();
        if (string2.length() == 0) {
            return null;
        }
        String path = remoteURL.getPath();
        m.e(path, "remoteURL.path");
        return new File(getCacheDir(), string2 + com.amazon.a.a.o.c.a.b.f16463a + k.N0(com.amazon.a.a.o.c.a.b.f16463a, path, "")).toURI();
    }

    @Override // com.revenuecat.purchases.storage.LocalFileCache
    public void saveData(InputStream inputStream, URI uri, Checksum checksum) throws IOException {
        m.f(inputStream, "inputStream");
        m.f(uri, "uri");
        File file = new File(uri);
        File tempFile = File.createTempFile("rc_download_", ETagPayloadStore.TEMP_SUFFIX, file.getParentFile());
        try {
            if (checksum != null) {
                m.e(tempFile, "tempFile");
                if (isFalse(streamToFileAndCompareChecksum(inputStream, tempFile, checksum))) {
                    tempFile.delete();
                    return;
                }
            } else {
                m.e(tempFile, "tempFile");
                streamToFile(inputStream, tempFile);
            }
            if (!tempFile.renameTo(file)) {
                l.n0(tempFile, file);
            }
        } catch (Exception e2) {
            LogLevel logLevel = LogLevel.VERBOSE;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.v("[Purchases] - " + logLevel.name(), "Failed to copy temp file to final file: " + e2.getMessage());
            }
            file.delete();
        } finally {
            tempFile.delete();
        }
    }

    public /* synthetic */ DefaultFileCache(Context context, String str, int i10, f fVar) {
        this(context, (i10 & 2) != 0 ? DEFAULT_SUBDIR : str);
    }
}
