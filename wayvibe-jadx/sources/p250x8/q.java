package p250x8;

import M8.D;
import M8.o;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import p241x.AbstractC2315s;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q implements OnSuccessListener, OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f28654a;

    public /* synthetic */ q(m mVar) {
        this.f28654a = mVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        AbstractC2315s.d(this.f28654a, new e("clearAuthorizationToken failed", exc.getMessage()));
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        this.f28654a.invoke(new o(D.f8402a));
    }
}
