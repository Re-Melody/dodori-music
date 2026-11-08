package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.J;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.s;

/* JADX INFO: loaded from: classes.dex */
public final class zzaf {
    public final s removeActivityUpdates(q qVar, PendingIntent pendingIntent) {
        return ((J) qVar).f17874b.doWrite(new zzad(this, qVar, pendingIntent));
    }

    public final s requestActivityUpdates(q qVar, long j10, PendingIntent pendingIntent) {
        return ((J) qVar).f17874b.doWrite(new zzac(this, qVar, j10, pendingIntent));
    }
}
