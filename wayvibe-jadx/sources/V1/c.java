package V1;

import G0.AbstractC0454b;
import O1.j;
import O1.l;
import T1.g;
import U1.d;
import V5.C0943i;
import V5.C0945k;
import V5.C0957x;
import V5.EnumC0954u;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.auth.api.identity.e;
import com.google.android.gms.auth.api.identity.f;
import com.google.android.gms.auth.api.identity.h;
import com.google.android.gms.auth.api.identity.i;
import com.google.android.gms.auth.api.identity.q;
import com.google.android.gms.common.internal.E;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.m;
import org.json.JSONObject;
import p011a7.C1016d;
import p097i9.k;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f12470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public O1.c f12471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Executor f12472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CancellationSignal f12473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f12474i;

    public c(Context context) {
        m.f(context, "context");
        this.f12470e = context;
        this.f12474i = new b(this, new Handler(Looper.getMainLooper()), 0);
    }

    public final l c(q qVar) throws P1.d, P1.c, R1.b {
        String string;
        AbstractC0454b jVar;
        String str = qVar.f17772a;
        String str2 = qVar.f17777f;
        if (str2 != null) {
            m.e(str, "getId(...)");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_ID", str);
            bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", str2);
            jVar = new j(str2, 1, bundle);
        } else {
            String str3 = qVar.f17778g;
            p043d6.c cVar = null;
            if (str3 != null) {
                m.e(str, "getId(...)");
                String str4 = qVar.f17773b;
                String str5 = str4 != null ? str4 : null;
                String str6 = qVar.f17774c;
                String str7 = str6 != null ? str6 : null;
                String str8 = qVar.f17775d;
                String str9 = str8 != null ? str8 : null;
                String str10 = qVar.f17779h;
                String str11 = str10 != null ? str10 : null;
                Uri uri = qVar.f17776e;
                cVar = new p043d6.c(str, str3, str5, str9, str7, uri != null ? uri : null, str11);
            } else {
                C0957x c0957x = qVar.f17780i;
                if (c0957x != null) {
                    LinkedHashMap linkedHashMap = W1.a.f12775a;
                    JSONObject jSONObject = new JSONObject();
                    Object obj = c0957x.f12691d;
                    if (obj == null && (obj = c0957x.f12692e) == null && (obj = c0957x.f12693f) == null) {
                        throw new IllegalStateException("No response set.");
                    }
                    if (obj instanceof C0945k) {
                        C0945k c0945k = (C0945k) obj;
                        EnumC0954u enumC0954u = c0945k.f12672a;
                        m.e(enumC0954u, "getErrorCode(...)");
                        Q1.a aVar = (Q1.a) W1.a.f12775a.get(enumC0954u);
                        String str12 = c0945k.f12673b;
                        if (aVar == null) {
                            throw new R1.b(new Q1.a(26), p134m1.b.k("unknown fido gms exception - ", str12));
                        }
                        if (enumC0954u == EnumC0954u.NOT_ALLOWED_ERR && str12 != null && k.n0(str12, "Unable to get sync account")) {
                            throw new P1.c("Passkey retrieval was cancelled by the user.");
                        }
                        throw new R1.b(aVar, str12);
                    }
                    if (obj instanceof C0943i) {
                        try {
                            string = c0957x.u().toString();
                            m.e(string, "toJson(...)");
                        } catch (Throwable th) {
                            throw new P1.d("The PublicKeyCredential response json had an unexpected exception when parsing: " + th.getMessage());
                        }
                    } else {
                        Log.e("PublicKeyUtility", "AuthenticatorResponse expected assertion response but got: ".concat(obj.getClass().getName()));
                        string = jSONObject.toString();
                        m.e(string, "toString(...)");
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON", string);
                    jVar = new j(string, 2, bundle2);
                } else {
                    Log.w("BeginSignIn", "Credential returned but no google Id or password or passkey found");
                }
            }
            jVar = cVar;
        }
        if (jVar != null) {
            return new l(jVar);
        }
        throw new P1.d("When attempting to convert get response, null credential found");
    }

    public final O1.c d() {
        O1.c cVar = this.f12471f;
        if (cVar != null) {
            return cVar;
        }
        m.l("callback");
        throw null;
    }

    public final Executor e() {
        Executor executor = this.f12472g;
        if (executor != null) {
            return executor;
        }
        m.l("executor");
        throw null;
    }

    public final void f(O1.k request, CancellationSignal cancellationSignal, Executor executor, O1.c callback) {
        m.f(request, "request");
        m.f(callback, "callback");
        m.f(executor, "executor");
        this.f12473h = cancellationSignal;
        this.f12471f = callback;
        this.f12472g = executor;
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (g.a(cancellationSignal)) {
            return;
        }
        Context context = this.f12470e;
        m.f(context, "context");
        h hVar = new h(false);
        C1016d c1016dU = e.u();
        c1016dU.f14226a = false;
        e eVarA = c1016dU.a();
        com.google.android.gms.auth.api.identity.g gVar = new com.google.android.gms.auth.api.identity.g(null, false, null);
        f fVar = new f(false, null);
        PackageManager packageManager = context.getPackageManager();
        m.e(packageManager, "getPackageManager(...)");
        int i10 = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        e eVar = eVarA;
        boolean z10 = false;
        for (O1.m mVar : request.f9016a) {
            if (mVar instanceof p043d6.a) {
                p043d6.a aVar = (p043d6.a) mVar;
                C1016d c1016dU2 = e.u();
                c1016dU2.f14229d = aVar.f19284f;
                c1016dU2.f14228c = aVar.f19283e;
                String str = aVar.f19282d;
                E.e(str);
                c1016dU2.f14227b = str;
                c1016dU2.f14226a = true;
                e eVarA2 = c1016dU2.a();
                z10 = z10 || aVar.f19285g;
                eVar = eVarA2;
            }
        }
        p242x0.c.w(context).beginSignIn(new i(hVar, eVar, null, z10, 0, gVar, fVar, false)).addOnSuccessListener(new A8.b(new U1.e(1, cancellationSignal, this), 19)).addOnFailureListener(new A7.a(6, this, cancellationSignal));
    }
}
