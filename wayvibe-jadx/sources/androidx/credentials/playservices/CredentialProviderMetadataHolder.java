package androidx.credentials.playservices;

import T1.a;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class CredentialProviderMetadataHolder extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f15018a = new a();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        m.f(intent, "intent");
        return this.f15018a;
    }
}
