package D2;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes.dex */
public final class s extends AbstractC0202c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RandomAccessFile f1902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f1903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f1904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1905h;

    @Override // D2.h
    public final void close() {
        this.f1903f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f1902e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f1902e = null;
                if (this.f1905h) {
                    this.f1905h = false;
                    b();
                }
            } catch (IOException e2) {
                throw new r(2000, e2);
            }
        } catch (Throwable th) {
            this.f1902e = null;
            if (this.f1905h) {
                this.f1905h = false;
                b();
            }
            throw th;
        }
    }

    @Override // D2.h
    public final long l(k kVar) throws r {
        Uri uri = kVar.f1865a;
        long j10 = kVar.f1869e;
        this.f1903f = uri;
        c();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f1902e = randomAccessFile;
            try {
                randomAccessFile.seek(j10);
                long length = kVar.f1870f;
                if (length == -1) {
                    length = this.f1902e.length() - j10;
                }
                this.f1904g = length;
                if (length < 0) {
                    throw new r(null, null, 2008);
                }
                this.f1905h = true;
                e(kVar);
                return this.f1904g;
            } catch (IOException e2) {
                throw new r(2000, e2);
            }
        } catch (FileNotFoundException e4) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new r((B2.C.f560a < 21 || !q.b(e4.getCause())) ? 2005 : 2006, e4);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbQ = p134m1.b.q("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbQ.append(fragment);
            throw new r(sbQ.toString(), e4, 1004);
        } catch (SecurityException e7) {
            throw new r(2006, e7);
        } catch (RuntimeException e10) {
            throw new r(2000, e10);
        }
    }

    @Override // p255y2.InterfaceC2333i
    public final int read(byte[] bArr, int i10, int i11) throws r {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f1904g;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f1902e;
            int i12 = B2.C.f560a;
            int i13 = randomAccessFile.read(bArr, i10, (int) Math.min(j10, i11));
            if (i13 > 0) {
                this.f1904g -= (long) i13;
                a(i13);
            }
            return i13;
        } catch (IOException e2) {
            throw new r(2000, e2);
        }
    }

    @Override // D2.h
    public final Uri s() {
        return this.f1903f;
    }
}
