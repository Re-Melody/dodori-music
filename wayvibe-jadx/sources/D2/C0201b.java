package D2;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: D2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0201b extends AbstractC0202c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AssetManager f1838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f1839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InputStream f1840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f1841h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1842i;

    public C0201b(Context context) {
        super(false);
        this.f1838e = context.getAssets();
    }

    @Override // D2.h
    public final void close() {
        this.f1839f = null;
        try {
            try {
                InputStream inputStream = this.f1840g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f1840g = null;
                if (this.f1842i) {
                    this.f1842i = false;
                    b();
                }
            } catch (IOException e2) {
                throw new C0200a(2000, e2);
            }
        } catch (Throwable th) {
            this.f1840g = null;
            if (this.f1842i) {
                this.f1842i = false;
                b();
            }
            throw th;
        }
    }

    @Override // D2.h
    public final long l(k kVar) throws C0200a {
        try {
            Uri uri = kVar.f1865a;
            long j10 = kVar.f1869e;
            this.f1839f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            c();
            InputStream inputStreamOpen = this.f1838e.open(path, 1);
            this.f1840g = inputStreamOpen;
            if (inputStreamOpen.skip(j10) < j10) {
                throw new C0200a(2008, null);
            }
            long j11 = kVar.f1870f;
            if (j11 != -1) {
                this.f1841h = j11;
            } else {
                long jAvailable = this.f1840g.available();
                this.f1841h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f1841h = -1L;
                }
            }
            this.f1842i = true;
            e(kVar);
            return this.f1841h;
        } catch (C0200a e2) {
            throw e2;
        } catch (IOException e4) {
            throw new C0200a(e4 instanceof FileNotFoundException ? 2005 : 2000, e4);
        }
    }

    @Override // p255y2.InterfaceC2333i
    public final int read(byte[] bArr, int i10, int i11) throws C0200a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f1841h;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i11 = (int) Math.min(j10, i11);
                } catch (IOException e2) {
                    throw new C0200a(2000, e2);
                }
            }
            InputStream inputStream = this.f1840g;
            int i12 = B2.C.f560a;
            int i13 = inputStream.read(bArr, i10, i11);
            if (i13 != -1) {
                long j11 = this.f1841h;
                if (j11 != -1) {
                    this.f1841h = j11 - ((long) i13);
                }
                a(i13);
                return i13;
            }
        }
        return -1;
    }

    @Override // D2.h
    public final Uri s() {
        return this.f1839f;
    }
}
