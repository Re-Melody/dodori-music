package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.common.internal.E;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f17718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f17719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Account f17722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f17723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f17724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Bundle f17725h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f17726i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f17727j;

    public final void a(String str) {
        E.h(str);
        String str2 = this.f17719b;
        boolean z10 = true;
        if (str2 != null && !str2.equals(str)) {
            z10 = false;
        }
        E.a("two different server client ids provided", z10);
    }
}
