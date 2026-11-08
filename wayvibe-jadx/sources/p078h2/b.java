package p078h2;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.firebase.firestore.Z;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Z {
    @Override // com.google.firebase.firestore.Z
    public final Signature[] k(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
