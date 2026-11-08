package com.revenuecat.purchases.blockstore;

import Z8.c;
import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class BlockstoreHelper$sam$com_google_android_gms_tasks_OnSuccessListener$0 implements OnSuccessListener {
    private final /* synthetic */ c function;

    public BlockstoreHelper$sam$com_google_android_gms_tasks_OnSuccessListener$0(c function) {
        m.f(function, "function");
        this.function = function;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(Object obj) {
        this.function.invoke(obj);
    }
}
