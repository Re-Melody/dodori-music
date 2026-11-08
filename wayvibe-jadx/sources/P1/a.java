package P1;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Exception {
    public a(String str) {
        this("android.credentials.ClearCredentialStateException.TYPE_UNKNOWN", str);
    }

    public a() {
        this("androidx.credentials.TYPE_CLEAR_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION", "clearCredentialStateAsync no provider dependencies found - please ensure the desired provider dependencies are added");
    }

    public a(String str, String str2) {
        super(str2 != null ? str2.toString() : null);
    }
}
