package L2;

import D2.B;
import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class a implements D2.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D2.h f7487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f7488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f7489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CipherInputStream f7490d;

    public a(D2.h hVar, byte[] bArr, byte[] bArr2) {
        this.f7487a = hVar;
        this.f7488b = bArr;
        this.f7489c = bArr2;
    }

    @Override // D2.h
    public final void close() {
        if (this.f7490d != null) {
            this.f7490d = null;
            this.f7487a.close();
        }
    }

    @Override // D2.h
    public final long l(D2.k kVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f7488b, "AES"), new IvParameterSpec(this.f7489c));
                D2.j jVar = new D2.j(this.f7487a, kVar);
                this.f7490d = new CipherInputStream(jVar, cipher);
                if (jVar.f1862d) {
                    return -1L;
                }
                jVar.f1859a.l(jVar.f1860b);
                jVar.f1862d = true;
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e2) {
                throw new RuntimeException(e2);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // D2.h
    public final Map n() {
        return this.f7487a.n();
    }

    @Override // D2.h
    public final void r(B b10) {
        b10.getClass();
        this.f7487a.r(b10);
    }

    @Override // p255y2.InterfaceC2333i
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        this.f7490d.getClass();
        int i12 = this.f7490d.read(bArr, i10, i11);
        if (i12 < 0) {
            return -1;
        }
        return i12;
    }

    @Override // D2.h
    public final Uri s() {
        return this.f7487a.s();
    }
}
