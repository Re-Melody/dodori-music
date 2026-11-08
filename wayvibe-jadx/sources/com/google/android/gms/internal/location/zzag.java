package com.google.android.gms.internal.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC1131a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.InterfaceC1141h;
import com.google.android.gms.common.api.internal.InterfaceC1151s;
import com.google.android.gms.common.internal.C1167i;

/* JADX INFO: loaded from: classes.dex */
final class zzag extends AbstractC1131a {
    @Override // com.google.android.gms.common.api.AbstractC1131a
    public final /* synthetic */ g buildClient(Context context, Looper looper, C1167i c1167i, Object obj, InterfaceC1141h interfaceC1141h, InterfaceC1151s interfaceC1151s) {
        return new zzg(context, looper, c1167i, interfaceC1141h, interfaceC1151s);
    }
}
