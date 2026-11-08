package p250x8;

import D7.W;
import H5.j;
import M8.q;
import O1.d;
import O1.k;
import P1.g;
import V0.p;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.ClearTokenRequest;
import com.google.android.gms.auth.api.identity.RevokeAccessRequest;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.internal.p000authapi.zbbj;
import com.google.android.gms.tasks.OnSuccessListener;
import io.flutter.plugins.firebase.firestore.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.m;
import org.maplibre.android.location.u;
import p009a5.e;
import p043d6.a;
import p045d8.AbstractActivityC1932d;
import p134m1.b;
import p140m7.C2061m;
import p161o8.f;
import p161o8.n;
import p208t8.c;
import p241x.AbstractC2315s;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ o f28651a = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f28652b = W.S(new e(1));

    public static n a() {
        return (n) f28652b.getValue();
    }

    public static void b(f binaryMessenger, final t tVar) {
        m.f(binaryMessenger, "binaryMessenger");
        Object obj = null;
        C2061m c2061m = new C2061m(binaryMessenger, b.k("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.getGoogleServicesJsonServerClientId", ""), a(), obj);
        if (tVar != null) {
            final int i10 = 0;
            c2061m.J(new p161o8.b() { // from class: x8.n
                @Override // p161o8.b
                public final void g(Object obj2, W4.m mVar) {
                    List listU;
                    String str;
                    String str2;
                    boolean z10;
                    int i11;
                    switch (i10) {
                        case 0:
                            try {
                                Context context = tVar.f28659a;
                                int identifier = context.getResources().getIdentifier("default_web_client_id", "string", context.getPackageName());
                                listU = W.T(identifier != 0 ? context.getString(identifier) : null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof e) {
                                    e eVar = th;
                                    listU = W.U(eVar.f28634a, eVar.f28635b, null);
                                } else {
                                    listU = W.U(th.getClass().getSimpleName(), th.toString(), p.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            mVar.d(listU);
                            return;
                        case 1:
                            m.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            m.d(obj3, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.GetCredentialRequestParams");
                            j jVar = (j) obj3;
                            m mVar2 = new m(mVar, 3);
                            t tVar2 = tVar;
                            tVar2.getClass();
                            try {
                                String str3 = jVar.f28643c;
                                if (str3 != null && !str3.isEmpty()) {
                                    AbstractActivityC1932d abstractActivityC1932d = tVar2.f28663e;
                                    if (abstractActivityC1932d == null) {
                                        AbstractC2315s.e(mVar2, new f(h.NO_ACTIVITY, "No activity available", null));
                                        return;
                                    }
                                    String str4 = jVar.f28645e;
                                    String str5 = jVar.f28644d;
                                    ArrayList arrayList = new ArrayList();
                                    if (jVar.f28641a) {
                                        if (str5 == null) {
                                            str5 = null;
                                        }
                                        arrayList.add(new p043d6.b(str3, str5, str4 != null ? str4 : null));
                                    } else {
                                        i iVar = jVar.f28642b;
                                        boolean z11 = iVar.f28639a;
                                        boolean z12 = iVar.f28640b;
                                        if (str3.length() <= 0) {
                                            throw new IllegalArgumentException("serverClientId should not be empty");
                                        }
                                        arrayList.add(new a(str3, str4 != null ? str4 : null, z11, z12));
                                    }
                                    m.f(tVar2.f28659a, "context");
                                    k kVar = new k(N8.n.W0(arrayList));
                                    ExecutorService executor = Executors.newSingleThreadExecutor();
                                    p161o8.p pVar = new p161o8.p(tVar2, mVar2);
                                    m.f(executor, "executor");
                                    d dVarB = j.b(new j(abstractActivityC1932d, 1), kVar);
                                    if (dVarB == null) {
                                        pVar.a(new g("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
                                        return;
                                    } else {
                                        dVarB.onGetCredential(abstractActivityC1932d, kVar, null, executor, pVar);
                                        return;
                                    }
                                }
                                AbstractC2315s.e(mVar2, new f(h.MISSING_SERVER_CLIENT_ID, "CredentialManager requires a serverClientId.", null));
                                return;
                            } catch (RuntimeException e2) {
                                AbstractC2315s.e(mVar2, new f(h.UNKNOWN, e2.getMessage(), "Cause: " + e2.getCause() + ", Stacktrace: " + Log.getStackTraceString(e2)));
                                return;
                            }
                        case 2:
                            m mVar3 = new m(mVar, 1);
                            t tVar3 = tVar;
                            s sVar = tVar3.f28660b;
                            Context context2 = tVar3.f28659a;
                            m.f(context2, "context");
                            O1.a aVar = new O1.a();
                            new Bundle();
                            ExecutorService executor2 = Executors.newSingleThreadExecutor();
                            u uVar = new u(mVar3);
                            m.f(executor2, "executor");
                            d dVarB2 = j.b(new j(context2, 1), "androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE");
                            if (dVarB2 == null) {
                                uVar.a(new P1.a());
                                return;
                            } else {
                                dVarB2.onClearCredential(aVar, null, executor2, uVar);
                                return;
                            }
                        case 3:
                            m.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            m.d(obj4, "null cannot be cast to non-null type kotlin.String");
                            m mVar4 = new m(mVar, 4);
                            t tVar4 = tVar;
                            s sVar2 = tVar4.f28661c;
                            s.d(tVar4.f28659a).clearToken(new ClearTokenRequest((String) obj4, null)).addOnSuccessListener(new q(mVar4)).addOnFailureListener(new q(mVar4));
                            return;
                        case 4:
                            m.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            m.d(obj5, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformAuthorizationRequest");
                            v vVar = (v) obj5;
                            Object obj6 = list.get(1);
                            m.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            final boolean zBooleanValue = ((Boolean) obj6).booleanValue();
                            final m mVar5 = new m(mVar, 0);
                            final t tVar5 = tVar;
                            tVar5.getClass();
                            try {
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it = vVar.f28668a.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(new Scope(1, (String) it.next()));
                                }
                                E.a("requestedScopes cannot be null or empty", !arrayList2.isEmpty());
                                String str6 = vVar.f28669b;
                                if (str6 != null) {
                                    E.e(str6);
                                    str = str6;
                                } else {
                                    str = null;
                                }
                                String str7 = vVar.f28671d;
                                if (str7 != null) {
                                    i11 = 1;
                                    str2 = str7;
                                    z10 = true;
                                } else {
                                    str2 = null;
                                    z10 = false;
                                    i11 = 0;
                                }
                                String str8 = vVar.f28670c;
                                s.d(tVar5.f28659a).authorize(new AuthorizationRequest(arrayList2, str2, z10, false, str8 != null ? new Account(str8, "com.google") : null, str, null, false, null, false, i11)).addOnSuccessListener(new OnSuccessListener() { // from class: x8.s
                                    @Override // com.google.android.gms.tasks.OnSuccessListener
                                    public final void onSuccess(Object obj7) {
                                        com.google.android.gms.auth.api.identity.d dVar = (com.google.android.gms.auth.api.identity.d) obj7;
                                        t tVar6 = tVar5;
                                        tVar6.getClass();
                                        PendingIntent pendingIntent = dVar.f17733f;
                                        m mVar6 = mVar5;
                                        if (pendingIntent == null) {
                                            AbstractC2315s.e(mVar6, new w(dVar.f17729b, dVar.f17728a, dVar.f17731d));
                                            return;
                                        }
                                        if (!zBooleanValue) {
                                            AbstractC2315s.e(mVar6, new a(c.UNAUTHORIZED, null, null));
                                            return;
                                        }
                                        AbstractActivityC1932d abstractActivityC1932d2 = tVar6.f28663e;
                                        if (abstractActivityC1932d2 == null) {
                                            AbstractC2315s.e(mVar6, new a(c.NO_ACTIVITY, "No activity available", null));
                                            return;
                                        }
                                        try {
                                            tVar6.f28664f = mVar6;
                                            abstractActivityC1932d2.startIntentSenderForResult(pendingIntent.getIntentSender(), 53294, null, 0, 0, 0, null);
                                        } catch (IntentSender.SendIntentException e4) {
                                            tVar6.f28664f = null;
                                            AbstractC2315s.e(mVar6, new a(c.PENDING_INTENT_EXCEPTION, e4.getMessage(), null));
                                        }
                                    }
                                }).addOnFailureListener(new c(mVar5, 6));
                                return;
                            } catch (RuntimeException e4) {
                                AbstractC2315s.e(mVar5, new a(c.API_EXCEPTION, e4.getMessage(), "Cause: " + e4.getCause() + ", Stacktrace: " + Log.getStackTraceString(e4)));
                                return;
                            }
                        default:
                            m.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            m.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformRevokeAccessRequest");
                            y yVar = (y) obj7;
                            m mVar6 = new m(mVar, 2);
                            t tVar6 = tVar;
                            tVar6.getClass();
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it2 = yVar.f28682b.iterator();
                            while (it2.hasNext()) {
                                arrayList3.add(new Scope(1, (String) it2.next()));
                            }
                            s.d(tVar6.f28659a).revokeAccess(new RevokeAccessRequest(zbbj.zbi(arrayList3), new Account(yVar.f28681a, "com.google"), null)).addOnSuccessListener(new r(mVar6)).addOnFailureListener(new r(mVar6));
                            return;
                    }
                }
            });
        } else {
            c2061m.J(null);
        }
        C2061m c2061m2 = new C2061m(binaryMessenger, b.k("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.getCredential", ""), a(), obj);
        if (tVar != null) {
            final int i11 = 1;
            c2061m2.J(new p161o8.b() { // from class: x8.n
                @Override // p161o8.b
                public final void g(Object obj2, W4.m mVar) {
                    List listU;
                    String str;
                    String str2;
                    boolean z10;
                    int i12;
                    switch (i11) {
                        case 0:
                            try {
                                Context context = tVar.f28659a;
                                int identifier = context.getResources().getIdentifier("default_web_client_id", "string", context.getPackageName());
                                listU = W.T(identifier != 0 ? context.getString(identifier) : null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof e) {
                                    e eVar = th;
                                    listU = W.U(eVar.f28634a, eVar.f28635b, null);
                                } else {
                                    listU = W.U(th.getClass().getSimpleName(), th.toString(), p.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            mVar.d(listU);
                            return;
                        case 1:
                            m.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            m.d(obj3, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.GetCredentialRequestParams");
                            j jVar = (j) obj3;
                            m mVar2 = new m(mVar, 3);
                            t tVar2 = tVar;
                            tVar2.getClass();
                            try {
                                String str3 = jVar.f28643c;
                                if (str3 != null && !str3.isEmpty()) {
                                    AbstractActivityC1932d abstractActivityC1932d = tVar2.f28663e;
                                    if (abstractActivityC1932d == null) {
                                        AbstractC2315s.e(mVar2, new f(h.NO_ACTIVITY, "No activity available", null));
                                        return;
                                    }
                                    String str4 = jVar.f28645e;
                                    String str5 = jVar.f28644d;
                                    ArrayList arrayList = new ArrayList();
                                    if (jVar.f28641a) {
                                        if (str5 == null) {
                                            str5 = null;
                                        }
                                        arrayList.add(new p043d6.b(str3, str5, str4 != null ? str4 : null));
                                    } else {
                                        i iVar = jVar.f28642b;
                                        boolean z11 = iVar.f28639a;
                                        boolean z12 = iVar.f28640b;
                                        if (str3.length() <= 0) {
                                            throw new IllegalArgumentException("serverClientId should not be empty");
                                        }
                                        arrayList.add(new a(str3, str4 != null ? str4 : null, z11, z12));
                                    }
                                    m.f(tVar2.f28659a, "context");
                                    k kVar = new k(N8.n.W0(arrayList));
                                    ExecutorService executor = Executors.newSingleThreadExecutor();
                                    p161o8.p pVar = new p161o8.p(tVar2, mVar2);
                                    m.f(executor, "executor");
                                    d dVarB = j.b(new j(abstractActivityC1932d, 1), kVar);
                                    if (dVarB == null) {
                                        pVar.a(new g("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
                                        return;
                                    } else {
                                        dVarB.onGetCredential(abstractActivityC1932d, kVar, null, executor, pVar);
                                        return;
                                    }
                                }
                                AbstractC2315s.e(mVar2, new f(h.MISSING_SERVER_CLIENT_ID, "CredentialManager requires a serverClientId.", null));
                                return;
                            } catch (RuntimeException e2) {
                                AbstractC2315s.e(mVar2, new f(h.UNKNOWN, e2.getMessage(), "Cause: " + e2.getCause() + ", Stacktrace: " + Log.getStackTraceString(e2)));
                                return;
                            }
                        case 2:
                            m mVar3 = new m(mVar, 1);
                            t tVar3 = tVar;
                            s sVar = tVar3.f28660b;
                            Context context2 = tVar3.f28659a;
                            m.f(context2, "context");
                            O1.a aVar = new O1.a();
                            new Bundle();
                            ExecutorService executor2 = Executors.newSingleThreadExecutor();
                            u uVar = new u(mVar3);
                            m.f(executor2, "executor");
                            d dVarB2 = j.b(new j(context2, 1), "androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE");
                            if (dVarB2 == null) {
                                uVar.a(new P1.a());
                                return;
                            } else {
                                dVarB2.onClearCredential(aVar, null, executor2, uVar);
                                return;
                            }
                        case 3:
                            m.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            m.d(obj4, "null cannot be cast to non-null type kotlin.String");
                            m mVar4 = new m(mVar, 4);
                            t tVar4 = tVar;
                            s sVar2 = tVar4.f28661c;
                            s.d(tVar4.f28659a).clearToken(new ClearTokenRequest((String) obj4, null)).addOnSuccessListener(new q(mVar4)).addOnFailureListener(new q(mVar4));
                            return;
                        case 4:
                            m.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            m.d(obj5, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformAuthorizationRequest");
                            v vVar = (v) obj5;
                            Object obj6 = list.get(1);
                            m.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            final boolean zBooleanValue = ((Boolean) obj6).booleanValue();
                            final m mVar5 = new m(mVar, 0);
                            final t tVar5 = tVar;
                            tVar5.getClass();
                            try {
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it = vVar.f28668a.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(new Scope(1, (String) it.next()));
                                }
                                E.a("requestedScopes cannot be null or empty", !arrayList2.isEmpty());
                                String str6 = vVar.f28669b;
                                if (str6 != null) {
                                    E.e(str6);
                                    str = str6;
                                } else {
                                    str = null;
                                }
                                String str7 = vVar.f28671d;
                                if (str7 != null) {
                                    i12 = 1;
                                    str2 = str7;
                                    z10 = true;
                                } else {
                                    str2 = null;
                                    z10 = false;
                                    i12 = 0;
                                }
                                String str8 = vVar.f28670c;
                                s.d(tVar5.f28659a).authorize(new AuthorizationRequest(arrayList2, str2, z10, false, str8 != null ? new Account(str8, "com.google") : null, str, null, false, null, false, i12)).addOnSuccessListener(new OnSuccessListener() { // from class: x8.s
                                    @Override // com.google.android.gms.tasks.OnSuccessListener
                                    public final void onSuccess(Object obj7) {
                                        com.google.android.gms.auth.api.identity.d dVar = (com.google.android.gms.auth.api.identity.d) obj7;
                                        t tVar6 = tVar5;
                                        tVar6.getClass();
                                        PendingIntent pendingIntent = dVar.f17733f;
                                        m mVar6 = mVar5;
                                        if (pendingIntent == null) {
                                            AbstractC2315s.e(mVar6, new w(dVar.f17729b, dVar.f17728a, dVar.f17731d));
                                            return;
                                        }
                                        if (!zBooleanValue) {
                                            AbstractC2315s.e(mVar6, new a(c.UNAUTHORIZED, null, null));
                                            return;
                                        }
                                        AbstractActivityC1932d abstractActivityC1932d2 = tVar6.f28663e;
                                        if (abstractActivityC1932d2 == null) {
                                            AbstractC2315s.e(mVar6, new a(c.NO_ACTIVITY, "No activity available", null));
                                            return;
                                        }
                                        try {
                                            tVar6.f28664f = mVar6;
                                            abstractActivityC1932d2.startIntentSenderForResult(pendingIntent.getIntentSender(), 53294, null, 0, 0, 0, null);
                                        } catch (IntentSender.SendIntentException e4) {
                                            tVar6.f28664f = null;
                                            AbstractC2315s.e(mVar6, new a(c.PENDING_INTENT_EXCEPTION, e4.getMessage(), null));
                                        }
                                    }
                                }).addOnFailureListener(new c(mVar5, 6));
                                return;
                            } catch (RuntimeException e4) {
                                AbstractC2315s.e(mVar5, new a(c.API_EXCEPTION, e4.getMessage(), "Cause: " + e4.getCause() + ", Stacktrace: " + Log.getStackTraceString(e4)));
                                return;
                            }
                        default:
                            m.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            m.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformRevokeAccessRequest");
                            y yVar = (y) obj7;
                            m mVar6 = new m(mVar, 2);
                            t tVar6 = tVar;
                            tVar6.getClass();
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it2 = yVar.f28682b.iterator();
                            while (it2.hasNext()) {
                                arrayList3.add(new Scope(1, (String) it2.next()));
                            }
                            s.d(tVar6.f28659a).revokeAccess(new RevokeAccessRequest(zbbj.zbi(arrayList3), new Account(yVar.f28681a, "com.google"), null)).addOnSuccessListener(new r(mVar6)).addOnFailureListener(new r(mVar6));
                            return;
                    }
                }
            });
        } else {
            c2061m2.J(null);
        }
        C2061m c2061m3 = new C2061m(binaryMessenger, b.k("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.clearCredentialState", ""), a(), obj);
        if (tVar != null) {
            final int i12 = 2;
            c2061m3.J(new p161o8.b() { // from class: x8.n
                @Override // p161o8.b
                public final void g(Object obj2, W4.m mVar) {
                    List listU;
                    String str;
                    String str2;
                    boolean z10;
                    int i13;
                    switch (i12) {
                        case 0:
                            try {
                                Context context = tVar.f28659a;
                                int identifier = context.getResources().getIdentifier("default_web_client_id", "string", context.getPackageName());
                                listU = W.T(identifier != 0 ? context.getString(identifier) : null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof e) {
                                    e eVar = th;
                                    listU = W.U(eVar.f28634a, eVar.f28635b, null);
                                } else {
                                    listU = W.U(th.getClass().getSimpleName(), th.toString(), p.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            mVar.d(listU);
                            return;
                        case 1:
                            m.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            m.d(obj3, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.GetCredentialRequestParams");
                            j jVar = (j) obj3;
                            m mVar2 = new m(mVar, 3);
                            t tVar2 = tVar;
                            tVar2.getClass();
                            try {
                                String str3 = jVar.f28643c;
                                if (str3 != null && !str3.isEmpty()) {
                                    AbstractActivityC1932d abstractActivityC1932d = tVar2.f28663e;
                                    if (abstractActivityC1932d == null) {
                                        AbstractC2315s.e(mVar2, new f(h.NO_ACTIVITY, "No activity available", null));
                                        return;
                                    }
                                    String str4 = jVar.f28645e;
                                    String str5 = jVar.f28644d;
                                    ArrayList arrayList = new ArrayList();
                                    if (jVar.f28641a) {
                                        if (str5 == null) {
                                            str5 = null;
                                        }
                                        arrayList.add(new p043d6.b(str3, str5, str4 != null ? str4 : null));
                                    } else {
                                        i iVar = jVar.f28642b;
                                        boolean z11 = iVar.f28639a;
                                        boolean z12 = iVar.f28640b;
                                        if (str3.length() <= 0) {
                                            throw new IllegalArgumentException("serverClientId should not be empty");
                                        }
                                        arrayList.add(new a(str3, str4 != null ? str4 : null, z11, z12));
                                    }
                                    m.f(tVar2.f28659a, "context");
                                    k kVar = new k(N8.n.W0(arrayList));
                                    ExecutorService executor = Executors.newSingleThreadExecutor();
                                    p161o8.p pVar = new p161o8.p(tVar2, mVar2);
                                    m.f(executor, "executor");
                                    d dVarB = j.b(new j(abstractActivityC1932d, 1), kVar);
                                    if (dVarB == null) {
                                        pVar.a(new g("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
                                        return;
                                    } else {
                                        dVarB.onGetCredential(abstractActivityC1932d, kVar, null, executor, pVar);
                                        return;
                                    }
                                }
                                AbstractC2315s.e(mVar2, new f(h.MISSING_SERVER_CLIENT_ID, "CredentialManager requires a serverClientId.", null));
                                return;
                            } catch (RuntimeException e2) {
                                AbstractC2315s.e(mVar2, new f(h.UNKNOWN, e2.getMessage(), "Cause: " + e2.getCause() + ", Stacktrace: " + Log.getStackTraceString(e2)));
                                return;
                            }
                        case 2:
                            m mVar3 = new m(mVar, 1);
                            t tVar3 = tVar;
                            s sVar = tVar3.f28660b;
                            Context context2 = tVar3.f28659a;
                            m.f(context2, "context");
                            O1.a aVar = new O1.a();
                            new Bundle();
                            ExecutorService executor2 = Executors.newSingleThreadExecutor();
                            u uVar = new u(mVar3);
                            m.f(executor2, "executor");
                            d dVarB2 = j.b(new j(context2, 1), "androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE");
                            if (dVarB2 == null) {
                                uVar.a(new P1.a());
                                return;
                            } else {
                                dVarB2.onClearCredential(aVar, null, executor2, uVar);
                                return;
                            }
                        case 3:
                            m.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            m.d(obj4, "null cannot be cast to non-null type kotlin.String");
                            m mVar4 = new m(mVar, 4);
                            t tVar4 = tVar;
                            s sVar2 = tVar4.f28661c;
                            s.d(tVar4.f28659a).clearToken(new ClearTokenRequest((String) obj4, null)).addOnSuccessListener(new q(mVar4)).addOnFailureListener(new q(mVar4));
                            return;
                        case 4:
                            m.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            m.d(obj5, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformAuthorizationRequest");
                            v vVar = (v) obj5;
                            Object obj6 = list.get(1);
                            m.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            final boolean zBooleanValue = ((Boolean) obj6).booleanValue();
                            final m mVar5 = new m(mVar, 0);
                            final t tVar5 = tVar;
                            tVar5.getClass();
                            try {
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it = vVar.f28668a.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(new Scope(1, (String) it.next()));
                                }
                                E.a("requestedScopes cannot be null or empty", !arrayList2.isEmpty());
                                String str6 = vVar.f28669b;
                                if (str6 != null) {
                                    E.e(str6);
                                    str = str6;
                                } else {
                                    str = null;
                                }
                                String str7 = vVar.f28671d;
                                if (str7 != null) {
                                    i13 = 1;
                                    str2 = str7;
                                    z10 = true;
                                } else {
                                    str2 = null;
                                    z10 = false;
                                    i13 = 0;
                                }
                                String str8 = vVar.f28670c;
                                s.d(tVar5.f28659a).authorize(new AuthorizationRequest(arrayList2, str2, z10, false, str8 != null ? new Account(str8, "com.google") : null, str, null, false, null, false, i13)).addOnSuccessListener(new OnSuccessListener() { // from class: x8.s
                                    @Override // com.google.android.gms.tasks.OnSuccessListener
                                    public final void onSuccess(Object obj7) {
                                        com.google.android.gms.auth.api.identity.d dVar = (com.google.android.gms.auth.api.identity.d) obj7;
                                        t tVar6 = tVar5;
                                        tVar6.getClass();
                                        PendingIntent pendingIntent = dVar.f17733f;
                                        m mVar6 = mVar5;
                                        if (pendingIntent == null) {
                                            AbstractC2315s.e(mVar6, new w(dVar.f17729b, dVar.f17728a, dVar.f17731d));
                                            return;
                                        }
                                        if (!zBooleanValue) {
                                            AbstractC2315s.e(mVar6, new a(c.UNAUTHORIZED, null, null));
                                            return;
                                        }
                                        AbstractActivityC1932d abstractActivityC1932d2 = tVar6.f28663e;
                                        if (abstractActivityC1932d2 == null) {
                                            AbstractC2315s.e(mVar6, new a(c.NO_ACTIVITY, "No activity available", null));
                                            return;
                                        }
                                        try {
                                            tVar6.f28664f = mVar6;
                                            abstractActivityC1932d2.startIntentSenderForResult(pendingIntent.getIntentSender(), 53294, null, 0, 0, 0, null);
                                        } catch (IntentSender.SendIntentException e4) {
                                            tVar6.f28664f = null;
                                            AbstractC2315s.e(mVar6, new a(c.PENDING_INTENT_EXCEPTION, e4.getMessage(), null));
                                        }
                                    }
                                }).addOnFailureListener(new c(mVar5, 6));
                                return;
                            } catch (RuntimeException e4) {
                                AbstractC2315s.e(mVar5, new a(c.API_EXCEPTION, e4.getMessage(), "Cause: " + e4.getCause() + ", Stacktrace: " + Log.getStackTraceString(e4)));
                                return;
                            }
                        default:
                            m.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            m.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformRevokeAccessRequest");
                            y yVar = (y) obj7;
                            m mVar6 = new m(mVar, 2);
                            t tVar6 = tVar;
                            tVar6.getClass();
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it2 = yVar.f28682b.iterator();
                            while (it2.hasNext()) {
                                arrayList3.add(new Scope(1, (String) it2.next()));
                            }
                            s.d(tVar6.f28659a).revokeAccess(new RevokeAccessRequest(zbbj.zbi(arrayList3), new Account(yVar.f28681a, "com.google"), null)).addOnSuccessListener(new r(mVar6)).addOnFailureListener(new r(mVar6));
                            return;
                    }
                }
            });
        } else {
            c2061m3.J(null);
        }
        C2061m c2061m4 = new C2061m(binaryMessenger, b.k("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.clearAuthorizationToken", ""), a(), obj);
        if (tVar != null) {
            final int i13 = 3;
            c2061m4.J(new p161o8.b() { // from class: x8.n
                @Override // p161o8.b
                public final void g(Object obj2, W4.m mVar) {
                    List listU;
                    String str;
                    String str2;
                    boolean z10;
                    int i14;
                    switch (i13) {
                        case 0:
                            try {
                                Context context = tVar.f28659a;
                                int identifier = context.getResources().getIdentifier("default_web_client_id", "string", context.getPackageName());
                                listU = W.T(identifier != 0 ? context.getString(identifier) : null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof e) {
                                    e eVar = th;
                                    listU = W.U(eVar.f28634a, eVar.f28635b, null);
                                } else {
                                    listU = W.U(th.getClass().getSimpleName(), th.toString(), p.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            mVar.d(listU);
                            return;
                        case 1:
                            m.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            m.d(obj3, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.GetCredentialRequestParams");
                            j jVar = (j) obj3;
                            m mVar2 = new m(mVar, 3);
                            t tVar2 = tVar;
                            tVar2.getClass();
                            try {
                                String str3 = jVar.f28643c;
                                if (str3 != null && !str3.isEmpty()) {
                                    AbstractActivityC1932d abstractActivityC1932d = tVar2.f28663e;
                                    if (abstractActivityC1932d == null) {
                                        AbstractC2315s.e(mVar2, new f(h.NO_ACTIVITY, "No activity available", null));
                                        return;
                                    }
                                    String str4 = jVar.f28645e;
                                    String str5 = jVar.f28644d;
                                    ArrayList arrayList = new ArrayList();
                                    if (jVar.f28641a) {
                                        if (str5 == null) {
                                            str5 = null;
                                        }
                                        arrayList.add(new p043d6.b(str3, str5, str4 != null ? str4 : null));
                                    } else {
                                        i iVar = jVar.f28642b;
                                        boolean z11 = iVar.f28639a;
                                        boolean z12 = iVar.f28640b;
                                        if (str3.length() <= 0) {
                                            throw new IllegalArgumentException("serverClientId should not be empty");
                                        }
                                        arrayList.add(new a(str3, str4 != null ? str4 : null, z11, z12));
                                    }
                                    m.f(tVar2.f28659a, "context");
                                    k kVar = new k(N8.n.W0(arrayList));
                                    ExecutorService executor = Executors.newSingleThreadExecutor();
                                    p161o8.p pVar = new p161o8.p(tVar2, mVar2);
                                    m.f(executor, "executor");
                                    d dVarB = j.b(new j(abstractActivityC1932d, 1), kVar);
                                    if (dVarB == null) {
                                        pVar.a(new g("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
                                        return;
                                    } else {
                                        dVarB.onGetCredential(abstractActivityC1932d, kVar, null, executor, pVar);
                                        return;
                                    }
                                }
                                AbstractC2315s.e(mVar2, new f(h.MISSING_SERVER_CLIENT_ID, "CredentialManager requires a serverClientId.", null));
                                return;
                            } catch (RuntimeException e2) {
                                AbstractC2315s.e(mVar2, new f(h.UNKNOWN, e2.getMessage(), "Cause: " + e2.getCause() + ", Stacktrace: " + Log.getStackTraceString(e2)));
                                return;
                            }
                        case 2:
                            m mVar3 = new m(mVar, 1);
                            t tVar3 = tVar;
                            s sVar = tVar3.f28660b;
                            Context context2 = tVar3.f28659a;
                            m.f(context2, "context");
                            O1.a aVar = new O1.a();
                            new Bundle();
                            ExecutorService executor2 = Executors.newSingleThreadExecutor();
                            u uVar = new u(mVar3);
                            m.f(executor2, "executor");
                            d dVarB2 = j.b(new j(context2, 1), "androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE");
                            if (dVarB2 == null) {
                                uVar.a(new P1.a());
                                return;
                            } else {
                                dVarB2.onClearCredential(aVar, null, executor2, uVar);
                                return;
                            }
                        case 3:
                            m.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            m.d(obj4, "null cannot be cast to non-null type kotlin.String");
                            m mVar4 = new m(mVar, 4);
                            t tVar4 = tVar;
                            s sVar2 = tVar4.f28661c;
                            s.d(tVar4.f28659a).clearToken(new ClearTokenRequest((String) obj4, null)).addOnSuccessListener(new q(mVar4)).addOnFailureListener(new q(mVar4));
                            return;
                        case 4:
                            m.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            m.d(obj5, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformAuthorizationRequest");
                            v vVar = (v) obj5;
                            Object obj6 = list.get(1);
                            m.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            final boolean zBooleanValue = ((Boolean) obj6).booleanValue();
                            final m mVar5 = new m(mVar, 0);
                            final t tVar5 = tVar;
                            tVar5.getClass();
                            try {
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it = vVar.f28668a.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(new Scope(1, (String) it.next()));
                                }
                                E.a("requestedScopes cannot be null or empty", !arrayList2.isEmpty());
                                String str6 = vVar.f28669b;
                                if (str6 != null) {
                                    E.e(str6);
                                    str = str6;
                                } else {
                                    str = null;
                                }
                                String str7 = vVar.f28671d;
                                if (str7 != null) {
                                    i14 = 1;
                                    str2 = str7;
                                    z10 = true;
                                } else {
                                    str2 = null;
                                    z10 = false;
                                    i14 = 0;
                                }
                                String str8 = vVar.f28670c;
                                s.d(tVar5.f28659a).authorize(new AuthorizationRequest(arrayList2, str2, z10, false, str8 != null ? new Account(str8, "com.google") : null, str, null, false, null, false, i14)).addOnSuccessListener(new OnSuccessListener() { // from class: x8.s
                                    @Override // com.google.android.gms.tasks.OnSuccessListener
                                    public final void onSuccess(Object obj7) {
                                        com.google.android.gms.auth.api.identity.d dVar = (com.google.android.gms.auth.api.identity.d) obj7;
                                        t tVar6 = tVar5;
                                        tVar6.getClass();
                                        PendingIntent pendingIntent = dVar.f17733f;
                                        m mVar6 = mVar5;
                                        if (pendingIntent == null) {
                                            AbstractC2315s.e(mVar6, new w(dVar.f17729b, dVar.f17728a, dVar.f17731d));
                                            return;
                                        }
                                        if (!zBooleanValue) {
                                            AbstractC2315s.e(mVar6, new a(c.UNAUTHORIZED, null, null));
                                            return;
                                        }
                                        AbstractActivityC1932d abstractActivityC1932d2 = tVar6.f28663e;
                                        if (abstractActivityC1932d2 == null) {
                                            AbstractC2315s.e(mVar6, new a(c.NO_ACTIVITY, "No activity available", null));
                                            return;
                                        }
                                        try {
                                            tVar6.f28664f = mVar6;
                                            abstractActivityC1932d2.startIntentSenderForResult(pendingIntent.getIntentSender(), 53294, null, 0, 0, 0, null);
                                        } catch (IntentSender.SendIntentException e4) {
                                            tVar6.f28664f = null;
                                            AbstractC2315s.e(mVar6, new a(c.PENDING_INTENT_EXCEPTION, e4.getMessage(), null));
                                        }
                                    }
                                }).addOnFailureListener(new c(mVar5, 6));
                                return;
                            } catch (RuntimeException e4) {
                                AbstractC2315s.e(mVar5, new a(c.API_EXCEPTION, e4.getMessage(), "Cause: " + e4.getCause() + ", Stacktrace: " + Log.getStackTraceString(e4)));
                                return;
                            }
                        default:
                            m.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            m.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformRevokeAccessRequest");
                            y yVar = (y) obj7;
                            m mVar6 = new m(mVar, 2);
                            t tVar6 = tVar;
                            tVar6.getClass();
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it2 = yVar.f28682b.iterator();
                            while (it2.hasNext()) {
                                arrayList3.add(new Scope(1, (String) it2.next()));
                            }
                            s.d(tVar6.f28659a).revokeAccess(new RevokeAccessRequest(zbbj.zbi(arrayList3), new Account(yVar.f28681a, "com.google"), null)).addOnSuccessListener(new r(mVar6)).addOnFailureListener(new r(mVar6));
                            return;
                    }
                }
            });
        } else {
            c2061m4.J(null);
        }
        C2061m c2061m5 = new C2061m(binaryMessenger, b.k("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.authorize", ""), a(), obj);
        if (tVar != null) {
            final int i14 = 4;
            c2061m5.J(new p161o8.b() { // from class: x8.n
                @Override // p161o8.b
                public final void g(Object obj2, W4.m mVar) {
                    List listU;
                    String str;
                    String str2;
                    boolean z10;
                    int i15;
                    switch (i14) {
                        case 0:
                            try {
                                Context context = tVar.f28659a;
                                int identifier = context.getResources().getIdentifier("default_web_client_id", "string", context.getPackageName());
                                listU = W.T(identifier != 0 ? context.getString(identifier) : null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof e) {
                                    e eVar = th;
                                    listU = W.U(eVar.f28634a, eVar.f28635b, null);
                                } else {
                                    listU = W.U(th.getClass().getSimpleName(), th.toString(), p.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            mVar.d(listU);
                            return;
                        case 1:
                            m.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            m.d(obj3, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.GetCredentialRequestParams");
                            j jVar = (j) obj3;
                            m mVar2 = new m(mVar, 3);
                            t tVar2 = tVar;
                            tVar2.getClass();
                            try {
                                String str3 = jVar.f28643c;
                                if (str3 != null && !str3.isEmpty()) {
                                    AbstractActivityC1932d abstractActivityC1932d = tVar2.f28663e;
                                    if (abstractActivityC1932d == null) {
                                        AbstractC2315s.e(mVar2, new f(h.NO_ACTIVITY, "No activity available", null));
                                        return;
                                    }
                                    String str4 = jVar.f28645e;
                                    String str5 = jVar.f28644d;
                                    ArrayList arrayList = new ArrayList();
                                    if (jVar.f28641a) {
                                        if (str5 == null) {
                                            str5 = null;
                                        }
                                        arrayList.add(new p043d6.b(str3, str5, str4 != null ? str4 : null));
                                    } else {
                                        i iVar = jVar.f28642b;
                                        boolean z11 = iVar.f28639a;
                                        boolean z12 = iVar.f28640b;
                                        if (str3.length() <= 0) {
                                            throw new IllegalArgumentException("serverClientId should not be empty");
                                        }
                                        arrayList.add(new a(str3, str4 != null ? str4 : null, z11, z12));
                                    }
                                    m.f(tVar2.f28659a, "context");
                                    k kVar = new k(N8.n.W0(arrayList));
                                    ExecutorService executor = Executors.newSingleThreadExecutor();
                                    p161o8.p pVar = new p161o8.p(tVar2, mVar2);
                                    m.f(executor, "executor");
                                    d dVarB = j.b(new j(abstractActivityC1932d, 1), kVar);
                                    if (dVarB == null) {
                                        pVar.a(new g("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
                                        return;
                                    } else {
                                        dVarB.onGetCredential(abstractActivityC1932d, kVar, null, executor, pVar);
                                        return;
                                    }
                                }
                                AbstractC2315s.e(mVar2, new f(h.MISSING_SERVER_CLIENT_ID, "CredentialManager requires a serverClientId.", null));
                                return;
                            } catch (RuntimeException e2) {
                                AbstractC2315s.e(mVar2, new f(h.UNKNOWN, e2.getMessage(), "Cause: " + e2.getCause() + ", Stacktrace: " + Log.getStackTraceString(e2)));
                                return;
                            }
                        case 2:
                            m mVar3 = new m(mVar, 1);
                            t tVar3 = tVar;
                            s sVar = tVar3.f28660b;
                            Context context2 = tVar3.f28659a;
                            m.f(context2, "context");
                            O1.a aVar = new O1.a();
                            new Bundle();
                            ExecutorService executor2 = Executors.newSingleThreadExecutor();
                            u uVar = new u(mVar3);
                            m.f(executor2, "executor");
                            d dVarB2 = j.b(new j(context2, 1), "androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE");
                            if (dVarB2 == null) {
                                uVar.a(new P1.a());
                                return;
                            } else {
                                dVarB2.onClearCredential(aVar, null, executor2, uVar);
                                return;
                            }
                        case 3:
                            m.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            m.d(obj4, "null cannot be cast to non-null type kotlin.String");
                            m mVar4 = new m(mVar, 4);
                            t tVar4 = tVar;
                            s sVar2 = tVar4.f28661c;
                            s.d(tVar4.f28659a).clearToken(new ClearTokenRequest((String) obj4, null)).addOnSuccessListener(new q(mVar4)).addOnFailureListener(new q(mVar4));
                            return;
                        case 4:
                            m.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            m.d(obj5, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformAuthorizationRequest");
                            v vVar = (v) obj5;
                            Object obj6 = list.get(1);
                            m.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            final boolean zBooleanValue = ((Boolean) obj6).booleanValue();
                            final m mVar5 = new m(mVar, 0);
                            final t tVar5 = tVar;
                            tVar5.getClass();
                            try {
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it = vVar.f28668a.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(new Scope(1, (String) it.next()));
                                }
                                E.a("requestedScopes cannot be null or empty", !arrayList2.isEmpty());
                                String str6 = vVar.f28669b;
                                if (str6 != null) {
                                    E.e(str6);
                                    str = str6;
                                } else {
                                    str = null;
                                }
                                String str7 = vVar.f28671d;
                                if (str7 != null) {
                                    i15 = 1;
                                    str2 = str7;
                                    z10 = true;
                                } else {
                                    str2 = null;
                                    z10 = false;
                                    i15 = 0;
                                }
                                String str8 = vVar.f28670c;
                                s.d(tVar5.f28659a).authorize(new AuthorizationRequest(arrayList2, str2, z10, false, str8 != null ? new Account(str8, "com.google") : null, str, null, false, null, false, i15)).addOnSuccessListener(new OnSuccessListener() { // from class: x8.s
                                    @Override // com.google.android.gms.tasks.OnSuccessListener
                                    public final void onSuccess(Object obj7) {
                                        com.google.android.gms.auth.api.identity.d dVar = (com.google.android.gms.auth.api.identity.d) obj7;
                                        t tVar6 = tVar5;
                                        tVar6.getClass();
                                        PendingIntent pendingIntent = dVar.f17733f;
                                        m mVar6 = mVar5;
                                        if (pendingIntent == null) {
                                            AbstractC2315s.e(mVar6, new w(dVar.f17729b, dVar.f17728a, dVar.f17731d));
                                            return;
                                        }
                                        if (!zBooleanValue) {
                                            AbstractC2315s.e(mVar6, new a(c.UNAUTHORIZED, null, null));
                                            return;
                                        }
                                        AbstractActivityC1932d abstractActivityC1932d2 = tVar6.f28663e;
                                        if (abstractActivityC1932d2 == null) {
                                            AbstractC2315s.e(mVar6, new a(c.NO_ACTIVITY, "No activity available", null));
                                            return;
                                        }
                                        try {
                                            tVar6.f28664f = mVar6;
                                            abstractActivityC1932d2.startIntentSenderForResult(pendingIntent.getIntentSender(), 53294, null, 0, 0, 0, null);
                                        } catch (IntentSender.SendIntentException e4) {
                                            tVar6.f28664f = null;
                                            AbstractC2315s.e(mVar6, new a(c.PENDING_INTENT_EXCEPTION, e4.getMessage(), null));
                                        }
                                    }
                                }).addOnFailureListener(new c(mVar5, 6));
                                return;
                            } catch (RuntimeException e4) {
                                AbstractC2315s.e(mVar5, new a(c.API_EXCEPTION, e4.getMessage(), "Cause: " + e4.getCause() + ", Stacktrace: " + Log.getStackTraceString(e4)));
                                return;
                            }
                        default:
                            m.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            m.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformRevokeAccessRequest");
                            y yVar = (y) obj7;
                            m mVar6 = new m(mVar, 2);
                            t tVar6 = tVar;
                            tVar6.getClass();
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it2 = yVar.f28682b.iterator();
                            while (it2.hasNext()) {
                                arrayList3.add(new Scope(1, (String) it2.next()));
                            }
                            s.d(tVar6.f28659a).revokeAccess(new RevokeAccessRequest(zbbj.zbi(arrayList3), new Account(yVar.f28681a, "com.google"), null)).addOnSuccessListener(new r(mVar6)).addOnFailureListener(new r(mVar6));
                            return;
                    }
                }
            });
        } else {
            c2061m5.J(null);
        }
        C2061m c2061m6 = new C2061m(binaryMessenger, b.k("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.revokeAccess", ""), a(), obj);
        if (tVar == null) {
            c2061m6.J(null);
        } else {
            final int i15 = 5;
            c2061m6.J(new p161o8.b() { // from class: x8.n
                @Override // p161o8.b
                public final void g(Object obj2, W4.m mVar) {
                    List listU;
                    String str;
                    String str2;
                    boolean z10;
                    int i16;
                    switch (i15) {
                        case 0:
                            try {
                                Context context = tVar.f28659a;
                                int identifier = context.getResources().getIdentifier("default_web_client_id", "string", context.getPackageName());
                                listU = W.T(identifier != 0 ? context.getString(identifier) : null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof e) {
                                    e eVar = th;
                                    listU = W.U(eVar.f28634a, eVar.f28635b, null);
                                } else {
                                    listU = W.U(th.getClass().getSimpleName(), th.toString(), p.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            mVar.d(listU);
                            return;
                        case 1:
                            m.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            m.d(obj3, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.GetCredentialRequestParams");
                            j jVar = (j) obj3;
                            m mVar2 = new m(mVar, 3);
                            t tVar2 = tVar;
                            tVar2.getClass();
                            try {
                                String str3 = jVar.f28643c;
                                if (str3 != null && !str3.isEmpty()) {
                                    AbstractActivityC1932d abstractActivityC1932d = tVar2.f28663e;
                                    if (abstractActivityC1932d == null) {
                                        AbstractC2315s.e(mVar2, new f(h.NO_ACTIVITY, "No activity available", null));
                                        return;
                                    }
                                    String str4 = jVar.f28645e;
                                    String str5 = jVar.f28644d;
                                    ArrayList arrayList = new ArrayList();
                                    if (jVar.f28641a) {
                                        if (str5 == null) {
                                            str5 = null;
                                        }
                                        arrayList.add(new p043d6.b(str3, str5, str4 != null ? str4 : null));
                                    } else {
                                        i iVar = jVar.f28642b;
                                        boolean z11 = iVar.f28639a;
                                        boolean z12 = iVar.f28640b;
                                        if (str3.length() <= 0) {
                                            throw new IllegalArgumentException("serverClientId should not be empty");
                                        }
                                        arrayList.add(new a(str3, str4 != null ? str4 : null, z11, z12));
                                    }
                                    m.f(tVar2.f28659a, "context");
                                    k kVar = new k(N8.n.W0(arrayList));
                                    ExecutorService executor = Executors.newSingleThreadExecutor();
                                    p161o8.p pVar = new p161o8.p(tVar2, mVar2);
                                    m.f(executor, "executor");
                                    d dVarB = j.b(new j(abstractActivityC1932d, 1), kVar);
                                    if (dVarB == null) {
                                        pVar.a(new g("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
                                        return;
                                    } else {
                                        dVarB.onGetCredential(abstractActivityC1932d, kVar, null, executor, pVar);
                                        return;
                                    }
                                }
                                AbstractC2315s.e(mVar2, new f(h.MISSING_SERVER_CLIENT_ID, "CredentialManager requires a serverClientId.", null));
                                return;
                            } catch (RuntimeException e2) {
                                AbstractC2315s.e(mVar2, new f(h.UNKNOWN, e2.getMessage(), "Cause: " + e2.getCause() + ", Stacktrace: " + Log.getStackTraceString(e2)));
                                return;
                            }
                        case 2:
                            m mVar3 = new m(mVar, 1);
                            t tVar3 = tVar;
                            s sVar = tVar3.f28660b;
                            Context context2 = tVar3.f28659a;
                            m.f(context2, "context");
                            O1.a aVar = new O1.a();
                            new Bundle();
                            ExecutorService executor2 = Executors.newSingleThreadExecutor();
                            u uVar = new u(mVar3);
                            m.f(executor2, "executor");
                            d dVarB2 = j.b(new j(context2, 1), "androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE");
                            if (dVarB2 == null) {
                                uVar.a(new P1.a());
                                return;
                            } else {
                                dVarB2.onClearCredential(aVar, null, executor2, uVar);
                                return;
                            }
                        case 3:
                            m.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            m.d(obj4, "null cannot be cast to non-null type kotlin.String");
                            m mVar4 = new m(mVar, 4);
                            t tVar4 = tVar;
                            s sVar2 = tVar4.f28661c;
                            s.d(tVar4.f28659a).clearToken(new ClearTokenRequest((String) obj4, null)).addOnSuccessListener(new q(mVar4)).addOnFailureListener(new q(mVar4));
                            return;
                        case 4:
                            m.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            m.d(obj5, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformAuthorizationRequest");
                            v vVar = (v) obj5;
                            Object obj6 = list.get(1);
                            m.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            final boolean zBooleanValue = ((Boolean) obj6).booleanValue();
                            final m mVar5 = new m(mVar, 0);
                            final t tVar5 = tVar;
                            tVar5.getClass();
                            try {
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it = vVar.f28668a.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(new Scope(1, (String) it.next()));
                                }
                                E.a("requestedScopes cannot be null or empty", !arrayList2.isEmpty());
                                String str6 = vVar.f28669b;
                                if (str6 != null) {
                                    E.e(str6);
                                    str = str6;
                                } else {
                                    str = null;
                                }
                                String str7 = vVar.f28671d;
                                if (str7 != null) {
                                    i16 = 1;
                                    str2 = str7;
                                    z10 = true;
                                } else {
                                    str2 = null;
                                    z10 = false;
                                    i16 = 0;
                                }
                                String str8 = vVar.f28670c;
                                s.d(tVar5.f28659a).authorize(new AuthorizationRequest(arrayList2, str2, z10, false, str8 != null ? new Account(str8, "com.google") : null, str, null, false, null, false, i16)).addOnSuccessListener(new OnSuccessListener() { // from class: x8.s
                                    @Override // com.google.android.gms.tasks.OnSuccessListener
                                    public final void onSuccess(Object obj7) {
                                        com.google.android.gms.auth.api.identity.d dVar = (com.google.android.gms.auth.api.identity.d) obj7;
                                        t tVar6 = tVar5;
                                        tVar6.getClass();
                                        PendingIntent pendingIntent = dVar.f17733f;
                                        m mVar6 = mVar5;
                                        if (pendingIntent == null) {
                                            AbstractC2315s.e(mVar6, new w(dVar.f17729b, dVar.f17728a, dVar.f17731d));
                                            return;
                                        }
                                        if (!zBooleanValue) {
                                            AbstractC2315s.e(mVar6, new a(c.UNAUTHORIZED, null, null));
                                            return;
                                        }
                                        AbstractActivityC1932d abstractActivityC1932d2 = tVar6.f28663e;
                                        if (abstractActivityC1932d2 == null) {
                                            AbstractC2315s.e(mVar6, new a(c.NO_ACTIVITY, "No activity available", null));
                                            return;
                                        }
                                        try {
                                            tVar6.f28664f = mVar6;
                                            abstractActivityC1932d2.startIntentSenderForResult(pendingIntent.getIntentSender(), 53294, null, 0, 0, 0, null);
                                        } catch (IntentSender.SendIntentException e4) {
                                            tVar6.f28664f = null;
                                            AbstractC2315s.e(mVar6, new a(c.PENDING_INTENT_EXCEPTION, e4.getMessage(), null));
                                        }
                                    }
                                }).addOnFailureListener(new c(mVar5, 6));
                                return;
                            } catch (RuntimeException e4) {
                                AbstractC2315s.e(mVar5, new a(c.API_EXCEPTION, e4.getMessage(), "Cause: " + e4.getCause() + ", Stacktrace: " + Log.getStackTraceString(e4)));
                                return;
                            }
                        default:
                            m.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            m.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformRevokeAccessRequest");
                            y yVar = (y) obj7;
                            m mVar6 = new m(mVar, 2);
                            t tVar6 = tVar;
                            tVar6.getClass();
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it2 = yVar.f28682b.iterator();
                            while (it2.hasNext()) {
                                arrayList3.add(new Scope(1, (String) it2.next()));
                            }
                            s.d(tVar6.f28659a).revokeAccess(new RevokeAccessRequest(zbbj.zbi(arrayList3), new Account(yVar.f28681a, "com.google"), null)).addOnSuccessListener(new r(mVar6)).addOnFailureListener(new r(mVar6));
                            return;
                    }
                }
            });
        }
    }
}
