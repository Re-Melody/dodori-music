package L4;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class a implements W4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W4.c f7775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f7776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f7777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CipherInputStream f7778d;

    public a(W4.c cVar, byte[] bArr, byte[] bArr2) {
        this.f7775a = cVar;
        this.f7776b = bArr;
        this.f7777c = bArr2;
    }

    @Override // W4.c
    public final long a(W4.e eVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f7776b, "AES"), new IvParameterSpec(this.f7777c));
                this.f7778d = new CipherInputStream(new W4.d(this.f7775a, eVar), cipher);
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e2) {
                throw new RuntimeException(e2);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // W4.c
    public final void b() {
        this.f7778d = null;
        this.f7775a.b();
    }

    @Override // W4.c
    public final int a(byte[] bArr, int i10, int i11) throws IOException {
        X4.a.q(this.f7778d != null);
        int i12 = this.f7778d.read(bArr, i10, i11);
        if (i12 < 0) {
            return -1;
        }
        return i12;
    }

    @Override // W4.c
    public final Uri a() {
        return this.f7775a.a();
    }
}
