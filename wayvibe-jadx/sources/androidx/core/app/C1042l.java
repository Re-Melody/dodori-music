package androidx.core.app;

import android.content.Intent;

/* JADX INFO: renamed from: androidx.core.app.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1042l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f14936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f14938c;

    public C1042l(r rVar, Intent intent, int i10) {
        this.f14938c = rVar;
        this.f14936a = intent;
        this.f14937b = i10;
    }

    @Override // androidx.core.app.m
    public final void a() {
        this.f14938c.stopSelf(this.f14937b);
    }

    @Override // androidx.core.app.m
    public final Intent getIntent() {
        return this.f14936a;
    }
}
