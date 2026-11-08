package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC1155w extends AbstractBinderC1143j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1139f f17959a;

    public BinderC1155w(InterfaceC1139f interfaceC1139f) {
        this.f17959a = interfaceC1139f;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1144k
    public final void onResult(Status status) {
        this.f17959a.setResult(status);
    }
}
