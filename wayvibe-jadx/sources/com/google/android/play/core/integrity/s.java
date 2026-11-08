package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f18356a = this;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p248x6.i f18357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p248x6.i f18358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p248x6.i f18359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p248x6.i f18360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p248x6.i f18361f;

    public s(Context context, r rVar) {
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        O2.h hVar = new O2.h(context);
        this.f18357b = hVar;
        p248x6.g gVarB = p248x6.g.b(ac.f18247a);
        this.f18358c = gVarB;
        au auVar = new au(hVar, l.f18349a);
        this.f18359d = auVar;
        p248x6.g gVarB2 = p248x6.g.b(new al(hVar, gVarB, auVar, l.f18349a));
        this.f18360e = gVarB2;
        this.f18361f = p248x6.g.b(new ab(gVarB2));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f18361f.a();
    }
}
