package p206t6;

import G7.e;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import p216u6.d;
import p216u6.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f26891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f26892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f26893c;

    public g(j jVar, e eVar, TaskCompletionSource taskCompletionSource) {
        this.f26893c = jVar;
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.f26891a = eVar;
        this.f26892b = taskCompletionSource;
    }

    @Override // p216u6.i
    public void F(Bundle bundle) {
        this.f26893c.f26898a.c(this.f26892b);
        this.f26891a.c("onRequestInfo", new Object[0]);
    }

    @Override // p216u6.i
    public void P(Bundle bundle) {
        this.f26893c.f26898a.c(this.f26892b);
        this.f26891a.c("onCompleteUpdate", new Object[0]);
    }
}
