package J3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6585d;

    public l(long j10, long j11, int i10, int i11) {
        this.f6582a = i10;
        this.f6583b = i11;
        this.f6584c = j10;
        this.f6585d = j11;
    }

    public static l a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            l lVar = new l(dataInputStream.readLong(), dataInputStream.readLong(), dataInputStream.readInt(), dataInputStream.readInt());
            dataInputStream.close();
            return lVar;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f6582a);
            dataOutputStream.writeInt(this.f6583b);
            dataOutputStream.writeLong(this.f6584c);
            dataOutputStream.writeLong(this.f6585d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof l)) {
            l lVar = (l) obj;
            if (this.f6583b == lVar.f6583b && this.f6584c == lVar.f6584c && this.f6582a == lVar.f6582a && this.f6585d == lVar.f6585d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f6583b), Long.valueOf(this.f6584c), Integer.valueOf(this.f6582a), Long.valueOf(this.f6585d));
    }
}
