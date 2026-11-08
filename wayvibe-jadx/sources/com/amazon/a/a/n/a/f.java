package com.amazon.a.a.n.a;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public class f extends com.amazon.a.a.i.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f16295b = new com.amazon.a.a.o.c("DecisionDialog");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f16297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BlockingQueue<a> f16298e = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Thread f16296c = Thread.currentThread();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.amazon.d.a.a f16301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f16302b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Intent f16303c;

        public a(com.amazon.d.a.a aVar) {
            this.f16301a = aVar;
            this.f16302b = aVar.a();
            this.f16303c = aVar.b();
        }

        public com.amazon.d.a.a a() {
            return this.f16301a;
        }

        public String b() {
            return this.f16302b;
        }

        public Intent c() {
            return this.f16303c;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f16304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f16305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f16306c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final a f16307d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final a f16308e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final a f16309f;

        public b(com.amazon.d.a.f fVar) {
            this.f16304a = fVar.b();
            this.f16305b = fVar.c();
            this.f16306c = fVar.d();
            this.f16307d = a(fVar.e());
            this.f16308e = a(fVar.f());
            this.f16309f = a(fVar.g());
        }

        private a a(com.amazon.d.a.a aVar) {
            if (aVar == null) {
                return null;
            }
            return new a(aVar);
        }

        public String b() {
            return this.f16305b;
        }

        public long c() {
            return this.f16306c;
        }

        public a d() {
            return this.f16309f;
        }

        public a e() {
            return this.f16308e;
        }

        public a f() {
            return this.f16307d;
        }

        public String a() {
            return this.f16304a;
        }
    }

    public f(com.amazon.d.a.f fVar) {
        this.f16297d = new b(fVar);
    }

    private ActivityInfo e(Activity activity) {
        try {
            return activity.getPackageManager().getActivityInfo(activity.getComponentName(), ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);
        } catch (PackageManager.NameNotFoundException unused) {
            if (!com.amazon.a.a.o.c.f16457b) {
                return null;
            }
            f16295b.b("Unable to get info for activity: " + activity);
            return null;
        }
    }

    private Dialog f(Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(this.f16297d.a()).setMessage(this.f16297d.b()).setCancelable(false);
        AlertDialog alertDialogCreate = builder.create();
        a(activity, alertDialogCreate, this.f16297d.f(), -1);
        a(activity, alertDialogCreate, this.f16297d.e(), -3);
        a(activity, alertDialogCreate, this.f16297d.d(), -2);
        return alertDialogCreate;
    }

    private com.amazon.d.a.a n() throws com.amazon.a.a.n.a.a.e {
        try {
            if (com.amazon.a.a.o.c.f16456a) {
                f16295b.a("Blocking while awaiting customer decision: " + Thread.currentThread());
            }
            return this.f16298e.take().a();
        } catch (InterruptedException unused) {
            if (com.amazon.a.a.o.c.f16456a) {
                f16295b.a("Interrupted while awaiting decision, throwing decision expired!");
            }
            throw new com.amazon.a.a.n.a.a.e(o());
        }
    }

    private e o() {
        return l() == com.amazon.a.a.i.d.NOT_COMPATIBLE ? e.APP_NOT_COMPATIBLE : e.EXPIRATION_DURATION_ELAPSED;
    }

    private boolean p() {
        return a(this.f16297d.f()) || a(this.f16297d.e()) || a(this.f16297d.d());
    }

    @Override // com.amazon.a.a.i.b
    public Dialog d(Activity activity) {
        return f(activity);
    }

    @Override // com.amazon.a.a.e.c
    public long h() {
        return this.f16297d.c();
    }

    public com.amazon.d.a.a i() {
        if (com.amazon.a.a.o.c.f16456a) {
            f16295b.a("GetCustomerDecision: " + this.f16296c);
        }
        return n();
    }

    public String toString() {
        return "DecisionDialog: " + this.f16297d.a();
    }

    private boolean a(a aVar) {
        return (aVar == null || aVar.c() == null) ? false : true;
    }

    @Override // com.amazon.a.a.i.b
    public boolean b(Activity activity) {
        if (!p()) {
            return true;
        }
        ActivityInfo activityInfoE = e(activity);
        if (activityInfoE == null) {
            return false;
        }
        boolean z10 = activityInfoE.launchMode == 3;
        com.amazon.a.a.o.c cVar = f16295b;
        cVar.a("Single instance: " + z10);
        boolean z11 = (activityInfoE.flags & 2) != 0;
        cVar.a("Finish on task launch:" + z11);
        boolean z12 = (activityInfoE.flags & ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD) != 0;
        cVar.a("No History: " + z12);
        return (z10 || z11 || z12) ? false : true;
    }

    @Override // com.amazon.a.a.i.b
    public void a(com.amazon.a.a.i.d dVar) {
        if (com.amazon.a.a.o.c.f16456a) {
            f16295b.a("Expiring Decision Dialog: Thread: " + Thread.currentThread());
        }
        this.f16296c.interrupt();
    }

    private void a(Activity activity, AlertDialog alertDialog, final a aVar, int i10) {
        if (aVar == null) {
            return;
        }
        alertDialog.setButton(i10, aVar.b(), new DialogInterface.OnClickListener() { // from class: com.amazon.a.a.n.a.f.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i11) {
                if (com.amazon.a.a.o.c.f16456a) {
                    f.f16295b.a("Choice selected!");
                }
                if (f.this.k()) {
                    f.this.f16298e.add(aVar);
                }
            }
        });
    }
}
