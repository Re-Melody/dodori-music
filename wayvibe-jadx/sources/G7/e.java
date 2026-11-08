package G7;

import B2.AbstractC0112b;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class e implements o, p078h2.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f5646a;

    public static String d(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e2) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e2);
                str2 = AbstractC0112b.y(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return V0.p.B(str, " : ", str2);
    }

    public void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", d(this.f5646a, str, objArr));
        }
    }

    public void b(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", d(this.f5646a, str, objArr), remoteException);
        }
    }

    public void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", d(this.f5646a, str, objArr));
        }
    }

    @Override // p078h2.k
    public boolean v(CharSequence charSequence, int i10, int i11, p078h2.r rVar) {
        if (!TextUtils.equals(charSequence.subSequence(i10, i11), this.f5646a)) {
            return true;
        }
        rVar.f20217c = (rVar.f20217c & 3) | 4;
        return false;
    }

    @Override // G7.o
    public Object y() {
        throw new E7.n(this.f5646a);
    }

    public e(String str) {
        this.f5646a = AbstractC0112b.f("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat(str);
    }

    @Override // p078h2.k
    public Object j() {
        return this;
    }
}
