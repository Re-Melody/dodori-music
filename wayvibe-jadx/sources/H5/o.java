package H5;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.common.internal.V;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class o extends zzb implements V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6060a;

    public o(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        E.c(bArr.length == 25);
        this.f6060a = Arrays.hashCode(bArr);
    }

    public static byte[] d0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    public abstract byte[] O();

    public final boolean equals(Object obj) {
        if (obj instanceof V) {
            try {
                V v3 = (V) obj;
                if (((o) v3).f6060a == this.f6060a) {
                    return Arrays.equals(O(), (byte[]) R5.b.d0(new R5.b(((o) v3).O())));
                }
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6060a;
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            R5.b bVar = new R5.b(O());
            parcel2.writeNoException();
            zzc.zze(parcel2, bVar);
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f6060a);
        return true;
    }
}
