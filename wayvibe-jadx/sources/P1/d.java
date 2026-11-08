package P1;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e {
    public d(CharSequence charSequence) {
        super(charSequence, "android.credentials.GetCredentialException.TYPE_UNKNOWN");
    }

    public d(CharSequence charSequence, String str) {
        super(charSequence, str);
        if (str.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }
}
