package D2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z extends AbstractC0202c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f1910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k f1911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f1912g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FileInputStream f1913h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f1914i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1915j;

    public z(Context context) {
        super(false);
        this.f1910e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
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
            r5.f1911f = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.f1913h     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
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
            r5.f1913h = r0
            android.content.res.AssetFileDescriptor r3 = r5.f1912g     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
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
            r5.f1912g = r0
            boolean r0 = r5.f1915j
            if (r0 == 0) goto L2b
            r5.f1915j = r2
            r5.b()
        L2b:
            return
        L2c:
            D2.y r4 = new D2.y     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.f1912g = r0
            boolean r0 = r5.f1915j
            if (r0 == 0) goto L3d
            r5.f1915j = r2
            r5.b()
        L3d:
            throw r1
        L3e:
            D2.y r4 = new D2.y     // Catch: java.lang.Throwable -> Le
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.f1913h = r0
            android.content.res.AssetFileDescriptor r4 = r5.f1912g     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
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
            r5.f1912g = r0
            boolean r0 = r5.f1915j
            if (r0 == 0) goto L5d
            r5.f1915j = r2
            r5.b()
        L5d:
            throw r3
        L5e:
            D2.y r4 = new D2.y     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.f1912g = r0
            boolean r0 = r5.f1915j
            if (r0 == 0) goto L6f
            r5.f1915j = r2
            r5.b()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: D2.z.close():void");
    }

    @Override // D2.h
    public final long l(k kVar) throws y {
        Resources resourcesForApplication;
        int identifier;
        int i10;
        Resources resources;
        this.f1911f = kVar;
        c();
        Uri uriNormalizeScheme = kVar.f1865a.normalizeScheme();
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Context context = this.f1910e;
        if (zEquals) {
            resources = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new y("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
            try {
                i10 = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new y("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new y("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new y("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e2, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new y("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                identifier = resourcesForApplication.getIdentifier(V0.p.B(packageName, ":", path), "raw", null);
                if (identifier == 0) {
                    throw new y("Resource not found.", null, 2005);
                }
            }
            i10 = identifier;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(i10);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new y("Resource is compressed: " + uriNormalizeScheme, null, 2000);
            }
            this.f1912g = assetFileDescriptorOpenRawResourceFd;
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.f1912g.getFileDescriptor());
            this.f1913h = fileInputStream;
            long j10 = kVar.f1869e;
            try {
                if (length != -1 && j10 > length) {
                    throw new y(null, null, 2008);
                }
                long startOffset = this.f1912g.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j10) - startOffset;
                if (jSkip != j10) {
                    throw new y(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.f1914i = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.f1914i = size;
                        if (size < 0) {
                            throw new y(null, null, 2008);
                        }
                    }
                } else {
                    long j11 = length - jSkip;
                    this.f1914i = j11;
                    if (j11 < 0) {
                        throw new i(2008);
                    }
                }
                long j12 = kVar.f1870f;
                if (j12 != -1) {
                    long j13 = this.f1914i;
                    this.f1914i = j13 == -1 ? j12 : Math.min(j13, j12);
                }
                this.f1915j = true;
                e(kVar);
                return j12 != -1 ? j12 : this.f1914i;
            } catch (y e4) {
                throw e4;
            } catch (IOException e7) {
                throw new y(null, e7, 2000);
            }
        } catch (Resources.NotFoundException e10) {
            throw new y(null, e10, 2005);
        }
    }

    @Override // p255y2.InterfaceC2333i
    public final int read(byte[] bArr, int i10, int i11) throws y {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f1914i;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i11 = (int) Math.min(j10, i11);
                } catch (IOException e2) {
                    throw new y(null, e2, 2000);
                }
            }
            FileInputStream fileInputStream = this.f1913h;
            int i12 = B2.C.f560a;
            int i13 = fileInputStream.read(bArr, i10, i11);
            if (i13 != -1) {
                long j11 = this.f1914i;
                if (j11 != -1) {
                    this.f1914i = j11 - ((long) i13);
                }
                a(i13);
                return i13;
            }
            if (this.f1914i != -1) {
                throw new y("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }

    @Override // D2.h
    public final Uri s() {
        k kVar = this.f1911f;
        if (kVar != null) {
            return kVar.f1865a;
        }
        return null;
    }
}
