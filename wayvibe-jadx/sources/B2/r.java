package B2;

import D7.p1;
import G0.AbstractC0454b;
import H2.C0536f;
import H2.C0540j;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.play.core.install.zza;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.tika.utils.XMLReaderUtils;

/* JADX INFO: loaded from: classes.dex */
public final class r extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f616b;

    public /* synthetic */ r(Object obj, int i10) {
        this.f615a = i10;
        this.f616b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x014b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0152  */
    /* JADX WARN: Code duplicated, block: B:55:0x0154  */
    /* JADX WARN: Code duplicated, block: B:57:0x015a  */
    /* JADX WARN: Code duplicated, block: B:58:0x015c  */
    /* JADX WARN: Code duplicated, block: B:59:0x015e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0160  */
    /* JADX WARN: Code duplicated, block: B:61:0x0162  */
    /* JADX WARN: Code duplicated, block: B:62:0x0164  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i10;
        switch (this.f615a) {
            case 0:
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null) {
                    i10 = 0;
                } else {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        i10 = 1;
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type == 0) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i10 = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i10 = 4;
                                        break;
                                    case 13:
                                        i10 = 5;
                                        break;
                                    case 16:
                                    case 19:
                                    default:
                                        i10 = 6;
                                        break;
                                    case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        i10 = 2;
                                        break;
                                    case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                                        if (C.f560a >= 29) {
                                            i10 = 9;
                                        } else {
                                            i10 = 0;
                                        }
                                        break;
                                }
                            } else if (type == 1) {
                                i10 = 2;
                            } else if (type == 4 || type == 5) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i10 = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i10 = 4;
                                        break;
                                    case 13:
                                        i10 = 5;
                                        break;
                                    case 16:
                                    case 19:
                                    default:
                                        i10 = 6;
                                        break;
                                    case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        i10 = 2;
                                        break;
                                    case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                                        if (C.f560a >= 29) {
                                            i10 = 9;
                                        } else {
                                            i10 = 0;
                                        }
                                        break;
                                }
                            } else if (type != 6) {
                                i10 = type != 9 ? 8 : 7;
                            } else {
                                i10 = 5;
                            }
                        }
                    } catch (SecurityException unused) {
                    }
                }
                int i11 = C.f560a;
                s sVar = (s) this.f616b;
                if (i11 < 31 || i10 != 5) {
                    s.b(i10, sVar);
                    return;
                }
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    telephonyManager.getClass();
                    q qVar = new q(sVar);
                    telephonyManager.registerTelephonyCallback(context.getMainExecutor(), qVar);
                    telephonyManager.unregisterTelephonyCallback(qVar);
                    return;
                } catch (RuntimeException unused2) {
                    s.b(5, sVar);
                    return;
                }
            case 1:
                if (isInitialStickyBroadcast()) {
                    return;
                }
                C0540j c0540j = (C0540j) this.f616b;
                c0540j.a(C0536f.b(context, intent, c0540j.f5916i, c0540j.f5915h));
                return;
            case 2:
                ((AbstractC0454b) this.f616b).j();
                return;
            case 3:
                p206t6.c cVar = (p206t6.c) this.f616b;
                cVar.getClass();
                if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
                    cVar.f26878a.a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
                    return;
                }
                cVar.f26878a.a("List of extras in received intent:", new Object[0]);
                for (String str : intent.getExtras().keySet()) {
                    cVar.f26878a.a("Key: %s; value: %s", str, intent.getExtras().get(str));
                }
                G7.e eVar = cVar.f26878a;
                eVar.a("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
                eVar.a("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
                eVar.a("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
                zza zzaVar = new zza(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name"));
                cVar.f26878a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", zzaVar);
                synchronized (cVar) {
                    Iterator it = new HashSet(cVar.f26881d).iterator();
                    while (it.hasNext()) {
                        ((Y7.b) it.next()).a(zzaVar);
                    }
                }
                return;
            default:
                if ("close action".equals(intent.getAction())) {
                    ((WebViewActivity) this.f616b).finish();
                    return;
                }
                return;
        }
    }
}
