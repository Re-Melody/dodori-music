package Y7;

import M8.D;
import T0.C0802e;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import kotlin.jvm.internal.m;
import p150n8.o;
import p161o8.h;
import p161o8.i;
import p161o8.j;
import p161o8.q;
import p161o8.r;
import p161o8.s;
import p161o8.u;
import p206t6.l;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements p118k8.b, q, u, Application.ActivityLifecycleCallbacks, p130l8.a, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f13396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f13397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f13398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f13399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f13400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f13401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f13402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p206t6.a f13403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p206t6.d f13404i;

    @Override // p161o8.i
    public final void a(Object obj, h hVar) {
        this.f13399d = hVar;
    }

    public final void b(o oVar, Z8.a aVar) {
        if (this.f13403h == null) {
            oVar.d(null, "REQUIRE_CHECK_FOR_UPDATE", "Call checkForUpdate first!");
            throw new IllegalArgumentException("kotlin.Unit");
        }
        a aVar2 = this.f13400e;
        if ((aVar2 != null ? aVar2.l() : null) == null) {
            oVar.d(null, "REQUIRE_FOREGROUND_ACTIVITY", "in_app_update requires a foreground activity");
            throw new IllegalArgumentException("kotlin.Unit");
        }
        if (this.f13404i != null) {
            aVar.invoke();
        } else {
            oVar.d(null, "REQUIRE_CHECK_FOR_UPDATE", "Call checkForUpdate first!");
            throw new IllegalArgumentException("kotlin.Unit");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m.f(activity, "activity");
    }

    @Override // p161o8.u
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        o oVar;
        if (i10 != 1276) {
            return false;
        }
        Integer num = this.f13402g;
        if (num != null && num.intValue() == 1) {
            if (i11 == -1) {
                o oVar2 = this.f13401f;
                if (oVar2 != null) {
                    oVar2.b(null);
                }
            } else if (i11 == 0) {
                o oVar3 = this.f13401f;
                if (oVar3 != null) {
                    oVar3.d(null, "USER_DENIED_UPDATE", String.valueOf(i11));
                }
            } else if (i11 == 1 && (oVar = this.f13401f) != null) {
                oVar.d(null, "IN_APP_UPDATE_FAILED", "Some other error prevented either the user from providing consent or the update to proceed.");
            }
            this.f13401f = null;
            return true;
        }
        Integer num2 = this.f13402g;
        if (num2 == null || num2.intValue() != 0) {
            return false;
        }
        if (i11 == 0) {
            o oVar4 = this.f13401f;
            if (oVar4 != null) {
                oVar4.d(null, "USER_DENIED_UPDATE", String.valueOf(i11));
            }
            this.f13401f = null;
            return true;
        }
        if (i11 != 1) {
            return true;
        }
        o oVar5 = this.f13401f;
        if (oVar5 != null) {
            oVar5.d(null, "IN_APP_UPDATE_FAILED", String.valueOf(i11));
        }
        this.f13401f = null;
        return true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Task taskA;
        m.f(activity, "activity");
        p206t6.d dVar = this.f13404i;
        if (dVar == null || (taskA = dVar.a()) == null) {
            return;
        }
        taskA.addOnSuccessListener(new A8.b(new U1.e(3, this, activity), 22));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        m.f(activity, "activity");
        m.f(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m.f(activity, "activity");
    }

    @Override // p130l8.a
    public final void onAttachedToActivity(p130l8.b activityPluginBinding) {
        m.f(activityPluginBinding, "activityPluginBinding");
        this.f13400e = new F5.i(activityPluginBinding, 28);
    }

    @Override // p118k8.b
    public final void onAttachedToEngine(p118k8.a flutterPluginBinding) {
        m.f(flutterPluginBinding, "flutterPluginBinding");
        p161o8.f fVar = flutterPluginBinding.f21665c;
        s sVar = new s(fVar, "de.ffuf.in_app_update/methods");
        this.f13396a = sVar;
        sVar.b(this);
        j jVar = new j(fVar, "de.ffuf.in_app_update/stateEvents");
        this.f13397b = jVar;
        jVar.a(this);
        b bVar = new b(this, 0);
        this.f13398c = bVar;
        p206t6.d dVar = this.f13404i;
        if (dVar != null) {
            dVar.b(bVar);
        }
    }

    @Override // p161o8.i
    public final void onCancel() {
        this.f13399d = null;
    }

    @Override // p130l8.a
    public final void onDetachedFromActivity() {
        this.f13400e = null;
    }

    @Override // p130l8.a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f13400e = null;
    }

    @Override // p118k8.b
    public final void onDetachedFromEngine(p118k8.a binding) {
        m.f(binding, "binding");
        s sVar = this.f13396a;
        if (sVar == null) {
            m.l("channel");
            throw null;
        }
        sVar.b(null);
        j jVar = this.f13397b;
        if (jVar == null) {
            m.l("event");
            throw null;
        }
        jVar.a(null);
        p206t6.d dVar = this.f13404i;
        if (dVar != null) {
            b bVar = this.f13398c;
            if (bVar == null) {
                m.l("installStateUpdatedListener");
                throw null;
            }
            synchronized (dVar) {
                p206t6.c cVar = dVar.f26884b;
                synchronized (cVar) {
                    cVar.f26878a.c("unregisterListener", new Object[0]);
                    cVar.f26881d.remove(bVar);
                    cVar.a();
                }
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p161o8.q
    public final void onMethodCall(p161o8.o call, r rVar) {
        p206t6.e eVar;
        Application application;
        m.f(call, "call");
        String str = call.f23827a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1873373639:
                    if (str.equals("performImmediateUpdate")) {
                        final o oVar = (o) rVar;
                        final int i10 = 1;
                        b(oVar, new Z8.a(this) { // from class: Y7.c

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ f f13389b;

                            {
                                this.f13389b = this;
                            }

                            @Override // Z8.a
                            public final Object invoke() throws IntentSender.SendIntentException {
                                switch (i10) {
                                    case 0:
                                        f fVar = this.f13389b;
                                        fVar.f13402g = 0;
                                        fVar.f13401f = oVar;
                                        if (fVar.f13404i != null) {
                                            p206t6.a aVar = fVar.f13403h;
                                            m.c(aVar);
                                            a aVar2 = fVar.f13400e;
                                            m.c(aVar2);
                                            p206t6.d.c(aVar, aVar2.l(), l.a(0));
                                        }
                                        p206t6.d dVar = fVar.f13404i;
                                        if (dVar != null) {
                                            dVar.b(new b(fVar, 1));
                                        }
                                        break;
                                    default:
                                        f fVar2 = this.f13389b;
                                        fVar2.f13402g = 1;
                                        fVar2.f13401f = oVar;
                                        if (fVar2.f13404i != null) {
                                            p206t6.a aVar3 = fVar2.f13403h;
                                            m.c(aVar3);
                                            a aVar4 = fVar2.f13400e;
                                            m.c(aVar4);
                                            p206t6.d.c(aVar3, aVar4.l(), l.a(1));
                                        }
                                        break;
                                }
                                return D.f8402a;
                            }
                        });
                        return;
                    }
                    break;
                case -1541164682:
                    if (str.equals("startFlexibleUpdate")) {
                        final o oVar2 = (o) rVar;
                        final int i11 = 0;
                        b(oVar2, new Z8.a(this) { // from class: Y7.c

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ f f13389b;

                            {
                                this.f13389b = this;
                            }

                            @Override // Z8.a
                            public final Object invoke() throws IntentSender.SendIntentException {
                                switch (i11) {
                                    case 0:
                                        f fVar = this.f13389b;
                                        fVar.f13402g = 0;
                                        fVar.f13401f = oVar2;
                                        if (fVar.f13404i != null) {
                                            p206t6.a aVar = fVar.f13403h;
                                            m.c(aVar);
                                            a aVar2 = fVar.f13400e;
                                            m.c(aVar2);
                                            p206t6.d.c(aVar, aVar2.l(), l.a(0));
                                        }
                                        p206t6.d dVar = fVar.f13404i;
                                        if (dVar != null) {
                                            dVar.b(new b(fVar, 1));
                                        }
                                        break;
                                    default:
                                        f fVar2 = this.f13389b;
                                        fVar2.f13402g = 1;
                                        fVar2.f13401f = oVar2;
                                        if (fVar2.f13404i != null) {
                                            p206t6.a aVar3 = fVar2.f13403h;
                                            m.c(aVar3);
                                            a aVar4 = fVar2.f13400e;
                                            m.c(aVar4);
                                            p206t6.d.c(aVar3, aVar4.l(), l.a(1));
                                        }
                                        break;
                                }
                                return D.f8402a;
                            }
                        });
                        return;
                    }
                    break;
                case -1317168438:
                    if (str.equals("checkForUpdate")) {
                        a aVar = this.f13400e;
                        if ((aVar != null ? aVar.l() : null) == null) {
                            ((o) rVar).d(null, "REQUIRE_FOREGROUND_ACTIVITY", "in_app_update requires a foreground activity");
                            throw new IllegalArgumentException("kotlin.Unit");
                        }
                        a aVar2 = this.f13400e;
                        if (aVar2 != null) {
                            aVar2.g(this);
                        }
                        a aVar3 = this.f13400e;
                        if (aVar3 != null && (application = aVar3.l().getApplication()) != null) {
                            application.registerActivityLifecycleCallbacks(this);
                        }
                        a aVar4 = this.f13400e;
                        m.c(aVar4);
                        Context contextL = aVar4.l();
                        synchronized (p206t6.b.class) {
                            try {
                                if (p206t6.b.f26869a == null) {
                                    Context applicationContext = contextL.getApplicationContext();
                                    if (applicationContext != null) {
                                        contextL = applicationContext;
                                    }
                                    p206t6.b.f26869a = new p206t6.e(new C0802e(contextL, false));
                                }
                                eVar = p206t6.b.f26869a;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        p206t6.d dVar = (p206t6.d) eVar.f26886a.zza();
                        this.f13404i = dVar;
                        m.c(dVar);
                        Task taskA = dVar.a();
                        m.e(taskA, "getAppUpdateInfo(...)");
                        o oVar3 = (o) rVar;
                        taskA.addOnSuccessListener(new A8.b(new U1.e(4, this, oVar3), 23));
                        taskA.addOnFailureListener(new d(oVar3, 0));
                        return;
                    }
                    break;
                case -193504755:
                    if (str.equals("completeFlexibleUpdate")) {
                        b((o) rVar, new F9.h(this, 3));
                        return;
                    }
                    break;
            }
        }
        ((o) rVar).c();
    }

    @Override // p130l8.a
    public final void onReattachedToActivityForConfigChanges(p130l8.b activityPluginBinding) {
        m.f(activityPluginBinding, "activityPluginBinding");
        this.f13400e = new e(activityPluginBinding, 0);
    }
}
