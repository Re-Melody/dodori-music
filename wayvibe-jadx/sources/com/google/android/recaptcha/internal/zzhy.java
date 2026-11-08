package com.google.android.recaptcha.internal;

import N8.m;
import N8.n;
import N8.s;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzhy {
    private List zza = s.f8650a;

    public final long zza(long[] jArr) {
        Iterator it = n.M0(this.zza, m.A0(jArr)).iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = Long.valueOf(((Number) next).longValue() ^ ((Number) it.next()).longValue());
        }
        return ((Number) next).longValue();
    }

    public final void zzb(long[] jArr) {
        this.zza = m.A0(jArr);
    }
}
