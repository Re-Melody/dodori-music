package B2;

import android.content.Context;
import android.hardware.biometrics.BiometricPrompt;
import android.text.PrecomputedText;
import android.text.TextPaint;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class o {
    public static /* synthetic */ BiometricPrompt.Builder e(Context context) {
        return new BiometricPrompt.Builder(context);
    }

    public static /* synthetic */ BiometricPrompt.CryptoObject g(Cipher cipher) {
        return new BiometricPrompt.CryptoObject(cipher);
    }

    public static /* synthetic */ PrecomputedText.Params.Builder j(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* synthetic */ void s() {
    }
}
