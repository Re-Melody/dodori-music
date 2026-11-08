package P7;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class c extends BiometricPrompt$AuthenticationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f9738a;

    public c(j jVar) {
        this.f9738a = jVar;
    }

    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        super.onAuthenticationError(i10, charSequence);
        Log.e("FlutterSecureStorage", "Biometric authentication error [" + i10 + "]: " + ((Object) charSequence));
        this.f9738a.m(new Exception("Biometric authentication error [" + i10 + "]: " + ((Object) charSequence)));
    }

    public final void onAuthenticationFailed() {
        super.onAuthenticationFailed();
        Log.w("FlutterSecureStorage", "Biometric authentication failed, user not recognized");
        this.f9738a.m(new Exception("Biometric authentication failed, user not recognized"));
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        super.onAuthenticationSucceeded(authenticationResult);
        this.f9738a.onSuccess(authenticationResult);
    }
}
