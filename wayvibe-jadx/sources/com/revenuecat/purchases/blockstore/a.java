package com.revenuecat.purchases.blockstore;

import M8.InterfaceC0643e;
import Z8.c;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements OnSuccessListener, OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0643e f18846a;

    public /* synthetic */ a(InterfaceC0643e interfaceC0643e) {
        this.f18846a = interfaceC0643e;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        BlockstoreHelper.C13501.invokeSuspend$lambda$2((Z8.a) this.f18846a, exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((c) this.f18846a).invoke(obj);
    }
}
