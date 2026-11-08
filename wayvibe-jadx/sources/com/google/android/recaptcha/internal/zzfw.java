package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.Arrays;
import p119k9.C;
import p119k9.F;

/* JADX INFO: loaded from: classes.dex */
public final class zzfw {
    private final WebView zza;
    private final C zzb;

    public zzfw(WebView webView, C c3) {
        this.zza = webView;
        this.zzb = c3;
    }

    public final void zzb(String str, String... strArr) {
        F.w(this.zzb, null, null, new zzfv((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null), 3);
    }
}
