package H1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p199t.G;
import p199t.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f5751a = new n(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f5752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f5753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final G f5754d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new j());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f5752b = threadPoolExecutor;
        f5753c = new Object();
        f5754d = new G(0);
    }

    public static String a(int i10, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            sb.append(((c) list.get(i11)).f5741h);
            sb.append("-");
            sb.append(i10);
            if (i11 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static f b(String str, Context context, List list, int i10) {
        int i11;
        Typeface typefaceN;
        Trace.beginSection(p046da.b.g0("getFontSync"));
        n nVar = f5751a;
        try {
            Typeface typeface = (Typeface) nVar.get(str);
            if (typeface != null) {
                f fVar = new f(typeface);
                Trace.endSection();
                return fVar;
            }
            try {
                D4.e eVarA = b.a(context, list);
                int i12 = eVarA.f1956a;
                List list2 = eVarA.f1957b;
                if (i12 == 0) {
                    h[] hVarArr = (h[]) list2.get(0);
                    if (hVarArr == null || hVarArr.length == 0) {
                        i11 = 1;
                    } else {
                        int length = hVarArr.length;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= length) {
                                i11 = 0;
                                break;
                            }
                            int i14 = hVarArr[i13].f5760f;
                            if (i14 != 0) {
                                if (i14 >= 0) {
                                    i11 = i14;
                                    break;
                                }
                                i11 = -3;
                                break;
                            }
                            i13++;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        i11 = -3;
                        break;
                    }
                    i11 = -2;
                }
                if (i11 != 0) {
                    f fVar2 = new f(i11);
                    Trace.endSection();
                    return fVar2;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    h[] hVarArr2 = (h[]) list2.get(0);
                    p046da.b bVar = B1.h.f538a;
                    Trace.beginSection(p046da.b.g0("TypefaceCompat.createFromFontInfo"));
                    try {
                        typefaceN = B1.h.f538a.n(context, hVarArr2, i10);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    p046da.b bVar2 = B1.h.f538a;
                    Trace.beginSection(p046da.b.g0("TypefaceCompat.createFromFontInfoWithFallback"));
                    try {
                        typefaceN = B1.h.f538a.o(context, list2, i10);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (typefaceN == null) {
                    f fVar3 = new f(-3);
                    Trace.endSection();
                    return fVar3;
                }
                nVar.put(str, typefaceN);
                f fVar4 = new f(typefaceN);
                Trace.endSection();
                return fVar4;
            } catch (PackageManager.NameNotFoundException unused) {
                f fVar5 = new f(-1);
                Trace.endSection();
                return fVar5;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
