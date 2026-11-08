package T3;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class i extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Pattern f11604d;

    public i() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.f11604d = Pattern.compile("\\A\\d+");
    }

    @Override // T3.c
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // T3.c
    public final boolean b() {
        int i10;
        PackageInfo packageInfoC;
        boolean zB = super.b();
        if (!zB || (i10 = Build.VERSION.SDK_INT) >= 29) {
            return zB;
        }
        WeakHashMap weakHashMap = S3.e.f11087a;
        if (i10 >= 26) {
            packageInfoC = WebView.getCurrentWebViewPackage();
        } else {
            try {
                packageInfoC = S3.e.c();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                packageInfoC = null;
            }
        }
        if (packageInfoC != null) {
            Matcher matcher = this.f11604d.matcher(packageInfoC.versionName);
            if (matcher.find() && Integer.parseInt(packageInfoC.versionName.substring(matcher.start(), matcher.end())) >= 105) {
                return true;
            }
        }
        return false;
    }
}
