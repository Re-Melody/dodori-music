package com.amazon.device.iap.internal.a;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.amazon.a.a.i.h;

/* JADX INFO: loaded from: classes.dex */
public class a extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f16736b = "a";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f16737e = "http://www.amazon.com/gp/mas/get-appstore/android/ref=mas_mx_mba_iap_dl";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f16738f = "Amazon Appstore required";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f16739g = "Amazon Appstore Update Required";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f16740j = 31536000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.a.a f16741h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.amazon.a.a.i.c f16742i;

    public a(com.amazon.a.a.i.c cVar) {
        super(cVar);
        this.f16742i = cVar;
    }

    @Override // com.amazon.a.a.e.c
    public long h() {
        return 31536000L;
    }

    @Override // com.amazon.a.a.i.h
    public void i() {
        com.amazon.device.iap.internal.util.b.a(f16736b, "doAction");
        if (f16738f.equalsIgnoreCase(this.f16742i.e()) || f16739g.equalsIgnoreCase(this.f16742i.e())) {
            try {
                Activity activityB = this.f16741h.b();
                if (activityB == null) {
                    activityB = this.f16741h.a();
                }
                activityB.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(f16737e)));
            } catch (Exception e2) {
                com.amazon.device.iap.internal.util.b.b(f16736b, "Exception in PurchaseItemCommandTask.OnSuccess: " + e2);
            }
        }
    }

    public String toString() {
        return f16736b;
    }
}
