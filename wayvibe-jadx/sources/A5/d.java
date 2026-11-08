package A5;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.AbstractC1131a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.InterfaceC1141h;
import com.google.android.gms.common.api.internal.InterfaceC1151s;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.internal.C1167i;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.internal.auth.zzam;
import com.google.android.gms.internal.auth.zzbe;
import com.google.android.gms.internal.p000authapi.zbd;
import com.google.android.gms.internal.p001authapiphone.zzw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC1131a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f287a;

    @Override // com.google.android.gms.common.api.AbstractC1131a
    public g buildClient(Context context, Looper looper, C1167i c1167i, Object obj, o oVar, p pVar) {
        switch (this.f287a) {
            case 0:
                return new zbd(context, looper, c1167i, (e) obj, oVar, pVar);
            case 1:
                return new F5.e(context, looper, c1167i, (GoogleSignInOptions) obj, oVar, pVar);
            case 2:
            case 3:
            case 4:
            case 5:
            default:
                return super.buildClient(context, looper, c1167i, obj, oVar, pVar);
            case 6:
                c1167i.getClass();
                Integer num = c1167i.f18043g;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new p032c6.a(context, looper, c1167i, bundle, oVar, pVar);
            case 7:
                obj.getClass();
                throw new ClassCastException();
            case 8:
                return new zzam(context, looper, c1167i, oVar, pVar);
        }
    }

    @Override // com.google.android.gms.common.api.f
    public List getImpliedScopes(Object obj) {
        switch (this.f287a) {
            case 1:
                GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
                return googleSignInOptions == null ? Collections.EMPTY_LIST : new ArrayList(googleSignInOptions.f17803b);
            default:
                return super.getImpliedScopes(obj);
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC1131a
    public g buildClient(Context context, Looper looper, C1167i commonSettings, Object obj, InterfaceC1141h connectedListener, InterfaceC1151s connectionFailedListener) {
        switch (this.f287a) {
            case 2:
                return new zzbe(context, looper, commonSettings, (c) obj, connectedListener, connectionFailedListener);
            case 3:
                return new zzw(context, looper, commonSettings, connectedListener, connectionFailedListener);
            case 4:
                return new J5.c(context, looper, commonSettings, (w) obj, connectedListener, connectionFailedListener);
            case 5:
                com.google.android.gms.common.api.d apiOptions = (com.google.android.gms.common.api.d) obj;
                m.f(context, "context");
                m.f(looper, "looper");
                m.f(commonSettings, "commonSettings");
                m.f(apiOptions, "apiOptions");
                m.f(connectedListener, "connectedListener");
                m.f(connectionFailedListener, "connectionFailedListener");
                return new Y5.e(context, looper, 352, commonSettings, connectedListener, connectionFailedListener);
            default:
                return super.buildClient(context, looper, commonSettings, obj, connectedListener, connectionFailedListener);
        }
    }
}
