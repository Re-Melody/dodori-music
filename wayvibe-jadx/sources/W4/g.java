package W4;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes.dex */
public final class g implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RandomAccessFile f12811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Uri f12812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f12813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12814d;

    @Override // W4.c
    public final long a(e eVar) throws I2.a {
        try {
            Uri uri = eVar.f12798a;
            long j10 = eVar.f12800c;
            this.f12812b = uri;
            RandomAccessFile randomAccessFile = new RandomAccessFile(eVar.f12798a.getPath(), "r");
            this.f12811a = randomAccessFile;
            randomAccessFile.seek(j10);
            long length = eVar.f12801d;
            if (length == -1) {
                length = this.f12811a.length() - j10;
            }
            this.f12813c = length;
            if (length < 0) {
                throw new EOFException();
            }
            this.f12814d = true;
            return length;
        } catch (IOException e2) {
            throw new I2.a(e2);
        }
    }

    @Override // W4.c
    public final void b() {
        this.f12812b = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f12811a;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f12811a = null;
                if (this.f12814d) {
                    this.f12814d = false;
                }
            } catch (IOException e2) {
                throw new I2.a(e2);
            }
        } catch (Throwable th) {
            this.f12811a = null;
            if (this.f12814d) {
                this.f12814d = false;
            }
            throw th;
        }
    }

    @Override // W4.c
    public final int a(byte[] bArr, int i10, int i11) throws I2.a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f12813c;
        if (j10 == 0) {
            return -1;
        }
        try {
            int i12 = this.f12811a.read(bArr, i10, (int) Math.min(j10, i11));
            if (i12 > 0) {
                this.f12813c -= (long) i12;
            }
            return i12;
        } catch (IOException e2) {
            throw new I2.a(e2);
        }
    }

    @Override // W4.c
    public final Uri a() {
        return this.f12812b;
    }
}
