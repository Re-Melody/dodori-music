package com.google.android.gms.auth.api.signin.internal;

import A9.C0108h;
import F5.i;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.K;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import java.lang.reflect.Modifier;
import java.util.Set;
import p193s2.a;
import p193s2.b;
import p193s2.c;
import p193s2.d;
import p199t.H;

/* JADX INFO: loaded from: classes.dex */
public class SignInHubActivity extends K {
    public static boolean k = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f17817f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SignInConfiguration f17818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17820i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Intent f17821j;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.lifecycle.u, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void e() {
        a supportLoaderManager = getSupportLoaderManager();
        i iVar = new i(this);
        d dVar = (d) supportLoaderManager;
        c cVar = dVar.f26074b;
        if (cVar.f26072b) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        H h10 = cVar.f26071a;
        b bVar = (b) h10.c(0);
        ?? r10 = dVar.f26073a;
        if (bVar == 0) {
            try {
                cVar.f26072b = true;
                SignInHubActivity signInHubActivity = (SignInHubActivity) iVar.f4547b;
                Set set = q.f17975a;
                synchronized (set) {
                }
                F5.d dVar2 = new F5.d(signInHubActivity, set);
                if (F5.d.class.isMemberClass() && !Modifier.isStatic(F5.d.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + dVar2);
                }
                b bVar2 = new b(dVar2);
                h10.d(0, bVar2);
                cVar.f26072b = false;
                C0108h c0108h = new C0108h(bVar2.f26067l, iVar);
                bVar2.d(r10, c0108h);
                C0108h c0108h2 = bVar2.f26069n;
                if (c0108h2 != null) {
                    bVar2.g(c0108h2);
                }
                bVar2.f26068m = r10;
                bVar2.f26069n = c0108h;
            } catch (Throwable th) {
                cVar.f26072b = false;
                throw th;
            }
        } else {
            C0108h c0108h3 = new C0108h(bVar.f26067l, iVar);
            bVar.d(r10, c0108h3);
            C0108h c0108h4 = bVar.f26069n;
            if (c0108h4 != null) {
                bVar.g(c0108h4);
            }
            bVar.f26068m = r10;
            bVar.f26069n = c0108h3;
        }
        k = false;
    }

    public final void f(int i10) {
        Status status = new Status(i10, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        k = false;
    }

    @Override // androidx.fragment.app.K, p036d.n, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.f17817f) {
            return;
        }
        setResult(0);
        if (i10 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.f17813b) != null) {
                i iVarE = i.E(this);
                GoogleSignInOptions googleSignInOptions = this.f17818g.f17816b;
                synchronized (iVarE) {
                    ((F5.b) iVarE.f4547b).c(googleSignInAccount, googleSignInOptions);
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.f17819h = true;
                this.f17820i = i11;
                this.f17821j = intent;
                e();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                f(intExtra);
                return;
            }
        }
        f(8);
    }

    @Override // androidx.fragment.app.K, p036d.n, androidx.core.app.AbstractActivityC1038h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            Log.e("AuthSignInClient", "Null action");
            f(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e("AuthSignInClient", "Action not implemented");
            f(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            Log.e("AuthSignInClient", "Activity started with no configuration.");
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f17818g = signInConfiguration;
        if (bundle != null) {
            boolean z10 = bundle.getBoolean("signingInGoogleApiClients");
            this.f17819h = z10;
            if (z10) {
                this.f17820i = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                if (intent2 != null) {
                    this.f17821j = intent2;
                    e();
                    return;
                } else {
                    Log.e("AuthSignInClient", "Sign in result data cannot be null");
                    setResult(0);
                    finish();
                    return;
                }
            }
            return;
        }
        if (k) {
            setResult(0);
            f(12502);
            return;
        }
        k = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra("config", this.f17818g);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f17817f = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            f(17);
        }
    }

    @Override // androidx.fragment.app.K, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        k = false;
    }

    @Override // p036d.n, androidx.core.app.AbstractActivityC1038h, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f17819h);
        if (this.f17819h) {
            bundle.putInt("signInResultCode", this.f17820i);
            bundle.putParcelable("signInResultData", this.f17821j);
        }
    }
}
