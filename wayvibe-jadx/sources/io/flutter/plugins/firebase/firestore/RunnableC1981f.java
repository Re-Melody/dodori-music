package io.flutter.plugins.firebase.firestore;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;

/* JADX INFO: renamed from: io.flutter.plugins.firebase.firestore.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1981f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f20991b;

    public /* synthetic */ RunnableC1981f(int i10, TaskCompletionSource taskCompletionSource) {
        this.f20990a = i10;
        this.f20991b = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TaskCompletionSource taskCompletionSource = this.f20991b;
        switch (this.f20990a) {
            case 0:
                HashMap map = C1985j.f21004h;
                try {
                    taskCompletionSource.setResult(null);
                } catch (Exception e2) {
                    taskCompletionSource.setException(e2);
                    return;
                }
                break;
            default:
                FlutterFirebasePluginRegistry.lambda$didReinitializeFirebaseCore$1(taskCompletionSource);
                break;
        }
    }
}
