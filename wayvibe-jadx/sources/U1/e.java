package U1;

import D8.RunnableC0290l;
import M8.D;
import N8.n;
import N8.o;
import N8.y;
import T1.g;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import com.google.android.gms.auth.api.identity.j;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.m;
import p206t6.l;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Z8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12059c;

    public /* synthetic */ e(int i10, Object obj, Object obj2) {
        this.f12057a = i10;
        this.f12058b = obj;
        this.f12059c = obj2;
    }

    @Override // Z8.c
    public final Object invoke(Object obj) {
        Y7.f fVar;
        Integer num;
        switch (this.f12057a) {
            case 0:
                P1.e e2 = (P1.e) obj;
                m.f(e2, "e");
                ((Executor) this.f12058b).execute(new f((O1.c) this.f12059c, e2, 0));
                break;
            case 1:
                j jVar = (j) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                CancellationSignal cancellationSignal = (CancellationSignal) this.f12058b;
                if (!g.a(cancellationSignal)) {
                    V1.c cVar = (V1.c) this.f12059c;
                    Intent intent = new Intent(cVar.f12470e, (Class<?>) HiddenActivity.class);
                    d.a(cVar.f12474i, intent, "BEGIN_SIGN_IN");
                    intent.putExtra("EXTRA_FLOW_PENDING_INTENT", jVar.f17758a);
                    try {
                        cVar.f12470e.startActivity(intent);
                    } catch (Exception unused) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!g.a(cancellationSignal)) {
                            cVar.e().execute(new RunnableC0290l(cVar, 15));
                        }
                    }
                }
                break;
            case 2:
                PendingIntent result = (PendingIntent) obj;
                m.f(result, "result");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f12058b;
                if (!g.a(cancellationSignal2)) {
                    X1.b bVar = (X1.b) this.f12059c;
                    Intent intent2 = new Intent(bVar.f13052e, (Class<?>) HiddenActivity.class);
                    d.a(bVar.f13056i, intent2, "SIGN_IN_INTENT");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", result);
                    try {
                        bVar.f13052e.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!g.a(cancellationSignal2)) {
                            bVar.f().execute(new RunnableC0290l(bVar, 17));
                        }
                    }
                }
                break;
            case 3:
                Activity activity = (Activity) this.f12059c;
                p206t6.a aVar = (p206t6.a) obj;
                if (aVar.f26861c == 3 && (num = (fVar = (Y7.f) this.f12058b).f13402g) != null && num.intValue() == 1) {
                    try {
                        if (fVar.f13404i != null) {
                            p206t6.d.c(aVar, activity, l.a(1));
                        }
                    } catch (IntentSender.SendIntentException e4) {
                        Log.e("in_app_update", "Could not start update flow", e4);
                    }
                }
                break;
            case 4:
                p206t6.a aVar2 = (p206t6.a) obj;
                ((Y7.f) this.f12058b).f13403h = aVar2;
                M8.l lVar = new M8.l("updateAvailability", Integer.valueOf(aVar2.f26861c));
                M8.l lVar2 = new M8.l("immediateAllowed", Boolean.valueOf(aVar2.b(l.a(1)) != null));
                Set<Integer> setA = aVar2.a(l.a(1));
                ArrayList arrayList = new ArrayList(o.o0(setA, 10));
                for (Integer num2 : setA) {
                    num2.getClass();
                    arrayList.add(num2);
                }
                M8.l lVar3 = new M8.l("immediateAllowedPreconditions", n.W0(arrayList));
                M8.l lVar4 = new M8.l("flexibleAllowed", Boolean.valueOf(aVar2.b(l.a(0)) != null));
                Set<Integer> setA2 = aVar2.a(l.a(0));
                ArrayList arrayList2 = new ArrayList(o.o0(setA2, 10));
                for (Integer num3 : setA2) {
                    num3.getClass();
                    arrayList2.add(num3);
                }
                ((p150n8.o) this.f12059c).b(y.g0(lVar, lVar2, lVar3, lVar4, new M8.l("flexibleAllowedPreconditions", n.W0(arrayList2)), new M8.l("availableVersionCode", Integer.valueOf(aVar2.f26860b)), new M8.l("installStatus", Integer.valueOf(aVar2.f26862d)), new M8.l("packageName", aVar2.f26859a), new M8.l("clientVersionStalenessDays", aVar2.f26863e), new M8.l("updatePriority", Integer.valueOf(aVar2.f26864f))));
                break;
            case 5:
                ((p131l9.d) this.f12058b).f22111c.removeCallbacks((C8.a) this.f12059c);
                break;
            default:
                ((t9.c) this.f12059c).getClass();
                ((t9.d) this.f12058b).e(null);
                break;
        }
        return D.f8402a;
    }
}
