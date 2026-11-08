package com.it_nomads.fluttersecurestorage.ciphers;

import android.content.Context;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public interface a {
    byte[] B(SecretKeySpec secretKeySpec);

    void i();

    Cipher p(Context context);

    Key t(byte[] bArr);
}
