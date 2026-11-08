package com.amazon.a.a.l;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f16208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f16209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f16210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Intent f16211d;

    public a(Activity activity, int i10, int i11, Intent intent) {
        this.f16208a = activity;
        this.f16209b = i10;
        this.f16210c = i11;
        this.f16211d = intent;
    }

    public Activity a() {
        return this.f16208a;
    }

    public int b() {
        return this.f16209b;
    }

    public Intent c() {
        return this.f16211d;
    }

    public int d() {
        return this.f16210c;
    }

    public String toString() {
        return "ActivtyResult: [ requestCode: " + this.f16209b + ", resultCode: " + this.f16210c + ", activity: " + this.f16208a + ", intent: " + this.f16211d + "]";
    }
}
