package T3;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f11615a;

    static {
        n eVar;
        try {
            eVar = new A.n((WebViewProviderFactoryBoundaryInterface) S9.b.h(WebViewProviderFactoryBoundaryInterface.class, p242x0.c.m()));
        } catch (ClassNotFoundException unused) {
            eVar = new e();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
        f11615a = eVar;
    }
}
