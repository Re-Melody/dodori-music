package D2;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC0202c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ContentResolver f1847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f1848f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f1849g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FileInputStream f1850h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f1851i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1852j;

    public e(Context context) {
        super(false);
        this.f1847e = context.getContentResolver();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // D2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() {
        /*
            r5 = this;
            r0 = 0
            r5.f1848f = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.f1850h     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            if (r3 == 0) goto L12
            r3.close()     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            goto L12
        Le:
            r3 = move-exception
            goto L44
        L10:
            r3 = move-exception
            goto L3e
        L12:
            r5.f1850h = r0
            android.content.res.AssetFileDescriptor r3 = r5.f1849g     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            if (r3 == 0) goto L20
            r3.close()     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            goto L20
        L1c:
            r1 = move-exception
            goto L32
        L1e:
            r3 = move-exception
            goto L2c
        L20:
            r5.f1849g = r0
            boolean r0 = r5.f1852j
            if (r0 == 0) goto L2b
            r5.f1852j = r2
            r5.b()
        L2b:
            return
        L2c:
            D2.d r4 = new D2.d     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.f1849g = r0
            boolean r0 = r5.f1852j
            if (r0 == 0) goto L3d
            r5.f1852j = r2
            r5.b()
        L3d:
            throw r1
        L3e:
            D2.d r4 = new D2.d     // Catch: java.lang.Throwable -> Le
            r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.f1850h = r0
            android.content.res.AssetFileDescriptor r4 = r5.f1849g     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            if (r4 == 0) goto L52
            r4.close()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            goto L52
        L4e:
            r1 = move-exception
            goto L64
        L50:
            r3 = move-exception
            goto L5e
        L52:
            r5.f1849g = r0
            boolean r0 = r5.f1852j
            if (r0 == 0) goto L5d
            r5.f1852j = r2
            r5.b()
        L5d:
            throw r3
        L5e:
            D2.d r4 = new D2.d     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.f1849g = r0
            boolean r0 = r5.f1852j
            if (r0 == 0) goto L6f
            r5.f1852j = r2
            r5.b()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: D2.e.close():void");
    }

    @Override // D2.h
    public final long l(k kVar) throws C0203d {
        int i10;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                Uri uriNormalizeScheme = kVar.f1865a.normalizeScheme();
                this.f1848f = uriNormalizeScheme;
                c();
                boolean zEquals = "content".equals(uriNormalizeScheme.getScheme());
                ContentResolver contentResolver = this.f1847e;
                if (zEquals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.f1849g = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i10 = 2000;
                    try {
                        throw new C0203d(2000, new IOException("Could not open file descriptor for: " + uriNormalizeScheme));
                    } catch (IOException e2) {
                        e = e2;
                        if (e instanceof FileNotFoundException) {
                            i10 = 2005;
                        }
                        throw new C0203d(i10, e);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.f1850h = fileInputStream;
                long j10 = kVar.f1869e;
                if (length != -1 && j10 > length) {
                    throw new C0203d(2008, null);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j10) - startOffset;
                if (jSkip != j10) {
                    throw new C0203d(2008, null);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f1851i = -1L;
                    } else {
                        long jPosition = size - channel.position();
                        this.f1851i = jPosition;
                        if (jPosition < 0) {
                            throw new C0203d(2008, null);
                        }
                    }
                } else {
                    long j11 = length - jSkip;
                    this.f1851i = j11;
                    if (j11 < 0) {
                        throw new C0203d(2008, null);
                    }
                }
                long j12 = kVar.f1870f;
                if (j12 != -1) {
                    long j13 = this.f1851i;
                    this.f1851i = j13 == -1 ? j12 : Math.min(j13, j12);
                }
                this.f1852j = true;
                e(kVar);
                return j12 != -1 ? j12 : this.f1851i;
            } catch (IOException e4) {
                e = e4;
                i10 = 2000;
            }
        } catch (C0203d e7) {
            throw e7;
        }
    }

    @Override // p255y2.InterfaceC2333i
    public final int read(byte[] bArr, int i10, int i11) throws C0203d {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f1851i;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i11 = (int) Math.min(j10, i11);
                } catch (IOException e2) {
                    throw new C0203d(2000, e2);
                }
            }
            FileInputStream fileInputStream = this.f1850h;
            int i12 = B2.C.f560a;
            int i13 = fileInputStream.read(bArr, i10, i11);
            if (i13 != -1) {
                long j11 = this.f1851i;
                if (j11 != -1) {
                    this.f1851i = j11 - ((long) i13);
                }
                a(i13);
                return i13;
            }
        }
        return -1;
    }

    @Override // D2.h
    public final Uri s() {
        return this.f1848f;
    }
}
