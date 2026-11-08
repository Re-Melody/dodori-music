package com.google.android.gms.internal.fido;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC1131a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.internal.C1167i;

/* JADX INFO: loaded from: classes.dex */
public final class zzo extends AbstractC1131a {
    @Override // com.google.android.gms.common.api.AbstractC1131a
    public final /* synthetic */ g buildClient(Context context, Looper looper, C1167i c1167i, Object obj, o oVar, p pVar) {
        return new zzp(context, looper, c1167i, oVar, pVar);
    }
}
