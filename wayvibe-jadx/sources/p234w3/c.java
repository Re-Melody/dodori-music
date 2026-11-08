package p234w3;

import B.n;
import B2.e;
import G.C0449n;
import G0.AbstractC0507w0;
import U.C0896l;
import U.C0906q;
import U.InterfaceC0898m;
import V0.p;
import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import androidx.compose.foundation.gestures.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.app.AbstractC1036f;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import p028c1.k;
import p067g0.r;
import p241x.C;
import p241x.C2311n;
import p241x.o0;
import p241x.p0;
import p241x.q0;
import p241x.r0;
import p261z.EnumC2391a0;
import p261z.InterfaceC2432v0;
import p261z.X;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static int a(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, AbstractC1036f.a(context)) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static boolean b(String str) {
        return str == null || str.isEmpty();
    }

    public static String c(String str, Object... objArr) {
        int iIndexOf;
        String string;
        String strValueOf = String.valueOf(str);
        int i10 = 0;
        for (int i11 = 0; i11 < objArr.length; i11++) {
            Object obj = objArr[i11];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e2) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e2);
                    StringBuilder sbU = p.u("<", str2, " threw ");
                    sbU.append(e2.getClass().getName());
                    sbU.append(">");
                    string = sbU.toString();
                }
            }
            objArr[i11] = string;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i12 = 0;
        while (i10 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i12)) != -1) {
            sb.append((CharSequence) strValueOf, i12, iIndexOf);
            sb.append(objArr[i10]);
            i12 = iIndexOf + 2;
            i10++;
        }
        sb.append((CharSequence) strValueOf, i12, strValueOf.length());
        if (i10 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb.append(", ");
                sb.append(objArr[i13]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static void d(e eVar, int i10, e eVar2) {
        long jG = eVar.g(i10);
        List listN = eVar.n(jG);
        if (listN.isEmpty()) {
            return;
        }
        if (i10 == eVar.r() - 1) {
            throw new IllegalStateException();
        }
        long jG2 = eVar.g(i10 + 1) - eVar.g(i10);
        if (jG2 > 0) {
            eVar2.accept(new a(listN, jG, jG2));
        }
    }

    public static final r e(r rVar, InterfaceC2432v0 interfaceC2432v0, EnumC2391a0 enumC2391a0, boolean z10, X x10, n nVar, C0449n c0449n, InterfaceC0898m interfaceC0898m, int i10) {
        r0 r0Var;
        if ((i10 & 64) != 0) {
            c0449n = null;
        }
        C0449n c0449n2 = c0449n;
        C0906q c0906q = (C0906q) interfaceC0898m;
        Context context = (Context) c0906q.k(AndroidCompositionLocals_androidKt.f14838b);
        p0 p0Var = (p0) c0906q.k(q0.f28280a);
        if (p0Var != null) {
            c0906q.T(1586021609);
            boolean zF = c0906q.f(context) | c0906q.f(p0Var);
            Object objI = c0906q.I();
            if (zF || objI == C0896l.f11886a) {
                objI = new C2311n(context, p0Var);
                c0906q.d0(objI);
            }
            r0Var = (C2311n) objI;
            c0906q.q(false);
        } else {
            c0906q.T(1586120933);
            c0906q.q(false);
            r0Var = o0.f28265b;
        }
        r0 r0Var2 = r0Var;
        EnumC2391a0 enumC2391a1 = EnumC2391a0.Vertical;
        return a.b(rVar.then(enumC2391a0 == enumC2391a1 ? C.f28104c : C.f28103b).then(r0Var2.c()), interfaceC2432v0, enumC2391a0, r0Var2, z10, ((k) c0906q.k(AbstractC0507w0.f5316l)) != k.Rtl || enumC2391a0 == enumC2391a1, x10, nVar, c0449n2);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    public static void f(e eVar, l lVar, e eVar2) {
        int iF;
        boolean z10;
        long j10 = lVar.f27873a;
        if (j10 == -9223372036854775807L) {
            iF = 0;
        } else {
            iF = eVar.f(j10);
            if (iF == -1) {
                iF = eVar.r();
            }
            if (iF > 0 && eVar.g(iF - 1) == j10) {
                iF--;
            }
        }
        if (j10 == -9223372036854775807L || iF >= eVar.r()) {
            z10 = false;
        } else {
            List listN = eVar.n(j10);
            long jG = eVar.g(iF);
            if (listN.isEmpty()) {
                z10 = false;
            } else {
                long j11 = lVar.f27873a;
                if (j11 < jG) {
                    eVar2.accept(new a(listN, j11, jG - j11));
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
        }
        for (int i10 = iF; i10 < eVar.r(); i10++) {
            d(eVar, i10, eVar2);
        }
        if (lVar.f27874b) {
            if (z10) {
                iF--;
            }
            for (int i11 = 0; i11 < iF; i11++) {
                d(eVar, i11, eVar2);
            }
            if (z10) {
                eVar2.accept(new a(eVar.n(j10), eVar.g(iF), j10 - eVar.g(iF)));
            }
        }
    }
}
