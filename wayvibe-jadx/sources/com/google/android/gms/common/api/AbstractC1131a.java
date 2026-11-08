package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.internal.InterfaceC1141h;
import com.google.android.gms.common.api.internal.InterfaceC1151s;
import com.google.android.gms.common.internal.C1167i;

/* JADX INFO: renamed from: com.google.android.gms.common.api.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1131a extends f {
    @Deprecated
    public g buildClient(Context context, Looper looper, C1167i c1167i, Object obj, o oVar, p pVar) {
        return buildClient(context, looper, c1167i, obj, (InterfaceC1141h) oVar, (InterfaceC1151s) pVar);
    }

    public g buildClient(Context context, Looper looper, C1167i c1167i, Object obj, InterfaceC1141h interfaceC1141h, InterfaceC1151s interfaceC1151s) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}
