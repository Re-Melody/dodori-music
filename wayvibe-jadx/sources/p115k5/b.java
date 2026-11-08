package p115k5;

import Y7.e;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.revenuecat.purchases.common.localrules.DeviceDimensionProvider;
import com.revenuecat.purchases.common.localrules.StoreDimensionProvider;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p083h7.d;
import p127l5.c;
import p127l5.f;
import p127l5.h;
import p127l5.i;
import p127l5.j;
import p127l5.k;
import p127l5.l;
import p127l5.n;
import p127l5.o;
import p127l5.q;
import p127l5.r;
import p127l5.s;
import p127l5.t;
import p127l5.u;
import p127l5.v;
import p148n5.g;
import p225v5.a;

/* JADX INFO: loaded from: classes.dex */
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f21648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f21649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f21650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final URL f21651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f21652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f21653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f21654g;

    public b(Context context, a aVar, a aVar2) {
        d dVar = new d();
        c cVar = c.f21990a;
        dVar.a(o.class, cVar);
        dVar.a(i.class, cVar);
        f fVar = f.f22003a;
        dVar.a(s.class, fVar);
        dVar.a(l.class, fVar);
        p127l5.d dVar2 = p127l5.d.f21992a;
        dVar.a(q.class, dVar2);
        dVar.a(j.class, dVar2);
        p127l5.b bVar = p127l5.b.f21978a;
        dVar.a(p127l5.a.class, bVar);
        dVar.a(h.class, bVar);
        p127l5.e eVar = p127l5.e.f21995a;
        dVar.a(r.class, eVar);
        dVar.a(k.class, eVar);
        p127l5.g gVar = p127l5.g.f22011a;
        dVar.a(v.class, gVar);
        dVar.a(n.class, gVar);
        dVar.f20330d = true;
        this.f21648a = new e(dVar, 11);
        this.f21650c = context;
        this.f21649b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f21651d = b(a.f21643c);
        this.f21652e = aVar2;
        this.f21653f = aVar;
        this.f21654g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException(p134m1.b.k("Invalid url: ", str), e2);
        }
    }

    public final p138m5.h a(p138m5.h hVar) {
        int subtype;
        NetworkInfo activeNetworkInfo = this.f21649b.getActiveNetworkInfo();
        G2.e eVarC = hVar.c();
        int i10 = Build.VERSION.SDK_INT;
        HashMap map = (HashMap) eVarC.f5371f;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put("sdk-version", String.valueOf(i10));
        eVarC.b("model", Build.MODEL);
        eVarC.b("hardware", Build.HARDWARE);
        eVarC.b("device", Build.DEVICE);
        eVarC.b("product", Build.PRODUCT);
        eVarC.b("os-uild", Build.ID);
        eVarC.b("manufacturer", Build.MANUFACTURER);
        eVarC.b("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / PipesIterator.DEFAULT_QUEUE_SIZE;
        HashMap map2 = (HashMap) eVarC.f5371f;
        if (map2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map2.put("tz-offset", String.valueOf(offset));
        int iF = activeNetworkInfo == null ? u.NONE.f() : activeNetworkInfo.getType();
        HashMap map3 = (HashMap) eVarC.f5371f;
        if (map3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map3.put("net-type", String.valueOf(iF));
        int i11 = -1;
        if (activeNetworkInfo == null) {
            subtype = t.UNKNOWN_MOBILE_SUBTYPE.f();
        } else {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                subtype = t.COMBINED.f();
            } else if (t.e(subtype) == null) {
                subtype = 0;
            }
        }
        HashMap map4 = (HashMap) eVarC.f5371f;
        if (map4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map4.put("mobile-subtype", String.valueOf(subtype));
        eVarC.b(StoreDimensionProvider.KEY_COUNTRY, Locale.getDefault().getCountry());
        eVarC.b(DeviceDimensionProvider.KEY_LOCALE, Locale.getDefault().getLanguage());
        Context context = this.f21650c;
        eVarC.b("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
        try {
            i11 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            S9.b.q("CctTransportBackend", "Unable to find version code for package", e2);
        }
        eVarC.b("application_build", Integer.toString(i11));
        return eVarC.g();
    }
}
