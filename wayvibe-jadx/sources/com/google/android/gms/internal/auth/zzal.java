package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.J;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.s;
import p266z5.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzal {
    private static final Status zza = new Status(13, null, null, null);

    public final s addWorkAccount(q qVar, String str) {
        return ((J) qVar).f17874b.doWrite(new zzae(this, a.f29869a, qVar, str));
    }

    public final s removeWorkAccount(q qVar, Account account) {
        return ((J) qVar).f17874b.doWrite(new zzag(this, a.f29869a, qVar, account));
    }

    public final void setWorkAuthenticatorEnabled(q qVar, boolean z10) {
        setWorkAuthenticatorEnabledWithResult(qVar, z10);
    }

    public final s setWorkAuthenticatorEnabledWithResult(q qVar, boolean z10) {
        return ((J) qVar).f17874b.doWrite(new zzac(this, a.f29869a, qVar, z10));
    }
}
