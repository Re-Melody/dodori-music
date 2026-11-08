package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class D implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17849b;

    public /* synthetic */ D(Object obj, Object obj2) {
        this.f17849b = obj;
        this.f17848a = obj2;
    }

    public void a(Status status, boolean z10) {
        HashMap map;
        HashMap map2;
        synchronized (((Map) this.f17848a)) {
            map = new HashMap((Map) this.f17848a);
        }
        synchronized (((Map) this.f17849b)) {
            map2 = new HashMap((Map) this.f17849b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new com.google.android.gms.common.api.j(status));
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((Map) ((D) this.f17849b).f17849b).remove((TaskCompletionSource) this.f17848a);
    }

    public D() {
        this.f17848a = Collections.synchronizedMap(new WeakHashMap());
        this.f17849b = Collections.synchronizedMap(new WeakHashMap());
    }
}
