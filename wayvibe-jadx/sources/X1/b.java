package X1;

import O1.c;
import O1.k;
import P1.h;
import T1.g;
import U1.d;
import U1.e;
import android.content.Context;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.auth.api.identity.l;
import com.google.android.gms.auth.api.identity.q;
import com.google.android.gms.common.internal.E;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f13052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f13053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Executor f13054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CancellationSignal f13055h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final V1.b f13056i;

    public b(Context context) {
        m.f(context, "context");
        this.f13052e = context;
        this.f13056i = new V1.b(this, new Handler(Looper.getMainLooper()), 1);
    }

    public static l c(k request) throws h {
        m.f(request, "request");
        List list = request.f9016a;
        if (list.size() != 1) {
            throw new h("GetSignInWithGoogleOption cannot be combined with other options.");
        }
        Object obj = list.get(0);
        m.d(obj, "null cannot be cast to non-null type com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption");
        p043d6.b bVar = (p043d6.b) obj;
        String str = bVar.f19286d;
        E.h(str);
        return new l(str, bVar.f19287e, null, bVar.f19288f, false, 0, null);
    }

    public final O1.l d(q qVar) throws P1.d {
        String str = qVar.f17778g;
        p043d6.c cVar = null;
        if (str != null) {
            String str2 = qVar.f17772a;
            m.e(str2, "getId(...)");
            String str3 = qVar.f17773b;
            if (str3 == null) {
                str3 = null;
            }
            String str4 = qVar.f17774c;
            String str5 = str4 != null ? str4 : null;
            String str6 = qVar.f17775d;
            if (str6 == null) {
                str6 = null;
            }
            String str7 = qVar.f17779h;
            String str8 = str7 != null ? str7 : null;
            Uri uri = qVar.f17776e;
            cVar = new p043d6.c(str2, str, str3, str6, str5, uri != null ? uri : null, str8);
        } else {
            Log.w("GetSignInIntent", "Credential returned but no google Id found");
        }
        if (cVar != null) {
            return new O1.l(cVar);
        }
        throw new P1.d("When attempting to convert get response, null credential found");
    }

    public final c e() {
        c cVar = this.f13053f;
        if (cVar != null) {
            return cVar;
        }
        m.l("callback");
        throw null;
    }

    public final Executor f() {
        Executor executor = this.f13054g;
        if (executor != null) {
            return executor;
        }
        m.l("executor");
        throw null;
    }

    public final void g(k request, CancellationSignal cancellationSignal, Executor executor, c callback) {
        m.f(request, "request");
        m.f(callback, "callback");
        m.f(executor, "executor");
        this.f13055h = cancellationSignal;
        this.f13053f = callback;
        this.f13054g = executor;
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (g.a(cancellationSignal)) {
            return;
        }
        try {
            p242x0.c.w(this.f13052e).getSignInIntent(c(request)).addOnSuccessListener(new A8.b(new e(2, cancellationSignal, this), 20)).addOnFailureListener(new A7.a(7, this, cancellationSignal));
        } catch (h e2) {
            CredentialProviderPlayServicesImpl.Companion.getClass();
            if (g.a(cancellationSignal)) {
                return;
            }
            f().execute(new A1.k(28, this, e2));
        }
    }
}
