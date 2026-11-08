package Z6;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    private static final K5.a zza = new K5.a("PhoneAuthProvider", new String[0]);

    public abstract void onCodeAutoRetrievalTimeOut(String str);

    public abstract void onCodeSent(String str, v vVar);

    public abstract void onVerificationCompleted(t tVar);

    public abstract void onVerificationFailed(W6.i iVar);
}
