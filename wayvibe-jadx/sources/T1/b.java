package T1;

import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O1.c f11555b;

    public /* synthetic */ b(O1.c cVar, int i10) {
        this.f11554a = i10;
        this.f11555b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11554a) {
            case 0:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$0$0(this.f11555b);
                break;
            case 1:
                this.f11555b.onResult(null);
                break;
            case 2:
                CredentialProviderPlayServicesImpl.onCreateCredential$lambda$0$0(this.f11555b);
                break;
            case 3:
                this.f11555b.onResult(null);
                break;
            case 4:
                this.f11555b.onResult(null);
                break;
            case 5:
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$1$0(this.f11555b);
                break;
            case 6:
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$0$0(this.f11555b);
                break;
            case 7:
                this.f11555b.a(new P1.d("No provider data returned."));
                break;
            default:
                this.f11555b.a(new P1.d("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                break;
        }
    }
}
