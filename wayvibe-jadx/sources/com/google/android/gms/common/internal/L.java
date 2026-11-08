package com.google.android.gms.common.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class L extends C {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC1164f f18006g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(AbstractC1164f abstractC1164f, int i10, Bundle bundle) {
        super(abstractC1164f, i10, bundle);
        this.f18006g = abstractC1164f;
    }

    @Override // com.google.android.gms.common.internal.C
    public final boolean a() {
        this.f18006g.zzc.a(H5.b.f6027f);
        return true;
    }

    @Override // com.google.android.gms.common.internal.C
    public final void b(H5.b bVar) {
        AbstractC1164f abstractC1164f = this.f18006g;
        if (abstractC1164f.enableLocalFallback() && abstractC1164f.zzg()) {
            abstractC1164f.zzf(16);
        } else {
            abstractC1164f.zzc.a(bVar);
            abstractC1164f.onConnectionFailed(bVar);
        }
    }
}
