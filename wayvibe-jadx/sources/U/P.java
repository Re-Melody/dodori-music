package U;

import android.app.ActivityOptions;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import org.maplibre.android.location.C2198e;
import p140m7.C2061m;
import p255y2.C2329e;
import p255y2.C2339o;

/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f11786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f11787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f11788e;

    public /* synthetic */ P(int i10, Object obj, Object obj2, Object obj3, boolean z10) {
        this.f11784a = i10;
        this.f11786c = obj;
        this.f11787d = obj2;
        this.f11788e = obj3;
        this.f11785b = z10;
    }

    public static final void a(P p10) {
        Context context = (Context) p10.f11786c;
        if (p10.f11785b) {
            try {
                if (((p150n8.o) p10.f11788e) == null) {
                    return;
                }
                Object systemService = context.getSystemService("power");
                kotlin.jvm.internal.m.d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
                boolean zIsIgnoringBatteryOptimizations = ((PowerManager) systemService).isIgnoringBatteryOptimizations(context.getPackageName());
                p150n8.o oVar = (p150n8.o) p10.f11788e;
                if (oVar != null) {
                    oVar.b(Boolean.valueOf(zIsIgnoringBatteryOptimizations));
                }
            } catch (Exception e2) {
                p150n8.o oVar2 = (p150n8.o) p10.f11788e;
                if (oVar2 != null) {
                    oVar2.d(e2.getMessage(), "BatteryOptimizationError", "Error checking permission status");
                }
            } finally {
                p10.h();
            }
        }
    }

    public static HashMap m(byte[] bArr) {
        HashMap map = new HashMap();
        map.put("enabled", Boolean.TRUE);
        map.put("data", bArr);
        return map;
    }

    public void b(long j10, String str) {
        e(str, String.valueOf(j10));
    }

    public void c(Object obj, String str) {
        p150n8.a aVar = new p150n8.a();
        ((p150n8.a) this.f11788e).f22981c = aVar;
        this.f11788e = aVar;
        aVar.f22980b = obj;
        aVar.f22979a = str;
    }

    public void d(String str, boolean z10) {
        e(str, String.valueOf(z10));
    }

    public void e(String str, String str2) {
        p267z6.j jVar = new p267z6.j();
        ((p150n8.a) this.f11788e).f22981c = jVar;
        this.f11788e = jVar;
        jVar.f22980b = str2;
        jVar.f22979a = str;
    }

    public C2198e f() {
        Intent intent = (Intent) this.f11786c;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f11785b);
        ((p096i8.c) this.f11787d).getClass();
        intent.putExtras(new Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        int i10 = Build.VERSION.SDK_INT;
        String strA = p190s.b.a();
        if (!TextUtils.isEmpty(strA)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", strA);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (i10 >= 34) {
            if (((ActivityOptions) this.f11788e) == null) {
                this.f11788e = p190s.a.a();
            }
            p190s.c.a((ActivityOptions) this.f11788e, false);
        }
        ActivityOptions activityOptions = (ActivityOptions) this.f11788e;
        return new C2198e(intent, activityOptions != null ? activityOptions.toBundle() : null, false);
    }

    public boolean g(C2329e c2329e, C2339o c2339o) {
        boolean zEquals = "audio/eac3-joc".equals(c2339o.f28954m);
        int i10 = c2339o.f28932A;
        if (zEquals && i10 == 16) {
            i10 = 12;
        }
        int iR = B2.C.r(i10);
        if (iR == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iR);
        int i11 = c2339o.f28933B;
        if (i11 != -1) {
            channelMask.setSampleRate(i11);
        }
        return ((Spatializer) this.f11786c).canBeSpatialized((AudioAttributes) c2329e.a().f24715a, channelMask.build());
    }

    public void h() {
        Z7.d dVar = (Z7.d) this.f11787d;
        if (dVar != null) {
            Context applicationContext = ((Context) this.f11786c).getApplicationContext();
            kotlin.jvm.internal.m.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(dVar);
        }
        this.f11787d = null;
        this.f11788e = null;
        this.f11785b = false;
    }

    public void i(boolean z10) {
        p103j4.g gVar = (p103j4.g) this.f11788e;
        synchronized (gVar) {
            try {
                if (this.f11785b) {
                    throw new IllegalStateException("editor is closed");
                }
                if (kotlin.jvm.internal.m.b(((p103j4.c) this.f11786c).f21468g, this)) {
                    p103j4.g.b(gVar, this, z10);
                }
                this.f11785b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public E9.C j(int i10) {
        E9.C c3;
        p103j4.g gVar = (p103j4.g) this.f11788e;
        synchronized (gVar) {
            if (this.f11785b) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.f11787d)[i10] = true;
            Object obj = ((p103j4.c) this.f11786c).f21465d.get(i10);
            p103j4.e eVar = gVar.f21490p;
            E9.C c9 = (E9.C) obj;
            if (!eVar.l(c9)) {
                p224v4.g.a(eVar.z(c9));
            }
            c3 = (E9.C) obj;
        }
        return c3;
    }

    public boolean k() {
        Context context = (Context) this.f11786c;
        Object systemService = context.getSystemService("power");
        kotlin.jvm.internal.m.d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return ((PowerManager) systemService).isIgnoringBatteryOptimizations(context.getPackageName());
    }

    public boolean l() {
        return ((Context) this.f11786c).checkSelfPermission("android.permission.WAKE_LOCK") == 0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x002f  */
    public void n(p150n8.b bVar, boolean z10) {
        p150n8.b bVar2;
        p150n8.b bVar3 = (p150n8.b) this.f11786c;
        if (bVar3 == bVar && z10 == this.f11785b) {
            return;
        }
        if (bVar == null && bVar3 == null) {
            this.f11785b = z10;
            return;
        }
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == 0) {
            bVar2 = bVar;
        } else if (iOrdinal == 1) {
            bVar2 = z10 ? p150n8.b.RESUMED : p150n8.b.INACTIVE;
        } else if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
            bVar2 = bVar;
        } else {
            bVar2 = null;
        }
        this.f11786c = bVar;
        this.f11785b = z10;
        if (bVar2 == ((p150n8.b) this.f11787d)) {
            return;
        }
        ((C2061m) this.f11788e).G("AppLifecycleState." + bVar2.name().toLowerCase(Locale.ROOT), null);
        this.f11787d = bVar2;
    }

    public String toString() {
        switch (this.f11784a) {
            case 4:
                StringBuilder sb = new StringBuilder("DatabaseInfo(databaseId:");
                sb.append((p170p7.f) this.f11786c);
                sb.append(" host:");
                return p134m1.b.m(sb, (String) this.f11788e, ")");
            case 9:
                boolean z10 = this.f11785b;
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f11786c);
                sb2.append('{');
                String str = "";
                for (p150n8.a aVar = (p150n8.a) ((p150n8.a) this.f11787d).f22981c; aVar != null; aVar = (p150n8.a) aVar.f22981c) {
                    Object obj = aVar.f22980b;
                    if ((aVar instanceof p267z6.j) || obj != null || !z10) {
                        sb2.append(str);
                        String str2 = (String) aVar.f22979a;
                        if (str2 != null) {
                            sb2.append(str2);
                            sb2.append('=');
                        }
                        if (obj == null || !obj.getClass().isArray()) {
                            sb2.append(obj);
                        } else {
                            String strDeepToString = Arrays.deepToString(new Object[]{obj});
                            sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                        }
                        str = ", ";
                    }
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public P(Context context) {
        this.f11784a = 2;
        this.f11786c = context;
    }

    public P(int i10) {
        this.f11784a = i10;
        switch (i10) {
            case 8:
                this.f11786c = new Intent("android.intent.action.VIEW");
                this.f11787d = new p096i8.c();
                this.f11785b = true;
                break;
            default:
                this.f11786c = new Object();
                this.f11787d = new ArrayList();
                this.f11788e = new ArrayList();
                this.f11785b = true;
                break;
        }
    }

    public P(p063f8.b bVar, int i10) {
        this.f11784a = i10;
        switch (i10) {
            case 7:
                p161o8.s sVar = new p161o8.s(bVar, "flutter/restoration", p161o8.x.f23838b, null);
                this.f11785b = false;
                Y7.e eVar = new Y7.e(this, 22);
                this.f11787d = sVar;
                sVar.b(eVar);
                break;
            default:
                C2061m c2061m = new C2061m(bVar, "flutter/lifecycle", p161o8.y.f23841b, null);
                this.f11786c = null;
                this.f11787d = null;
                this.f11785b = true;
                this.f11788e = c2061m;
                break;
        }
    }

    public P(String str) {
        this.f11784a = 9;
        p150n8.a aVar = new p150n8.a();
        this.f11787d = aVar;
        this.f11788e = aVar;
        this.f11785b = false;
        this.f11786c = str;
    }

    public P(p103j4.g gVar, p103j4.c cVar) {
        this.f11784a = 3;
        this.f11788e = gVar;
        this.f11786c = cVar;
        gVar.getClass();
        this.f11787d = new boolean[2];
    }

    public P(Spatializer spatializer) {
        this.f11784a = 1;
        this.f11786c = spatializer;
        this.f11785b = spatializer.getImmersiveAudioLevel() != 0;
    }
}
