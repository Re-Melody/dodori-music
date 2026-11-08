package com.google.android.gms.internal.auth;

import D5.a;
import com.google.android.gms.common.api.internal.J;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.internal.E;

/* JADX INFO: loaded from: classes.dex */
public final class zzbt {
    public final s getSpatulaHeader(q qVar) {
        E.h(qVar);
        return ((J) qVar).f17874b.doWrite(new zzbs(this, qVar));
    }

    public final s performProxyRequest(q qVar, a aVar) {
        E.h(qVar);
        E.h(aVar);
        return ((J) qVar).f17874b.doWrite(new zzbq(this, qVar, aVar));
    }
}
