package T3;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class j extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11605e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, String str2, int i10) {
        super(str, str2, 2);
        this.f11605e = i10;
    }

    @Override // T3.c
    public final boolean b() {
        PackageInfo packageInfoC;
        switch (this.f11605e) {
            case 0:
                if (!super.b()) {
                    return false;
                }
                WeakHashMap weakHashMap = S3.e.f11087a;
                if (Build.VERSION.SDK_INT < 26) {
                    try {
                        packageInfoC = S3.e.c();
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                        packageInfoC = null;
                    }
                    break;
                } else {
                    packageInfoC = WebView.getCurrentWebViewPackage();
                }
                if (packageInfoC == null) {
                    return false;
                }
                return (Build.VERSION.SDK_INT >= 28 ? C1.b.d(packageInfoC) : (long) packageInfoC.versionCode) >= 636700000;
            case 1:
                if (!super.b() || !R3.a.Q("MULTI_PROCESS")) {
                    return false;
                }
                WeakHashMap weakHashMap2 = S3.e.f11087a;
                if (k.f11607b.b()) {
                    return l.f11615a.getStatics().isMultiProcessEnabled();
                }
                throw k.a();
            default:
                if (R3.a.Q("MULTI_PROFILE")) {
                    return super.b();
                }
                return false;
        }
    }
}
