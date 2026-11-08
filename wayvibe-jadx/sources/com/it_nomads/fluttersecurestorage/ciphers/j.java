package com.it_nomads.fluttersecurestorage.ciphers;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class j implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Cipher f18838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SecureRandom f18839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Key f18840d;

    public j(Context context, a aVar, int i10) {
        this.f18837a = i10;
        switch (i10) {
            case 1:
                SecureRandom secureRandom = new SecureRandom();
                this.f18839c = secureRandom;
                SharedPreferences sharedPreferences = context.getSharedPreferences("FlutterSecureKeyStorage", 0);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                String string = sharedPreferences.getString("AESVGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK", null);
                this.f18838b = Cipher.getInstance("AES/GCM/NoPadding");
                if (string == null) {
                    byte[] bArr = new byte[16];
                    secureRandom.nextBytes(bArr);
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                    this.f18840d = secretKeySpec;
                    editorEdit.putString("AESVGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK", Base64.encodeToString(aVar.B(secretKeySpec), 0));
                    editorEdit.apply();
                } else {
                    this.f18840d = aVar.t(Base64.decode(string, 0));
                }
                break;
            default:
                SecureRandom secureRandom2 = new SecureRandom();
                this.f18839c = secureRandom2;
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("FlutterSecureKeyStorage", 0);
                SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                String string2 = sharedPreferences2.getString("VGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK", null);
                this.f18838b = Cipher.getInstance("AES/CBC/PKCS7Padding");
                if (string2 == null) {
                    byte[] bArr2 = new byte[16];
                    secureRandom2.nextBytes(bArr2);
                    SecretKeySpec secretKeySpec2 = new SecretKeySpec(bArr2, "AES");
                    this.f18840d = secretKeySpec2;
                    editorEdit2.putString("VGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK", Base64.encodeToString(aVar.B(secretKeySpec2), 0));
                    editorEdit2.apply();
                } else {
                    this.f18840d = aVar.t(Base64.decode(string2, 0));
                }
                break;
        }
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.f
    public final byte[] a(byte[] bArr) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, InvalidAlgorithmParameterException {
        switch (this.f18837a) {
            case 0:
                byte[] bArr2 = new byte[16];
                this.f18839c.nextBytes(bArr2);
                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
                Key key = this.f18840d;
                Cipher cipher = this.f18838b;
                cipher.init(1, key, ivParameterSpec);
                byte[] bArrDoFinal = cipher.doFinal(bArr);
                byte[] bArr3 = new byte[bArrDoFinal.length + 16];
                System.arraycopy(bArr2, 0, bArr3, 0, 16);
                System.arraycopy(bArrDoFinal, 0, bArr3, 16, bArrDoFinal.length);
                return bArr3;
            default:
                byte[] bArr4 = new byte[12];
                this.f18839c.nextBytes(bArr4);
                GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD, bArr4);
                Cipher cipher2 = this.f18838b;
                cipher2.init(1, this.f18840d, gCMParameterSpec);
                byte[] bArrDoFinal2 = cipher2.doFinal(bArr);
                byte[] bArr5 = new byte[bArrDoFinal2.length + 12];
                System.arraycopy(bArr4, 0, bArr5, 0, 12);
                System.arraycopy(bArrDoFinal2, 0, bArr5, 12, bArrDoFinal2.length);
                return bArr5;
        }
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.f
    public final byte[] b(byte[] bArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        switch (this.f18837a) {
            case 0:
                byte[] bArr2 = new byte[16];
                System.arraycopy(bArr, 0, bArr2, 0, 16);
                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
                int length = bArr.length - 16;
                byte[] bArr3 = new byte[length];
                System.arraycopy(bArr, 16, bArr3, 0, length);
                Key key = this.f18840d;
                Cipher cipher = this.f18838b;
                cipher.init(2, key, ivParameterSpec);
                return cipher.doFinal(bArr3);
            default:
                byte[] bArr4 = new byte[12];
                System.arraycopy(bArr, 0, bArr4, 0, 12);
                GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD, bArr4);
                int length2 = bArr.length - 12;
                byte[] bArr5 = new byte[length2];
                System.arraycopy(bArr, 12, bArr5, 0, length2);
                Cipher cipher2 = this.f18838b;
                cipher2.init(2, this.f18840d, gCMParameterSpec);
                return cipher2.doFinal(bArr5);
        }
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.f
    public final void c(Context context) {
        switch (this.f18837a) {
            case 0:
                context.getSharedPreferences("FlutterSecureKeyStorage", 0).edit().remove("VGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK").apply();
                break;
            default:
                context.getSharedPreferences("FlutterSecureKeyStorage", 0).edit().remove("AESVGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK").apply();
                break;
        }
    }
}
